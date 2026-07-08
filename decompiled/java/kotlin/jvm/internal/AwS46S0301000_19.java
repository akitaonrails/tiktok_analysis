package kotlin.jvm.internal;

import X.C09AY;
import X.C1232140iAW;
import X.C1255650imR;
import X.C1263670izN;
import X.C19EG;
import X.C450840Hm6;
import X.C451220Hmi;
import X.EnumC1065850dqJ;
import X.EnumC1255610imN;
import X.EnumC1262450ixP;
import Y.ACListenerS85S0300000_19;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ProfileHeaderSignatureTranslationComponent;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS46S0301000_19 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AwS46S0301000_19 awS46S0301000_19, Object obj) {
        int value = ((EnumC1262450ixP) awS46S0301000_19.l0).getValue();
        MufPageTrackInfo mufPageTrackInfo = (MufPageTrackInfo) awS46S0301000_19.l1;
        ((MufListPageViewModel) awS46S0301000_19.l2).getClass();
        return C1263670izN.LIZ((C1263670izN) obj, value, mufPageTrackInfo, null, null, null, null, null, MufListPageViewModel.yQ2(), null, awS46S0301000_19.i3, 380);
    }

    public static final Object invoke$1(AwS46S0301000_19 awS46S0301000_19, Object obj) {
        C1232140iAW c1232140iAW = C1232140iAW.LIZ;
        HashMap map = (HashMap) awS46S0301000_19.l0;
        c1232140iAW.getClass();
        C1232140iAW.LJIIJ("shoot", "click_edit_profile", map);
        ((C1255650imR) awS46S0301000_19.l1).LIZ(awS46S0301000_19.i3, (Activity) awS46S0301000_19.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS46S0301000_19 awS46S0301000_19, Object obj) {
        ((C1255650imR) awS46S0301000_19.l0).LJFF.LJ(EnumC1255610imN.TAKE_PHOTO, (HashMap) awS46S0301000_19.l1);
        ((C1255650imR) awS46S0301000_19.l0).LIZ(awS46S0301000_19.i3, (Activity) awS46S0301000_19.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS46S0301000_19 awS46S0301000_19, Object obj) {
        C450840Hm6 c450840Hm6 = new C450840Hm6();
        int i = awS46S0301000_19.i3;
        ProfileHeaderSignatureTranslationComponent profileHeaderSignatureTranslationComponent = (ProfileHeaderSignatureTranslationComponent) awS46S0301000_19.l0;
        View view = (View) awS46S0301000_19.l1;
        EnumC1065850dqJ enumC1065850dqJ = (EnumC1065850dqJ) awS46S0301000_19.l2;
        c450840Hm6.LIZ = R.raw.icon_languages;
        c450840Hm6.LIZIZ = R.attr.ee;
        c450840Hm6.LIZJ = i;
        c450840Hm6.LJ = R.attr.ee;
        c450840Hm6.LJFF = new ACListenerS85S0300000_19(profileHeaderSignatureTranslationComponent, view, enumC1065850dqJ, 20);
        ((C451220Hmi) obj).LIZIZ(c450840Hm6);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S0301000_19(C19EG c19eg, C1255650imR c1255650imR, HashMap map, int i) {
        super(1);
        this.$t = i;
        this.l0 = map;
        this.l1 = c1255650imR;
        this.i3 = 0;
        this.l2 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S0301000_19(int i, Activity activity, C1255650imR c1255650imR, HashMap map, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1255650imR;
        this.l1 = map;
        this.i3 = i;
        this.l2 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S0301000_19(int i, ProfileHeaderSignatureTranslationComponent profileHeaderSignatureTranslationComponent, View view, EnumC1065850dqJ enumC1065850dqJ, int i2) {
        super(1);
        this.$t = i2;
        this.i3 = i;
        this.l0 = profileHeaderSignatureTranslationComponent;
        this.l1 = view;
        this.l2 = enumC1065850dqJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S0301000_19(EnumC1262450ixP enumC1262450ixP, MufPageTrackInfo mufPageTrackInfo, MufListPageViewModel mufListPageViewModel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = enumC1262450ixP;
        this.l1 = mufPageTrackInfo;
        this.l2 = mufListPageViewModel;
        this.i3 = i;
    }
}
