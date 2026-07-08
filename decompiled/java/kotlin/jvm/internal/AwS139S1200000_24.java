package kotlin.jvm.internal;

import X.AbstractC1587040rOw;
import X.C04R9;
import X.C09AY;
import X.C13LP;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1587020rOu;
import X.C1587060rOy;
import X.C1587080rP0;
import X.C1587170rP9;
import X.C1589640rT8;
import X.C1595430rcT;
import X.C1599640rjG;
import X.C1614640s7S;
import X.C1614710s7Z;
import X.C16F4;
import X.C19EG;
import X.C1EK7;
import X.C2188811AlT;
import X.C296370BjX;
import X.C319860CgK;
import X.C786410Ut5;
import X.EnumC1584360rKc;
import X.EnumC1586970rOp;
import X.EnumC1587000rOs;
import X.EnumC20538815Yk;
import X.InterfaceC1610880s1O;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import com.bytedance.hox.Hox;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ICrossPlatformLegacyService;
import com.ss.android.ugc.aweme.feed.util.LiveHotReloadCepManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.model.FriendsUserNewContent;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.model.VipSubscriptionDetail;
import com.ss.android.ugc.aweme.model.VipSubscriptionDetailResponse;
import com.ss.android.ugc.aweme.reddot.RedDotService;
import com.ss.android.ugc.aweme.series.vip.fragment.SeriesVipSubscriptionFragment;
import com.ss.android.ugc.aweme.service.IFriendsTabDebugService;
import com.ss.android.ugc.aweme.skylight.SkylightCellLongClickAbilityImpl;
import com.ss.android.ugc.aweme.vibefeed.feed.component.VibeDiggComponent;
import com.tts.oecverify.BdTuring;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public class AwS139S1200000_24 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$0(AwS139S1200000_24 awS139S1200000_24) {
        String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_series_vip_fragment_SeriesVipSubscriptionFragment$setupNavBar$1$2_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra$0;
        VipSubscriptionDetail vipSubscriptionDetail;
        String strT2;
        Locale localeLJII;
        Intent intent;
        C19EG activity = ((SeriesVipSubscriptionFragment) awS139S1200000_24.l1).getActivity();
        if (activity == null || (intent = activity.getIntent()) == null || (strINVOKEVIRTUAL_com_ss_android_ugc_aweme_series_vip_fragment_SeriesVipSubscriptionFragment$setupNavBar$1$2_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra$0 = INVOKEVIRTUAL_com_ss_android_ugc_aweme_series_vip_fragment_SeriesVipSubscriptionFragment$setupNavBar$1$2_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra$0(intent, "enter_from")) == null) {
            strINVOKEVIRTUAL_com_ss_android_ugc_aweme_series_vip_fragment_SeriesVipSubscriptionFragment$setupNavBar$1$2_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra$0 = "";
        }
        VipSubscriptionDetailResponse vipSubscriptionDetailResponse = ((C1614710s7Z) ((SeriesVipSubscriptionFragment) awS139S1200000_24.l1).SR().getState()).LLILLJJLI;
        if (vipSubscriptionDetailResponse != null) {
            vipSubscriptionDetail = vipSubscriptionDetailResponse.detail;
        } else {
            vipSubscriptionDetail = null;
        }
        C1614640s7S.LIZIZ(strINVOKEVIRTUAL_com_ss_android_ugc_aweme_series_vip_fragment_SeriesVipSubscriptionFragment$setupNavBar$1$2_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra$0, vipSubscriptionDetail, "more_info", null, null);
        Context context = ((TuxNavBar) awS139S1200000_24.l2).getContext();
        if (context != null) {
            ICrossPlatformLegacyService iCrossPlatformLegacyService = (ICrossPlatformLegacyService) PluggableExtentionKt.pluggableSpi$default(ICrossPlatformLegacyService.class, false, false, false, 14, null);
            if (iCrossPlatformLegacyService == null || (localeLJII = iCrossPlatformLegacyService.LJII()) == null || (strT2 = C786410Ut5.t2(localeLJII)) == null || strT2.length() <= 0) {
                strT2 = "en";
            }
            try {
                String strEncode = URLEncoder.encode(UriProtector.parse(awS139S1200000_24.s0).buildUpon().appendPath(strT2).build().toString(), "UTF-8");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://webview/?url=");
                sbLIZ.append(strEncode);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(strLIZIZ);
                c1537900q7g.getClass();
                new C1541950qED(context, sparkContext).LIZIZ();
            } catch (UnsupportedEncodingException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS139S1200000_24 awS139S1200000_24) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS139S1200000_24.s0);
        sbLIZ.append(": set page from ");
        sbLIZ.append((EnumC20538815Yk) awS139S1200000_24.l1);
        sbLIZ.append(" -> ");
        sbLIZ.append((EnumC20538815Yk) awS139S1200000_24.l2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS139S1200000_24 awS139S1200000_24) {
        InterfaceC1610880s1O cepService = ((LiveHotReloadCepManager) awS139S1200000_24.l1).getCepService();
        if (cepService != null) {
            cepService.onEvent(awS139S1200000_24.s0, (JSONObject) awS139S1200000_24.l2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0096 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS139S1200000_24 r21) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS139S1200000_24.invoke$3(kotlin.jvm.internal.AwS139S1200000_24):java.lang.Object");
    }

    public static final Object invoke$4(AwS139S1200000_24 awS139S1200000_24) {
        SkylightCellLongClickAbilityImpl skylightCellLongClickAbilityImpl = (SkylightCellLongClickAbilityImpl) awS139S1200000_24.l1;
        Map map = (Map) awS139S1200000_24.l2;
        String str = awS139S1200000_24.s0;
        skylightCellLongClickAbilityImpl.getClass();
        SkylightCellLongClickAbilityImpl.LIZIZ("cancel", str, map);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS139S1200000_24 awS139S1200000_24) {
        SkylightCellLongClickAbilityImpl skylightCellLongClickAbilityImpl = (SkylightCellLongClickAbilityImpl) awS139S1200000_24.l1;
        Map map = (Map) awS139S1200000_24.l2;
        String str = awS139S1200000_24.s0;
        skylightCellLongClickAbilityImpl.getClass();
        SkylightCellLongClickAbilityImpl.LIZIZ("cancel", str, map);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AwS139S1200000_24 r8) {
        /*
            X.0rP9 r0 = X.C1587170rP9.LIZ
            java.lang.Object r4 = r8.l1
            com.ss.android.ugc.aweme.friendstab.model.UserNewContent r4 = (com.ss.android.ugc.aweme.friendstab.model.UserNewContent) r4
            java.lang.String r1 = r8.s0
            java.lang.Object r3 = r8.l2
            com.ss.android.ugc.aweme.friendstab.model.UserNewContent r3 = (com.ss.android.ugc.aweme.friendstab.model.UserNewContent) r3
            r0.getClass()
            java.lang.String r0 = "click"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L93
            if (r4 == 0) goto L90
            X.0rOF r1 = r4.getFeedType()
            X.0rOF r0 = X.EnumC1586610rOF.FRIENDS_FEED
            if (r1 == r0) goto L29
            X.0rOF r1 = r4.getFeedType()
            X.0rOF r0 = X.EnumC1586610rOF.FRIENDS_WATER_FALL
            if (r1 != r0) goto L90
        L29:
            java.lang.Object r0 = r8.l1
            com.ss.android.ugc.aweme.friendstab.model.UserNewContent r0 = (com.ss.android.ugc.aweme.friendstab.model.UserNewContent) r0
            if (r0 == 0) goto L90
            com.ss.android.ugc.aweme.friendstab.model.FriendsRedDotUser r3 = r0.getUser()
            if (r3 == 0) goto L90
            java.lang.Object r0 = r8.l1
            com.ss.android.ugc.aweme.friendstab.model.UserNewContent r0 = (com.ss.android.ugc.aweme.friendstab.model.UserNewContent) r0
            long r1 = X.C1587170rP9.LIZJ(r0)
            java.lang.String r7 = r3.uid
            float r6 = r3.affinityScore
            java.lang.String r5 = r8.s0
            X.09Gk r4 = new X.09Gk
            r4.<init>()
            java.lang.String r3 = "enter_from"
            java.lang.String r0 = "homepage_friends"
            r4.LJIIIIZZ(r3, r0)
            java.lang.String r0 = "heads_user_id"
            r4.LJIIIIZZ(r0, r7)
            java.lang.String r0 = "affinity_score"
            r4.LIZIZ(r6, r0)
            java.lang.String r0 = "exit_method"
            r4.LJIIIIZZ(r0, r5)
            java.lang.String r0 = "duration"
            r4.LIZLLL(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "friends_heads_dot_duration"
            X.C20684815ws.LJIILLIIL(r0, r1)
            X.0rPE r0 = X.C1587220rPE.LIZ
            r0.getClass()
            X.01GW r0 = X.C1587220rPE.LJFF
            java.lang.Object r2 = r0.getValue()
            com.bytedance.keva.Keva r2 = (com.bytedance.keva.Keva) r2
            java.lang.String r1 = X.C1587220rPE.LIZIZ()
            java.lang.String r0 = ""
            r2.storeString(r1, r0)
            java.lang.Object r2 = r8.l2
            com.ss.android.ugc.aweme.friendstab.model.UserNewContent r2 = (com.ss.android.ugc.aweme.friendstab.model.UserNewContent) r2
            if (r2 == 0) goto L90
            kotlin.jvm.internal.AwS568S0100000_24 r1 = new kotlin.jvm.internal.AwS568S0100000_24
            r0 = 1829(0x725, float:2.563E-42)
            r1.<init>(r2, r0)
            X.C087Q.LIZ(r1)
        L90:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L93:
            r2 = 0
            if (r4 == 0) goto Lc2
            com.ss.android.ugc.aweme.friendstab.model.FriendsRedDotUser r0 = r4.getUser()
            if (r0 == 0) goto Lc2
            java.lang.String r1 = r0.uid
        L9e:
            if (r3 == 0) goto La8
            com.ss.android.ugc.aweme.friendstab.model.FriendsRedDotUser r0 = r3.getUser()
            if (r0 == 0) goto La8
            java.lang.String r2 = r0.uid
        La8:
            if (r4 == 0) goto L90
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
            if (r0 != 0) goto L90
            X.0rOF r1 = r4.getFeedType()
            X.0rOF r0 = X.EnumC1586610rOF.FRIENDS_FEED
            if (r1 == r0) goto L29
            X.0rOF r1 = r4.getFeedType()
            X.0rOF r0 = X.EnumC1586610rOF.FRIENDS_WATER_FALL
            if (r1 != r0) goto L90
            goto L29
        Lc2:
            r1 = r2
            goto L9e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS139S1200000_24.invoke$6(kotlin.jvm.internal.AwS139S1200000_24):java.lang.Object");
    }

    public static final Object invoke$7(AwS139S1200000_24 awS139S1200000_24) {
        SingleTabCounter next;
        C1587020rOu c1587020rOu = (C1587020rOu) awS139S1200000_24.l1;
        String str = awS139S1200000_24.s0;
        EnumC1586970rOp enumC1586970rOp = (EnumC1586970rOp) awS139S1200000_24.l2;
        c1587020rOu.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invalidate tab dot by scene of ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        IBottomTabLayoutAbility iBottomTabLayoutAbilityLJJIIZI = C1587020rOu.LJJIIZI();
        if (iBottomTabLayoutAbilityLJJIIZI != null && iBottomTabLayoutAbilityLJJIIZI.hv0()) {
            C1587060rOy c1587060rOy = c1587020rOu.LLILZIL;
            if (c1587060rOy != null) {
                c1587060rOy.LIZIZ();
            }
        } else {
            if (C296370BjX.LIZ()) {
                if (!C1589640rT8.LIZIZ.C2()) {
                    int iLIZ = c1587020rOu.LLIZ.LIZ();
                    if (iLIZ > 0) {
                        c1587020rOu.LJJIJIL(str, iLIZ, enumC1586970rOp);
                    } else if (Intrinsics.LJFF(str, "click unlogin")) {
                        RedDotService.LIZ.getClass();
                        RedDotService redDotServiceLIZ = C04R9.LIZ();
                        if (redDotServiceLIZ != null) {
                            redDotServiceLIZ.LJI(EnumC1584360rKc.FRIENDS, null);
                        }
                        C1587060rOy c1587060rOy2 = c1587020rOu.LLILZIL;
                        if (c1587060rOy2 != null) {
                            c1587060rOy2.LIZJ();
                        }
                    } else {
                        C1587060rOy c1587060rOy3 = c1587020rOu.LLILZIL;
                        if (c1587060rOy3 == null || c1587060rOy3.getDotCount() != 0) {
                            RedDotService.LIZ.getClass();
                            RedDotService redDotServiceLIZ2 = C04R9.LIZ();
                            if (redDotServiceLIZ2 != null) {
                                redDotServiceLIZ2.LJI(EnumC1584360rKc.FRIENDS, null);
                            }
                        }
                        c1587020rOu.LJJIZ(enumC1586970rOp);
                        C1EK7.LIZ.getClass();
                        if (!C1EK7.LIZ() && !c1587020rOu.LLILZ) {
                            C1587060rOy c1587060rOy4 = c1587020rOu.LLILZIL;
                            if (c1587060rOy4 != null) {
                                c1587060rOy4.LIZ(0);
                            }
                        } else {
                            C1587060rOy c1587060rOy5 = c1587020rOu.LLILZIL;
                            if (c1587060rOy5 != null) {
                                c1587060rOy5.LIZJ();
                            }
                            c1587020rOu.LLILZ = false;
                        }
                    }
                } else {
                    C1587060rOy c1587060rOy6 = c1587020rOu.LLILZIL;
                    if (c1587060rOy6 == null || c1587060rOy6.getDotCount() != 0) {
                        RedDotService.LIZ.getClass();
                        RedDotService redDotServiceLIZ3 = C04R9.LIZ();
                        if (redDotServiceLIZ3 != null) {
                            redDotServiceLIZ3.LJI(EnumC1584360rKc.FRIENDS, null);
                        }
                    }
                    c1587020rOu.LJJIZ(enumC1586970rOp);
                    C1587060rOy c1587060rOy7 = c1587020rOu.LLILZIL;
                    if (c1587060rOy7 != null) {
                        c1587060rOy7.LIZ(0);
                    }
                }
            } else if (!C1589640rT8.LIZIZ.W2()) {
                int iLIZ2 = c1587020rOu.LLIZ.LIZ();
                if (iLIZ2 > 0) {
                    c1587020rOu.LJJIJIL(str, iLIZ2, enumC1586970rOp);
                } else if (Intrinsics.LJFF(str, "click unlogin")) {
                    C1587060rOy c1587060rOy8 = c1587020rOu.LLILZIL;
                    if (c1587060rOy8 != null) {
                        c1587060rOy8.LIZJ();
                    }
                    RedDotService.LIZ.getClass();
                    RedDotService redDotServiceLIZ4 = C04R9.LIZ();
                    if (redDotServiceLIZ4 != null) {
                        redDotServiceLIZ4.LJI(EnumC1584360rKc.FRIENDS, null);
                    }
                } else {
                    C1587060rOy c1587060rOy9 = c1587020rOu.LLILZIL;
                    if (c1587060rOy9 == null || c1587060rOy9.getDotCount() != 0) {
                        RedDotService.LIZ.getClass();
                        RedDotService redDotServiceLIZ5 = C04R9.LIZ();
                        if (redDotServiceLIZ5 != null) {
                            redDotServiceLIZ5.LJI(EnumC1584360rKc.FRIENDS, null);
                        }
                    }
                    c1587020rOu.LJJIZ(enumC1586970rOp);
                    C1EK7.LIZ.getClass();
                    if (C1EK7.LIZ() && c1587020rOu.LLILZ) {
                        C1587060rOy c1587060rOy10 = c1587020rOu.LLILZIL;
                        if (c1587060rOy10 != null) {
                            c1587060rOy10.LIZJ();
                        }
                        c1587020rOu.LLILZ = false;
                    } else {
                        C1587060rOy c1587060rOy11 = c1587020rOu.LLILZIL;
                        if (c1587060rOy11 != null) {
                            c1587060rOy11.LIZ(0);
                        }
                    }
                }
            } else {
                C1587060rOy c1587060rOy12 = c1587020rOu.LLILZIL;
                if (c1587060rOy12 == null || c1587060rOy12.getDotCount() != 0) {
                    RedDotService.LIZ.getClass();
                    RedDotService redDotServiceLIZ6 = C04R9.LIZ();
                    if (redDotServiceLIZ6 != null) {
                        redDotServiceLIZ6.LJI(EnumC1584360rKc.FRIENDS, null);
                    }
                }
                c1587020rOu.LJJIZ(enumC1586970rOp);
                C1587060rOy c1587060rOy13 = c1587020rOu.LLILZIL;
                if (c1587060rOy13 != null) {
                    c1587060rOy13.LIZ(0);
                }
            }
            Iterator it2 = ((ArrayList) c1587020rOu.LJJJ()).iterator();
            while (it2.hasNext()) {
                String tag = ((ISocialTabProtocol) it2.next()).getTag();
                IBottomTabLayoutAbility iBottomTabLayoutAbilityLJJIIZI2 = C1587020rOu.LJJIIZI();
                if (iBottomTabLayoutAbilityLJJIIZI2 != null && iBottomTabLayoutAbilityLJJIIZI2.hv0()) {
                    Iterator<SingleTabCounter> it3 = c1587020rOu.LLIZ.LIZIZ.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (Intrinsics.LJFF(next.tag, tag)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    SingleTabCounter singleTabCounter = next;
                    if (singleTabCounter != null && Intrinsics.LJFF(tag, "FRIENDS_FEED")) {
                        C1589640rT8.LIZIZ.g3(singleTabCounter.numberCount);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS139S1200000_24 awS139S1200000_24) {
        int i;
        int i2;
        FriendsUserNewContent friendsUserNewContent;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse;
        ArrayList<FriendsUserNewContent> avatarList;
        int redDotCount;
        String fakeCountReason;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse2;
        NewContentResponse.FriendsFeedRedDotResponse friendsFeedResponse3;
        C1587060rOy c1587060rOy;
        AbstractC1587040rOw abstractC1587040rOw = (AbstractC1587040rOw) awS139S1200000_24.l1;
        String str = awS139S1200000_24.s0;
        EnumC1586970rOp enumC1586970rOp = (EnumC1586970rOp) awS139S1200000_24.l2;
        abstractC1587040rOw.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invalidate tab dot by scene of ");
        sbLIZ.append(str);
        sbLIZ.append(", source = ");
        sbLIZ.append(enumC1586970rOp);
        C2188811AlT.LIZIZ(sbLIZ);
        C1599640rjG c1599640rjG = C1599640rjG.LIZIZ;
        if (c1599640rjG.Ru()) {
            C1587060rOy c1587060rOy2 = abstractC1587040rOw.LLILZIL;
            if (c1587060rOy2 != null) {
                c1587060rOy2.LIZIZ();
            }
        } else {
            C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
            if (!c1589640rT8.C2()) {
                int i3 = abstractC1587040rOw.LLIZ;
                if (i3 > 0) {
                    if (abstractC1587040rOw.LLILZIL != null && C1587060rOy.LIZLLL() && (c1587060rOy = abstractC1587040rOw.LLILZIL) != null) {
                        c1587060rOy.LIZJ();
                    }
                    StateOwner stateOwner = StateOwner.LL;
                    stateOwner.LIZ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("numberDotUpdate to ");
                    sbLIZ2.append(i3);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    IFriendsTabDebugService iFriendsTabDebugService = (IFriendsTabDebugService) ServiceManager.get().getService(IFriendsTabDebugService.class);
                    if (iFriendsTabDebugService != null) {
                        iFriendsTabDebugService.LJFF();
                    }
                    C19EG c19egLIZIZ = stateOwner.LIZIZ();
                    if (c19egLIZIZ != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("showNumberRedDot count:");
                        sbLIZ3.append(i3);
                        sbLIZ3.append(",lastRedDotCount:");
                        sbLIZ3.append(abstractC1587040rOw.LLJI);
                        sbLIZ3.append(',');
                        C2188811AlT.LIZIZ(sbLIZ3);
                        if (abstractC1587040rOw.LLJI != i3) {
                            boolean z = !c1589640rT8.W2();
                            C1EK7.LIZ.getClass();
                            if (C1EK7.LIZ()) {
                                i2 = 0;
                            } else {
                                i2 = i3;
                            }
                            if (z) {
                                C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
                                String strBQ2 = Hox.LLJILJIL.LIZ(c19egLIZIZ).BQ2();
                                NewContentResponse newContentResponse = abstractC1587040rOw.LLILLJJLI;
                                if (newContentResponse != null && (friendsFeedResponse3 = newContentResponse.getFriendsFeedResponse()) != null) {
                                    redDotCount = friendsFeedResponse3.getRedDotCount();
                                } else {
                                    redDotCount = 0;
                                }
                                NewContentResponse newContentResponse2 = abstractC1587040rOw.LLILLJJLI;
                                if (newContentResponse2 == null || (friendsFeedResponse2 = newContentResponse2.getFriendsFeedResponse()) == null || (fakeCountReason = friendsFeedResponse2.getFakeCountReason()) == null) {
                                    fakeCountReason = "";
                                }
                                IBottomFriendsTabAvatarAbility iBottomFriendsTabAvatarAbilityLJJIIZI = abstractC1587040rOw.LJJIIZI();
                                c1587170rP9.getClass();
                                i = i3;
                                C1587170rP9.LJIIL(i2, redDotCount, i3, iBottomFriendsTabAvatarAbilityLJJIIZI, enumC1586970rOp, strBQ2, fakeCountReason, "friends");
                            } else {
                                i = i3;
                            }
                            if (c1599640rjG.Vu() == null) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("showNumberRedDotV2,preloadWithInsert(),scene:");
                                sbLIZ4.append(str);
                                sbLIZ4.append(",lastRedDotCount:");
                                sbLIZ4.append(abstractC1587040rOw.LLJI);
                                sbLIZ4.append(",count:");
                                sbLIZ4.append(i);
                                sbLIZ4.append(",fragment == null,!tryToInteruptRequestBySource(source):");
                                sbLIZ4.append(!C1587080rP0.LIZ(enumC1586970rOp));
                                sbLIZ4.append(",!isFromLocalChange(scene):");
                                sbLIZ4.append(!C1587080rP0.LIZIZ(str));
                                sbLIZ4.append(",count > 0:");
                                sbLIZ4.append(true);
                                sbLIZ4.append(",tabCount:");
                                sbLIZ4.append(abstractC1587040rOw.LLIZ);
                                C2188811AlT.LIZIZ(sbLIZ4);
                                if (!C1587080rP0.LIZ(enumC1586970rOp) && !C1587080rP0.LIZIZ(str)) {
                                    C1595430rcT c1595430rcT = C1595430rcT.LIZIZ;
                                    boolean zEnableTabAvatar = c1595430rcT.LIZIZ().enableTabAvatar();
                                    NewContentResponse latestResponse = c1595430rcT.LIZIZ().getLatestResponse();
                                    if (latestResponse != null && (friendsFeedResponse = latestResponse.getFriendsFeedResponse()) != null && (avatarList = friendsFeedResponse.getAvatarList()) != null) {
                                        friendsUserNewContent = (FriendsUserNewContent) C13LP.LJJJLL(avatarList);
                                    } else {
                                        friendsUserNewContent = null;
                                    }
                                    if (!zEnableTabAvatar) {
                                        friendsUserNewContent = null;
                                    }
                                    c1599640rjG.dv(friendsUserNewContent, EnumC1587000rOs.NUMBER_DOT_CHANGE, enumC1586970rOp);
                                }
                            }
                        } else {
                            i = i3;
                        }
                        C1EK7.LIZ.getClass();
                        if (C1EK7.LIZ()) {
                            if (c1589640rT8.W2()) {
                                C1587060rOy c1587060rOy3 = abstractC1587040rOw.LLILZIL;
                                if (c1587060rOy3 != null) {
                                    c1587060rOy3.LIZIZ();
                                }
                                C1587060rOy c1587060rOy4 = abstractC1587040rOw.LLILZIL;
                                if (c1587060rOy4 != null) {
                                    c1587060rOy4.LIZJ();
                                }
                                C1587060rOy c1587060rOy5 = abstractC1587040rOw.LLILZIL;
                                if (c1587060rOy5 != null) {
                                    c1587060rOy5.LIZ(0);
                                }
                            } else {
                                C1587060rOy c1587060rOy6 = abstractC1587040rOw.LLILZIL;
                                if (c1587060rOy6 != null) {
                                    c1587060rOy6.LJFF();
                                }
                                C1587060rOy c1587060rOy7 = abstractC1587040rOw.LLILZIL;
                                if (c1587060rOy7 != null) {
                                    c1587060rOy7.LIZ(0);
                                }
                            }
                            abstractC1587040rOw.LLILZ = true;
                            abstractC1587040rOw.LLJI = i;
                        } else {
                            C1587060rOy c1587060rOy8 = abstractC1587040rOw.LLILZIL;
                            if (c1587060rOy8 != null) {
                                c1587060rOy8.LIZ(i);
                            }
                            abstractC1587040rOw.LLJI = i;
                            if (c1589640rT8.W2()) {
                                C1587060rOy c1587060rOy9 = abstractC1587040rOw.LLILZIL;
                                if (c1587060rOy9 != null) {
                                    c1587060rOy9.LIZIZ();
                                }
                                C1587060rOy c1587060rOy10 = abstractC1587040rOw.LLILZIL;
                                if (c1587060rOy10 != null) {
                                    c1587060rOy10.LIZJ();
                                }
                                C1587060rOy c1587060rOy11 = abstractC1587040rOw.LLILZIL;
                                if (c1587060rOy11 != null) {
                                    c1587060rOy11.LIZ(0);
                                }
                            }
                        }
                    }
                } else if (Intrinsics.LJFF(str, "click unlogin") && C319860CgK.LIZ()) {
                    RedDotService.LIZ.getClass();
                    RedDotService redDotServiceLIZ = C04R9.LIZ();
                    if (redDotServiceLIZ != null) {
                        redDotServiceLIZ.LJI(EnumC1584360rKc.FRIENDS, null);
                    }
                    C1587060rOy c1587060rOy12 = abstractC1587040rOw.LLILZIL;
                    if (c1587060rOy12 != null) {
                        c1587060rOy12.LIZJ();
                    }
                } else {
                    C1587060rOy c1587060rOy13 = abstractC1587040rOw.LLILZIL;
                    if (c1587060rOy13 == null || c1587060rOy13.getDotCount() != 0) {
                        RedDotService.LIZ.getClass();
                        RedDotService redDotServiceLIZ2 = C04R9.LIZ();
                        if (redDotServiceLIZ2 != null) {
                            redDotServiceLIZ2.LJI(EnumC1584360rKc.FRIENDS, null);
                        }
                    }
                    C1EK7.LIZ.getClass();
                    if (!C1EK7.LIZ() && !abstractC1587040rOw.LLILZ) {
                        abstractC1587040rOw.LJJIJIL(enumC1586970rOp);
                        C1587060rOy c1587060rOy14 = abstractC1587040rOw.LLILZIL;
                        if (c1587060rOy14 != null) {
                            c1587060rOy14.LIZ(0);
                        }
                    } else {
                        C1587060rOy c1587060rOy15 = abstractC1587040rOw.LLILZIL;
                        if (c1587060rOy15 != null) {
                            c1587060rOy15.LIZJ();
                        }
                        abstractC1587040rOw.LLILZ = false;
                        abstractC1587040rOw.LJJIJIL(enumC1586970rOp);
                    }
                }
            } else {
                C1587060rOy c1587060rOy16 = abstractC1587040rOw.LLILZIL;
                if (c1587060rOy16 == null || c1587060rOy16.getDotCount() != 0) {
                    RedDotService.LIZ.getClass();
                    RedDotService redDotServiceLIZ3 = C04R9.LIZ();
                    if (redDotServiceLIZ3 != null) {
                        redDotServiceLIZ3.LJI(EnumC1584360rKc.FRIENDS, null);
                    }
                }
                abstractC1587040rOw.LJJIJIL(enumC1586970rOp);
                C1587060rOy c1587060rOy17 = abstractC1587040rOw.LLILZIL;
                if (c1587060rOy17 != null) {
                    c1587060rOy17.LIZ(0);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS139S1200000_24 awS139S1200000_24) {
        ((VibeDiggComponent) awS139S1200000_24.l1).ho(awS139S1200000_24.s0, (ViewGroup) awS139S1200000_24.l2);
        return Unit.LIZ;
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_aweme_series_vip_fragment_SeriesVipSubscriptionFragment$setupNavBar$1$2_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra$0(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S1200000_24(C1587020rOu c1587020rOu, String str, EnumC1586970rOp enumC1586970rOp, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1587020rOu;
        this.s0 = str;
        this.l2 = enumC1586970rOp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S1200000_24(AbstractC1587040rOw abstractC1587040rOw, String str, EnumC1586970rOp enumC1586970rOp, int i) {
        super(0);
        this.$t = i;
        this.l1 = abstractC1587040rOw;
        this.s0 = str;
        this.l2 = enumC1586970rOp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS139S1200000_24(LiveHotReloadCepManager liveHotReloadCepManager, LiveHotReloadCepManager liveHotReloadCepManager2, String str, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l1 = liveHotReloadCepManager;
        this.s0 = liveHotReloadCepManager2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S1200000_24(LiveHotReloadCepManager liveHotReloadCepManager, String str, JSONObject jSONObject, int i) {
        super(0);
        this.$t = i;
        this.l1 = liveHotReloadCepManager;
        this.s0 = str;
        this.l2 = jSONObject;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S1200000_24(UserNewContent userNewContent, String str, UserNewContent userNewContent2, int i) {
        super(0);
        this.$t = i;
        this.l1 = userNewContent;
        this.s0 = str;
        this.l2 = userNewContent2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S1200000_24(SeriesVipSubscriptionFragment seriesVipSubscriptionFragment, TuxNavBar tuxNavBar, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = seriesVipSubscriptionFragment;
        this.l2 = tuxNavBar;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS139S1200000_24(SkylightCellLongClickAbilityImpl skylightCellLongClickAbilityImpl, SkylightCellLongClickAbilityImpl skylightCellLongClickAbilityImpl2, Map<String, String> map, String str) {
        super(0);
        this.$t = str;
        this.l1 = skylightCellLongClickAbilityImpl;
        this.l2 = skylightCellLongClickAbilityImpl2;
        this.s0 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S1200000_24(VibeDiggComponent vibeDiggComponent, String str, C16F4 c16f4, int i) {
        super(0);
        this.$t = i;
        this.l1 = vibeDiggComponent;
        this.s0 = str;
        this.l2 = c16f4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S1200000_24(String str, EnumC20538815Yk enumC20538815Yk, EnumC20538815Yk enumC20538815Yk2, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = enumC20538815Yk;
        this.l2 = enumC20538815Yk2;
    }
}
