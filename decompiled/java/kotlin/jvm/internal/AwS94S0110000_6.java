package kotlin.jvm.internal;

import X.C09AY;
import X.C0HFD;
import X.C0HFS;
import X.C0HH9;
import X.C0HNI;
import X.C0HWW;
import X.C0I7D;
import X.C1163440gNi;
import X.C13LE;
import X.C2344009Gk;
import X.C435950H7p;
import X.C436960HBm;
import X.C462160IAk;
import X.C513001zE;
import X.C628830OlV;
import X.C869590Y9l;
import X.ViewOnAttachStateChangeListenerC346290Dhr;
import android.content.Context;
import com.ss.android.ugc.aweme.detail.prefab.HeaderBasicInfoAssem;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoKeyFrameViewModel;
import com.ss.android.ugc.aweme.template.datamodel.TemplateDetailModel;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS94S0110000_6 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS94S0110000_6 r4, java.lang.Object r5) {
        /*
            X.0kl3 r5 = (X.C1331670kl3) r5
            boolean r0 = X.C454440Hru.LIZ()
            r5.LJJJJLI = r0
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate r0 = (com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate) r0
            java.lang.Integer r3 = X.C2243571Crb.LIZLLL(r0)
            X.0Hme r0 = X.EnumC451180Hme.VIDEO_STICKER_ANIMATED
            int r1 = r0.getType()
            if (r3 == 0) goto L1e
            int r0 = r3.intValue()
            if (r0 == r1) goto L2c
        L1e:
            X.0Hme r0 = X.EnumC451180Hme.VIDEO_STICKER_STATIC
            int r1 = r0.getType()
            if (r3 == 0) goto L48
            int r0 = r3.intValue()
            if (r0 != r1) goto L48
        L2c:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565
        L2e:
            X.0HsE r0 = com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi.LIZ
            com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi r0 = r0.LIZIZ()
            X.0Hh6 r0 = r0.getImStickerStoreService()
            X.06TB r1 = r0.LJIJJ(r3)
            boolean r0 = r4.z1
            r0 = r0 ^ 1
            r5.LIZLLL = r0
            r5.LJIL = r2
            X.C1332130kln.LIZJ(r5, r1)
            return r5
        L48:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS94S0110000_6.invoke$0(kotlin.jvm.internal.AwS94S0110000_6, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS94S0110000_6 awS94S0110000_6, Object obj) {
        List<SearchKeyFramePoint> list = ((SearchVideoKeyFrameViewModel) awS94S0110000_6.l0).LLILLJJLI;
        boolean z = awS94S0110000_6.z1;
        obj.getClass();
        return new C435950H7p(list, z);
    }

    public static final Object invoke$2(AwS94S0110000_6 awS94S0110000_6, Object obj) {
        C628830OlV c628830OlV = (C628830OlV) obj;
        c628830OlV.LL = C13LE.LIZ(HeaderBasicInfoAssem.class);
        c628830OlV.LLJIJIL = C1163440gNi.LIZJ;
        c628830OlV.LJ(Boolean.FALSE, "is_image_right");
        c628830OlV.LJII("cover", new AwS97S0110000_9((TemplateDetailModel) awS94S0110000_6.l0, awS94S0110000_6.z1, 6));
        c628830OlV.LJII("desc", AFwS236S0000000_6.get$arr$(364));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS94S0110000_6 awS94S0110000_6, Object obj) {
        int i;
        String str;
        C0HH9 c0hh9;
        C0HFS c0hfs;
        C2344009Gk c2344009Gk = (C2344009Gk) obj;
        C436960HBm c436960HBm = ((C0HNI) ((SocialAvatarReviewFragment) awS94S0110000_6.l0).UR().getState()).LLILLL;
        int i2 = 0;
        if (c436960HBm != null) {
            i = c436960HBm.LIZJ;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "final_avatar_order");
        C0HFD c0hfd = ((C0HNI) ((SocialAvatarReviewFragment) awS94S0110000_6.l0).UR().getState()).LLILZ;
        if (c0hfd != null && (c0hfs = c0hfd.LIZ) != null) {
            i2 = c0hfs.LIZ;
        }
        c2344009Gk.LIZJ(i2, "final_background_order");
        c2344009Gk.LJ(Boolean.valueOf(awS94S0110000_6.z1), "is_posted_on_story");
        C436960HBm c436960HBm2 = ((C0HNI) ((SocialAvatarReviewFragment) awS94S0110000_6.l0).UR().getState()).LLILLL;
        if (c436960HBm2 == null || (str = c436960HBm2.LJI) == null) {
            str = "";
        }
        c2344009Gk.LJFF("expression", str);
        C0HWW c0hww = C0HWW.LIZ;
        boolean z = !((SocialAvatarReviewFragment) awS94S0110000_6.l0).UR().yQ2();
        boolean z2 = !((SocialAvatarReviewFragment) awS94S0110000_6.l0).UR().zQ2();
        c0hww.getClass();
        if (z2) {
            if (z) {
                c0hh9 = C0HH9.DEFAULT_BG_DEFAULT_EXPRESSION;
            } else {
                c0hh9 = C0HH9.CHANGED_BG_DEFAULT_EXPRESSION;
            }
        } else if (z) {
            c0hh9 = C0HH9.DEFAULT_BG_CHANGED_EXPRESSION;
        } else {
            c0hh9 = C0HH9.CHANGED_BG_CHANGED_EXPRESSION;
        }
        c2344009Gk.LIZJ(c0hh9.getParam(), "is_default");
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS94S0110000_6 awS94S0110000_6, Object obj) {
        boolean z = awS94S0110000_6.z1;
        long msgId = ((C869590Y9l) awS94S0110000_6.l0).getMsgId();
        long msgId2 = ((C869590Y9l) awS94S0110000_6.l0).getMsgId();
        obj.getClass();
        return new C462160IAk(z, msgId, msgId2);
    }

    public static final Object invoke$5(AwS94S0110000_6 awS94S0110000_6, Object obj) {
        int i;
        Context context = (Context) obj;
        float f = context.getResources().getDisplayMetrics().density;
        int i2 = (int) (12 * f);
        C0I7D c0i7d = new C0I7D(context, null, 6, 0);
        boolean z = awS94S0110000_6.z1;
        Function1 function1 = (Function1) awS94S0110000_6.l0;
        c0i7d.setBackgroundResource(R.drawable.dge);
        c0i7d.setTuxFont(41);
        c0i7d.setSingleLine(false);
        c0i7d.setMaxLines(3);
        c0i7d.setHint(2131831183);
        if (z) {
            i = 16;
        } else {
            i = 127;
        }
        c0i7d.setPaddingRelative(i2, i2, (int) (i * f), i2);
        c0i7d.setFocusable(true);
        c0i7d.setFocusableInTouchMode(true);
        c0i7d.addTextChangedListener(new C513001zE(function1, 1));
        c0i7d.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC346290Dhr(1));
        return c0i7d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AwS94S0110000_6 r6, java.lang.Object r7) {
        /*
            X.0kl3 r7 = (X.C1331670kl3) r7
            boolean r0 = X.C454440Hru.LIZ()
            r7.LJJJJLI = r0
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate r0 = (com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate) r0
            java.lang.Integer r5 = X.C2243571Crb.LIZLLL(r0)
            X.0Hme r4 = X.EnumC451180Hme.VIDEO_STICKER_ANIMATED
            int r1 = r4.getType()
            if (r5 == 0) goto L1e
            int r0 = r5.intValue()
            if (r0 == r1) goto L2c
        L1e:
            X.0Hme r0 = X.EnumC451180Hme.VIDEO_STICKER_STATIC
            int r1 = r0.getType()
            if (r5 == 0) goto L93
            int r0 = r5.intValue()
            if (r0 != r1) goto L93
        L2c:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565
        L2e:
            boolean r0 = r6.z1
            r3 = 0
            if (r0 != 0) goto L90
            X.0Hme r0 = X.EnumC451180Hme.ANIMATED
            int r1 = r0.getType()
            if (r5 == 0) goto L41
            int r0 = r5.intValue()
            if (r0 == r1) goto L85
        L41:
            int r1 = r4.getType()
            if (r5 == 0) goto L4d
            int r0 = r5.intValue()
            if (r0 == r1) goto L85
        L4d:
            X.0Hme r0 = X.EnumC451180Hme.PHOTO_STICKER
            int r1 = r0.getType()
            if (r5 == 0) goto L5b
            int r0 = r5.intValue()
            if (r0 == r1) goto L85
        L5b:
            X.0Hme r0 = X.EnumC451180Hme.GIPHY
            int r1 = r0.getType()
            if (r5 == 0) goto L69
            int r0 = r5.intValue()
            if (r0 == r1) goto L85
        L69:
            X.0Hme r0 = X.EnumC451180Hme.THIRD_PARTY_GIPHY
            int r1 = r0.getType()
            if (r5 == 0) goto L77
            int r0 = r5.intValue()
            if (r0 == r1) goto L85
        L77:
            X.0Hme r0 = X.EnumC451180Hme.THIRD_PARTY_TENOR
            int r1 = r0.getType()
            if (r5 == 0) goto L90
            int r0 = r5.intValue()
            if (r0 != r1) goto L90
        L85:
            r3 = 1
            X.06TB r0 = X.C06TB.ANIMATED_STICKER
        L88:
            r7.LIZLLL = r3
            r7.LJIL = r2
            X.C1332130kln.LIZJ(r7, r0)
            return r7
        L90:
            X.06TB r0 = X.C06TB.STATIC_STICKER
            goto L88
        L93:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS94S0110000_6.invoke$6(kotlin.jvm.internal.AwS94S0110000_6, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S0110000_6(C869590Y9l c869590Y9l, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c869590Y9l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S0110000_6(StickerTemplate stickerTemplate, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = stickerTemplate;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S0110000_6(SearchVideoKeyFrameViewModel searchVideoKeyFrameViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchVideoKeyFrameViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S0110000_6(TemplateDetailModel templateDetailModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = templateDetailModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S0110000_6(SocialAvatarReviewFragment socialAvatarReviewFragment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = socialAvatarReviewFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S0110000_6(Function1 function1, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = function1;
    }
}
