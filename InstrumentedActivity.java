package net.medlinker.medlinker.test;

import net.medlinker.medlinker.guide.MainActivity;
import android.util.Log;

public class InstrumentedActivity extends MainActivity {
	public static String TAG = "InstrumentedActivity";

	private net.medlinker.medlinker.test.FinishListener mListener;

	public void setFinishListener(FinishListener listener) {
		mListener = listener;
	}


	@Override
	public void onDestroy() {
		Log.d(TAG + ".InstrumentedActivity", "onDestroy()");
		super.finish();
		if (mListener != null) {
			mListener.onActivityFinished();
		}
	}

}