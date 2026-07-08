package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C10EW;
import X.C1218400hoM;
import X.C1243410iSh;
import X.C1246990iYT;
import X.C1247000iYU;
import X.C1247130iYh;
import X.C1247140iYi;
import X.C1247490iZH;
import X.C1247500iZI;
import X.C1247680iZa;
import X.C1247690iZb;
import X.C1253000iiA;
import X.C1253010iiB;
import X.C1264860j1I;
import X.C1265420j2C;
import X.C1388190mED;
import X.C1391190mJ3;
import X.C1393030mM1;
import X.C13LP;
import X.C19EG;
import X.C343950De5;
import X.EnumC1236450iHT;
import X.EnumC1247010iYV;
import X.InterfaceC1264850j1H;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufSearchCell;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufUserCell;
import com.ss.android.ugc.aweme.ui.CancelUploadOrReeditSheetContentFragment;
import com.ss.android.ugc.aweme.upvote.detail.repostshare.RepostActionCell;
import com.ss.android.ugc.profile.business.ur.school.datasource.CampusGroup;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups.cell.SchoolGroupsItemCell;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class AkS58S0200000_19 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS58S0200000_19 akS58S0200000_19, View view) {
        ((Function0) akS58S0200000_19.l0).invoke();
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((CancelUploadOrReeditSheetContentFragment) akS58S0200000_19.l1, new C343950De5());
    }

    public static final void LIZ$1(AkS58S0200000_19 akS58S0200000_19, View view) {
        RepostActionCell repostActionCell = (RepostActionCell) akS58S0200000_19.l0;
        if (repostActionCell.LLILLL) {
            ((C1218400hoM) akS58S0200000_19.l1).LLILZ.invoke();
            return;
        }
        AssemVMLazy assemVMLazy = repostActionCell.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = RepostActionCell.LLILZIL;
        assemVMLazy.getValue().setStateImmediate(AFwS256S0000000_18.get$arr$(784));
    }

    public static final void LIZ$2(AkS58S0200000_19 akS58S0200000_19, View view) {
        int value;
        Integer numValueOf;
        EnumC1247010iYV enumC1247010iYV;
        EnumC1247010iYV enumC1247010iYV2;
        String str;
        boolean z;
        EnumC1247010iYV enumC1247010iYV3;
        EnumC1247010iYV enumC1247010iYV4;
        int value2;
        Integer numValueOf2;
        EnumC1247010iYV enumC1247010iYV5;
        EnumC1247010iYV enumC1247010iYV6;
        String str2;
        Integer numValueOf3;
        int value3;
        EnumC1247010iYV enumC1247010iYV7;
        EnumC1247010iYV enumC1247010iYV8;
        final InterfaceC1264850j1H interfaceC1264850j1H = (InterfaceC1264850j1H) akS58S0200000_19.l0;
        final User user = (User) akS58S0200000_19.l1;
        View viewBl = interfaceC1264850j1H.bl();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(interfaceC1264850j1H.getFragmentActivity());
        if (c19egLIZIZ != null) {
            viewBl.getContext();
            C1247140iYi c1247140iYi = new C1247140iYi();
            ArrayList arrayList = new ArrayList();
            String str3 = "following_list";
            int value4 = 0;
            Integer numValueOf4 = null;
            if (C1253000iiA.LIZ() && (user.getFollowStatus() == 1 || user.getFollowStatus() == 2 || user.getFollowStatus() == 4)) {
                String strYe = interfaceC1264850j1H.Ye();
                if (Intrinsics.LJFF(strYe, "following_relation")) {
                    str2 = "following_list";
                } else if (Intrinsics.LJFF(strYe, "follower_relation")) {
                    str2 = "fans";
                } else {
                    str2 = "";
                }
                C1265420j2C c1265420j2CZ0 = interfaceC1264850j1H.Z0();
                if (c1265420j2CZ0 != null && (enumC1247010iYV8 = c1265420j2CZ0.LLILZIL) != null) {
                    numValueOf3 = Integer.valueOf(enumC1247010iYV8.getValue());
                } else {
                    numValueOf3 = null;
                }
                boolean zLIZLLL = C1247000iYU.LIZLLL(numValueOf3, Integer.valueOf(user.getFollowStatus()));
                Context context = viewBl.getContext();
                C1265420j2C c1265420j2CZ02 = interfaceC1264850j1H.Z0();
                if (c1265420j2CZ02 != null && (enumC1247010iYV7 = c1265420j2CZ02.LLILZIL) != null) {
                    value3 = enumC1247010iYV7.getValue();
                } else {
                    value3 = 0;
                }
                arrayList.add(new C1247490iZH(user, context, str2, value3, zLIZLLL));
            }
            if (Intrinsics.LJFF(interfaceC1264850j1H.Ye(), "following_relation")) {
                if (C1253010iiB.LIZJ.LJJIIZ()) {
                    Context context2 = viewBl.getContext();
                    String strLIZ = C1264860j1I.LIZ(interfaceC1264850j1H);
                    C1265420j2C c1265420j2CZ03 = interfaceC1264850j1H.Z0();
                    if (c1265420j2CZ03 != null && (enumC1247010iYV6 = c1265420j2CZ03.LLILZIL) != null) {
                        value2 = enumC1247010iYV6.getValue();
                    } else {
                        value2 = 0;
                    }
                    C1265420j2C c1265420j2CZ04 = interfaceC1264850j1H.Z0();
                    if (c1265420j2CZ04 != null && (enumC1247010iYV5 = c1265420j2CZ04.LLILZIL) != null) {
                        numValueOf2 = Integer.valueOf(enumC1247010iYV5.getValue());
                    } else {
                        numValueOf2 = null;
                    }
                    arrayList.add(new C1247500iZI(user, context2, strLIZ, value2, C1247000iYU.LIZLLL(numValueOf2, Integer.valueOf(user.getFollowStatus())) ? 1 : 0, new C10EW() { // from class: X.0iZR
                        @Override // X.C10EW
                        public final C10EF LIZIZ() {
                            return null;
                        }

                        @Override // X.C10EW
                        public final void LIZJ() {
                        }

                        @Override // X.C10EW
                        public final String LIZLLL() {
                            return "";
                        }

                        @Override // X.C10EW
                        public final void LJ(int i, int i2) {
                            if (i == 4) {
                                C1264860j1I.LJIIIIZZ(interfaceC1264850j1H, i2);
                                user.setLivePushNotificationStatus(i2);
                            }
                        }
                    }));
                }
            } else if (Intrinsics.LJFF(interfaceC1264850j1H.Ye(), "follower_relation")) {
                Context context3 = viewBl.getContext();
                String strLIZ2 = C1264860j1I.LIZ(interfaceC1264850j1H);
                String strLIZIZ = C1264860j1I.LIZIZ(interfaceC1264850j1H);
                C1265420j2C c1265420j2CZ05 = interfaceC1264850j1H.Z0();
                if (c1265420j2CZ05 != null && (enumC1247010iYV2 = c1265420j2CZ05.LLILZIL) != null) {
                    value = enumC1247010iYV2.getValue();
                } else {
                    value = 0;
                }
                C1265420j2C c1265420j2CZ06 = interfaceC1264850j1H.Z0();
                if (c1265420j2CZ06 != null && (enumC1247010iYV = c1265420j2CZ06.LLILZIL) != null) {
                    numValueOf = Integer.valueOf(enumC1247010iYV.getValue());
                } else {
                    numValueOf = null;
                }
                arrayList.add(new C1246990iYT(user, context3, strLIZ2, strLIZIZ, value, C1247000iYU.LIZLLL(numValueOf, Integer.valueOf(user.getFollowStatus())) ? 1 : 0, new AwS420S0200000_19(user, interfaceC1264850j1H, 140)));
            }
            ((ArrayList) c1247140iYi.LIZ).addAll(C13LP.LLIIII(arrayList));
            C1247130iYh c1247130iYhLIZ = c1247140iYi.LIZ();
            FragmentManager supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
            String strYe2 = interfaceC1264850j1H.Ye();
            if (Intrinsics.LJFF(strYe2, "following_relation")) {
                str = "more_action_sheet_following";
            } else if (!Intrinsics.LJFF(strYe2, "follower_relation")) {
                str = "";
            } else {
                str = "more_action_sheet_follower";
            }
            String strYe3 = interfaceC1264850j1H.Ye();
            if (!Intrinsics.LJFF(strYe3, "following_relation")) {
                if (Intrinsics.LJFF(strYe3, "follower_relation")) {
                    str3 = "fans";
                } else {
                    str3 = "";
                }
            }
            int followStatus = user.getFollowStatus();
            if (C1247000iYU.LIZIZ(user) != null) {
                z = true;
            } else {
                z = false;
            }
            C1265420j2C c1265420j2CZ07 = interfaceC1264850j1H.Z0();
            if (c1265420j2CZ07 != null && (enumC1247010iYV4 = c1265420j2CZ07.LLILZIL) != null) {
                value4 = enumC1247010iYV4.getValue();
            }
            C1265420j2C c1265420j2CZ08 = interfaceC1264850j1H.Z0();
            if (c1265420j2CZ08 != null && (enumC1247010iYV3 = c1265420j2CZ08.LLILZIL) != null) {
                numValueOf4 = Integer.valueOf(enumC1247010iYV3.getValue());
            }
            c1247130iYhLIZ.LIZ(supportFragmentManager, str, new C1243410iSh(str3, "card_list", "show", followStatus, z, value4, C1247000iYU.LIZLLL(numValueOf4, Integer.valueOf(user.getFollowStatus())) ? 1 : 0));
        }
    }

    public static final void LIZ$3(AkS58S0200000_19 akS58S0200000_19, View view) {
        ((SchoolGroupsItemCell) akS58S0200000_19.l0).L5((CampusGroup) akS58S0200000_19.l1, EnumC1236450iHT.GROUP_NAME);
    }

    public static final void LIZ$4(AkS58S0200000_19 akS58S0200000_19, View view) {
        ((SchoolGroupsItemCell) akS58S0200000_19.l0).L5((CampusGroup) akS58S0200000_19.l1, EnumC1236450iHT.GROUP_HEAD);
    }

    public static final void LIZ$5(AkS58S0200000_19 akS58S0200000_19, View view) {
        ((SchoolGroupsItemCell) akS58S0200000_19.l0).L5((CampusGroup) akS58S0200000_19.l1, EnumC1236450iHT.CELL);
    }

    public static final void LIZ$6(AkS58S0200000_19 akS58S0200000_19, View view) {
        int i;
        boolean z;
        User user = (User) akS58S0200000_19.l0;
        MufSearchCell mufSearchCell = (MufSearchCell) akS58S0200000_19.l1;
        View view2 = mufSearchCell.itemView;
        TuxIconView tuxIconView = (TuxIconView) mufSearchCell.LLILZ.getValue();
        C1247680iZa item = ((MufSearchCell) akS58S0200000_19.l1).getItem();
        if (item != null) {
            i = item.LLILZIL;
        } else {
            i = 0;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(view2.getContext());
        if (c19egLIZIZ != null) {
            view2.getContext();
            C1247140iYi c1247140iYi = new C1247140iYi();
            if (C1253000iiA.LIZ() && (user.getFollowStatus() == 1 || user.getFollowStatus() == 2 || user.getFollowStatus() == 4)) {
                ((ArrayList) c1247140iYi.LIZ).add(new C1247490iZH(user, view2.getContext(), "friends_list", i, C1247000iYU.LIZLLL(Integer.valueOf(i), Integer.valueOf(user.getFollowStatus()))));
            }
            boolean zLIZLLL = C1247000iYU.LIZLLL(Integer.valueOf(i), Integer.valueOf(user.getFollowStatus()));
            ((ArrayList) c1247140iYi.LIZ).add(new C1393030mM1(user, view2, tuxIconView));
            C1247130iYh c1247130iYhLIZ = c1247140iYi.LIZ();
            FragmentManager supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
            int followStatus = user.getFollowStatus();
            if (C1247000iYU.LIZIZ(user) != null) {
                z = true;
            } else {
                z = false;
            }
            c1247130iYhLIZ.LIZ(supportFragmentManager, "more_action_sheet_friends", new C1243410iSh("friends_list", "card_list", "show", followStatus, z, i, zLIZLLL ? 1 : 0));
        }
    }

    public static final void LIZ$7(AkS58S0200000_19 akS58S0200000_19, View view) {
        boolean z;
        Integer numValueOf;
        int value;
        MufUserCell mufUserCell = (MufUserCell) akS58S0200000_19.l0;
        C1247690iZb c1247690iZb = (C1247690iZb) akS58S0200000_19.l1;
        mufUserCell.getClass();
        User user = c1247690iZb.LL;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(mufUserCell.itemView.getContext());
        if (c19egLIZIZ != null) {
            mufUserCell.itemView.getContext();
            C1247140iYi c1247140iYi = new C1247140iYi();
            Integer numValueOf2 = null;
            int value2 = 0;
            if (C1253000iiA.LIZ() && (user.getFollowStatus() == 1 || user.getFollowStatus() == 2 || user.getFollowStatus() == 4)) {
                EnumC1247010iYV enumC1247010iYV = c1247690iZb.LLILZLL;
                if (enumC1247010iYV != null) {
                    numValueOf = Integer.valueOf(enumC1247010iYV.getValue());
                } else {
                    numValueOf = null;
                }
                boolean zLIZLLL = C1247000iYU.LIZLLL(numValueOf, Integer.valueOf(user.getFollowStatus()));
                Context context = mufUserCell.itemView.getContext();
                EnumC1247010iYV enumC1247010iYV2 = c1247690iZb.LLILZLL;
                if (enumC1247010iYV2 != null) {
                    value = enumC1247010iYV2.getValue();
                } else {
                    value = 0;
                }
                ((ArrayList) c1247140iYi.LIZ).add(new C1247490iZH(user, context, "friends_list", value, zLIZLLL));
            }
            ((ArrayList) c1247140iYi.LIZ).add(new C1393030mM1(user, mufUserCell.itemView, mufUserCell.N5()));
            C1247130iYh c1247130iYhLIZ = c1247140iYi.LIZ();
            FragmentManager supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
            int followStatus = user.getFollowStatus();
            if (C1247000iYU.LIZIZ(user) != null) {
                z = true;
            } else {
                z = false;
            }
            EnumC1247010iYV enumC1247010iYV3 = c1247690iZb.LLILZLL;
            if (enumC1247010iYV3 != null) {
                value2 = enumC1247010iYV3.getValue();
            }
            EnumC1247010iYV enumC1247010iYV4 = c1247690iZb.LLILZLL;
            if (enumC1247010iYV4 != null) {
                numValueOf2 = Integer.valueOf(enumC1247010iYV4.getValue());
            }
            c1247130iYhLIZ.LIZ(supportFragmentManager, "more_action_sheet_friends", new C1243410iSh("friends_list", "card_list", "show", followStatus, z, value2, C1247000iYU.LIZLLL(numValueOf2, Integer.valueOf(user.getFollowStatus())) ? 1 : 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$8(irm.AkS58S0200000_19 r4, android.view.View r5) {
        /*
            X.0LAB r2 = new X.0LAB
            r2.<init>()
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.profile.tab.card.GuideCardCell r0 = (com.ss.android.ugc.profile.business.profile.tab.card.GuideCardCell) r0
            X.0zJl r0 = r0.getItem()
            X.0igL r0 = (X.C1251870igL) r0
            r3 = 0
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.profile.model.UserProfileGuideDataV2 r0 = r0.LL
            if (r0 == 0) goto L77
            java.lang.String r1 = r0.getName()
        L1a:
            java.lang.String r0 = "scene_type"
            r2.LJ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "profile_empty_guide_click"
            X.C20684815ws.LJIILLIIL(r0, r1)
            java.lang.Object r1 = r4.l1
            X.0igL r1 = (X.C1251870igL) r1
            com.ss.android.ugc.profile.business.profile.tab.card.protocol.GuideCardBaseProtocol r0 = r1.LLILLJJLI
            if (r0 == 0) goto L75
            boolean r0 = r0.LIZJ(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L36:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L71
            java.lang.Object r0 = r4.l1
            X.0igL r0 = (X.C1251870igL) r0
            com.ss.android.ugc.aweme.profile.model.UserProfileGuideDataV2 r0 = r0.LL
            if (r0 == 0) goto L72
            com.ss.android.ugc.aweme.profile.model.Action r2 = r0.getAction()
            if (r2 == 0) goto L73
            java.lang.String r1 = r2.getType()
        L50:
            java.lang.String r0 = "router"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L71
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.profile.tab.card.GuideCardCell r0 = (com.ss.android.ugc.profile.business.profile.tab.card.GuideCardCell) r0
            android.content.Context r1 = r0.getContext()
            com.ss.android.ugc.aweme.profile.model.Action$RouterInfo r0 = r2.getRouter()
            if (r0 == 0) goto L6a
            java.lang.String r3 = r0.getUrl()
        L6a:
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r1, r3)
            r0.open()
        L71:
            return
        L72:
            r2 = r3
        L73:
            r1 = r3
            goto L50
        L75:
            r1 = r3
            goto L36
        L77:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS58S0200000_19.LIZ$8(irm.AkS58S0200000_19, android.view.View):void");
    }

    public AkS58S0200000_19(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
