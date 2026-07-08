package tbk;

import X.C01GW;
import X.C0CHQ;
import X.C1442930neV;
import X.C1443360nfC;
import X.C1697810uHb;
import X.C19323510in;
import X.C1AF0;
import X.C2097608Jq;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C443530HaJ;
import X.C452501pT;
import X.C814420VxA;
import X.EnumC755480TkI;
import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS106S1000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class c {
    public static final c LIZ = new c();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5194));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(488));
    public static EnumC755480TkI LIZLLL = EnumC755480TkI.LL;
    public static long LJ = -1;
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(489));

    public static InnerPushConfig LIZJ(int i) {
        return new InnerPushConfig(0L, null, 10000, C1697810uHb.LJIIJJI(1, 2, 3, 4, 5, 6, 9), i);
    }

    public static Uri LIZLLL(VideoPublishEditModel videoPublishEditModel, boolean z) {
        boolean z2;
        C1442930neV.LIZ.getClass();
        String strLIZ = C1442930neV.LIZ(videoPublishEditModel);
        String strLIZIZ = C1442930neV.LIZIZ(videoPublishEditModel);
        Uri.Builder builderBuildUpon = UriProtector.parse("aweme://openRecord").buildUpon();
        int i = 1;
        if (strLIZ != null && strLIZ.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 && strLIZIZ != null && strLIZIZ.length() != 0) {
            if (C1442930neV.LIZLLL(z)) {
                builderBuildUpon.appendQueryParameter("type", "use_music_and_sticker").appendQueryParameter("music_id", strLIZ).appendQueryParameter("sticker_id", strLIZIZ);
            }
        } else if (strLIZ != null && strLIZ.length() != 0) {
            if (C1442930neV.LIZLLL(z)) {
                builderBuildUpon.appendQueryParameter("type", "use_music").appendQueryParameter("music_id", strLIZ);
            }
        } else if (strLIZIZ != null && strLIZIZ.length() != 0 && C1442930neV.LIZLLL(z)) {
            builderBuildUpon.appendQueryParameter("type", "use_sticker").appendQueryParameter("sticker_id", strLIZIZ);
        }
        Uri uriBuild = builderBuildUpon.build();
        int iLIZIZ = C1443360nfC.LIZIZ(new AwS106S1000000_22(strLIZ, 7), z);
        int iLIZIZ2 = C1443360nfC.LIZIZ(new AwS106S1000000_22(strLIZIZ, 6), z);
        long j = videoPublishEditModel.creativeModel.postPageModel.userClickPostOrSaveDraftTimestamp;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("is_use_post_again_music", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, "music_id"));
        pairArr[1] = new Pair("is_use_post_again_effect", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, "sticker_id"));
        if (!z) {
            i = 2;
        }
        pairArr[2] = new Pair("post_again_popup_type", String.valueOf(i));
        pairArr[3] = new Pair("is_remember_music", String.valueOf(iLIZIZ));
        pairArr[4] = new Pair("is_remember_effect", String.valueOf(iLIZIZ2));
        pairArr[5] = new Pair("post_again_duration", String.valueOf(j));
        Uri uriBuild2 = uriBuild.buildUpon().appendQueryParameter("from", "post_another").appendQueryParameter("extra_log_params", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), C2097608Jq.LJIIIIZZ(pairArr))).appendQueryParameter("need_mob_shoot", "1").build();
        if (uriBuild2 != null) {
            return uriBuild2;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static List LIZIZ(Function0 function0, Activity activity, String str) {
        int i;
        int i2;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap = (Bitmap) function0.invoke();
        if (bitmap == null) {
            return null;
        }
        if (bitmap.isRecycled()) {
            C1AF0.LJFF(new Throwable("Build push with cover bitmap, but bitmap is recycled"), str);
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width * 4 >= height * 3) {
            i2 = (int) ((height * 3.0f) / 4.0f);
            i = height;
        } else {
            i = (int) ((width * 4.0f) / 3.0f);
            i2 = width;
        }
        if (width > height) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, Math.abs(width - i2) / 2, 0, i2, i);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, Math.abs(height - i) / 2, i2, i);
        }
        if (!Intrinsics.LJFF(bitmapCreateBitmap, bitmap)) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        C443530HaJ c443530HaJ = new C443530HaJ(activity.getResources(), bitmapCreateBitmap);
        c443530HaJ.LIZJ(4);
        return Collections.singletonList(c443530HaJ);
    }

    public static C19323510in LIZ(Activity activity, int i, String str, List list, int i2, String str2, Map map, Map map2) {
        String string = activity.getResources().getString(i2);
        String string2 = activity.getResources().getString(2131829610);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZ = R.raw.icon_camera_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a00);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(activity);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        return new C19323510in(i, str, LIZJ(((Number) LIZIZ.getValue()).intValue()), new InnerPushUITemplate(0, null, 0, 0, 0, 0, null, null, null, null, null, null, null, list, null, 36, 48, 4, 0.5f, null, 20, 20, null, false, -3, 3, null, 0, 0, 0, Boolean.FALSE, 0, 0, 0, 0, 0, string, null, string2, null, 2, null, 1, null, null, 36, 48, 4, 0, C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(activity)), null, 0.5f, null, true, 0, null, null, str2, 12, null, null, null, null, null, 0), map2, map, 268);
    }
}
