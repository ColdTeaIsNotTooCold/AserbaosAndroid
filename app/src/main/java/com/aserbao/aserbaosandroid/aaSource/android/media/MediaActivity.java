package com.aserbao.aserbaosandroid.aaSource.android.media;

import android.view.View;

import com.aserbao.aserbaosandroid.aaSource.android.media.mediaCodec.MediaCodecActivity;
import com.aserbao.aserbaosandroid.comon.base.BaseRecyclerViewActivity;
import com.aserbao.aserbaosandroid.comon.base.beans.BaseRecyclerBean;

public class MediaActivity extends BaseRecyclerViewActivity {

    @Override
    public void initGetData() {
        mBaseRecyclerBean.add(new BaseRecyclerBean("MediaCodec", MediaCodecActivity.class));
    }

    @Override
    public void itemClickBack(View view, int position, boolean isLongClick, int comeFrom) {

    }
}
