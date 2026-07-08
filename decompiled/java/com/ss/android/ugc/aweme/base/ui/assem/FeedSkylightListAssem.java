package com.ss.android.ugc.aweme.base.ui.assem;

import X.AbstractC21673719rz;
import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C01D1;
import X.C01GW;
import X.C08CX;
import X.C098200Yq;
import X.C09R3;
import X.C0AG4;
import X.C0AGJ;
import X.C0IR0;
import X.C0IS1;
import X.C0IS3;
import X.C0QSJ;
import X.C0V06;
import X.C0XQ7;
import X.C0ZP4;
import X.C116900cR;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C134900fL;
import X.C139500g5;
import X.C139600g6;
import X.C13LE;
import X.C1439490nYx;
import X.C1478160oZK;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1564490qoZ;
import X.C1564500qoa;
import X.C1572230r13;
import X.C1573030r2L;
import X.C1589640rT8;
import X.C1591220rVg;
import X.C1594800rbS;
import X.C1594860rbY;
import X.C1594870rbZ;
import X.C1594880rba;
import X.C1594890rbb;
import X.C1594980rbk;
import X.C1595220rc8;
import X.C1595960rdK;
import X.C1596130rdb;
import X.C1596360rdy;
import X.C1596560reI;
import X.C1597870rgP;
import X.C1597880rgQ;
import X.C1597900rgS;
import X.C1597910rgT;
import X.C1600300rkK;
import X.C1610870s1N;
import X.C1618440sDa;
import X.C1619980sG4;
import X.C1637806bA;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C20600815jK;
import X.C20603715jn;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C260240AHu;
import X.C278340AvY;
import X.C285800BIc;
import X.C294120Bfu;
import X.C298490Bmx;
import X.C298530Bn1;
import X.C298540Bn2;
import X.C305290Bxv;
import X.C319860CgK;
import X.C328160Cti;
import X.C328170Ctj;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C497820Jfg;
import X.C582130MsN;
import X.C610880Nxe;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C729510SjV;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C740360T2k;
import X.C743840TFu;
import X.C7843034n;
import X.C786410Ut5;
import X.C814420VxA;
import X.C994000byQ;
import X.InterfaceC1055110dYz;
import X.InterfaceC1146704e9;
import X.InterfaceC1585190rLx;
import X.InterfaceC1594830rbV;
import X.InterfaceC1594910rbd;
import X.InterfaceC1595940rdI;
import X.InterfaceC1597970rgZ;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC468940IaC;
import X.InterfaceC586170Myt;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS71S0200000_2;
import Y.ATListenerS456S0100000_24;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.hox.Hox;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ability.FeedRecommendSkylightDrawerAbility;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.ability.ISkylightListAbility;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.business.followinguser.FollowingSkylightUserCell;
import com.ss.android.ugc.aweme.business.live.cell.FollowingLiveEventSkylightCell;
import com.ss.android.ugc.aweme.business.live.cell.FollowingLiveOnlySkylightBigAvatarCell;
import com.ss.android.ugc.aweme.business.live.cell.FollowingLiveOnlySkylightDoubleBigAvatarCell;
import com.ss.android.ugc.aweme.business.live.cell.FollowingLiveSkylightBigAvatarCell;
import com.ss.android.ugc.aweme.business.live.cell.FollowingLiveSkylightDoubleBigAvatarCell;
import com.ss.android.ugc.aweme.business.live.cell.GoLiveSkylightCell;
import com.ss.android.ugc.aweme.business.live.cell.LiveSkylightBigAvatarCell;
import com.ss.android.ugc.aweme.business.live.cell.LiveSkylightDoubleBigAvatarCell;
import com.ss.android.ugc.aweme.business.live.cell.LiveSkylightWidgetCell;
import com.ss.android.ugc.aweme.business.story.ui.cell.StorySkylightCell;
import com.ss.android.ugc.aweme.experiment.LiveFYPSkylightUnfoldModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS14S2000000_12;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedSkylightListAssem extends UIListContentAssem<FeedSkylightListViewModel> implements InterfaceC1585190rLx, ISkylightListAbility, InterfaceC1055110dYz, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 72));
    public final C1559260qg8 LLJ = new C1559260qg8(new C723580SZw(this, C1564490qoZ.class, "feed_skylight_hierarchy_data_key"), checkSupervisorPrepared());
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(70));
    public final C630740Ooa LLJIJIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 77));
    public final AssemVMLazy LLJILJIL;
    public final String LLJILJILJ;
    public final C0IS1<C0IR0> LLJILLL;
    public final C630740Ooa LLJJ;
    public final C01GW LLJJI;
    public ARunnableS107S0100000_7 LLJJIII;
    public final C736950SvV LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C630740Ooa LLJJJ;
    public final C01GW LLJJJIL;
    public final C630740Ooa LLJJJJ;
    public final C630740Ooa LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C630740Ooa LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public String LLJLLL;
    public final C01GW LLJZ;
    public int LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public volatile MainBusinessAbility LLLFF;
    public InterfaceC665370Q7z LLLFFI;
    public C0QSJ LLLFZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedSkylightListAssem.class, "containerVM", "getContainerVM()Lcom/ss/android/ugc/aweme/base/vm/FeedSkylightContainerViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FeedSkylightListAssem.class, "mainBizAbilityByDI", "getMainBizAbilityByDI()Lcom/ss/android/ugc/aweme/base/MainBusinessAbility;", 0);
        c09r3.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public FeedSkylightListAssem() {
        C0IS1<C0IR0> c0is1LIZIZ;
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedSkylightContainerViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 67);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, awS568S0100000_24, AFwS264S0000000_24.get$arr$(23), null, true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowSkyLightSceneName");
        sbLIZ.append(hashCode());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LLJILJILJ = strLIZIZ;
        if (C285800BIc.LIZ()) {
            InterfaceC468940IaC interfaceC468940IaCLIZ = C582130MsN.LIZ().LIZ();
            C0IS3 c0is3 = new C0IS3();
            c0is3.LIZ = strLIZIZ;
            c0is3.LIZIZ = "following";
            c0is3.LIZJ = "LIVE_DATA_MODE";
            c0is1LIZIZ = interfaceC468940IaCLIZ.LIZIZ(c0is3);
            c0is1LIZIZ.LIZJ();
        } else {
            c0is1LIZIZ = null;
        }
        this.LLJILLL = c0is1LIZIZ;
        this.LLJJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 71));
        this.LLJJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(67));
        this.LLJJIJI = new C736950SvV(C13LE.LIZ(FeedSkylightListViewModel.class), new AwS568S0100000_24(this, 79), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(24), new AwS568S0100000_24((AbstractC738140SxQ) this, 78), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 73));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 75));
        this.LLJJJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 74));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 70));
        this.LLJJJJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 80));
        this.LLJJJJJIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 69));
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(69));
        this.LLJJL = C628500Oky.LIZ(new AwS568S0100000_24(this, 68));
        this.LLJL = true;
        this.LLJZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(68));
        this.LLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(66));
        this.LLLF = C452501pT.LIZIZ(new AwS568S0100000_24(this, 76));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C1564500qoa c1564500qoa;
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 5;
        c20603715jn.LJIILIIL = true;
        C1564490qoZ c1564490qoZSo = So();
        c20603715jn.LIZJ = (c1564490qoZSo == null || (c1564500qoa = c1564490qoZSo.LLILLJJLI) == null) ? false : c1564500qoa.LIZLLL;
        c20603715jn.LJII = C786410Ut5.h4();
        c20603715jn.LJIILLIIL = true;
        return c20603715jn;
    }

    public final FeedSkylightContainerViewModel No() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLI;
        return (FeedSkylightContainerViewModel) assemVMLazy.getValue();
    }

    public final FeedRecommendSkylightDrawerAbility Oo() {
        return (FeedRecommendSkylightDrawerAbility) this.LLJJJJJIL.getValue();
    }

    public final C1564490qoZ So() {
        return (C1564490qoZ) this.LLJ.getValue();
    }

    public final Keva Vo() {
        return (Keva) this.LLJZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.ability.ISkylightListAbility
    public final C1594870rbZ YL0() {
        View view;
        C1596360rdy c1596360rdy;
        Aweme aweme;
        C1594870rbZ c1594870rbZ = new C1594870rbZ(null, true, null);
        List<ITEM> listListGetAll = ip().listGetAll();
        if (listListGetAll == 0) {
            return c1594870rbZ;
        }
        int size = listListGetAll.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) ListProtector.get(listListGetAll, i);
            if (interfaceC1891350zJl instanceof C1596360rdy) {
                C1596360rdy c1596360rdy2 = (C1596360rdy) interfaceC1891350zJl;
                if (!c1596360rdy2.LL && C729510SjV.LJJJJLI(AwemeExtKt.getAuthorUid(c1596360rdy2.LLILLJJLI)) && !C729510SjV.LJJII(c1596360rdy2.LLILLJJLI)) {
                    if (i > 0) {
                        Object obj = ListProtector.get(listListGetAll, i);
                        c1594870rbZ.LIZ = (!(obj instanceof C1596360rdy) || (c1596360rdy = (C1596360rdy) obj) == null || (aweme = c1596360rdy.LLILLJJLI) == null) ? null : AwemeExtKt.getAuthorUid(aweme);
                        c1594870rbZ.LIZJ = false;
                    }
                }
            }
            i++;
        }
        c1594870rbZ.LIZ = null;
        c1594870rbZ.LIZJ = true;
        i = 0;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = Go().findViewHolderForAdapterPosition(i);
        if (viewHolderFindViewHolderForAdapterPosition != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            Rect rect = new Rect(0, 0, Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels);
            int i2 = iArr[0];
            if (rect.intersect(new Rect(i2, iArr[1], view.getWidth() + i2, iArr[1] + view.getHeight()))) {
                c1594870rbZ.LIZIZ = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView : null;
            }
        }
        return c1594870rbZ;
    }

    public final InterfaceC1597970rgZ Zo() {
        return (InterfaceC1597970rgZ) this.LLJJJJLIIL.getValue();
    }

    public final int ap() {
        return ((Number) this.LLJIJIL.getValue()).intValue();
    }

    public final List<C0ZP4> bp() {
        return (List) this.LLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: cp, reason: merged with bridge method [inline-methods] */
    public final FeedSkylightListViewModel ip() {
        return (FeedSkylightListViewModel) this.LLJJIJI.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r1.KQ2("FRIENDS_TAB") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r0 == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dp() {
        /*
            Method dump skipped, instruction units count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightListAssem.dp():void");
    }

    public static String hp() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId());
        sbLIZ.append("auto_show_exit");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String ip() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId());
        sbLIZ.append("auto_unfold_state");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean Lo() {
        Set<String> stringSet = Vo().getStringSet(hp(), C08CX.INSTANCE);
        long jCurrentTimeMillis = (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - ((long) ((Number) C0AGJ.LIZ.getValue()).intValue());
        Iterator<String> it2 = stringSet.iterator();
        int i = 0;
        while (it2.hasNext()) {
            try {
                if (CastLongProtector.parseLong(it2.next()) > jCurrentTimeMillis) {
                    i++;
                }
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return i < ((Number) C0AG4.LIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.base.ability.ISkylightListAbility
    public final ViewOnAttachStateChangeListenerC20604515jv Wl() {
        return Go();
    }

    public final boolean ep() {
        MainBusinessAbility mainBusinessAbility;
        if (ap() != 1) {
            return false;
        }
        MainBusinessAbility mainBusinessAbility2 = (MainBusinessAbility) this.LLJJJ.getValue();
        return (mainBusinessAbility2 != null && mainBusinessAbility2.oi2()) || ((mainBusinessAbility = (MainBusinessAbility) this.LLJJJ.getValue()) != null && mainBusinessAbility.isADShowing());
    }

    public final void mp() {
        C20600815jK<InterfaceC1891350zJl> state;
        int iAp = ap();
        if ((iAp == 0 || (iAp == 2 && !C305290Bxv.LIZIZ())) && (state = Go().getState()) != null && state.LJIIIIZZ() > 0 && No().xQ2()) {
            No().wQ2();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Hox.LLJILJIL.LIZ(c19egLIZ).wQ2("Following", this);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), ISkylightListAbility.class, null);
        }
        EventBus.LIZLLL().LJJI(this);
        C0XQ7.LJ();
        C0XQ7.LIZ.LJI((InterfaceC586170Myt) this.LLJJIJIIJIL.getValue());
        C1610870s1N.LIZ.getClass();
        boolean zLIZ = C1610870s1N.LIZ();
        boolean z = C319860CgK.LIZ() && ap() == 0;
        if (zLIZ || z) {
            C1589640rT8.LIZIZ.H2((C1594800rbS) this.LLJJIJIL.getValue());
        }
        C1572230r13.LIZ(bp());
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Hox.LLJILJIL.LIZ(c19egLIZ).PQ2("Following", this);
        }
        if (C1591220rVg.LIZLLL()) {
            HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLJJJIL.getValue();
            if (homeTabAbility != null) {
                homeTabAbility.tx0(this);
            }
            HomeTabAbility homeTabAbility2 = (HomeTabAbility) this.LLJJJIL.getValue();
            if (homeTabAbility2 != null) {
                homeTabAbility2.Ik0(this);
            }
            if (No().xQ2()) {
                FeedSkylightContainerViewModel.AQ2(No(), false, No().LL, false, false, false, null, 60);
                No().zQ2(false, true);
            }
        }
        FeedSkylightListViewModel feedSkylightListViewModelIp = ip();
        synchronized (feedSkylightListViewModelIp.LLJLLIL) {
            try {
                feedSkylightListViewModelIp.LLJLILLLLZIIL = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        AnonymousClass0956 anonymousClass0956;
        super.onPause();
        FeedSkylightListViewModel feedSkylightListViewModelIp = ip();
        feedSkylightListViewModelIp.getClass();
        if (((Boolean) C139600g6.LIZ.getValue()).booleanValue()) {
            C1594860rbY c1594860rbY = feedSkylightListViewModelIp.LLJILLL;
            if (c1594860rbY != null && c1594860rbY.LIZIZ == 0) {
                c1594860rbY.LIZIZ = SystemClock.elapsedRealtime();
            }
            AnonymousClass0956 anonymousClass09562 = feedSkylightListViewModelIp.LLJI;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
        } else if (((Boolean) C139500g5.LIZ.getValue()).booleanValue()) {
            C1594860rbY c1594860rbY2 = feedSkylightListViewModelIp.LLJILLL;
            if (c1594860rbY2 != null && c1594860rbY2.LIZIZ == 0) {
                c1594860rbY2.LIZIZ = SystemClock.elapsedRealtime();
            }
            AnonymousClass0956 anonymousClass09563 = feedSkylightListViewModelIp.LLJI;
            if (anonymousClass09563 != null) {
                anonymousClass09563.LIZIZ(null);
            }
        } else if (((Boolean) C134900fL.LIZ.getValue()).booleanValue() && (anonymousClass0956 = feedSkylightListViewModelIp.LLJI) != null) {
            anonymousClass0956.LIZIZ(null);
        }
        List<ITEM> listListGetAll = feedSkylightListViewModelIp.listGetAll();
        if (listListGetAll == 0 || listListGetAll.isEmpty()) {
            return;
        }
        C23250099c.LIZLLL(feedSkylightListViewModelIp.getAssemVMScope(), null, null, new C610880Nxe(feedSkylightListViewModelIp, listListGetAll, null), 3);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        InterfaceC1594830rbV c0v06;
        List<ITEM> listListGetAll;
        C1596360rdy c1596360rdy;
        Aweme aweme;
        InterfaceC1594830rbV c0v062;
        super.onResume();
        FeedSkylightListViewModel feedSkylightListViewModelIp = ip();
        feedSkylightListViewModelIp.getClass();
        if (((Boolean) C139600g6.LIZ.getValue()).booleanValue()) {
            C1594860rbY c1594860rbY = feedSkylightListViewModelIp.LLJILLL;
            if (c1594860rbY == null) {
                c0v062 = null;
            } else if (c1594860rbY.LIZIZ == 0) {
                c0v062 = C1594890rbb.LIZ;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                c1594860rbY.LIZIZ = 0L;
                if (c1594860rbY.LIZ == 0) {
                    c0v062 = C1594890rbb.LIZ;
                } else {
                    long j = jElapsedRealtime - c1594860rbY.LIZ;
                    if (j >= 600000) {
                        c0v062 = C1594880rba.LIZ;
                    } else {
                        long j2 = 600000 - j;
                        c0v062 = new C0V06(j2 >= 0 ? j2 : 0L);
                    }
                }
            }
            feedSkylightListViewModelIp.IQ2(c0v062);
        } else if (((Boolean) C139500g5.LIZ.getValue()).booleanValue()) {
            C1594860rbY c1594860rbY2 = feedSkylightListViewModelIp.LLJILLL;
            if (c1594860rbY2 == null) {
                c0v06 = null;
            } else if (c1594860rbY2.LIZIZ == 0) {
                c0v06 = C1594890rbb.LIZ;
            } else {
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                long j3 = jElapsedRealtime2 - c1594860rbY2.LIZIZ;
                c1594860rbY2.LIZIZ = 0L;
                if (j3 >= 600000) {
                    c0v06 = C1594880rba.LIZ;
                } else {
                    c1594860rbY2.LIZ += j3;
                    long j4 = 600000 - (jElapsedRealtime2 - c1594860rbY2.LIZ);
                    c0v06 = new C0V06(j4 >= 0 ? j4 : 0L);
                }
            }
            feedSkylightListViewModelIp.IQ2(c0v06);
        } else if (((Boolean) C134900fL.LIZ.getValue()).booleanValue()) {
            feedSkylightListViewModelIp.RQ2();
        }
        if (!C298540Bn2.LIZ() || (listListGetAll = ip().listGetAll()) == 0) {
            return;
        }
        InterfaceC1597970rgZ interfaceC1597970rgZLJJIJIL = C1618440sDa.LIZIZ.LJJIJIL();
        if (interfaceC1597970rgZLJJIJIL.LIZLLL()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListGetAll) {
            InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
            if (!interfaceC1597970rgZLJJIJIL.LIZ((!(interfaceC1891350zJl instanceof C1596360rdy) || (c1596360rdy = (C1596360rdy) interfaceC1891350zJl) == null || (aweme = c1596360rdy.LLILLJJLI) == null) ? null : AwemeExtKt.getAuthorUid(aweme))) {
                arrayList.add(obj);
            }
        }
        HandlerHook.viewPostDelay(Go(), new ARunnableS71S0200000_2(this, arrayList, 10), 300L);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        ap();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        if (C298530Bn1.LIZ() && ap() == 0) {
            Zo().LIZJ("homepage_friends", "exit");
        }
        if (C298490Bmx.LIZ() && ap() == 1) {
            Zo().LIZJ("homepage_hot", "exit");
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ability.ISkylightListAbility
    public final boolean p11() {
        return No().xQ2();
    }

    @Override // com.ss.android.ugc.aweme.base.ability.ISkylightListAbility
    public final int uH2() {
        return ap();
    }

    @Override // com.ss.android.ugc.aweme.base.ability.ISkylightListAbility
    public final boolean rb2() {
        return this.LLJLILLLLZIIL;
    }

    @Override // com.ss.android.ugc.aweme.base.ability.ISkylightListAbility
    public final boolean ry0() {
        return this.LLJLIL;
    }

    @Override // com.ss.android.ugc.aweme.base.ability.ISkylightListAbility
    public final void QY0(int i) {
        FeedRecommendSkylightDrawerAbility feedRecommendSkylightDrawerAbilityOo;
        this.LLJZIJLIL = 1;
        if (ap() == 1 && i == 2 && ((LiveFYPSkylightUnfoldModel) C278340AvY.LIZIZ.getValue()).autoFoldEnterRoom && (feedRecommendSkylightDrawerAbilityOo = Oo()) != null) {
            feedRecommendSkylightDrawerAbilityOo.G62("auto", false, false, false, "enter_room", false);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ability.ISkylightListAbility
    public final void kf1(TuxTextView tuxTextView) {
        int iIntValue;
        Integer numLIZJ;
        if (ap() == 0 && C319860CgK.LIZ()) {
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -16777216;
            }
            tuxTextView.setTextColor(iIntValue);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lp(java.lang.String r15) {
        /*
            r14 = this;
            int r0 = r14.ap()
            r11 = 0
            r2 = 2
            if (r0 != r2) goto Lbd
            com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel r0 = r14.ip()
            X.0rbz r1 = r0.FQ2()
            boolean r0 = r1 instanceof X.InterfaceC1595030rbp
            if (r0 == 0) goto Lbd
            X.0rbp r1 = (X.InterfaceC1595030rbp) r1
            if (r1 == 0) goto Lbd
            int r9 = r1.LJIIIZ()
        L1c:
            int r0 = r14.ap()
            if (r0 != r2) goto Lba
            com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel r0 = r14.ip()
            X.0rbz r1 = r0.FQ2()
            boolean r0 = r1 instanceof X.InterfaceC1595030rbp
            if (r0 == 0) goto Lba
            X.0rbp r1 = (X.InterfaceC1595030rbp) r1
            if (r1 == 0) goto Lba
            int r10 = r1.LJ()
        L36:
            X.0rdb r1 = X.C1596130rdb.LIZ
            int r0 = r14.ap()
            r1.getClass()
            int r5 = X.C1596130rdb.LJ(r0)
            X.0rc8 r2 = X.C1595220rc8.LIZ
            X.0qoZ r0 = r14.So()
            if (r0 == 0) goto L59
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.LL
            if (r1 == 0) goto L59
            java.lang.String r0 = "enter_from"
            java.lang.Object r3 = r1.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L5b
        L59:
            java.lang.String r3 = ""
        L5b:
            int r0 = r14.ap()
            java.util.concurrent.ConcurrentHashMap r1 = X.C1596130rdb.LIZLLL()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            X.0rda r0 = (X.C1596120rda) r0
            if (r0 == 0) goto Lb8
            int r6 = r0.LJIIIIZZ
        L71:
            int r0 = r14.ap()
            java.util.concurrent.ConcurrentHashMap r1 = X.C1596130rdb.LIZLLL()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            X.0rda r0 = (X.C1596120rda) r0
            if (r0 == 0) goto Lb6
            int r7 = r0.LJIIIZ
        L87:
            int r0 = r14.ap()
            int r8 = X.C1596130rdb.LIZJ(r0)
            int r0 = r14.ap()
            java.util.concurrent.ConcurrentHashMap r1 = X.C1596130rdb.LIZLLL()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            X.0rda r0 = (X.C1596120rda) r0
            if (r0 == 0) goto La5
            int r11 = r0.LIZLLL
        La5:
            r12 = 0
            int r0 = r14.ap()
            boolean r13 = X.C1596130rdb.LJII(r0)
            r2.getClass()
            r4 = r15
            X.C1595220rc8.LJFF(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        Lb6:
            r7 = 0
            goto L87
        Lb8:
            r6 = 0
            goto L71
        Lba:
            r10 = 0
            goto L36
        Lbd:
            r9 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightListAssem.lp(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.base.ability.ISkylightListAbility
    public final boolean nC0(InterfaceC1594910rbd interfaceC1594910rbd) {
        if (interfaceC1594910rbd == null) {
            return false;
        }
        ip().listRemoveItem(interfaceC1594910rbd);
        FeedSkylightListViewModel feedSkylightListViewModelIp = ip();
        feedSkylightListViewModelIp.getClass();
        feedSkylightListViewModelIp.setState(new AwS603S0100000_24(interfaceC1594910rbd, 528));
        C1596130rdb c1596130rdb = C1596130rdb.LIZ;
        int iAp = ap();
        c1596130rdb.getClass();
        C1596130rdb.LIZ(iAp, interfaceC1594910rbd);
        return true;
    }

    @C14EU
    public final void onA11yHideSkyLightEvent(C7843034n c7843034n) {
        if (c7843034n.LIZ) {
            int iAp = ap();
            if (iAp != 1) {
                if (iAp == 2) {
                    if (No().xQ2()) {
                        FeedSkylightContainerViewModel.AQ2(No(), false, "auto", false, false, false, null, 60);
                    }
                    No().zQ2(true, true);
                    No().BQ2(false);
                    return;
                }
                return;
            }
            FeedRecommendSkylightDrawerAbility feedRecommendSkylightDrawerAbilityOo = Oo();
            if (feedRecommendSkylightDrawerAbilityOo == null) {
                return;
            }
            feedRecommendSkylightDrawerAbilityOo.G62("auto", false, true, false, null, false);
        }
    }

    @C14EU
    public final void onAwesomeSplashEvent(C740360T2k c740360T2k) {
        FeedRecommendSkylightDrawerAbility feedRecommendSkylightDrawerAbilityOo;
        FeedRecommendSkylightDrawerAbility feedRecommendSkylightDrawerAbilityOo2;
        if (ap() != 1) {
            return;
        }
        int i = c740360T2k.LIZ;
        if ((i == 1 || i == 2) && (feedRecommendSkylightDrawerAbilityOo = Oo()) != null && feedRecommendSkylightDrawerAbilityOo.yw0() && (feedRecommendSkylightDrawerAbilityOo2 = Oo()) != null) {
            feedRecommendSkylightDrawerAbilityOo2.G62("auto", false, true, false, null, false);
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        C1597900rgS c1597900rgSLIZIZ;
        int iAp = ap();
        if (iAp != 0) {
            if (iAp == 2) {
                c1597900rgSLIZIZ = C1597910rgT.LIZ();
            } else {
                return;
            }
        } else {
            c1597900rgSLIZIZ = C1597910rgT.LIZIZ();
        }
        if (c1597900rgSLIZIZ != null) {
            C1597870rgP c1597870rgP = c1597900rgSLIZIZ.LIZ;
            c1597870rgP.LIZIZ = 0;
            c1597870rgP.LJI = -1L;
            C1597880rgQ c1597880rgQ = c1597900rgSLIZIZ.LIZIZ;
            c1597880rgQ.LIZIZ = 0;
            c1597880rgQ.LJI = -1L;
            c1597900rgSLIZIZ.LIZJ = -1L;
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        C1597900rgS c1597900rgSLIZIZ;
        InterfaceC1891350zJl interfaceC1891350zJl;
        InterfaceC1595940rdI interfaceC1595940rdI;
        Object next;
        boolean z;
        boolean z2;
        ARunnableS107S0100000_7 aRunnableS107S0100000_7 = this.LLJJIII;
        Object obj = null;
        if (aRunnableS107S0100000_7 != null) {
            aRunnableS107S0100000_7.run();
            this.LLJJIII = null;
        }
        int iAp = ap();
        if (iAp != 0) {
            if (iAp == 2) {
                c1597900rgSLIZIZ = C1597910rgT.LIZ();
            } else {
                return;
            }
        } else {
            c1597900rgSLIZIZ = C1597910rgT.LIZIZ();
        }
        if (c1597900rgSLIZIZ != null) {
            C1597870rgP c1597870rgP = c1597900rgSLIZIZ.LIZ;
            if (c1597870rgP.LIZIZ <= 0) {
                c1597870rgP.LIZIZ = 1;
                c1597870rgP.LIZJ = false;
                c1597870rgP.LIZLLL = false;
                c1597870rgP.LJ = false;
                if (c1597870rgP.LJFF == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c1597870rgP.LJFF = Boolean.valueOf(z2);
            }
            C1597880rgQ c1597880rgQ = c1597900rgSLIZIZ.LIZIZ;
            if (c1597880rgQ.LIZIZ <= 0) {
                c1597880rgQ.LIZIZ = 1;
                c1597880rgQ.LIZJ = false;
                c1597880rgQ.LIZLLL = false;
                c1597880rgQ.LJ = false;
                if (c1597880rgQ.LJFF == null) {
                    z = true;
                } else {
                    z = false;
                }
                c1597880rgQ.LJFF = Boolean.valueOf(z);
            }
            C1597900rgS.LIZIZ(c1597900rgSLIZIZ);
            List<ITEM> listListGetAll = ip().listGetAll();
            if (listListGetAll != 0) {
                Iterator it2 = listListGetAll.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next instanceof InterfaceC1595940rdI) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                interfaceC1891350zJl = (InterfaceC1891350zJl) next;
            } else {
                interfaceC1891350zJl = null;
            }
            if ((interfaceC1891350zJl instanceof InterfaceC1595940rdI) && (interfaceC1595940rdI = (InterfaceC1595940rdI) interfaceC1891350zJl) != null && C1595960rdK.LIZ(interfaceC1595940rdI, c1597900rgSLIZIZ.LIZJ)) {
                c1597900rgSLIZIZ.LIZLLL(0, true, true);
            }
            List<ITEM> listListGetAll2 = ip().listGetAll();
            if (listListGetAll2 != 0) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listListGetAll2) {
                    if (obj2 instanceof C1596360rdy) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    if (!((C1596360rdy) next2).LL) {
                        obj = next2;
                        break;
                    }
                }
                C1596360rdy c1596360rdy = (C1596360rdy) obj;
                if (c1596360rdy != null && c1596360rdy.LIZ(c1597900rgSLIZIZ.LIZJ)) {
                    c1597900rgSLIZIZ.LIZLLL(0, true, false);
                }
            }
        }
    }

    @C14EU
    public final void onStoryPublishStart(C1439490nYx c1439490nYx) {
        int iAp = ap();
        if (iAp != 0) {
            if (iAp != 1) {
                if (iAp == 2 && Intrinsics.LJFF(c1439490nYx.LIZ, "follow_top_cell")) {
                    Go().scrollToPosition(0);
                    return;
                }
                return;
            }
            if (!Intrinsics.LJFF(c1439490nYx.LIZ, "hot_top_cell") && !Intrinsics.LJFF(c1439490nYx.LIZ, "pull_down")) {
                return;
            }
            Go().scrollToPosition(0);
            return;
        }
        if (!Intrinsics.LJFF(c1439490nYx.LIZ, "friends_top_cell")) {
            return;
        }
        Go().scrollToPosition(0);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        AbstractC21673719rz itemAnimator;
        Object c098200Yq;
        Function0<Unit> function0;
        C1564500qoa c1564500qoa;
        Integer num;
        C1564500qoa c1564500qoa2;
        Integer num2;
        Integer numLIZJ;
        super.onViewCreated(view);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, ISkylightListAbility.class, null, null);
        }
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLJJJIL.getValue();
        if (homeTabAbility != null) {
            homeTabAbility.ao(this);
        }
        HomeTabAbility homeTabAbility2 = (HomeTabAbility) this.LLJJJIL.getValue();
        if (homeTabAbility2 != null) {
            homeTabAbility2.UC1(this);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jvGo.getContext());
        boolean z = false;
        linearLayoutManager.setOrientation(0);
        viewOnAttachStateChangeListenerC20604515jvGo.setLayoutManager(linearLayoutManager);
        if (C294120Bfu.LIZ() >= 3) {
            itemAnimator = C1600300rkK.LIZIZ.LJ();
        } else {
            itemAnimator = viewOnAttachStateChangeListenerC20604515jvGo.getItemAnimator();
            itemAnimator.LLILZLL = 350L;
            try {
                Field declaredField = itemAnimator.getClass().getDeclaredField("sDefaultInterpolator");
                declaredField.setAccessible(true);
                declaredField.set(null, C1619980sG4.LIZLLL());
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
        viewOnAttachStateChangeListenerC20604515jvGo.setItemAnimator(itemAnimator);
        if (ap() == 2) {
            Go().LJIILJJIL(LiveSkylightWidgetCell.class, FollowingLiveSkylightDoubleBigAvatarCell.class, FollowingLiveSkylightBigAvatarCell.class, StorySkylightCell.class, GoLiveSkylightCell.class, FollowingLiveOnlySkylightBigAvatarCell.class, FollowingLiveOnlySkylightDoubleBigAvatarCell.class, FollowingSkylightUserCell.class, FollowingLiveEventSkylightCell.class);
        } else {
            Go().LJIILJJIL(LiveSkylightWidgetCell.class, LiveSkylightDoubleBigAvatarCell.class, LiveSkylightBigAvatarCell.class, StorySkylightCell.class, GoLiveSkylightCell.class, FollowingSkylightUserCell.class);
        }
        viewOnAttachStateChangeListenerC20604515jvGo.requestDisallowInterceptTouchEvent(true);
        if (C1594980rbk.LIZIZ && C1594980rbk.LIZ().guideType > 0 && ap() == 1) {
            viewOnAttachStateChangeListenerC20604515jvGo.setOnTouchListener(new ATListenerS456S0100000_24(this, 0));
        }
        C1564490qoZ c1564490qoZSo = So();
        if (c1564490qoZSo != null && (c1564500qoa2 = c1564490qoZSo.LLILLJJLI) != null && (num2 = c1564500qoa2.LIZ) != null) {
            int iIntValue = num2.intValue();
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(iIntValue, context)) != null) {
                LJJIJL().setBackgroundColor(numLIZJ.intValue());
            }
        }
        C1564490qoZ c1564490qoZSo2 = So();
        if (c1564490qoZSo2 != null && (c1564500qoa = c1564490qoZSo2.LLILLJJLI) != null && (num = c1564500qoa.LIZIZ) != null) {
            int iIntValue2 = num.intValue();
            View viewLJJIJL = LJJIJL();
            ViewGroup.LayoutParams layoutParams = viewLJJIJL.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.height = iIntValue2;
                C786410Ut5.W5(viewLJJIJL, layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        bp().add(AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0r0u
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1573030r2L c1573030r2L = (C1573030r2L) obj;
                c1573030r2L.getClass();
                return C627260Oiy.LIZLLL(c1573030r2L);
            }
        }, null, new AwS603S0100000_24(this, 467), new AwS568S0100000_24(this, 1673), new AwS603S0100000_24(this, 470), 2, null));
        bp().add(C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0r6a
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1573030r2L) obj).LLILLL;
            }
        }, null, new AwS621S0100000_7(this, 61), 6));
        bp().add(C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0rbW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1573030r2L) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS621S0100000_7(this, 62), 4));
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0r2M
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1573030r2L) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 141), 4);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0r6c
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1573030r2L) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 143), 4);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0r1o
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1573030r2L c1573030r2L = (C1573030r2L) obj;
                c1573030r2L.getClass();
                return C627260Oiy.LIZ(c1573030r2L);
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 145), 4);
        bp().add(C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0r6x
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1575830r6r) obj).LL;
            }
        }, null, new AwS638S0100000_24(this, 150), 6));
        bp().add(C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0r1P
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1575830r6r) obj).LLILLJJLI);
            }
        }, null, new AwS638S0100000_24(this, 137), 6));
        bp().add(C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0r6s
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1575830r6r) obj).LLILZIL);
            }
        }, null, new AwS638S0100000_24(this, 138), 6));
        bp().add(C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0r6Y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1575830r6r) obj).LLILLL;
            }
        }, null, new AwS638S0100000_24(this, 140), 6));
        if (ap() == 2) {
            bp().add(C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0rbO
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1575830r6r) obj).LLILZLL;
                }
            }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 149), 4));
        }
        FeedSkylightListViewModel feedSkylightListViewModelIp = ip();
        synchronized (feedSkylightListViewModelIp.LLJLLIL) {
            try {
                feedSkylightListViewModelIp.LLJLILLLLZIIL = true;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        if (((Boolean) C260240AHu.LIZ.getValue()).booleanValue()) {
            SoftReference<Function0<Unit>> softReference = feedSkylightListViewModelIp.LLJLL;
            if (softReference != null && (function0 = softReference.get()) != null) {
                function0.invoke();
                feedSkylightListViewModelIp.LLJLL = null;
            } else if (feedSkylightListViewModelIp.LLJLIL && feedSkylightListViewModelIp.KQ2()) {
                feedSkylightListViewModelIp.WQ2(new AwS568S0100000_24(feedSkylightListViewModelIp, 1753));
            }
        }
        feedSkylightListViewModelIp.VQ2();
        EventBus.LIZLLL().LJIJJ(this);
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL((InterfaceC586170Myt) this.LLJJIJIIJIL.getValue());
        C1610870s1N.LIZ.getClass();
        boolean zLIZ = C1610870s1N.LIZ();
        if (C319860CgK.LIZ() && ap() == 0) {
            z = true;
        }
        if (zLIZ || z) {
            C1589640rT8.LIZIZ.D2((C1594800rbS) this.LLJJIJIL.getValue());
        }
    }

    public final void sp(int i) {
        if (i >= 0 && i < Go().getState().LJIIIIZZ()) {
            ((LinearLayoutManager) Go().getLayoutManager()).scrollToPositionWithOffset(i, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.ability.ISkylightListAbility
    public final int t51(C1596360rdy c1596360rdy) {
        List<ITEM> listListGetAll;
        int i = 0;
        if (c1596360rdy == null || (listListGetAll = ip().listGetAll()) == 0) {
            return 0;
        }
        for (ITEM item : listListGetAll) {
            if (item instanceof C1596360rdy) {
                if (Intrinsics.LJFF(C729510SjV.LJIIIZ(((C1596360rdy) item).LLILLJJLI), C729510SjV.LJIIIZ(c1596360rdy.LLILLJJLI))) {
                    return i;
                }
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kp(java.util.List r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightListAssem.kp(java.util.List, boolean):void");
    }

    @Override // X.InterfaceC1585190rLx
    public final void p1(String str, String str2) {
        int iHashCode = str2.hashCode();
        if (iHashCode == -1525083535 ? !(!str2.equals("Following") || C305290Bxv.LIZIZ()) : !(iHashCode == -1309089240 ? !str2.equals("FRIENDS_FEED") : !(iHashCode == -734952021 && str2.equals("FRIENDS_TAB")))) {
            mp();
        }
        if (C298540Bn2.LIZ()) {
            if (C298530Bn1.LIZ() && (Intrinsics.LJFF(str, "FRIENDS_FEED") || Intrinsics.LJFF(str, "FRIENDS_TAB"))) {
                Zo().LIZJ("homepage_friends", "exit");
            }
            if (C298490Bmx.LIZ()) {
                if (Intrinsics.LJFF(str, "For You") || Intrinsics.LJFF(str, "HOME")) {
                    Zo().LIZJ("homepage_hot", "exit");
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void op(String str, String str2, boolean z, boolean z2) {
        String str3;
        FeedRecommendSkylightDrawerAbility feedRecommendSkylightDrawerAbilityOo;
        int iLIZIZ;
        String str4;
        String str5;
        Map<String, String> map;
        Map<String, String> map2;
        String str6;
        Map<String, String> map3;
        String str7;
        List<ITEM> listListGetAll;
        C1596360rdy c1596360rdy;
        List<Aweme> stories;
        Map<String, String> map4;
        LinearLayoutManager linearLayoutManager;
        Map<String, String> map5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toggleSkylightListShow: isShow = ");
        sbLIZ.append(z);
        sbLIZ.append(", enterMethod = ");
        sbLIZ.append(str);
        sbLIZ.append(", enterFrom: ");
        C1564490qoZ c1564490qoZSo = So();
        if (c1564490qoZSo != null && (map5 = c1564490qoZSo.LL) != null) {
            str3 = map5.get("enter_from");
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        sbLIZ.append(str3);
        sbLIZ.append(", isShowStatusChange = ");
        sbLIZ.append(this.LLJL);
        C2188811AlT.LIZIZ(sbLIZ);
        IAVPublishService iAVPublishServicePublishService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
        int iLIZJ = C497820Jfg.LIZJ(LJJIJL().getContext());
        if (z) {
            this.LLJJLIIIJLLLLLLLZ = System.currentTimeMillis();
            RecyclerView.LayoutManager layoutManager = Go().getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null || linearLayoutManager.findFirstVisibleItemPosition() == 0) {
                C1595220rc8 c1595220rc8 = C1595220rc8.LIZ;
                C1564490qoZ c1564490qoZSo2 = So();
                if (c1564490qoZSo2 == null || (map3 = c1564490qoZSo2.LL) == null || (str6 = map3.get("enter_from")) == null) {
                    str6 = "";
                }
                C1596130rdb c1596130rdb = C1596130rdb.LIZ;
                int iAp = ap();
                c1596130rdb.getClass();
                boolean zLJII = C1596130rdb.LJII(iAp);
                c1595220rc8.getClass();
                C994000byQ.LIZIZ("story_creation_cell_show", new C743840TFu(str6, zLJII));
            }
            if (this.LLJL) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("toggleSkylightListShow reportEnterTopWindow enterMethod: ");
                sbLIZ2.append(str);
                sbLIZ2.append(", enterFrom: ");
                C1564490qoZ c1564490qoZSo3 = So();
                if (c1564490qoZSo3 == null || (map4 = c1564490qoZSo3.LL) == null || (str7 = map4.get("enter_from")) == null) {
                    str7 = "";
                }
                sbLIZ2.append(str7);
                C2188811AlT.LIZIZ(sbLIZ2);
                lp(str);
                C328160Cti.LIZ.getClass();
                if (C328160Cti.LIZIZ() && C328170Ctj.LIZ.enabled && (listListGetAll = ip().listGetAll()) != 0) {
                    Iterator it2 = listListGetAll.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                        if ((interfaceC1891350zJl instanceof C1596360rdy) && (c1596360rdy = (C1596360rdy) interfaceC1891350zJl) != null && c1596360rdy.LL) {
                            C328160Cti c328160Cti = C328160Cti.LIZ;
                            UserStory userStory = c1596360rdy.LLILLJJLI.getUserStory();
                            if (userStory != null && (stories = userStory.getStories()) != null) {
                                c328160Cti.getClass();
                                C328160Cti.LIZ(stories);
                            }
                        }
                    }
                }
                IFeedSkylightHostAbility iFeedSkylightHostAbility = (IFeedSkylightHostAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IFeedSkylightHostAbility.class, null);
                if (iFeedSkylightHostAbility != null) {
                    iFeedSkylightHostAbility.iu0(str, z2);
                }
                this.LLJL = false;
            }
            iLIZIZ = iLIZJ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(181)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            mp();
            if (C285800BIc.LIZ()) {
                C1478160oZK.LIZ().LJJJJIZL(31233, "");
            }
        } else {
            this.LLJLIL = false;
            if (this.LLJJLIIIJLLLLLLLZ != 0) {
                C1564490qoZ c1564490qoZSo4 = So();
                if (c1564490qoZSo4 == null || (map2 = c1564490qoZSo4.LL) == null || (str4 = map2.get("enter_from")) == null) {
                    str4 = "";
                }
                C994000byQ.LIZIZ("skylight_show_duration", new C116900cR(C994000byQ.LIZ(C1596560reI.LJII(So())), str4, System.currentTimeMillis() - this.LLJJLIIIJLLLLLLLZ));
                if (ap() != 2) {
                    String str8 = "enter_room";
                    if (!Intrinsics.LJFF(str2, "enter_room")) {
                        str8 = "default";
                        if (!Intrinsics.LJFF(str2, "default")) {
                            str8 = "draw";
                        }
                    }
                    C1595220rc8 c1595220rc82 = C1595220rc8.LIZ;
                    C1564490qoZ c1564490qoZSo5 = So();
                    if (c1564490qoZSo5 == null || (map = c1564490qoZSo5.LL) == null || (str5 = map.get("enter_from")) == null) {
                        str5 = "";
                    }
                    c1595220rc82.getClass();
                    C994000byQ.LIZIZ("livesdk_following_cover_close", new AwS14S2000000_12(str5, str8, 1));
                }
            }
            IFeedSkylightHostAbility iFeedSkylightHostAbility2 = (IFeedSkylightHostAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IFeedSkylightHostAbility.class, null);
            if (iFeedSkylightHostAbility2 != null) {
                iFeedSkylightHostAbility2.oi0(str2, z2);
            }
            List<InterfaceC1891350zJl> list = ((C1573030r2L) ip().getState()).LL.LLILZ;
            if ((list == null || list.isEmpty()) && ap() == 1 && (feedRecommendSkylightDrawerAbilityOo = Oo()) != null) {
                feedRecommendSkylightDrawerAbilityOo.G62(str, false, false, false, null, false);
            }
            this.LLJL = true;
            iLIZIZ = iLIZJ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
            if (C285800BIc.LIZ()) {
                C1478160oZK.LIZ().LJJJJIZL(31234, "");
            }
        }
        iAVPublishServicePublishService.moveProgress(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), iLIZIZ);
    }
}
