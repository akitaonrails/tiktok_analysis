package kotlin.jvm.internal;

import X.C09AY;
import X.C1637890six;
import X.C528320Knm;
import X.C528330Knn;
import X.C528350Knp;
import X.C528760KoU;
import X.C528910Koj;
import X.C529210KpD;
import X.C543670LTx;
import android.app.Activity;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaExtensionKt;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS19S1201000_8 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS19S1201000_8 awS19S1201000_8, Object obj) {
        C529210KpD c529210KpD = (C529210KpD) obj;
        ChooseMediaExtensionKt.LIZIZ(c529210KpD, (MediaModel) awS19S1201000_8.l1);
        C528350Knp c528350Knp = (C528350Knp) awS19S1201000_8.l2;
        c528350Knp.LLLLLLLZIL = false;
        MediaModel mediaModel = (MediaModel) awS19S1201000_8.l1;
        String str = c529210KpD.LIZIZ;
        int i = c529210KpD.LJ;
        long j = c529210KpD.LIZJ;
        String str2 = awS19S1201000_8.s0;
        String str3 = c529210KpD.LJFF;
        int i2 = awS19S1201000_8.i3;
        Activity activity = c528350Knp.mActivity;
        if (activity != null && c528350Knp.LLJJIJIIJIL) {
            C528910Koj.LIZ(activity, i, (int) c528350Knp.LLLLLLZZ, i2, 16);
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put("errorCode", String.valueOf(i));
            c543670LTx.LIZ.put("errorMsg", str3);
            C1637890six.LJ("aweme_movie_import_error_rate", 1, c543670LTx.LJ());
            C528350Knp.LLZIL(mediaModel, str, 1, i, j, str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS19S1201000_8 awS19S1201000_8, Object obj) {
        C529210KpD c529210KpD = (C529210KpD) obj;
        ChooseMediaExtensionKt.LIZIZ(c529210KpD, (MediaModel) awS19S1201000_8.l1);
        C528330Knn c528330Knn = (C528330Knn) awS19S1201000_8.l2;
        c528330Knn.LLLLLLZZ = false;
        MediaModel mediaModel = (MediaModel) awS19S1201000_8.l1;
        String str = c529210KpD.LIZIZ;
        int i = c529210KpD.LJ;
        long j = c529210KpD.LIZJ;
        String str2 = awS19S1201000_8.s0;
        String str3 = c529210KpD.LJFF;
        int i2 = awS19S1201000_8.i3;
        Activity activity = c528330Knn.mActivity;
        if (activity != null && c528330Knn.LLJJIJIIJIL) {
            C528910Koj.LIZ(activity, i, (int) c528330Knn.LLLLZI, i2, 16);
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put("errorCode", String.valueOf(i));
            c543670LTx.LIZ.put("errorMsg", str3);
            C1637890six.LJ("aweme_movie_import_error_rate", 1, c543670LTx.LJ());
            C528330Knn.LLZIL(mediaModel, str, 1, i, j, str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS19S1201000_8 awS19S1201000_8, Object obj) {
        C529210KpD c529210KpD = (C529210KpD) obj;
        ChooseMediaExtensionKt.LIZIZ(c529210KpD, (MediaModel) awS19S1201000_8.l1);
        C528320Knm c528320Knm = (C528320Knm) awS19S1201000_8.l2;
        c528320Knm.LLLLLLZZ = false;
        MediaModel mediaModel = (MediaModel) awS19S1201000_8.l1;
        String str = c529210KpD.LIZIZ;
        int i = c529210KpD.LJ;
        long j = c529210KpD.LIZJ;
        String str2 = awS19S1201000_8.s0;
        String str3 = c529210KpD.LJFF;
        int i2 = awS19S1201000_8.i3;
        Activity activity = c528320Knm.mActivity;
        if (activity != null && c528320Knm.LLJJIJIIJIL) {
            C528910Koj.LIZ(activity, i, (int) c528320Knm.LLLLLZ, i2, 16);
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put("errorCode", String.valueOf(i));
            c543670LTx.LIZ.put("errorMsg", str3);
            C1637890six.LJ("aweme_movie_import_error_rate", 1, c543670LTx.LJ());
            C528320Knm.LLZ(mediaModel, str, 1, i, j, str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS19S1201000_8 awS19S1201000_8, Object obj) {
        C529210KpD c529210KpD = (C529210KpD) obj;
        ChooseMediaExtensionKt.LIZIZ(c529210KpD, (MediaModel) awS19S1201000_8.l1);
        C528760KoU c528760KoU = (C528760KoU) awS19S1201000_8.l2;
        c528760KoU.LLLLLZIL = false;
        MediaModel mediaModel = (MediaModel) awS19S1201000_8.l1;
        String str = c529210KpD.LIZIZ;
        int i = c529210KpD.LJ;
        long j = c529210KpD.LIZJ;
        String str2 = awS19S1201000_8.s0;
        String str3 = c529210KpD.LJFF;
        int i2 = awS19S1201000_8.i3;
        Activity activity = c528760KoU.mActivity;
        if (activity != null && c528760KoU.LLJJIJIIJIL) {
            C528910Koj.LIZ(activity, i, (int) c528760KoU.LLLLZ, i2, 16);
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put("errorCode", String.valueOf(i));
            c543670LTx.LIZ.put("errorMsg", str3);
            C1637890six.LJ("aweme_movie_import_error_rate", 1, c543670LTx.LJ());
            C528760KoU.d(mediaModel, str, 1, i, j, str2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S1201000_8(MediaModel mediaModel, C528320Knm c528320Knm, String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = mediaModel;
        this.l2 = c528320Knm;
        this.s0 = str;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S1201000_8(MediaModel mediaModel, C528330Knn c528330Knn, String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = mediaModel;
        this.l2 = c528330Knn;
        this.s0 = str;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S1201000_8(MediaModel mediaModel, C528760KoU c528760KoU, String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = mediaModel;
        this.l2 = c528760KoU;
        this.s0 = str;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S1201000_8(TikTokMediaModel tikTokMediaModel, C528350Knp c528350Knp, String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = tikTokMediaModel;
        this.l2 = c528350Knp;
        this.s0 = str;
        this.i3 = i;
    }
}
