package kotlin.jvm.internal;

import X.C09AY;
import X.C0J3B;
import X.C0PEM;
import X.C1397620mTQ;
import X.C1619720sFe;
import X.C1719306oJ;
import X.C1778880wOM;
import X.C1833500xoS;
import X.C1879340z0O;
import X.C1897010zSt;
import X.C1897110zT3;
import X.C1897750zU5;
import X.C1900660zYm;
import X.C1912660zs8;
import X.C19292910dr;
import X.C19319010i4;
import X.C19319110i5;
import X.C19319810iC;
import X.C2296808zG;
import X.C23250099c;
import X.C710890RuZ;
import X.InterfaceC1896760zSU;
import X.InterfaceC1896860zSe;
import Y.ACListenerS162S0100000_28;
import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.ss.android.ugc.aweme.compliance.business.policynotice.routeaction.ConfirmLogoutRouteAction;
import com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterSettingsFragment;
import com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeDisableActionInfo;
import com.ss.android.ugc.aweme.services.edit.CachedAutoMuteStripSettingStatus;
import com.ss.android.ugc.aweme.services.edit.IMuteStripSettingService;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS114S0110000_28 extends C09AY implements Function1 {
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
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S0110000_28(SpecActPendantManager specActPendantManager, int i) {
        super(1);
        this.$t = i;
        this.l0 = specActPendantManager;
        this.z1 = true;
    }

    public static final Object invoke$0(AwS114S0110000_28 awS114S0110000_28, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJII(2131828321, null);
        c1397620mTQ.LJFF(2131836784, new AwS114S0110000_28((ConfirmLogoutRouteAction) awS114S0110000_28.l0, awS114S0110000_28.z1, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS114S0110000_28 awS114S0110000_28, Object obj) {
        ConfirmLogoutRouteAction confirmLogoutRouteAction = (ConfirmLogoutRouteAction) awS114S0110000_28.l0;
        boolean z = awS114S0110000_28.z1;
        confirmLogoutRouteAction.getClass();
        ConfirmLogoutRouteAction.LIZ(z);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS114S0110000_28 awS114S0110000_28, Object obj) {
        ((Keva) awS114S0110000_28.l0).storeBoolean("inspiration_setting_enable", awS114S0110000_28.z1);
        return C1833500xoS.LIZ((C19319810iC) obj, awS114S0110000_28.z1);
    }

    public static final Object invoke$3(AwS114S0110000_28 awS114S0110000_28, Object obj) {
        C1879340z0O c1879340z0OLIZ;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((SpecActPendantManager) awS114S0110000_28.l0).LJIIJJI().showOrHidePendant(((SpecActPendantManager) awS114S0110000_28.l0).LJJIJIIJIL(), false);
        if (zBooleanValue) {
            C710890RuZ.LIZ.LJ("");
        }
        if (((SpecActPendantManager) awS114S0110000_28.l0).LJIIJJI().isPendantShowing() && awS114S0110000_28.z1 && zBooleanValue && ((c1879340z0OLIZ = C1619720sFe.LIZ.LIZ(1)) == null || !(c1879340z0OLIZ instanceof C1897750zU5))) {
            ((SpecActPendantManager) awS114S0110000_28.l0).LJJIIZI();
        }
        String strLJJIII = ((SpecActPendantManager) awS114S0110000_28.l0).LJJIII();
        if (strLJJIII != null) {
            C0J3B.LIZ(strLJJIII, "pendant");
        }
        if (((SpecActPendantManager) awS114S0110000_28.l0).LJIIJJI().isNormalBubbleShouldShow()) {
            ArrayList<InterfaceC1896760zSU> arrayList = C1897010zSt.LIZ;
            InterfaceC1896860zSe interfaceC1896860zSeLJIIJJI = ((SpecActPendantManager) awS114S0110000_28.l0).LJIIJJI();
            if (interfaceC1896860zSeLJIIJJI != null && interfaceC1896860zSeLJIIJJI.isBound() && interfaceC1896860zSeLJIIJJI.isPendantShowing() && !C1897010zSt.LIZLLL) {
                Iterator<InterfaceC1896760zSU> it2 = C1897010zSt.LIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    InterfaceC1896760zSU next = it2.next();
                    if ((next instanceof C1897110zT3) && !C1897010zSt.LIZLLL && ((C1897110zT3) next).LIZ(interfaceC1896860zSeLJIIJJI, LSPassThroughRecordSizeConfig.DEFAULT)) {
                        C1897010zSt.LIZLLL = true;
                        break;
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS114S0110000_28 awS114S0110000_28, Object obj) {
        if (!awS114S0110000_28.z1) {
            C1912660zs8 c1912660zs8 = (C1912660zs8) awS114S0110000_28.l0;
            c1912660zs8.getClass();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1719306oJ(true, c1912660zs8, null), 3);
        }
        ((C1912660zs8) awS114S0110000_28.l0).LJIIL("click_red_button");
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS114S0110000_28 awS114S0110000_28, Object obj) {
        if (awS114S0110000_28.z1) {
            C1912660zs8 c1912660zs8 = (C1912660zs8) awS114S0110000_28.l0;
            c1912660zs8.getClass();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1719306oJ(false, c1912660zs8, null), 3);
        }
        ((C1912660zs8) awS114S0110000_28.l0).LJIIL("click_gray_button");
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS114S0110000_28 awS114S0110000_28, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        ((IMuteStripSettingService) ((CreatorCenterSettingsFragment) awS114S0110000_28.l0).LLJJ.getValue()).storeAutoMuteStripSetting(iIntValue);
        if (iIntValue <= CachedAutoMuteStripSettingStatus.DISABLED.getValue()) {
            C19292910dr c19292910dr = ((CreatorCenterSettingsFragment) awS114S0110000_28.l0).LLJILJIL;
            if (c19292910dr != null) {
                c19292910dr.LJI(new AwS40S0010000_28(awS114S0110000_28.z1, 23));
            }
        } else {
            C19292910dr c19292910dr2 = ((CreatorCenterSettingsFragment) awS114S0110000_28.l0).LLJILJIL;
            if (c19292910dr2 != null) {
                c19292910dr2.LJI(new AwS40S0001000_28(iIntValue, 2));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS114S0110000_28 awS114S0110000_28, Object obj) {
        return C19319010i4.LIZIZ(((C19319110i5) awS114S0110000_28.l0).LIZIZ(), null, awS114S0110000_28.z1, false, false, 65531);
    }

    public static final Object invoke$8(AwS114S0110000_28 awS114S0110000_28, Object obj) {
        return C1900660zYm.LIZ((C1900660zYm) obj, 0, null, null, null, null, null, null, new C1778880wOM((NoticeDisableActionInfo) awS114S0110000_28.l0, awS114S0110000_28.z1), null, null, 895);
    }

    public static final Object invoke$9(AwS114S0110000_28 awS114S0110000_28, Object obj) {
        return C19319810iC.LJJIJL((C19319810iC) obj, awS114S0110000_28.z1, null, new ACListenerS162S0100000_28((VideoGiftSettingActivity) awS114S0110000_28.l0, 216), false, null, false, false, false, false, null, false, 131066);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S0110000_28(C19319110i5 c19319110i5, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c19319110i5;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S0110000_28(Keva keva, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = keva;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S0110000_28(ConfirmLogoutRouteAction confirmLogoutRouteAction, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = confirmLogoutRouteAction;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S0110000_28(CreatorCenterSettingsFragment creatorCenterSettingsFragment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = creatorCenterSettingsFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S0110000_28(VideoGiftSettingActivity videoGiftSettingActivity, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = videoGiftSettingActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S0110000_28(NoticeDisableActionInfo noticeDisableActionInfo, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = noticeDisableActionInfo;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS114S0110000_28(boolean z, C1912660zs8 c1912660zs8, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1912660zs8;
    }
}
