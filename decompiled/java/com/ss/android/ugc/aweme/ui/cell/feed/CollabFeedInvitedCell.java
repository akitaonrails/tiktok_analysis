package com.ss.android.ugc.aweme.ui.cell.feed;

import X.AbstractC2211791BhR;
import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C0S1B;
import X.C0SE9;
import X.C0XQ7;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C123100dR;
import X.C1387050mCN;
import X.C1388190mED;
import X.C13LE;
import X.C1575080r5e;
import X.C1576550r81;
import X.C15O7;
import X.C1770850wBP;
import X.C1843500y4a;
import X.C1908030zkf;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C20642515q3;
import X.C20673215v0;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C241200wU;
import X.C343260Dcy;
import X.C343270Dcz;
import X.C444960Hcc;
import X.C452070Ho5;
import X.C452080Ho6;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.ICollabApi;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.vm.feed.CollabFeedCreatorPostListViewModel;
import com.ss.android.ugc.aweme.vm.feed.CollabFeedInvitedContainerViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS51S0200000_4;
import irm.AkS61S0200000_24;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS447S0200000_11;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS673S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class CollabFeedInvitedCell extends PowerCell<C343260Dcy> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C01GW LL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1433));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1440));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1438));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1446));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1447));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1444));
    public final C736950SvV LLIZ;
    public final AssemVMLazy LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CollabFeedInvitedCell.class, "listVM", "getListVM()Lcom/ss/android/ugc/aweme/vm/feed/CollabFeedCreatorPostListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public CollabFeedInvitedCell() {
        AssemVMLazy assemVMLazy;
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(383);
        this.LLIZ = new C736950SvV(C13LE.LIZ(CollabFeedInvitedContainerViewModel.class), aFwS213S0000000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(497), null, null, null);
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CollabFeedCreatorPostListViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 1457);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(496);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS568S0100000_24(c19719912DlLIZ, 1445), awS568S0100000_24, AFwS224S0000000_33.get$arr$(502), new AwS568S0100000_24((C03K6) this, 1448), new AwS568S0100000_24((C03K6) this, 1450), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1452), aFwS264S0000000_24, new AwS568S0100000_24((C03K6) this, 1454), null, new AwS568S0100000_24((C03K6) this, 1455));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24((C03K6) this, 1449);
            AwS568S0100000_24 awS568S0100000_243 = new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1451);
            AwS568S0100000_24 awS568S0100000_244 = new AwS568S0100000_24(c19719912DlLIZ, 1453);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS568S0100000_242, 141));
            AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c01gwLIZIZ, 3634);
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33(c01gwLIZIZ, 3635);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33(c01gwLIZIZ, 3636);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c01gwLIZIZ, 3637);
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 3638);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS568S0100000_244, awS568S0100000_24, new C452080Ho6(), awS577S0100000_33, awS577S0100000_332, awS568S0100000_243, aFwS264S0000000_24, awS577S0100000_333, awS577S0100000_334, awS577S0100000_335);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS568S0100000_24(c19719912DlLIZ, 1456), awS568S0100000_24, AFwS224S0000000_33.get$arr$(503), new AwS568S0100000_24((C03K6) this, 1458), new AwS568S0100000_24((C03K6) this, 1431), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1432), aFwS264S0000000_24, new AwS568S0100000_24((C03K6) this, 1434), null, new AwS568S0100000_24((C03K6) this, 1435));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS568S0100000_24(c19719912DlLIZ, 1436), awS568S0100000_24, AFwS224S0000000_33.get$arr$(501), new AwS568S0100000_24((C03K6) this, 1437), new AwS568S0100000_24((C03K6) this, 1439), new AwS568S0100000_24((C03K6) this, 1442), aFwS264S0000000_24, null, null, new AwS568S0100000_24((C03K6) this, 1443));
        }
        this.LLIZLLLIL = assemVMLazy;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv L5() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLILZLL.getValue();
    }

    public final CollabFeedInvitedContainerViewModel N5() {
        return (CollabFeedInvitedContainerViewModel) this.LLIZ.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.LL.getValue();
        avatarComponentView.setClickable(false);
        new AwS603S0100000_24(this, 375).invoke(avatarComponentView.getConfig().LIZ);
        avatarComponentView.LJFF(avatarComponentView.getConfig());
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvL5 = L5();
        viewOnAttachStateChangeListenerC20604515jvL5.LJIILJJIL(CollabFeedCreatorPostCell.class);
        viewOnAttachStateChangeListenerC20604515jvL5.setItemAnimator(null);
        final Context context = this.itemView.getContext();
        viewOnAttachStateChangeListenerC20604515jvL5.setLayoutManager(new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedCell$onItemViewCreated$2$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollHorizontally() {
                return false;
            }
        });
        ((LinearLayoutManager) viewOnAttachStateChangeListenerC20604515jvL5.getLayoutManager()).setOrientation(0);
        C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0r80
            public Function0<String> LJ;
            public final boolean LJFF = true;
            public final C1620890sHX LJI;

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                return this.LJI;
            }

            @Override // X.AbstractC2211791BhR
            public final boolean LJIIIZ() {
                return this.LJFF;
            }

            {
                this.LJ = new AwS568S0100000_24(this, 1441);
                this.LJI = new C1620890sHX(this, 2);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJ = function0;
            }
        });
    }

    public final void I5(C343260Dcy c343260Dcy) {
        Map<String, String> mapLJ;
        C1575080r5e c1575080r5e = N5().LL;
        if (c1575080r5e == null || (mapLJ = c1575080r5e.LIZIZ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        RelationButton relationButton = (RelationButton) this.LLILZ.getValue();
        C786410Ut5.t0(relationButton, 0);
        C1387050mCN c1387050mCN = new C1387050mCN(c343260Dcy.LLILLJJLI);
        c1387050mCN.LJIIJ = true;
        c1387050mCN.LJIIJJI = getCurrentLifecycleOwner();
        relationButton.LLLLZIL(c1387050mCN.LIZ());
        relationButton.setFollowClickListener(new AwS447S0200000_11(this, c343260Dcy, 12));
        relationButton.setFollowClickInterceptor(new C343270Dcz(this, null));
        relationButton.setDataChangeListener(new AwS583S0100000_4(c343260Dcy, 151));
        relationButton.setTracker(new AwS425S0200000_24((Map) mapLJ, (Map<String, String>) c343260Dcy, (C343260Dcy) 47));
    }

    public final void P5(String str) {
        Map<String, String> mapLJ;
        String authorUid;
        String aid;
        String uid;
        int i;
        User user;
        Aweme aweme;
        Aweme aweme2;
        C1575080r5e c1575080r5e = N5().LL;
        if (c1575080r5e == null || (mapLJ = c1575080r5e.LIZIZ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C241200wU c241200wU = C241200wU.LIZ;
        String str2 = mapLJ.get("enter_from");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        C343260Dcy item = getItem();
        if (item == null || (aweme2 = item.LLILZ) == null || (authorUid = AwemeExtKt.getAuthorUid(aweme2)) == null) {
            authorUid = "";
        }
        C343260Dcy item2 = getItem();
        if (item2 == null || (aweme = item2.LLILZ) == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        C343260Dcy item3 = getItem();
        if (item3 == null || (user = item3.LLILLJJLI) == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        C343260Dcy item4 = getItem();
        if (item4 != null && item4.LLILZIL) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = i ^ 1;
        String str4 = mapLJ.get("user_type");
        if (str4 != null) {
            str3 = str4;
        }
        c241200wU.getClass();
        C241200wU.LIZ(i2, str2, authorUid, aid, uid, str, str3);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Map<String, String> mapLJ;
        boolean z;
        int i;
        C343260Dcy c343260Dcy = (C343260Dcy) interfaceC1891350zJl;
        C0S1B.LIZ((AvatarComponentView) this.LL.getValue(), c343260Dcy.LLILLJJLI.getUid(), c343260Dcy.LLILLJJLI, this, false, null, 56);
        C1575080r5e c1575080r5e = N5().LL;
        final String secUid = null;
        if (c1575080r5e == null || (mapLJ = c1575080r5e.LIZIZ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        if (C123100dR.LIZ(mapLJ.get(Scene.SCENE_SERVICE))) {
            z = true;
        } else {
            z = false;
        }
        String nickname = c343260Dcy.LLILLJJLI.getNickname();
        if (nickname.length() == 0) {
            nickname = c343260Dcy.LLILLJJLI.getUniqueId();
        }
        TextView textView = (TextView) this.LLILLJJLI.getValue();
        if (z) {
            nickname = C0SE9.LIZ(c343260Dcy.LLILLJJLI, nickname);
        }
        textView.setText(nickname);
        C1908030zkf.LJI(this.itemView.getContext(), c343260Dcy.LLILLJJLI.getCustomVerify(), c343260Dcy.LLILLJJLI.getEnterpriseVerifyReason(), (TextView) this.LLILLJJLI.getValue());
        if (c343260Dcy.LLILLL) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            do {
                Aweme aweme = new Aweme();
                aweme.setAid(UUID.randomUUID().toString());
                User user = new User();
                user.setUid(UUID.randomUUID().toString());
                arrayList.add(new C1576550r81(aweme, user, false, true));
                i2++;
            } while (i2 < 4);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvL5 = L5();
            viewOnAttachStateChangeListenerC20604515jvL5.getState().LIZLLL(arrayList, null);
            C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jvL5);
            AssemVMLazy assemVMLazy = this.LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
            final CollabFeedCreatorPostListViewModel collabFeedCreatorPostListViewModel = (CollabFeedCreatorPostListViewModel) assemVMLazy.getValue();
            User author = c343260Dcy.LLILZ.getAuthor();
            if (author != null) {
                secUid = author.getSecUid();
            }
            final User user2 = c343260Dcy.LLILLJJLI;
            C15O7.LIZJ(new Callable() { // from class: X.0gbZ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String strLIZIZ;
                    C1C7U.LIZ("CollabFeedCreatorPostListViewModel@197e.tryFetchPostList$1");
                    try {
                        collabFeedCreatorPostListViewModel.getClass();
                        int[] iArrLIZ = C422830Gi1.LIZ(101);
                        String strLIZIZ2 = null;
                        if (iArrLIZ != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(iArrLIZ[0]);
                            sbLIZ.append('_');
                            sbLIZ.append(iArrLIZ[1]);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        } else {
                            strLIZIZ = null;
                        }
                        collabFeedCreatorPostListViewModel.getClass();
                        int[] iArrLIZ2 = C422830Gi1.LIZ(200);
                        if (iArrLIZ2 != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(iArrLIZ2[0]);
                            sbLIZ2.append('_');
                            sbLIZ2.append(iArrLIZ2[1]);
                            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        List<Aweme> items = ((ICollabApi) C317300CcC.LIZ.getValue()).fetchCreatorPostList(0, strLIZIZ, strLIZIZ2, 1, 0, 0, secUid, 1, 1, 20, Boolean.valueOf(C1601690rmZ.LIZJ())).execute().LIZIZ.getItems();
                        C343250Dcx c343250Dcx = C343250Dcx.LIZ;
                        List listLL = C13LP.LL(items, 4);
                        User user3 = user2;
                        c343250Dcx.getClass();
                        collabFeedCreatorPostListViewModel.setState(new AwS597S0100000_18(C343250Dcx.LIZJ(user3, listLL), (List<String>) 1074));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        collabFeedCreatorPostListViewModel.setState(AFwS256S0000000_18.get$arr$(1039));
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CollabFeedCreatorPostListViewModel@197e.tryFetchPostList$1");
                    return unit;
                }
            });
            C736680Sv4.LJIIIZ(this, this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.0gMf
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1155430gAn) obj).LLILLJJLI;
                }
            }, new C2217381BqS() { // from class: X.0gMe
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1155430gAn) obj).LL);
                }
            }, null, new AwS673S0100000_24(this, 8), 12);
        } else {
            C786410Ut5.LLF(8, L5());
        }
        int i3 = c343260Dcy.LL;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    C786410Ut5.t0((RelationButton) this.LLILZ.getValue(), 8);
                    C786410Ut5.LLLLLLJ((C197039127h) this.LLILZIL.getValue(), 8);
                } else {
                    C786410Ut5.t0((RelationButton) this.LLILZ.getValue(), 8);
                    C197039127h c197039127h = (C197039127h) this.LLILZIL.getValue();
                    C786410Ut5.LLLLLLJ(c197039127h, 0);
                    c197039127h.setEnabled(true);
                    C786410Ut5.I7(new AkS51S0200000_4(this, c343260Dcy, 1), c197039127h);
                }
            } else {
                C786410Ut5.LLLLLLJ((C197039127h) this.LLILZIL.getValue(), 8);
                I5(c343260Dcy);
            }
        } else {
            if (Intrinsics.LJFF(c343260Dcy.LLILLJJLI.getUid(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid())) {
                C786410Ut5.t0((RelationButton) this.LLILZ.getValue(), 8);
            } else {
                I5(c343260Dcy);
            }
            C786410Ut5.LLLLLLJ((C197039127h) this.LLILZIL.getValue(), 8);
        }
        TextView textView2 = (TextView) this.LLILLL.getValue();
        String strLJ = C20642515q3.LJ(2131755688, c343260Dcy.LLILLJJLI.getFollowerCount(), C1843500y4a.LIZIZ(r2.getFollowerCount()));
        if (strLJ == null) {
            strLJ = "";
        }
        textView2.setText(strLJ);
        TextView textView3 = (TextView) this.LLILLL.getValue();
        if (C444960Hcc.LIZIZ()) {
            i = 5;
        } else {
            i = 3;
        }
        textView3.setGravity(i);
        C786410Ut5.I7(new AkS61S0200000_24(this, c343260Dcy, 0), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewLIZJ;
        Activity activityLIZ = C1388190mED.LIZ(viewGroup.getContext());
        if (activityLIZ == null || (viewLIZJ = C20673215v0.LIZJ(R.layout.agb, activityLIZ)) == null) {
            return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.agb, viewGroup, false);
        }
        return viewLIZJ;
    }

    public final void R5(Aweme aweme, String str, String str2, boolean z) {
        Map<String, String> mapLJ;
        String str3;
        C1575080r5e c1575080r5e = N5().LL;
        if (c1575080r5e == null || (mapLJ = c1575080r5e.LIZIZ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C241200wU c241200wU = C241200wU.LIZ;
        String str4 = mapLJ.get("enter_from");
        if (str4 == null) {
            str4 = "";
        }
        String aid = aweme.getAid();
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        if (z) {
            str3 = "click";
        } else {
            str3 = "show";
        }
        c241200wU.getClass();
        C241200wU.LIZLLL(str4, aid, authorUid, "collab_panel", str3, "exit", str2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
