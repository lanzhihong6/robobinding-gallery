package org.robobinding.gallery.activity;

import org.robobinding.binder.Binders;
import org.robobinding.gallery.R;
import org.robobinding.gallery.presentationmodel.ListViewPresentationModel;

import android.app.Activity;
import android.os.Bundle;

/**
 *
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Cheng Wei
 */
public class ListViewActivity extends Activity
{
	private ListViewPresentationModel presentationModel;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		presentationModel = new ListViewPresentationModel();
		Binders.bind(this, R.layout.list_view_activity, presentationModel);
	}
	@Override
	protected void onResume()
	{
		super.onResume();

		presentationModel.refreshPresentationModel();
	}
}
