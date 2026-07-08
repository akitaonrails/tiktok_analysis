package com.ss.android.ugc.feed.platform.panel.player;

import X.C1389300mG0;
import X.C13LP;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19719612Di;
import X.C2521709uR;
import X.C586780Mzs;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class VideoPlayBehaviorMobComponent extends BasePanelComponent implements IVideoPlayBehaviorMobAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public int LLILZIL;
    public final BitSet LL = new BitSet(8);
    public final Map<String, Integer> LLILLJJLI = new LinkedHashMap();
    public final CopyOnWriteArrayList<Pair<String, String>> LLILLL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<List<Aweme>> LLILZ = new CopyOnWriteArrayList<>();
    public int LLILZLL = -1;
    public int LLIZ = -1;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1463829795) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IVideoPlayBehaviorMobAbility
    public final void rK2() {
        m348do(0);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IVideoPlayBehaviorMobAbility
    public final void ye2() {
        m348do(2);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        this.LLILZIL = 2;
        m348do(1);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IVideoPlayBehaviorMobAbility
    public final Map<String, Integer> gE1() {
        return this.LLILLJJLI;
    }

    public static final IVideoPlayBehaviorMobAbility bo(InterfaceC665370Q7z interfaceC665370Q7z) {
        if (interfaceC665370Q7z == null) {
            return null;
        }
        return (IVideoPlayBehaviorMobAbility) C1558520qew.LIZ(interfaceC665370Q7z, IVideoPlayBehaviorMobAbility.class, null);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IVideoPlayBehaviorMobAbility
    public final String Ae2(String str) {
        String str2 = "CLICK";
        if (C2521709uR.LIZ) {
            return "CLICK";
        }
        for (Pair<String, String> pair : this.LLILLL) {
            if (Intrinsics.LJFF(pair.getFirst(), str)) {
                return pair.getSecond();
            }
        }
        String str3 = "OTHER";
        String str4 = "REFRESH";
        if (!this.LL.isEmpty()) {
            int iNextSetBit = this.LL.nextSetBit(0);
            if (iNextSetBit != 0) {
                if (iNextSetBit != 1) {
                    if (iNextSetBit != 2) {
                        str2 = "OTHER";
                    } else {
                        str2 = "REFRESH";
                    }
                } else {
                    str2 = "PAGE_CHANGE";
                }
            }
            this.LL.clear();
            str4 = str2;
        } else {
            int i = this.LLILZLL;
            if (i != -1) {
                int i2 = this.LLIZ;
                if (i2 == i - 1) {
                    str3 = "DOWN";
                } else if (i2 == i + 1) {
                    str3 = "UP";
                }
                str4 = str3;
            }
        }
        this.LLILLL.add(new Pair<>(str, str4));
        return str4;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IVideoPlayBehaviorMobAbility
    public final int H71(int i) {
        int iMax = Math.max(i, this.LLILZIL);
        this.LLILZIL = 0;
        return iMax;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IVideoPlayBehaviorMobAbility
    public final void Ki1(String str) {
        if (C2521709uR.LIZ) {
            return;
        }
        C19719612Di.LJJIIJ(this.LLILLL, new C586780Mzs(str), true);
        if (this.LLILLL.size() > 128) {
            CopyOnWriteArrayList<Pair<String, String>> copyOnWriteArrayList = this.LLILLL;
            copyOnWriteArrayList.subList(0, copyOnWriteArrayList.size() - 128).clear();
        }
        if (this.LLILZ.size() > 128) {
            CopyOnWriteArrayList<List<Aweme>> copyOnWriteArrayList2 = this.LLILZ;
            copyOnWriteArrayList2.subList(0, copyOnWriteArrayList2.size() - 128).clear();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IVideoPlayBehaviorMobAbility
    public final void QF1(int i) {
        this.LLILZLL = this.LLIZ;
        this.LLIZ = i;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m348do(int i) {
        this.LL.set(i);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IVideoPlayBehaviorMobAbility
    public final int hX1(String str) {
        Integer num;
        int iPK = pK(str);
        if (C1389300mG0.LJII(getPanelContext())) {
            Integer numValueOf = Integer.valueOf(iPK);
            if (this.LLILZLL != -1 && (numValueOf == null || numValueOf.intValue() != 0 || this.LLIZ == 0)) {
                return 0;
            }
        } else {
            if (!C1389300mG0.LJIJJ(getPanelContext())) {
                return 0;
            }
            Integer numValueOf2 = Integer.valueOf(iPK);
            if (!C2521709uR.LIZ) {
                for (Pair<String, String> pair : this.LLILLL) {
                    if (Intrinsics.LJFF(pair.getFirst(), str)) {
                        String second = pair.getSecond();
                        int iHashCode = second.hashCode();
                        if (iHashCode != -995919008) {
                            if (iHashCode != 64212328) {
                                if (iHashCode != 1803427515 || !second.equals("REFRESH")) {
                                }
                            } else if (second.equals("CLICK")) {
                                return 2;
                            }
                        } else if (second.equals("PAGE_CHANGE")) {
                            return 2;
                        }
                    }
                }
                if (numValueOf2 != null && numValueOf2.intValue() == 0 && (num = (Integer) ((LinkedHashMap) this.LLILLJJLI).get(str)) != null) {
                    return num.intValue();
                }
                return 0;
            }
            return 0;
        }
        return 1;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IVideoPlayBehaviorMobAbility
    public final void ki0(List<? extends Aweme> list) {
        if (C2521709uR.LIZ) {
            return;
        }
        this.LLILZ.add(C13LP.LLIIII(list));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPageResume(int i) {
        super.onPageResume(i);
        this.LLILZIL = 2;
        m348do(1);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.player.IVideoPlayBehaviorMobAbility
    public final int pK(String str) {
        int i;
        if (C2521709uR.LIZ) {
            return -1;
        }
        Iterator it2 = C13LP.LJLJJLL(this.LLILZ).iterator();
        loop0: while (true) {
            i = -1;
            if (!it2.hasNext()) {
                break;
            }
            i = 0;
            for (Object obj : (List) it2.next()) {
                int i2 = i + 1;
                if (i >= 0) {
                    Aweme aweme = (Aweme) obj;
                    if (aweme.getAid() != null && aweme.getAid().equals(str)) {
                        break loop0;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return i;
    }
}
