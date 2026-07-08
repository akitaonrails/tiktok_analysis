package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC202143147p;
import X.C09CT;
import X.C09NT;
import X.C12ES;
import X.C19EG;
import X.C20190713zN;
import X.C2204771BQt;
import X.C786410Ut5;
import Y.AObjectS373S0100000_30;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.utils.crop.CropFragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes31.dex */
public final class ChooseImageMethod extends AbstractC202143147p<Params, Result> {
    public String LLIZ;
    public Params LLIZLLLIL;

    public static final class Params {

        @C09CT("max_height")
        public int max_height;

        @C09CT("max_size")
        public int max_size;

        @C09CT("max_width")
        public int max_width;

        @C09CT("min_height")
        public int min_height;

        @C09CT("min_width")
        public int min_width;

        @C09CT("width_to_height_ratio")
        public float width_to_height_ratio = 1.0f;
    }

    @Override // X.AbstractC1835360xrS
    public final void LJIIIZ() {
        this.LLILZLL = null;
    }

    public static final class Result {

        @C09CT("tempFiles")
        public PhotoFile[] files;

        public Result(PhotoFile[] photoFileArr) {
            this.files = photoFileArr;
        }

        public static class PhotoFile {

            @C09CT("base64Data")
            public String base64;

            @C09CT("path")
            public String path;

            @C09CT("size")
            public int size;

            public PhotoFile(String str, int i, String str2) {
                this.path = str;
                this.size = i;
                this.base64 = str2;
            }
        }
    }

    public ChooseImageMethod(SparkContext sparkContext) {
        super(sparkContext);
    }

    @Override // X.AbstractC1835360xrS
    public final void LJII(Object obj, C2204771BQt c2204771BQt) {
        Fragment fragment;
        this.LLIZLLLIL = (Params) obj;
        this.LLIZ = String.valueOf(System.currentTimeMillis());
        C19EG activity = this.LLILZLL.getActivity();
        if (this.LLILZIL) {
            fragment = null;
        } else {
            fragment = this.LLILZLL;
        }
        C20190713zN.LIZ(40003, activity, fragment);
    }

    @Override // X.InterfaceC20023413We
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 40003) {
            if (i2 == -1 && intent != null && intent.getData() != null) {
                C19EG activity = this.LLILZLL.getActivity();
                if (activity == null) {
                    LJFF();
                    return;
                }
                Uri data = intent.getData();
                try {
                    if (BitmapFactory.decodeStream(C09NT.LJ(activity.getContentResolver(), data)) != null) {
                        float f = this.LLIZLLLIL.width_to_height_ratio;
                        CropFragment cropFragment = new CropFragment();
                        Bundle bundle = new Bundle();
                        C786410Ut5.LJJIJL(bundle, "arg_origin_uri", data);
                        bundle.putFloat("arg_width_to_height_ratio", f);
                        cropFragment.setArguments(bundle);
                        cropFragment.LLIZ = new AObjectS373S0100000_30(this, 3);
                        cropFragment.show(this.LLILZLL.getChildFragmentManager(), "upload_photo");
                        return;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C12ES.LJ(activity, R.drawable.ec6, activity.getString(2131855117));
                LJFF();
                return;
            }
            LJFF();
        }
    }
}
