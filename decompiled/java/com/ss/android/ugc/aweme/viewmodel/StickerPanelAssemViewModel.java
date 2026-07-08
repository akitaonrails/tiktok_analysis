package com.ss.android.ugc.aweme.viewmodel;

import X.AbstractC1711506n3;
import X.AnonymousClass0956;
import X.C01GW;
import X.C056P;
import X.C05YD;
import X.C0HK1;
import X.C0HK3;
import X.C0HK4;
import X.C0HV2;
import X.C0HV3;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1954807lC;
import X.C2217381BqS;
import X.C23250099c;
import X.C259800zU;
import X.C443150HZh;
import X.C443730Had;
import X.C443740Hae;
import X.C443860Haq;
import X.C443870Har;
import X.C443890Hat;
import X.C443910Hav;
import X.C449650HkB;
import X.C449710HkH;
import X.C451430Hn3;
import X.C452501pT;
import X.C454640HsE;
import X.C457780HxI;
import X.C866950Xzh;
import X.EnumC440890HQp;
import X.EnumC443930Hax;
import X.EnumC449720HkI;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import X.InterfaceC443750Haf;
import X.InterfaceC443810Hal;
import X.InterfaceC444050Hb9;
import X.InterfaceC450290HlD;
import X.InterfaceC456940Hvw;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS21S0001000_6;
import kotlin.jvm.internal.AwS21S0010000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class StickerPanelAssemViewModel extends AssemViewModel<C443860Haq> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public AnonymousClass0956 LLILZ;
    public volatile InterfaceC450290HlD LLIZ;
    public final Map<EnumC449720HkI, List<InterfaceC444050Hb9>> LL = new LinkedHashMap();
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C449650HkB.class, (Class<Object>) null, (String) 13), true);
    public String LLILLL = "icon";
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(353));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(354));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StickerPanelAssemViewModel.class, "imStickerRepository", "getImStickerRepository()Lcom/ss/android/ugc/aweme/im/sticker/api/repo/IMStickerRepository;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final void KQ2() {
        C457780HxI c457780HxI;
        SessionInfo sessionInfo;
        String conversationId;
        C454640HsE c454640HsE = IMStickerApi.LIZ;
        IIMSocialAvatarService imSocialAvatarService = c454640HsE.LIZIZ().getImSocialAvatarService();
        if (imSocialAvatarService == null || !imSocialAvatarService.isEnabled()) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C0HV2(imSocialAvatarService, new C259800zU(), new C259800zU(), this, null), 3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C0HV3(this, imSocialAvatarService, null), 3);
        InterfaceC456940Hvw imAvatarDuoService = c454640HsE.LIZIZ().getImAvatarDuoService();
        if (imAvatarDuoService == null || !imAvatarDuoService.isEnabled() || (c457780HxI = wQ2().LLJJI) == null || (sessionInfo = c457780HxI.LL) == null || (conversationId = sessionInfo.getConversationId()) == null) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C443150HZh(imAvatarDuoService, conversationId, this, null), 3);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C443860Haq(0);
    }

    public final void vQ2() {
        ArrayList arrayList = new ArrayList();
        Iterator<EnumC449720HkI> it2 = wQ2().LL.iterator();
        while (it2.hasNext()) {
            Collection collection = (Collection) ((LinkedHashMap) this.LL).get(it2.next());
            if (collection != null) {
                arrayList.addAll(collection);
            }
        }
        if (wQ2().LLJLLIL == EnumC443930Hax.LAZY) {
            setState(new AwS585S0100000_6(arrayList, (List<? extends EnumC440890HQp>) 211));
        } else {
            setStateImmediate(new AwS585S0100000_6(arrayList, (List<? extends EnumC440890HQp>) 212));
        }
    }

    public final C449650HkB wQ2() {
        return (C449650HkB) this.LLILLJJLI.getValue();
    }

    public final String AQ2() {
        return wQ2().LLLFF;
    }

    public final int Al() {
        return getState().LLILLL.size();
    }

    public final InterfaceC444050Hb9 BQ2() {
        int i;
        C443860Haq state = getState();
        if (state.LLILLL.isEmpty() || (i = getState().LLILLJJLI) < 0 || i >= state.LLILLL.size()) {
            return null;
        }
        return (InterfaceC444050Hb9) ListProtector.get(state.LLILLL, i);
    }

    public final String EQ2() {
        return wQ2().LLILZLL;
    }

    public final Aweme xQ2() {
        Function0<Aweme> function0 = wQ2().LLLFFI;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    public final String yQ2() {
        SessionInfo sessionInfo;
        String str = wQ2().LLJJIII;
        if (str != null) {
            return str;
        }
        C457780HxI c457780HxI = wQ2().LLJJI;
        if (c457780HxI == null || (sessionInfo = c457780HxI.LL) == null) {
            return null;
        }
        return sessionInfo.getConversationId();
    }

    public final Integer zQ2() {
        SessionInfo sessionInfo;
        Integer num = wQ2().LLJJIJI;
        if (num != null) {
            return Integer.valueOf(num.intValue());
        }
        C457780HxI c457780HxI = wQ2().LLJJI;
        if (c457780HxI == null || (sessionInfo = c457780HxI.LL) == null) {
            return null;
        }
        return Integer.valueOf(sessionInfo.isSingleChat() ? AbstractC1711506n3.LIZ : AbstractC1711506n3.LIZIZ);
    }

    public static void HQ2(StickerPanelAssemViewModel stickerPanelAssemViewModel) {
        stickerPanelAssemViewModel.GQ2(C13BV.INSTANCE);
    }

    public final InterfaceC444050Hb9 CQ2(int i) {
        return (InterfaceC444050Hb9) C13LP.LJJJLZIJ(i, getState().LLILLL);
    }

    public final int DQ2(int i) {
        Iterator<InterfaceC444050Hb9> it2 = getState().LLILLL.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            if (it2.next().LIZJ() != i) {
                i2++;
            } else {
                return i2;
            }
        }
        return -1;
    }

    public final boolean FQ2(Integer num) {
        List<Integer> list;
        if (!C866950Xzh.LIZIZ(wQ2().LLJJ) || (list = wQ2().LLJJ) == null || C13LP.LJJJJ(num, list)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void GQ2(List<? extends C056P> list) {
        Object objSingletonList;
        boolean z;
        Object value;
        Iterator<EnumC449720HkI> it2 = wQ2().LL.iterator();
        while (true) {
            Object value2 = null;
            if (it2.hasNext()) {
                EnumC449720HkI next = it2.next();
                Map<EnumC449720HkI, List<InterfaceC444050Hb9>> map = this.LL;
                boolean z2 = true;
                switch (C449710HkH.LIZ[next.ordinal()]) {
                    case 1:
                        objSingletonList = Collections.singletonList(new C451430Hn3(1));
                        break;
                    case 2:
                        objSingletonList = Collections.singletonList(C443730Had.LIZIZ);
                        break;
                    case 3:
                        objSingletonList = Collections.singletonList(new C443910Hav() { // from class: X.0Haa
                            @Override // X.InterfaceC444050Hb9
                            public final int LIZJ() {
                                return 13;
                            }

                            @Override // X.C443910Hav, X.InterfaceC444050Hb9
                            public final int LIZLLL() {
                                return 0;
                            }

                            @Override // X.C443910Hav, X.InterfaceC444050Hb9
                            public final List<C451030HmP> LIZ() {
                                return C13BV.INSTANCE;
                            }

                            @Override // X.C443910Hav, X.InterfaceC444050Hb9
                            public final Drawable LJFF(Context context) {
                                C419910GdJ c419910GdJ = new C419910GdJ();
                                c419910GdJ.LIZ = R.raw.icon_fire;
                                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                                return c419910GdJ.LIZ(context);
                            }
                        });
                        break;
                    case 4:
                        objSingletonList = Collections.singletonList(new C443910Hav() { // from class: X.0Hac
                            @Override // X.InterfaceC444050Hb9
                            public final int LIZJ() {
                                return 8;
                            }

                            @Override // X.C443910Hav, X.InterfaceC444050Hb9
                            public final int LIZLLL() {
                                return 0;
                            }

                            @Override // X.C443910Hav, X.InterfaceC444050Hb9
                            public final Drawable LJFF(Context context) {
                                C419910GdJ c419910GdJ = new C419910GdJ();
                                c419910GdJ.LIZ = R.raw.icon_gif;
                                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                                return c419910GdJ.LIZ(context);
                            }
                        });
                        break;
                    case 5:
                        IMStickerApi iMStickerApiLIZIZ = IMStickerApi.LIZ.LIZIZ();
                        if (iMStickerApiLIZIZ.getImAvatarDuoService().isEnabled() && iMStickerApiLIZIZ.getImSocialAvatarService().LJJIIZI()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean z3 = iMStickerApiLIZIZ.getImSocialAvatarService().LJJLI(null, false).getValue() instanceof C0HK1;
                        boolean zContains = list.contains(C056P.MIX_STUDIO);
                        C05YD c05yd = (C05YD) this.LLILZIL.getValue();
                        if (c05yd != null) {
                            value = c05yd.getValue();
                        } else {
                            value = null;
                        }
                        if (!(value instanceof C0HK3)) {
                            C05YD c05yd2 = (C05YD) this.LLILZIL.getValue();
                            if (c05yd2 != null) {
                                value2 = c05yd2.getValue();
                            }
                            if (!(value2 instanceof C0HK4)) {
                                z2 = false;
                            }
                        }
                        objSingletonList = (!z && !z3 && !z2) ? C13BV.INSTANCE : Collections.singletonList(new C443740Hae(zContains));
                        break;
                    case 6:
                        InterfaceC443750Haf imAiSelfStickerService = IMStickerApi.LIZ.LIZIZ().getImAiSelfStickerService();
                        if (imAiSelfStickerService == null) {
                            objSingletonList = C13BV.INSTANCE;
                        } else if (!imAiSelfStickerService.LJI()) {
                            objSingletonList = C13BV.INSTANCE;
                        } else if (Intrinsics.LJFF(imAiSelfStickerService.getStatus().getValue(), new InterfaceC443810Hal() { // from class: X.0Hao
                        })) {
                            objSingletonList = C13BV.INSTANCE;
                        } else {
                            objSingletonList = Collections.singletonList(new C443910Hav() { // from class: X.0Hab
                                @Override // X.InterfaceC444050Hb9
                                public final int LIZJ() {
                                    return 11;
                                }

                                @Override // X.C443910Hav, X.InterfaceC444050Hb9
                                public final int LIZLLL() {
                                    return 0;
                                }

                                @Override // X.C443910Hav, X.InterfaceC444050Hb9
                                public final int LJI() {
                                    return 4;
                                }

                                @Override // X.C443910Hav, X.InterfaceC444050Hb9
                                public final String getName() {
                                    return "Ai-self";
                                }

                                @Override // X.C443910Hav, X.InterfaceC444050Hb9
                                public final String getIconUrl() {
                                    Pair<String, Boolean> pairLJII;
                                    String first;
                                    InterfaceC443750Haf imAiSelfStickerService2 = IMStickerApi.LIZ.LIZIZ().getImAiSelfStickerService();
                                    return (imAiSelfStickerService2 == null || (pairLJII = imAiSelfStickerService2.LJII()) == null || (first = pairLJII.getFirst()) == null) ? "" : first;
                                }

                                @Override // X.C443910Hav, X.InterfaceC444050Hb9
                                public final List<C451030HmP> LIZ() {
                                    return C13BV.INSTANCE;
                                }

                                @Override // X.C443910Hav, X.InterfaceC444050Hb9
                                public final Drawable LJFF(Context context) {
                                    C419910GdJ c419910GdJ = new C419910GdJ();
                                    c419910GdJ.LIZ = R.raw.icon_aimoji_placeholder;
                                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                                    return c419910GdJ.LIZ(context);
                                }
                            });
                        }
                        break;
                    case 7:
                        objSingletonList = new ArrayList();
                        if (wQ2().LLIZLLLIL) {
                            objSingletonList.add(new C443870Har());
                        }
                        break;
                    case 8:
                        objSingletonList = !IMStickerApi.LIZ.LIZIZ().getImStreakStickerService().LIZJ() ? C13BV.INSTANCE : Collections.singletonList(new C443910Hav() { // from class: X.0HaZ
                            @Override // X.InterfaceC444050Hb9
                            public final int LIZJ() {
                                return 12;
                            }

                            @Override // X.C443910Hav, X.InterfaceC444050Hb9
                            public final int LIZLLL() {
                                return 0;
                            }

                            @Override // X.C443910Hav, X.InterfaceC444050Hb9
                            public final int LJI() {
                                return 4;
                            }

                            @Override // X.C443910Hav, X.InterfaceC444050Hb9
                            public final String getName() {
                                return "Streak";
                            }

                            @Override // X.C443910Hav, X.InterfaceC444050Hb9
                            public final String getIconUrl() {
                                Pair<Boolean, String> pairLIZIZ = IMStickerApi.LIZ.LIZIZ().getImStreakStickerService().LIZIZ();
                                return !pairLIZIZ.getFirst().booleanValue() ? "" : pairLIZIZ.getSecond();
                            }

                            @Override // X.C443910Hav, X.InterfaceC444050Hb9
                            public final List<C451030HmP> LIZ() {
                                return C13BV.INSTANCE;
                            }

                            @Override // X.C443910Hav, X.InterfaceC444050Hb9
                            public final Drawable LJFF(Context context) {
                                C419910GdJ c419910GdJ = new C419910GdJ();
                                c419910GdJ.LIZ = R.raw.icon_aimoji_placeholder;
                                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                                return c419910GdJ.LIZ(context);
                            }
                        });
                        break;
                    default:
                        throw new C1954807lC();
                }
                map.put(next, (List<InterfaceC444050Hb9>) objSingletonList);
            } else {
                if (this.LL.containsKey(EnumC449720HkI.SET_STICKERS)) {
                    AnonymousClass0956 anonymousClass0956 = this.LLILZ;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    this.LLILZ = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C443890Hat(this, null), 3);
                    return;
                }
                vQ2();
                return;
            }
        }
    }

    public final void IQ2(int i) {
        if (wQ2().LLJLLIL == EnumC443930Hax.LAZY) {
            setState(new AwS21S0001000_6(i, 9));
        } else {
            setStateImmediate(new AwS21S0001000_6(i, 10));
        }
    }

    public final void JQ2(boolean z) {
        setState(new AwS21S0010000_6(z, 7));
    }
}
