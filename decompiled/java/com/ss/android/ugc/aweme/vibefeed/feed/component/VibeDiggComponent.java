package com.ss.android.ugc.aweme.vibefeed.feed.component;

import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C098200Yq;
import X.C09RB;
import X.C0P31;
import X.C1305070k49;
import X.C1305090k4B;
import X.C13BV;
import X.C13LE;
import X.C1470090oMJ;
import X.C14EU;
import X.C1558520qew;
import X.C1566140qrE;
import X.C1575440r6E;
import X.C1575980r76;
import X.C1620830sHR;
import X.C1637806bA;
import X.C16F4;
import X.C189200o6;
import X.C1939607ik;
import X.C19719912Dl;
import X.C19EG;
import X.C2189821An6;
import X.C2217381BqS;
import X.C23250099c;
import X.C299750Boz;
import X.C452501pT;
import X.C622680Oba;
import X.C630740Ooa;
import X.C724750Sbp;
import X.C737030Svd;
import X.EnumC452301pR;
import X.EnumC912680ZrG;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC735940Sts;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.live.alphaplayer.Configuration;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import com.ss.android.ugc.aweme.live.alphaplayer.player.DefaultSystemPlayer;
import com.ss.android.ugc.aweme.vibefeed.ability.IVibeDiggAbility;
import com.ss.android.ugc.aweme.vibefeed.feed.component.VibeDiggComponent;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedConsumeViewModel;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.digg.IDiggComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS139S1200000_24;
import kotlin.jvm.internal.AwS140S0110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS74S1000000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class VibeDiggComponent extends BasePanelComponent implements IVibeDiggAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C01GW LL;
    public C1305090k4B LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final AssemVMLazy LLILZIL;
    public JSONObject LLILZLL;
    public final Set<String> LLIZ;
    public final C01GW LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VibeDiggComponent.class, "consumeViewModel", "getConsumeViewModel()Lcom/ss/android/ugc/aweme/vibefeed/feed/viewmodel/VibeFeedConsumeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public VibeDiggComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1494), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 18));
        }
        this.LL = c01gwLIZIZ;
        this.LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1491));
        this.LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1495));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VibeFeedConsumeViewModel.class);
        this.LLILZIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1493), AFwS264S0000000_24.get$arr$(520), null, true);
        this.LLIZ = new LinkedHashSet();
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1492));
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 138432256) {
            return null;
        }
        return this;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final EnumC912680ZrG m333do() {
        return (EnumC912680ZrG) this.LLIZLLLIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0r68] */
    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() throws IllegalAccessException {
        Object c098200Yq;
        String vibeExtraParam;
        DetailNavArgModel navArgModel;
        super.onParentViewCreated();
        C1558520qew.LIZLLL(this);
        try {
            C2189821An6 c2189821An6 = getPanelContext().LIZJ;
            if (c2189821An6 == null || (navArgModel = c2189821An6.getNavArgModel()) == null || (vibeExtraParam = navArgModel.getVibeExtraParam()) == null) {
                vibeExtraParam = "";
            }
            c098200Yq = new JSONObject(vibeExtraParam);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        this.LLILZLL = (JSONObject) c098200Yq;
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = new C1305090k4B(getPanelContext().LIZ(), getPanelContext().LIZ(), m333do());
        }
        if (m333do().isPrivate()) {
            Pair<List<UrlModel>, Integer> pairFo = fo();
            List<UrlModel> first = pairFo.getFirst();
            Integer second = pairFo.getSecond();
            C1305090k4B c1305090k4B = this.LLILLJJLI;
            if (c1305090k4B != null) {
                c1305090k4B.LIZIZ(first, second, "", null);
            }
        }
        C622680Oba.LIZJ(this);
        IDiggComponentAbility iDiggComponentAbility = (IDiggComponentAbility) this.LLILLL.getValue();
        if (iDiggComponentAbility != 0) {
            iDiggComponentAbility.RN1(new InterfaceC735940Sts() { // from class: X.0r68
                @Override // X.InterfaceC735940Sts
                public final void LIZ(C16F4 c16f4) {
                    String aid;
                    Aweme awemeLJIIIIZZ;
                    IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LIZ.LLILZ.getValue();
                    if (iViewPagerComponentAbility == null || (awemeLJIIIIZZ = iViewPagerComponentAbility.LJIIIIZZ()) == null || (aid = awemeLJIIIIZZ.getAid()) == null) {
                        aid = "";
                    }
                    this.LIZ.bo(aid, c16f4);
                }
            });
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILZ.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new C1620830sHR(this, 8));
        }
    }

    public final Pair<List<UrlModel>, Integer> fo() {
        Aweme awemeLJIIIIZZ;
        List<String> listLJIIZILJ;
        String strOptString;
        UrlModel avatarThumb;
        if (m333do().isPrivate()) {
            JSONObject jSONObject = this.LLILZLL;
            if (jSONObject == null || (strOptString = jSONObject.optString("to_user_id")) == null) {
                strOptString = "";
            }
            IMUser iMUserLIZLLL = C1575440r6E.LIZLLL(strOptString);
            return new Pair<>((iMUserLIZLLL == null || (avatarThumb = iMUserLIZLLL.getAvatarThumb()) == null) ? null : Collections.singletonList(avatarThumb), null);
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILZ.getValue();
        if (iViewPagerComponentAbility == null || (awemeLJIIIIZZ = iViewPagerComponentAbility.LJIIIIZZ()) == null) {
            return new Pair<>(null, null);
        }
        String strLIZ = C1575440r6E.LIZ();
        if (strLIZ == null) {
            return new Pair<>(null, null);
        }
        AssemVMLazy assemVMLazy = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        VibeFeedConsumeViewModel vibeFeedConsumeViewModel = (VibeFeedConsumeViewModel) assemVMLazy.getValue();
        String aid = awemeLJIIIIZZ.getAid();
        C0P31 c0p31 = vibeFeedConsumeViewModel.LLILZ;
        if (c0p31 == null || (listLJIIZILJ = c0p31.LJIIZILJ(aid)) == null) {
            listLJIIZILJ = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : listLJIIZILJ) {
            if (!Intrinsics.LJFF(str, strLIZ)) {
                arrayList.add(str);
            }
        }
        return new Pair<>(C09RB.LJJII(C09RB.LJJI(C09RB.LJIJI(new C1939607ik(arrayList), new AwS74S1000000_24(strLIZ, 9)), 3)), Integer.valueOf(arrayList.size()));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
        IDiggComponentAbility iDiggComponentAbility = (IDiggComponentAbility) this.LLILLL.getValue();
        if (iDiggComponentAbility != null) {
            iDiggComponentAbility.RN1(null);
        }
        C1305090k4B c1305090k4B = this.LLILLJJLI;
        if (c1305090k4B != null) {
            c1305090k4B.LIZJ();
        }
        this.LLILLJJLI = null;
    }

    @C14EU
    public final void onVideoDiggEvent(C737030Svd c737030Svd) {
        String str;
        if (C1575980r76.LIZIZ(c737030Svd.LJ)) {
            Object obj = c737030Svd.LIZIZ;
            if ((obj instanceof String) && (str = (String) obj) != null) {
                AssemVMLazy assemVMLazy = this.LLILZIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
                VibeFeedConsumeViewModel vibeFeedConsumeViewModel = (VibeFeedConsumeViewModel) assemVMLazy.getValue();
                C0P31 c0p31 = vibeFeedConsumeViewModel.LLILZ;
                if (c0p31 != null && c0p31.LJJI(str)) {
                    vibeFeedConsumeViewModel.setState(AFwS240S0000000_9.get$arr$(815));
                    return;
                }
                return;
            }
            return;
        }
        if (c737030Svd.LIZ != 6) {
            return;
        }
        Object obj2 = c737030Svd.LIZIZ;
        if ((obj2 instanceof String) && obj2 != null) {
            this.LLIZ.remove(obj2);
        }
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.ability.IVibeDiggAbility
    public final void Rw1(String str, boolean z) {
        C16F4 c16f4XQ;
        if (z) {
            IDiggComponentAbility iDiggComponentAbility = (IDiggComponentAbility) this.LLILLL.getValue();
            if (iDiggComponentAbility != null && (c16f4XQ = iDiggComponentAbility.xQ()) != null) {
                bo(str, c16f4XQ);
                return;
            }
            return;
        }
        this.LLIZ.remove(str);
    }

    public final void bo(String str, C16F4 c16f4) {
        Aweme awemeLJIIIIZZ;
        List<String> listLJIIZILJ;
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILZ.getValue();
        if (iViewPagerComponentAbility != null && (awemeLJIIIIZZ = iViewPagerComponentAbility.LJIIIIZZ()) != null) {
            AssemVMLazy assemVMLazy = this.LLILZIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
            VibeFeedConsumeViewModel vibeFeedConsumeViewModel = (VibeFeedConsumeViewModel) assemVMLazy.getValue();
            String aid = awemeLJIIIIZZ.getAid();
            C0P31 c0p31 = vibeFeedConsumeViewModel.LLILZ;
            if (c0p31 == null || (listLJIIZILJ = c0p31.LJIIZILJ(aid)) == null) {
                listLJIIZILJ = C13BV.INSTANCE;
            }
            Iterator<String> it2 = listLJIIZILJ.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.LJFF(it2.next(), C1575440r6E.LIZ())) {
                    if (this.LLIZ.add(awemeLJIIIIZZ.getAid())) {
                        if (m333do().isPrivate()) {
                            ho(str, c16f4);
                            return;
                        }
                        Pair<List<UrlModel>, Integer> pairFo = fo();
                        List<UrlModel> first = pairFo.getFirst();
                        Integer second = pairFo.getSecond();
                        C1305090k4B c1305090k4B = this.LLILLJJLI;
                        if (c1305090k4B == null) {
                            return;
                        }
                        c1305090k4B.LIZIZ(first, second, awemeLJIIIIZZ.getAid(), new AwS139S1200000_24(this, str, c16f4, 9));
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void ho(final String str, ViewGroup viewGroup) {
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        C1305090k4B c1305090k4B = this.LLILLJJLI;
        if (c1305090k4B != null) {
            try {
                PlayerController playerController = c1305090k4B.LIZJ;
                if (playerController != null) {
                    if (playerController.isPlaying()) {
                        return;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        C1305090k4B c1305090k4B2 = this.LLILLJJLI;
        if (c1305090k4B2 != null) {
            Context context = viewGroup.getContext();
            C19EG c19egLIZ = getPanelContext().LIZ();
            AlphaPlayerAction alphaPlayerAction = new AlphaPlayerAction() { // from class: X.0r67
                @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
                public final void onVideoSizeChange(int i, int i2, DataSource.ScaleType scaleType) {
                }

                @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
                public final void endAction() {
                    C1305090k4B c1305090k4B3 = this.LIZ.LLILLJJLI;
                    if (c1305090k4B3 != null) {
                        c1305090k4B3.LIZ();
                    }
                }

                @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
                public final void startAction() {
                    String strOptString;
                    VibeDiggComponent vibeDiggComponent = this.LIZ;
                    String str2 = str;
                    JSONObject jSONObject = vibeDiggComponent.LLILZLL;
                    if (jSONObject == null || (strOptString = jSONObject.optString("conversation_id")) == null) {
                        strOptString = "";
                    }
                    String strLIZLLL = C0P30.LIZ().LIZLLL(strOptString);
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "shared_feed");
                    c2344009Gk.LJIIIIZZ("shared_feed_id", strLIZLLL);
                    c2344009Gk.LJIIIIZZ("conversation_id", strOptString);
                    c2344009Gk.LJIIIIZZ("group_id", str2);
                    String strLIZJ = vibeDiggComponent.m333do().isPrivate() ? C1575210r5r.LLILLJJLI.LIZJ(strOptString) : null;
                    if (strLIZJ != null) {
                        strLIZJ.toString();
                        c2344009Gk.LJFF("invitee_uid", strLIZJ);
                    }
                    c2344009Gk.LJIIIIZZ("chat_type", vibeDiggComponent.m333do().stringValue());
                    C20684815ws.LJIILLIIL("ttsocial_shared_feed_effect_show", c2344009Gk.LIZ);
                }
            };
            if (!c1305090k4B2.LJ) {
                c1305090k4B2.LJ = true;
                c1305090k4B2.LIZ();
                PlayerController playerController2 = c1305090k4B2.LIZJ;
                if (playerController2 != null) {
                    playerController2.release();
                }
                c1305090k4B2.LIZLLL = viewGroup;
                Configuration configuration = new Configuration();
                configuration.setContext(context);
                configuration.setLifecycleOwner(c19egLIZ);
                configuration.setAlphaVideoViewType(1);
                try {
                    c1305090k4B2.LIZJ = PlayerController.get(configuration, new C1470090oMJ(context));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c1305090k4B2.LIZJ = PlayerController.get(configuration, new DefaultSystemPlayer());
                }
                PlayerController playerController3 = c1305090k4B2.LIZJ;
                if (playerController3 != null) {
                    playerController3.withVideoAction(alphaPlayerAction);
                }
            }
        }
        C1305090k4B c1305090k4B3 = this.LLILLJJLI;
        if (c1305090k4B3 != null) {
            PlayerController playerController4 = c1305090k4B3.LIZJ;
            if (playerController4 != null) {
                playerController4.attachAlphaView(c1305090k4B3.LIZLLL);
            }
            DataSource dataSource = c1305090k4B3.LJI;
            if (dataSource != null) {
                PlayerController playerController5 = c1305090k4B3.LIZJ;
                if (playerController5 != null) {
                    MaskSrc maskSrc = new MaskSrc();
                    maskSrc.setName("Avatar Text");
                    maskSrc.setType(1);
                    maskSrc.setBitmap(c1305090k4B3.LJFF);
                    maskSrc.setUseBitmapSize(true);
                    playerController5.setMask(maskSrc);
                }
                PlayerController playerController6 = c1305090k4B3.LIZJ;
                if (playerController6 != null) {
                    playerController6.start(dataSource);
                    return;
                }
                return;
            }
            AnonymousClass0956 anonymousClass0956 = c1305090k4B3.LJIIIIZZ;
            if ((anonymousClass0956 != null && anonymousClass0956.isActive()) || (lifecycleOwner = c1305090k4B3.LIZIZ) == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
                return;
            }
            C23250099c.LIZLLL(lifecycleScope, null, null, new C1305070k49(c1305090k4B3, null), 3);
        }
    }
}
