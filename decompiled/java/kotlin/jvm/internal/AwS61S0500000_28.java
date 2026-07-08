package kotlin.jvm.internal;

import X.C05P0;
import X.C09AY;
import X.C0SY7;
import X.C0TJV;
import X.C100C;
import X.C103L;
import X.C10AA;
import X.C10CQ;
import X.C10GR;
import X.C1383370m6R;
import X.C1387050mCN;
import X.C1519390pdp;
import X.C1685510txl;
import X.C1876900ywS;
import X.C1908890zm3;
import X.C1910840zpC;
import X.C1910890zpH;
import X.C1917240zzW;
import X.C1917290zzb;
import X.C1917410zzn;
import X.C1917450zzr;
import X.C1917500zzw;
import X.C1917520zzy;
import X.C191833103b;
import X.C19EG;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C259800zU;
import X.C418440Gaw;
import X.C735600StK;
import X.C786410Ut5;
import X.C814420VxA;
import X.C849850XVn;
import X.DialogC1389620mGW;
import X.EnumC1387060mCO;
import X.EnumC1706760uW2;
import X.EnumC1910860zpE;
import X.EnumC1914120zuU;
import X.EnumC1914300zum;
import X.EnumC1917470zzt;
import X.EnumC1917480zzu;
import X.InterfaceC1519030pdF;
import X.InterfaceC1631630sYr;
import X.InterfaceC1665500tRU;
import X.InterfaceC1680560tpm;
import X.InterfaceC1917330zzf;
import X.InterfaceC1917380zzk;
import X.InterfaceC20661315t5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AObserverS188S0200000_28;
import Y.AObserverS230S0100000_28;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.compliance.api.model.Donor;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.pages.donorlist.DonorListPageFragment;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.PromoteVideoSettingSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopup;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlock;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockFormat;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBodyLinkList;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.nearby.ui.UserMatchedAssem;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.tiktok.ban.IUserBanDepService;
import com.ss.android.ugc.tiktok.ban.InlineLink;
import com.ss.android.ugc.tiktok.ban.PopAccessory;
import com.ss.android.ugc.tiktok.ban.PopButton;
import com.ss.android.ugc.tiktok.ban.TextWithInlineLink;
import com.ss.android.ugc.tiktok.ban.UserBanAppealStatusResponse;
import com.ss.android.ugc.tiktok.tpsc.privacy.video.PrivacyVideoRestrictionModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes29.dex */
public class AwS61S0500000_28 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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

    public static final Object invoke$0(AwS61S0500000_28 awS61S0500000_28, Object obj) {
        final AObserverS230S0100000_28 aObserverS230S0100000_28 = new AObserverS230S0100000_28((C05P0) awS61S0500000_28.l2, 16);
        ((DonorListPageFragment) awS61S0500000_28.l0).NR().LL.observe((LifecycleOwner) awS61S0500000_28.l1, aObserverS230S0100000_28);
        final AObserverS188S0200000_28 aObserverS188S0200000_28 = new AObserverS188S0200000_28(awS61S0500000_28.l3, (View) awS61S0500000_28.l4, (ViewPagerBottomSheetBehavior<View>) 6);
        ((DonorListPageFragment) awS61S0500000_28.l0).MR().LL.observe((LifecycleOwner) awS61S0500000_28.l1, aObserverS188S0200000_28);
        final DonorListPageFragment donorListPageFragment = (DonorListPageFragment) awS61S0500000_28.l0;
        return new InterfaceC1680560tpm() { // from class: X.0zpa
            @Override // X.InterfaceC1680560tpm
            public final void dispose() {
                donorListPageFragment.NR().LL.removeObserver(aObserverS230S0100000_28);
                donorListPageFragment.MR().LL.removeObserver(aObserverS188S0200000_28);
            }
        };
    }

    public static final Object invoke$1(AwS61S0500000_28 awS61S0500000_28, Object obj) {
        ((PromoteVideoSettingSheet) awS61S0500000_28.l0).openHalfSheet((C19EG) awS61S0500000_28.l1, (C103L) obj, (Aweme) awS61S0500000_28.l2, (PrivacyVideoRestrictionModel) awS61S0500000_28.l3, (Bundle) awS61S0500000_28.l4);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS61S0500000_28 awS61S0500000_28, Object obj) {
        PrivacyVideoRestrictionModel privacyVideoRestrictionModel = (PrivacyVideoRestrictionModel) obj;
        C10AA.LJ((Aweme) awS61S0500000_28.l0, privacyVideoRestrictionModel.getSettings());
        C786410Ut5.LJIIJ((DialogC1389620mGW) awS61S0500000_28.l1);
        C19EG c19eg = (C19EG) awS61S0500000_28.l2;
        C191833103b.LIZIZ(c19eg, "video_privacy_promote_video_visibility", new AwS61S0500000_28((PromoteVideoSettingSheet) awS61S0500000_28.l3, c19eg, (Aweme) awS61S0500000_28.l0, privacyVideoRestrictionModel, (Bundle) awS61S0500000_28.l4, 1));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS61S0500000_28 awS61S0500000_28, Object obj) {
        T tLJI;
        if (((Boolean) obj).booleanValue()) {
            C10CQ c10cq = new C10CQ((Context) awS61S0500000_28.l0, (C1917290zzb) awS61S0500000_28.l1);
            C259800zU c259800zU = (C259800zU) awS61S0500000_28.l2;
            if (C849850XVn.LIZIZ.LIZJ().LJJ("338") && !TextUtils.isEmpty(((C1917290zzb) awS61S0500000_28.l1).LJIIJJI)) {
                C1917240zzW c1917240zzW = C1917240zzW.LIZ;
                Context context = (Context) awS61S0500000_28.l0;
                C1917290zzb c1917290zzb = (C1917290zzb) awS61S0500000_28.l1;
                InterfaceC1917380zzk interfaceC1917380zzk = (InterfaceC1917380zzk) awS61S0500000_28.l3;
                InterfaceC1917330zzf interfaceC1917330zzf = (InterfaceC1917330zzf) awS61S0500000_28.l4;
                c1917240zzW.getClass();
                tLJI = C1917240zzW.LJIIIZ(context, c10cq, c1917290zzb, interfaceC1917380zzk, interfaceC1917330zzf);
            } else {
                C1917240zzW c1917240zzW2 = C1917240zzW.LIZ;
                Context context2 = (Context) awS61S0500000_28.l0;
                InterfaceC1917380zzk interfaceC1917380zzk2 = (InterfaceC1917380zzk) awS61S0500000_28.l3;
                InterfaceC1917330zzf interfaceC1917330zzf2 = (InterfaceC1917330zzf) awS61S0500000_28.l4;
                c1917240zzW2.getClass();
                tLJI = C1917240zzW.LJI(context2, c10cq, interfaceC1917380zzk2, interfaceC1917330zzf2);
            }
            c259800zU.element = tLJI;
        } else {
            int i = C2187451AjH.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, java.lang.Class] */
    public static final Object invoke$4(AwS61S0500000_28 awS61S0500000_28, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C10CQ c10cq = new C10CQ((Context) awS61S0500000_28.l0, (C1917290zzb) awS61S0500000_28.l1);
            if (C849850XVn.LIZIZ.LIZJ().LJJ("338") && !TextUtils.isEmpty(((C1917290zzb) awS61S0500000_28.l1).LJIIJJI)) {
                C259800zU c259800zU = (C259800zU) awS61S0500000_28.l2;
                C1917240zzW c1917240zzW = C1917240zzW.LIZ;
                Context context = (Context) awS61S0500000_28.l0;
                C1917290zzb c1917290zzb = (C1917290zzb) awS61S0500000_28.l1;
                InterfaceC1917380zzk interfaceC1917380zzk = (InterfaceC1917380zzk) awS61S0500000_28.l3;
                InterfaceC1917330zzf interfaceC1917330zzf = (InterfaceC1917330zzf) ((C259800zU) awS61S0500000_28.l4).element;
                c1917240zzW.getClass();
                c259800zU.element = C1917240zzW.LJIIIZ(context, c10cq, c1917290zzb, interfaceC1917380zzk, interfaceC1917330zzf);
            } else {
                C259800zU c259800zU2 = (C259800zU) awS61S0500000_28.l2;
                C1917240zzW c1917240zzW2 = C1917240zzW.LIZ;
                Context context2 = (Context) awS61S0500000_28.l0;
                InterfaceC1917380zzk interfaceC1917380zzk2 = (InterfaceC1917380zzk) awS61S0500000_28.l3;
                InterfaceC1917330zzf interfaceC1917330zzf2 = (InterfaceC1917330zzf) ((C259800zU) awS61S0500000_28.l4).element;
                c1917240zzW2.getClass();
                c259800zU2.element = C1917240zzW.LJI(context2, c10cq, interfaceC1917380zzk2, interfaceC1917330zzf2);
            }
        } else {
            int i = C2187451AjH.LIZ;
            InterfaceC1917330zzf interfaceC1917330zzf3 = (InterfaceC1917330zzf) ((C259800zU) awS61S0500000_28.l4).element;
            if (interfaceC1917330zzf3 != null) {
                interfaceC1917330zzf3.LIZ("pitaya_filtered");
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, java.lang.Class] */
    public static final Object invoke$5(AwS61S0500000_28 awS61S0500000_28, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C10CQ c10cq = new C10CQ((Context) awS61S0500000_28.l0, (C1917290zzb) awS61S0500000_28.l1);
            if (C849850XVn.LIZIZ.LIZJ().LJJ("338") && !TextUtils.isEmpty(((C1917290zzb) awS61S0500000_28.l1).LJIIJJI)) {
                C259800zU c259800zU = (C259800zU) awS61S0500000_28.l2;
                C1917240zzW c1917240zzW = C1917240zzW.LIZ;
                Context context = (Context) awS61S0500000_28.l0;
                C1917290zzb c1917290zzb = (C1917290zzb) awS61S0500000_28.l1;
                InterfaceC1917380zzk interfaceC1917380zzk = (InterfaceC1917380zzk) awS61S0500000_28.l3;
                InterfaceC1917330zzf interfaceC1917330zzf = (InterfaceC1917330zzf) ((C259800zU) awS61S0500000_28.l4).element;
                c1917240zzW.getClass();
                c259800zU.element = C1917240zzW.LJIIIZ(context, c10cq, c1917290zzb, interfaceC1917380zzk, interfaceC1917330zzf);
            } else {
                C259800zU c259800zU2 = (C259800zU) awS61S0500000_28.l2;
                C1917240zzW c1917240zzW2 = C1917240zzW.LIZ;
                Context context2 = (Context) awS61S0500000_28.l0;
                InterfaceC1917380zzk interfaceC1917380zzk2 = (InterfaceC1917380zzk) awS61S0500000_28.l3;
                InterfaceC1917330zzf interfaceC1917330zzf2 = (InterfaceC1917330zzf) ((C259800zU) awS61S0500000_28.l4).element;
                c1917240zzW2.getClass();
                c259800zU2.element = C1917240zzW.LJI(context2, c10cq, interfaceC1917380zzk2, interfaceC1917330zzf2);
            }
        } else {
            int i = C2187451AjH.LIZ;
            InterfaceC1917330zzf interfaceC1917330zzf3 = (InterfaceC1917330zzf) ((C259800zU) awS61S0500000_28.l4).element;
            if (interfaceC1917330zzf3 != null) {
                interfaceC1917330zzf3.LIZ("pitaya_filtered");
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, java.lang.Class] */
    public static final Object invoke$6(AwS61S0500000_28 awS61S0500000_28, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C10CQ c10cq = new C10CQ((Context) awS61S0500000_28.l0, (C1917290zzb) awS61S0500000_28.l1);
            if (C849850XVn.LIZIZ.LIZJ().LJJ("338") && !TextUtils.isEmpty(((C1917290zzb) awS61S0500000_28.l1).LJIIJJI)) {
                C259800zU c259800zU = (C259800zU) awS61S0500000_28.l2;
                C1917240zzW c1917240zzW = C1917240zzW.LIZ;
                Context context = (Context) awS61S0500000_28.l0;
                C1917290zzb c1917290zzb = (C1917290zzb) awS61S0500000_28.l1;
                InterfaceC1917380zzk interfaceC1917380zzk = (InterfaceC1917380zzk) awS61S0500000_28.l3;
                InterfaceC1917330zzf interfaceC1917330zzf = (InterfaceC1917330zzf) ((C259800zU) awS61S0500000_28.l4).element;
                c1917240zzW.getClass();
                c259800zU.element = C1917240zzW.LJIIIZ(context, c10cq, c1917290zzb, interfaceC1917380zzk, interfaceC1917330zzf);
            } else {
                C259800zU c259800zU2 = (C259800zU) awS61S0500000_28.l2;
                C1917240zzW c1917240zzW2 = C1917240zzW.LIZ;
                Context context2 = (Context) awS61S0500000_28.l0;
                InterfaceC1917380zzk interfaceC1917380zzk2 = (InterfaceC1917380zzk) awS61S0500000_28.l3;
                InterfaceC1917330zzf interfaceC1917330zzf2 = (InterfaceC1917330zzf) ((C259800zU) awS61S0500000_28.l4).element;
                c1917240zzW2.getClass();
                c259800zU2.element = C1917240zzW.LJI(context2, c10cq, interfaceC1917380zzk2, interfaceC1917330zzf2);
            }
        } else {
            int i = C2187451AjH.LIZ;
            InterfaceC1917330zzf interfaceC1917330zzf3 = (InterfaceC1917330zzf) ((C259800zU) awS61S0500000_28.l4).element;
            if (interfaceC1917330zzf3 != null) {
                interfaceC1917330zzf3.LIZ("pitaya_filtered");
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS61S0500000_28 awS61S0500000_28, Object obj) {
        Context context = (Context) obj;
        RelationButton relationButton = new RelationButton(context, (AttributeSet) null, 0, 14);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(relationButton);
        relationButton.setLayoutParams(layoutParams);
        C1910890zpH c1910890zpHLIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("generate relation button of user ");
        sbLIZ.append((User) awS61S0500000_28.l0);
        c1910890zpHLIZ.LIZ("UserMatchedAssem", C2188811AlT.LIZIZ(sbLIZ));
        relationButton.setButtonSize(1);
        C1387050mCN c1387050mCN = new C1387050mCN((User) awS61S0500000_28.l0);
        c1387050mCN.LJ = EnumC1387060mCO.MESSAGE_ICE_BREAKING;
        c1387050mCN.LJIJI = true;
        c1387050mCN.LJIJJ = true;
        c1387050mCN.LJIL = true;
        c1387050mCN.LJII.putAll(C2097908Jt.LIZJ(new Pair(C0SY7.UNFOLLOW_BUT_BE_FOLLOWED, new C1908890zm3(C1383370m6R.LJIIJ(R.string.jp2), null))));
        c1387050mCN.LJJII = (C735600StK) awS61S0500000_28.l1;
        relationButton.LLLLZIL(c1387050mCN.LIZ());
        relationButton.setTracker(new AwS572S0100000_28((C1685510txl) awS61S0500000_28.l2, 518));
        relationButton.setFollowClickListener(new C1910840zpC((User) awS61S0500000_28.l0, context, (UserMatchedAssem) awS61S0500000_28.l3, (C05P0) awS61S0500000_28.l4));
        return relationButton;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS61S0500000_28 awS61S0500000_28, Object obj) {
        if (obj != null) {
            ((Map) awS61S0500000_28.l1).put("verify_ticket", obj);
        }
        C786410Ut5.u3().getName();
        InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
        ((C1917520zzy) awS61S0500000_28.l0).getClass();
        interfaceC1519030pdFLIZJ.LIZ("pns_ban_internal_behaviour", C2097608Jq.LJIIIIZZ(new Pair("ban_type", "ban_type_session_ban"), new Pair("phase", "after_get_appeal_ticket")));
        super/*X.0zzx*/.LIZ((Map) awS61S0500000_28.l1, (InterfaceC1631630sYr) awS61S0500000_28.l2, (Function1) awS61S0500000_28.l3, (Function2) awS61S0500000_28.l4);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v3, types: [com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction, com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockFormat, java.lang.String, java.util.List, java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r29v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r30v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r31v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r31v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r31v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r31v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r32v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r33v3, types: [com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockFormat] */
    /* JADX WARN: Type inference failed for: r33v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r33v5, types: [com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockFormat] */
    /* JADX WARN: Type inference failed for: r33v8, types: [com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction] */
    /* JADX WARN: Type inference failed for: r34v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v10, types: [com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction, java.lang.String, java.util.List, java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r35v15 */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r35v4, types: [com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction] */
    /* JADX WARN: Type inference failed for: r35v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r35v6, types: [com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction] */
    /* JADX WARN: Type inference failed for: r35v8, types: [com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction, java.lang.String, java.util.List, java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r36v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r37v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r38v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r39v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r40v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r41v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r42v3, types: [com.ss.android.ugc.aweme.pns.universalpopup.core.model.StyleExtra] */
    /* JADX WARN: Type inference failed for: r45v2, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r48v2, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r58v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r58v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r58v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r61v2, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r61v3, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r61v4, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    public static final Object invoke$9(AwS61S0500000_28 awS61S0500000_28, Object obj) {
        boolean z;
        int i;
        String str;
        String str2;
        boolean z2;
        String str3;
        String str4;
        String string;
        final C19EG c19eg = (C19EG) obj;
        ((ArrayList) ((C1917450zzr) awS61S0500000_28.l0).LIZLLL).clear();
        ((C1917450zzr) awS61S0500000_28.l0).LIZIZ = new LinkedHashMap((Map) awS61S0500000_28.l1);
        ((C1917450zzr) awS61S0500000_28.l0).LIZJ = new LinkedHashMap((Map) awS61S0500000_28.l2);
        C1917450zzr c1917450zzr = (C1917450zzr) awS61S0500000_28.l0;
        UserBanAppealStatusResponse userBanAppealStatusResponse = (UserBanAppealStatusResponse) awS61S0500000_28.l3;
        Map<String, ? extends Object> map = (Map) awS61S0500000_28.l4;
        c1917450zzr.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String popTitle = userBanAppealStatusResponse.getPopTitle();
        if (popTitle != null && popTitle.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            UniversalPopupBlockFormat universalPopupBlockFormat = new UniversalPopupBlockFormat(20, 20, 24, 16, 0, 0, 0, 0, -1, "all");
            String popTitle2 = userBanAppealStatusResponse.getPopTitle();
            if (popTitle2 == null) {
                popTitle2 = "";
            }
            arrayList.add(new UniversalPopupBlock("info", "", null, null, null, Boolean.FALSE, null, null, null, universalPopupBlockFormat, C2097908Jt.LIZJ(new Pair("content", new UniversalPopupBlockElement("text", popTitle2, "H2-Bold", null, null, null, "center", null, null, null, 952, null))), null));
        }
        ?? r35 = 0;
        str = null;
        String str5 = null;
        String str6 = null;
        ?? r22 = 0;
        UniversalPopupBlock universalPopupBlock = new UniversalPopupBlock("", "", null, null, null, Boolean.FALSE, null, null, null, null, C2097608Jq.LJ(), null);
        if (z) {
            i = 24;
            str = "text";
            str2 = "H3-Regular";
        } else {
            i = 0;
            str = "subtext";
            str2 = "H4-Regular";
        }
        if (userBanAppealStatusResponse.getPopContentWithUrl() != null) {
            TextWithInlineLink popContentWithUrl = userBanAppealStatusResponse.getPopContentWithUrl();
            if (popContentWithUrl != null) {
                ArrayList arrayList4 = new ArrayList();
                List<InlineLink> list = popContentWithUrl.links;
                if (list != null) {
                    for (InlineLink inlineLink : list) {
                        str5 = str5;
                        arrayList4.add(new UniversalPopupBodyLinkList(inlineLink.text, "H4-Bold", "UITextPrimaryDisplay", str5, false, c1917450zzr.LIZLLL(C0TJV.USER_BAN_CONTENT_LINK.getValue(), inlineLink.linkType, inlineLink.url, map)));
                    }
                }
                String str7 = str5;
                String str8 = str5;
                String str9 = str5;
                ?? r352 = str5;
                universalPopupBlock = new UniversalPopupBlock("info", "", r352, r352, r352, Boolean.FALSE, r352, r352, r352, new UniversalPopupBlockFormat(20, 20, i, 16, 0, 0, 0, 0, -1, "all"), C2097908Jt.LIZJ(new Pair("content", new UniversalPopupBlockElement(str, popContentWithUrl.text, str2, str7, str8, str9, "center", r352, arrayList4, r352, 696, r352))), r352);
                r35 = r352;
            }
        } else if (userBanAppealStatusResponse.getPopContent() != null) {
            r35 = 0;
            universalPopupBlock = new UniversalPopupBlock("info", "", null, null, null, Boolean.FALSE, null, null, null, new UniversalPopupBlockFormat(20, 20, i, 16, 0, 0, 0, 0, -1, "all"), C2097908Jt.LIZJ(new Pair("content", new UniversalPopupBlockElement(str, userBanAppealStatusResponse.getPopContent(), str2, null, null, null, "center", null, null, null, 952, null))), null);
        } else {
            r35 = 0;
            universalPopupBlock = new UniversalPopupBlock("info", "", null, null, null, Boolean.FALSE, null, null, null, new UniversalPopupBlockFormat(20, 20, i, 16, 0, 0, 0, 0, -1, "all"), C2097908Jt.LIZJ(new Pair("content", new UniversalPopupBlockElement(str, c19eg.getString(2131826367), str2, null, null, null, "center", null, null, null, 952, null))), null);
        }
        arrayList2.add(universalPopupBlock);
        PopAccessory popAccessory = userBanAppealStatusResponse.getPopAccessory();
        if (popAccessory != null) {
            Integer num = popAccessory.openType;
            if (num != null && num.intValue() == 1) {
                string = popAccessory.url;
            } else {
                Uri.Builder builderBuildUpon = UriProtector.parse("aweme://webview_popup/").buildUpon();
                String str10 = popAccessory.url;
                Object obj2 = map.get("verify_ticket");
                if (!(obj2 instanceof String) || (str3 = (String) obj2) == null) {
                    str3 = "";
                }
                IUserBanDepService.LIZ.getClass();
                String strValueOf = String.valueOf(C1519390pdp.LIZ().getAppId());
                Object obj3 = map.get("user_nick_name");
                if (!(obj3 instanceof String) || (str4 = (String) obj3) == null) {
                    str4 = "";
                }
                string = builderBuildUpon.appendQueryParameter("url", C1917450zzr.LIZIZ(str10, str3, strValueOf, str4)).appendQueryParameter("height_percent", "90").appendQueryParameter("use_spark", "1").appendQueryParameter("keyboard_adjust", "2").appendQueryParameter("radius", "12").build().toString();
            }
            Map<String, String> map2 = c1917450zzr.LIZJ;
            StringBuilder sb = new StringBuilder();
            C0TJV c0tjv = C0TJV.USER_BAN_ACCESSORY;
            sb.append(c0tjv.getValue());
            sb.append("_internal_web");
            map2.put(sb.toString(), string);
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("action", EnumC1917470zzt.USER_BAN_WEB.getValue()), new Pair("user_ban_btn_style", c0tjv.getValue()), new Pair("user_ban_btn_type", String.valueOf(EnumC1917480zzu.INTERNAL_WEB.getValue())), new Pair("url", string));
            ((ArrayList) c1917450zzr.LIZLLL).add(mapLJIIJ);
            UniversalPopupBlockFormat universalPopupBlockFormat2 = new UniversalPopupBlockFormat(20, 20, 0, 16, 0, 0, 0, 0, -1, "all");
            String str11 = popAccessory.text;
            String value = c0tjv.getValue();
            String value2 = EnumC1914120zuU.LINK_TYPE_INTERNAL.getValue();
            IUserBanDepService.LIZ.getClass();
            String json = GsonProtectorUtils.toJson(C1519390pdp.LIZ().getGson(), mapLJIIJ);
            if (json == null) {
                json = "";
            }
            str6 = null;
            List listSingletonList = Collections.singletonList(new UniversalPopupBodyLinkList(str11, "H4-Semibold", "UIText1", null, true, new UniversalPopupAction(value, string, value2, json, 0, null, null, null, false, null, null, false, false, 8176, null)));
            r22 = r35;
            ?? r27 = r35;
            ?? r28 = r35;
            ?? r29 = r35;
            ?? r31 = r35;
            ?? r33 = r35;
            ?? r353 = r35;
            arrayList2.add(new UniversalPopupBlock("info", "", r353, r353, r353, Boolean.FALSE, r353, r353, r353, universalPopupBlockFormat2, C2097908Jt.LIZJ(new Pair("content", new UniversalPopupBlockElement("text", "%s", "Headline-Regular", r27, r28, r29, "center", r31, listSingletonList, r33, 696, r353))), r353));
        }
        List<PopButton> buttonList = userBanAppealStatusResponse.getButtonList();
        if (buttonList != null && !buttonList.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            List<PopButton> buttonList2 = userBanAppealStatusResponse.getButtonList();
            if (buttonList2 != null) {
                if (buttonList2.size() == 2) {
                    String strLIZJ = C1917450zzr.LIZJ(((PopButton) ListProtector.get(buttonList2, 0)).btnStyle);
                    String str12 = ((PopButton) ListProtector.get(buttonList2, 0)).btnContent;
                    C0TJV c0tjv2 = C0TJV.USER_BAN_BUTTON;
                    r22 = r22;
                    arrayList3.add(new UniversalPopupBlock("action", "", r22, r22, r22, Boolean.FALSE, r22, r22, r22, r22, C2097608Jq.LJIIIIZZ(new Pair("action_right", new UniversalPopupBlockElement(strLIZJ, str12, str6, str6, str6, str6, str6, str6, str6, c1917450zzr.LIZLLL(c0tjv2.getValue(), ((PopButton) ListProtector.get(buttonList2, 0)).btnType, ((PopButton) ListProtector.get(buttonList2, 0)).btnUrl, map), 508, str6)), new Pair("action_left", new UniversalPopupBlockElement(C1917450zzr.LIZJ(((PopButton) ListProtector.get(buttonList2, 1)).btnStyle), ((PopButton) ListProtector.get(buttonList2, 1)).btnContent, r22, r22, r22, r22, r22, r22, r22, c1917450zzr.LIZLLL(c0tjv2.getValue(), ((PopButton) ListProtector.get(buttonList2, 1)).btnType, ((PopButton) ListProtector.get(buttonList2, 1)).btnUrl, map), 508, r22))), r22));
                } else {
                    for (PopButton popButton : buttonList2) {
                        arrayList3.add(new UniversalPopupBlock("action", "", str6, str6, str6, Boolean.FALSE, str6, str6, str6, str6, C2097908Jt.LIZJ(new Pair("action_center", new UniversalPopupBlockElement(C1917450zzr.LIZJ(popButton.btnStyle), popButton.btnContent, str6, str6, str6, str6, str6, str6, str6, c1917450zzr.LIZLLL(C0TJV.USER_BAN_BUTTON.getValue(), popButton.btnType, popButton.btnUrl, map), 508, str6))), str6));
                    }
                }
            }
        } else {
            arrayList3.add(new UniversalPopupBlock("action", "", str6, str6, str6, Boolean.FALSE, str6, str6, str6, str6, C2097908Jt.LIZJ(new Pair("action_center", new UniversalPopupBlockElement(C1917450zzr.LIZJ(EnumC1706760uW2.PRIMARY.getValue()), c19eg.getString(2131832502), str6, str6, str6, str6, str6, str6, str6, c1917450zzr.LIZLLL(C0TJV.USER_BAN_BUTTON.getValue(), Integer.valueOf(EnumC1917480zzu.LOGOUT.getValue()), "", map), 508, str6))), str6));
            c1917450zzr.LIZJ.put("btn_logout", "1");
        }
        final List listSingletonList2 = Collections.singletonList(new UniversalPopup(true, c1917450zzr.LIZ, r22, r22, EnumC1914300zum.DIALOG.getValue(), r22, r22, arrayList, arrayList2, arrayList3, r22, r22, r22, r22, r22, r22, r22, r22, r22, r22, r22, r22, r22, 0.0f, 0.0f, r22, false, 134216812, r22));
        if (PopupManager.LJII(C1917410zzn.class)) {
            Pair[] pairArr = new Pair[2];
            Object obj4 = ((Map) awS61S0500000_28.l1).get("ban_type");
            if (obj4 == null) {
                obj4 = "";
            }
            pairArr[0] = new Pair("ban_type", obj4);
            pairArr[1] = new Pair("error_reason", "another_popup_showing");
            C1876900ywS.LIZIZ(C2097608Jq.LJIIIIZZ(pairArr));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PopupManager trigger Show on ");
            sbLIZ.append(c19eg.getClass().getSimpleName());
            sbLIZ.append(' ');
            sbLIZ.append(c19eg.hashCode());
            C2188811AlT.LIZIZ(sbLIZ);
            final UserBanAppealStatusResponse userBanAppealStatusResponse2 = (UserBanAppealStatusResponse) awS61S0500000_28.l3;
            final Map map3 = (Map) awS61S0500000_28.l4;
            C1917450zzr c1917450zzr2 = (C1917450zzr) awS61S0500000_28.l0;
            final Map<String, String> map4 = c1917450zzr2.LIZIZ;
            final Map<String, String> map5 = c1917450zzr2.LIZJ;
            final List<Map<String, String>> list2 = c1917450zzr2.LIZLLL;
            PopupManager.LJIJ(new C10GR(c19eg, listSingletonList2, userBanAppealStatusResponse2, map3, map4, map5, list2) { // from class: X.0zzn
                public final C19EG LL;
                public final List<UniversalPopup> LLILLJJLI;
                public final Map<String, Object> LLILLL;
                public final Map<String, String> LLILZ;
                public final Map<String, String> LLILZIL;
                public final List<Map<String, String>> LLILZLL;

                @Override // X.AbstractC20656215sG
                public final boolean canShow() {
                    return true;
                }

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return 0;
                }

                @Override // X.InterfaceC20660415sw
                public final C688120Qyw i2() {
                    C19EG c19eg2 = this.LL;
                    return new C688120Qyw(c19eg2, c19eg2, null);
                }

                @Override // X.AbstractC20656215sG
                public final void onConflict() {
                    super.onConflict();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("PopupManager has Another Popup Showing !!! ");
                    sbLIZ2.append(PopupManager.LJ());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    Pair[] pairArr2 = new Pair[2];
                    String str13 = this.LLILZ.get("ban_type");
                    if (str13 == null) {
                        str13 = "";
                    }
                    pairArr2[0] = new Pair("ban_type", str13);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(PopupManager.LJFF());
                    sbLIZ3.append("_already_showing");
                    pairArr2[1] = new Pair("phase", C2188811AlT.LIZIZ(sbLIZ3));
                    Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr2);
                    InterfaceC1519030pdF interfaceC1519030pdFLIZ = C1876900ywS.LIZ();
                    if (interfaceC1519030pdFLIZ != null) {
                        interfaceC1519030pdFLIZ.LIZ("pns_ban_analysis", mapLJIIIIZZ);
                    }
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    C1917420zzo c1917420zzo = C1917420zzo.LIZ;
                    C1917420zzo.LIZIZ = this.LLILLL;
                    C1917420zzo.LIZJ = this.LLILZ;
                    C1917420zzo.LIZLLL = this.LLILZIL;
                    C1917420zzo.LJ = this.LLILZLL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("PopupManager Real Show. loadUniversalPopupWithCustomLoader ");
                    sbLIZ2.append(this.LL.getClass().getSimpleName());
                    sbLIZ2.append(' ');
                    sbLIZ2.append(this.LL.hashCode());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    Map<String, String> map6 = this.LLILZ;
                    InterfaceC1519030pdF interfaceC1519030pdFLIZ = C1876900ywS.LIZ();
                    if (interfaceC1519030pdFLIZ != null) {
                        interfaceC1519030pdFLIZ.LIZ("pns_ban_load_model", map6);
                    }
                    IUserBanDepService iUserBanDepService = (IUserBanDepService) PluggableExtentionKt.pluggableSpi$default(IUserBanDepService.class, false, false, false, 14, null);
                    if (iUserBanDepService != null && iUserBanDepService.LJ() != null) {
                        C1914170zuZ.LIZJ(new InterfaceC1914160zuY(this.LLILLJJLI) { // from class: X.0zuB
                            public final List<UniversalPopup> LIZ;

                            @Override // X.InterfaceC1914160zuY
                            public final C15O7<UniversalPopupResponse> LIZIZ() {
                                return C15O7.LJIIJ(new UniversalPopupResponse(this.LIZ, null, 2, null));
                            }

                            {
                                this.LIZ = list;
                            }

                            @Override // X.InterfaceC1914160zuY
                            public final C15O7<Unit> LIZ(String str13, Map<String, String> map7) {
                                return C15O7.LJIIJ(Unit.LIZ);
                            }
                        }, this.LL, c1917420zzo);
                    }
                }

                @Override // X.AbstractC20656215sG
                public final void showPopupFailed(int i2, String str13) {
                    super.showPopupFailed(i2, str13);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("PopupManager showPopupFailed !!! ");
                    sbLIZ2.append(i2);
                    sbLIZ2.append(' ');
                    sbLIZ2.append(str13);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    Pair[] pairArr2 = new Pair[2];
                    String str14 = this.LLILZ.get("ban_type");
                    if (str14 == null) {
                        str14 = "";
                    }
                    pairArr2[0] = new Pair("ban_type", str14);
                    pairArr2[1] = new Pair("error_reason", str13);
                    C1876900ywS.LIZIZ(C2097608Jq.LJIIIIZZ(pairArr2));
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LL = c19eg;
                    this.LLILLJJLI = listSingletonList2;
                    this.LLILLL = map3;
                    this.LLILZ = map4;
                    this.LLILZIL = map5;
                    this.LLILZLL = list2;
                }
            }, "compliance_appeal_popup", new InterfaceC20661315t5() { // from class: X.1009
                @Override // X.InterfaceC20661315t5
                public final String getTriggerId() {
                    return "compliance_appeal_popup_pns_resume_trigger";
                }
            });
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS61S0500000_28(C1917450zzr c1917450zzr, C1917450zzr c1917450zzr2, Map<String, String> map, Map<String, String> map2, UserBanAppealStatusResponse userBanAppealStatusResponse, Map<String, ? extends Object> map3) {
        super(1);
        this.$t = map3;
        this.l0 = c1917450zzr;
        this.l1 = c1917450zzr2;
        this.l2 = map;
        this.l3 = map2;
        this.l4 = userBanAppealStatusResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS61S0500000_28(C1917520zzy c1917520zzy, Map map, C1917500zzw c1917500zzw, AwS607S0100000_28 awS607S0100000_28, AFwS315S0000000_28 aFwS315S0000000_28, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1917520zzy;
        this.l1 = map;
        this.l2 = c1917500zzw;
        this.l3 = awS607S0100000_28;
        this.l4 = aFwS315S0000000_28;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS61S0500000_28(Context context, Context context2, C1917290zzb c1917290zzb, C259800zU<Class<?>> c259800zU, InterfaceC1917380zzk interfaceC1917380zzk, InterfaceC1917330zzf interfaceC1917330zzf) {
        super(1);
        this.$t = interfaceC1917330zzf;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = c1917290zzb;
        this.l3 = c259800zU;
        this.l4 = interfaceC1917380zzk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS61S0500000_28(Context context, C1917290zzb c1917290zzb, InterfaceC1917380zzk interfaceC1917380zzk, C259800zU c259800zU, C259800zU c259800zU2, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = c1917290zzb;
        this.l2 = c259800zU;
        this.l3 = interfaceC1917380zzk;
        this.l4 = c259800zU2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS61S0500000_28(DonorListPageFragment donorListPageFragment, DonorListPageFragment donorListPageFragment2, LifecycleOwner lifecycleOwner, C05P0<InterfaceC1665500tRU<Donor>> c05p0, C05P0<Boolean> c05p02, C05P0<Boolean> c05p03) {
        super(1);
        this.$t = c05p03;
        this.l0 = donorListPageFragment;
        this.l1 = donorListPageFragment2;
        this.l2 = lifecycleOwner;
        this.l3 = c05p0;
        this.l4 = c05p02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS61S0500000_28(PromoteVideoSettingSheet promoteVideoSettingSheet, C19EG c19eg, Aweme aweme, PrivacyVideoRestrictionModel privacyVideoRestrictionModel, Bundle bundle, int i) {
        super(1);
        this.$t = i;
        this.l0 = promoteVideoSettingSheet;
        this.l1 = c19eg;
        this.l2 = aweme;
        this.l3 = privacyVideoRestrictionModel;
        this.l4 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS61S0500000_28(Aweme aweme, DialogC1389620mGW dialogC1389620mGW, C19EG c19eg, PromoteVideoSettingSheet promoteVideoSettingSheet, Bundle bundle, int i) {
        super(1);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = dialogC1389620mGW;
        this.l2 = c19eg;
        this.l3 = promoteVideoSettingSheet;
        this.l4 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS61S0500000_28(User user, User user2, C735600StK c735600StK, C1685510txl c1685510txl, UserMatchedAssem userMatchedAssem, C05P0<Boolean> c05p0) {
        super(1);
        this.$t = c05p0;
        this.l0 = user;
        this.l1 = user2;
        this.l2 = c735600StK;
        this.l3 = c1685510txl;
        this.l4 = userMatchedAssem;
    }
}
