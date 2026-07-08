package com.ss.android.ugc.aweme.tools.music.music.vertical;

import X.AbstractC1177930gl5;
import X.AbstractC1391240mJ8;
import X.AbstractC204621154x;
import X.AbstractC204625155b;
import X.AbstractC204637155n;
import X.AbstractC21673619ry;
import X.C00IV;
import X.C01GW;
import X.C06U1;
import X.C093Y;
import X.C09JN;
import X.C09R3;
import X.C0C64;
import X.C0CHQ;
import X.C0CNO;
import X.C0ETY;
import X.C0XPD;
import X.C1152660g6K;
import X.C11JF;
import X.C11NJ;
import X.C11PQ;
import X.C1201120hMU;
import X.C1205850hU7;
import X.C129G;
import X.C129I;
import X.C12DO;
import X.C12H3;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1429680nJ8;
import X.C1458260o3E;
import X.C14EU;
import X.C154M;
import X.C155H;
import X.C155P;
import X.C155U;
import X.C155V;
import X.C155W;
import X.C155X;
import X.C155Y;
import X.C155Z;
import X.C15O7;
import X.C1602160rnK;
import X.C1630570sX9;
import X.C1654760tAA;
import X.C1661180tKW;
import X.C1664660tQ8;
import X.C1664740tQG;
import X.C1664770tQJ;
import X.C1697810uHb;
import X.C16BC;
import X.C16G1;
import X.C16H0;
import X.C1701940uOG;
import X.C19471311Fv;
import X.C19561511g5;
import X.C19642311t7;
import X.C1DRF;
import X.C1DRG;
import X.C20440014yU;
import X.C204614154q;
import X.C204628155e;
import X.C204639155p;
import X.C204642155s;
import X.C204645155v;
import X.C204657156h;
import X.C20632315oP;
import X.C20749216Hi;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C265340Aaa;
import X.C280760AzS;
import X.C297110Bkj;
import X.C297410BlD;
import X.C298080BmI;
import X.C298090BmJ;
import X.C299110Bnx;
import X.C299130Bnz;
import X.C337180DJs;
import X.C345870DhB;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C560530Lyd;
import X.C580130Mp9;
import X.C622680Oba;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1654750tA9;
import X.InterfaceC1459070o4X;
import X.InterfaceC1459100o4a;
import X.InterfaceC1638460sjs;
import X.InterfaceC1867560yhO;
import X.InterfaceC20440614ya;
import X.InterfaceC204613154p;
import X.InterfaceC204626155c;
import X.InterfaceC204629155f;
import X.InterfaceC20499515Jh;
import X.InterfaceC20500415Jq;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2385309Wh;
import X.InterfaceC366450EYh;
import X.InterfaceC379610EuV;
import X.InterfaceC420801kM;
import X.InterfaceC849390XTt;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS102S0100000_2;
import Y.AfS188S0100000_19;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.music.ui.AIMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.VideoMusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicViewV2;
import com.ss.android.ugc.aweme.tools.music.music.vertical.player.VideoPlayerComponent;
import com.ss.android.ugc.aweme.tools.music.utils.VerticalMusicLeakFixHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jg5.AvS183S0000000_31;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS114S1200000_31;
import kotlin.jvm.internal.AwS115S0110000_29;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes32.dex */
public final class VerticalMusicViewV2 extends AbstractC204621154x implements InterfaceC1459070o4X, InterfaceC379610EuV, GenericLifecycleObserver {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLII;
    public final C1DRG LLILZ;
    public final C155W LLILZIL;
    public View LLILZLL;
    public C155H LLIZ;
    public C19561511g5 LLIZLLLIL;
    public C204628155e LLJ;
    public final C1664740tQG LLJI;
    public final C204639155p LLJIJIL;
    public VideoPlayerComponent LLJILJIL;
    public final float LLJILJILJ;
    public C204642155s LLJILLL;
    public C204645155v LLJJ;
    public final List<AbstractC204637155n> LLJJI;
    public SafeHandler LLJJIII;
    public ViewPager LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public C20632315oP LLJJJ;
    public final ArrayList<EnumC1654750tA9> LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public TuxSheet LLJJJJLIIL;
    public InterfaceC20500415Jq LLJJL;
    public final C11NJ LLJJLIIIJLLLLLLLZ;
    public MusicModel LLJL;
    public long LLJLIL;
    public boolean LLJLILLLLZIIL;
    public int LLJLL;
    public boolean LLJLLIL;
    public final List<InterfaceC204626155c> LLJLLL;
    public boolean LLJZ;
    public final C01GW LLJZIJLIL;
    public EnumC1654750tA9 LLL;
    public EnumC1654750tA9 LLLF;
    public final C204614154q LLLFF;
    public final Map<EnumC1654750tA9, Set<String>> LLLFFI;
    public final VerticalMusicLeakFixHelper LLLFZ;
    public final C01GW LLLI;
    public Integer LLLII;
    public C11JF LLLIIII;
    public boolean LLLIIIIL;
    public Boolean LLLIIIL;
    public final Map<EnumC1654750tA9, Set<String>> LLLIIL;
    public final C560530Lyd<Boolean> LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public String LLLILZJ;
    public final HashMap<String, MusicModel> LLLILZLLLI;
    public long LLLIZZ;
    public final C01GW LLLJ;
    public C06U1 LLLJIL;
    public Object LLLJL;
    public final C155X LLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VerticalMusicViewV2.class, "recentMusicApi", "getRecentMusicApi()Lcom/ss/android/ugc/aweme/tools/music/music/recent/components/RecentMusicTabApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VerticalMusicViewV2.class, "lyricApi", "getLyricApi()Lcom/ss/android/ugc/gamora/lyrics/ILyricStickerEffectDataLogicComponent;", 0);
        c09r3.getClass();
        LLLLII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.AbstractC204621154x
    public final void LJJJI() {
        this.LLLILZ = false;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    @Override // X.InterfaceC1459070o4X
    public final void LIZJ() {
        if (this.LLLIL) {
            this.LLLIL = false;
            this.LLJIJIL.LIZ = true;
            C204628155e c204628155e = this.LLJ;
            if ((c204628155e == null ? null : c204628155e).LIZ) {
                if (!(c204628155e == null ? null : c204628155e).LJ) {
                    if (c204628155e == null) {
                        c204628155e = null;
                    }
                    c204628155e.LIZLLL = 1.0f;
                }
            }
            ((AbstractC204625155b) LJJL().LLJJ.getValue()).LIZLLL();
        }
    }

    @Override // X.InterfaceC1459070o4X
    public final void LJ() {
        VideoPlayerComponent videoPlayerComponent = this.LLJILJIL;
        if (videoPlayerComponent != null) {
            VideoPlayerComponent.LJII(videoPlayerComponent);
        }
        VideoPlayerComponent videoPlayerComponent2 = this.LLJILJIL;
        if (videoPlayerComponent2 != null) {
            VideoPlayerComponent.LJI(videoPlayerComponent2);
        }
    }

    @Override // X.AbstractC204621154x, X.InterfaceC1459070o4X
    public final void LJFF() {
        this.LLJ = this.LLILZIL.At();
        ((AbstractC204625155b) LJJL().LLJJ.getValue()).LIZLLL();
    }

    @Override // X.InterfaceC1459070o4X
    public final void LJIIIIZZ() {
        C155H c155h = this.LLIZ;
        if (c155h == null) {
            c155h = null;
        }
        c155h.LJIIIZ = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    @Override // X.InterfaceC1459070o4X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.tools.music.music.vertical.player.VideoPlayerComponent r5 = r6.LLJILJIL
            r3 = 0
            r4 = 1
            if (r5 == 0) goto L92
            java.util.Map<X.129G, java.lang.Object> r0 = r5.LLILZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Set r0 = r0.keySet()
            java.lang.Object r0 = X.C13LP.LJJJLIIL(r0)
            X.129G r0 = (X.C129G) r0
            if (r0 == 0) goto L92
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r0.LLLFZ()
            if (r0 == 0) goto L90
            java.lang.String r2 = r0.getMusicId()
        L20:
            java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r5.LLIZLLLIL
            if (r1 == 0) goto L8e
            int r0 = r5.LLIZ
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L8e
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            if (r0 == 0) goto L8e
            java.lang.String r0 = r0.getIdStr()
        L38:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L92
            com.ss.android.ugc.aweme.tools.music.music.vertical.player.VideoPlayerComponent.LJII(r5)
            r2 = 1
        L42:
            boolean r0 = r6.LJJJJJ()
            if (r0 == 0) goto L8c
            X.155H r0 = r6.LLIZ
            if (r0 != 0) goto L4d
            r0 = r3
        L4d:
            X.00IV r1 = r0.LJIILJJIL
            X.00IV r0 = X.C00IV.RECORDPAGE
            if (r1 != r0) goto L8c
            X.155W r0 = r6.LLILZIL
            X.0nyL r0 = r0.zt()
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.LIZIZ()
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt.extractAVMusic(r0)
            if (r0 == 0) goto L67
            java.lang.String r3 = r0.getMusicId()
        L67:
            com.ss.android.ugc.aweme.tools.music.music.vertical.player.VideoPlayerComponent r1 = r6.LLJILJIL
            if (r1 == 0) goto L8c
            com.ss.android.ugc.aweme.shortvideo.model.VideoMusicModel r0 = r1.LLILZIL
            if (r0 == 0) goto L87
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r0.getMusicModel()
            java.lang.String r0 = r0.getMusicId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 != 0) goto L8c
            com.ss.android.ugc.aweme.tools.music.music.vertical.player.VideoPlayerComponent.LJI(r1)
        L80:
            r0 = 1
        L81:
            if (r2 != 0) goto L86
            if (r0 != 0) goto L86
            r4 = 0
        L86:
            return r4
        L87:
            com.ss.android.ugc.aweme.shortvideo.model.VideoMusicModel r0 = r1.LLILZLL
            if (r0 != 0) goto L8c
            goto L80
        L8c:
            r0 = 0
            goto L81
        L8e:
            r0 = r3
            goto L38
        L90:
            r2 = r3
            goto L20
        L92:
            r2 = 0
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicViewV2.LJIIIZ():boolean");
    }

    @Override // X.AbstractC204621154x
    public final C204628155e LJIJJ() {
        C204628155e c204628155e = this.LLJ;
        if (c204628155e == null) {
            return null;
        }
        return c204628155e;
    }

    @Override // X.AbstractC204621154x
    public final SafeHandler LJIJJLI() {
        SafeHandler safeHandler = this.LLJJIII;
        if (safeHandler == null) {
            return null;
        }
        return safeHandler;
    }

    @Override // X.AbstractC204621154x
    public final LifecycleCoroutineScope LJJ() {
        TuxSheet tuxSheet = this.LLJJJJLIIL;
        if (tuxSheet != null) {
            return LifecycleOwnerKt.getLifecycleScope(tuxSheet);
        }
        return null;
    }

    @Override // X.AbstractC204621154x
    public final void LJJIFFI() {
        C19471311Fv c19471311Fv;
        TuxTextView tuxTextView;
        if (this.LLLIIIIL) {
            this.LLLIIIIL = false;
            this.LLILZIL.Ft();
            Integer num = this.LLLII;
            if (num != null) {
                int iIntValue = num.intValue();
                C19561511g5 c19561511g5 = this.LLIZLLLIL;
                if (c19561511g5 == null) {
                    c19561511g5 = null;
                }
                C12H3 tabAt = c19561511g5.getTabAt(iIntValue);
                View view = tabAt != null ? tabAt.LJ : null;
                if (!(view instanceof C19471311Fv) || (c19471311Fv = (C19471311Fv) view) == null || (tuxTextView = c19471311Fv.LLILZ) == null) {
                    return;
                }
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
        }
    }

    @Override // X.AbstractC204621154x
    public final boolean LJJIIZI() {
        C204628155e c204628155e;
        C204628155e c204628155e2;
        C155H c155h = this.LLIZ;
        if (c155h == null) {
            c155h = null;
        }
        if (!c155h.LJIIIZ && ((c204628155e2 = this.LLJ) == null || !c204628155e2.LJIIIIZZ)) {
            return false;
        }
        TuxSheet tuxSheet = this.LLJJJJLIIL;
        return ((tuxSheet != null && tuxSheet.isAdded()) || ((c204628155e = this.LLJ) != null && c204628155e.LJIIIIZZ)) && this.LLJL == null;
    }

    public final boolean LJJJJJ() {
        C155H c155h = this.LLIZ;
        if (c155h == null) {
            c155h = null;
        }
        return c155h.LJJIIZI.LIZ;
    }

    public final void LJJJJJL() {
        TuxSheet tuxSheet;
        Dialog dialog;
        View viewFindViewById;
        C16G1 c16g1;
        BottomSheetBehavior bottomSheetBehavior;
        TuxSheetBehavior tuxSheetBehavior;
        if (this.LLLJL != null || (tuxSheet = this.LLJJJJLIIL) == null || (dialog = tuxSheet.getDialog()) == null || (viewFindViewById = dialog.findViewById(R.id.fpl)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (!(layoutParams instanceof C16G1) || (c16g1 = (C16G1) layoutParams) == null) {
            return;
        }
        if (!C299110Bnx.LIZ()) {
            C16BC c16bc = c16g1.LIZ;
            if (!(c16bc instanceof BottomSheetBehavior) || (bottomSheetBehavior = (BottomSheetBehavior) c16bc) == null) {
                return;
            }
            AbstractC1177930gl5 abstractC1177930gl5 = new AbstractC1177930gl5() { // from class: X.155i
                @Override // X.AbstractC1177930gl5
                public final void LIZJ(View view, float f) {
                    this.LIZ.LJJLIIIJILLIZJL();
                }

                @Override // X.AbstractC1177930gl5
                public final void LIZLLL(int i, View view) {
                    this.LIZ.LJJLIIIJILLIZJL();
                }
            };
            this.LLLJL = abstractC1177930gl5;
            bottomSheetBehavior.addBottomSheetCallback(abstractC1177930gl5);
            return;
        }
        C16BC c16bc2 = c16g1.LIZ;
        if (!(c16bc2 instanceof TuxSheetBehavior) || (tuxSheetBehavior = (TuxSheetBehavior) c16bc2) == null) {
            return;
        }
        AbstractC1391240mJ8 abstractC1391240mJ8 = new AbstractC1391240mJ8() { // from class: X.155k
            @Override // X.AbstractC1391240mJ8
            public final void LIZ(View view, float f) {
                this.LIZ.LJJLIIIJILLIZJL();
            }

            @Override // X.AbstractC1391240mJ8
            public final void LIZIZ(int i, View view) {
                this.LIZ.LJJLIIIJILLIZJL();
            }
        };
        this.LLLJL = abstractC1391240mJ8;
        if (tuxSheetBehavior.LJJIIJ.contains(abstractC1391240mJ8)) {
            return;
        }
        tuxSheetBehavior.LJJIIJ.add(abstractC1391240mJ8);
    }

    public final C1361400lX0 LJJJJL() {
        return (C1361400lX0) this.LLLI.getValue();
    }

    public final InterfaceC1459100o4a LJJJJLI() {
        return this.LLILZIL.Et();
    }

    public final InterfaceC204613154p LJJJJLL() {
        return (InterfaceC204613154p) this.LLJI.getValue(this, LLLLII[0]);
    }

    public final InterfaceC204629155f LJJJJZ() {
        InterfaceC204626155c next;
        Iterator<InterfaceC204626155c> it2 = this.LLJLLL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next instanceof InterfaceC204629155f) {
                break;
            }
        }
        if (next instanceof InterfaceC204629155f) {
            return (InterfaceC204629155f) next;
        }
        return null;
    }

    public final IMusicRequestParam LJJJJZI() {
        C155H c155h = this.LLIZ;
        if (c155h == null) {
            c155h = null;
        }
        return c155h.LIZJ.invoke();
    }

    public final C204645155v LJJL() {
        C204645155v c204645155v = this.LLJJ;
        if (c204645155v != null) {
            return c204645155v;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LJJLI() {
        C155H c155h = this.LLIZ;
        if (c155h == null) {
            c155h = null;
        }
        if (c155h.LJIIJ) {
            for (Map.Entry<String, MusicModel> entry : this.LLLILZLLLI.entrySet()) {
                String key = entry.getKey();
                MusicModel value = entry.getValue();
                boolean z = value.getCollectionType() == MusicModel.CollectionType.COLLECTED;
                MusicModel.CollectionType collectionType = value.getCollectionType();
                if (collectionType == null) {
                    break;
                }
                LJJJIL(new AwS395S0200000_29(value, collectionType, 40));
                if (key != null) {
                    C1152660g6K.LIZ.put(key, Boolean.valueOf(z));
                }
                this.LLLILZ = true;
            }
            LJJJIL(AFwS273S0000000_29.get$arr$(187));
        }
    }

    public final boolean LJJLIIIIJ() {
        C155H c155h = this.LLIZ;
        if (c155h == null) {
            c155h = null;
        }
        if (c155h.LIZLLL) {
            return false;
        }
        return (C0C64.LJIILLIIL().LJIIIZ(31744, "direct_to_camera_allow_full_song", true, false) && Intrinsics.LJFF(LJJJJZI().getShootWay(), "direct_shoot")) || (C0C64.LJIILLIIL().LJIIIZ(31744, "single_song_allow_full_song", true, false) && !Intrinsics.LJFF(LJJJJZI().getShootWay(), "direct_shoot"));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0087 A[PHI: r1
      0x0087: PHI (r1v8 int) = (r1v7 int), (r1v12 int) binds: [B:41:0x0082, B:26:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJILLIZJL() {
        /*
            r7 = this;
            com.bytedance.tux.sheet.sheet.TuxSheet r0 = r7.LLJJJJLIIL
            if (r0 == 0) goto L95
            android.app.Dialog r1 = r0.getDialog()
            if (r1 == 0) goto L95
            r0 = 2131368462(0x7f0a1a0e, float:1.8356875E38)
            android.view.View r6 = r1.findViewById(r0)
            if (r6 != 0) goto L14
            return
        L14:
            r0 = 2131369782(0x7f0a1f36, float:1.8359552E38)
            android.view.View r5 = r1.findViewById(r0)
            if (r5 != 0) goto L1e
            return
        L1e:
            X.06U1 r3 = r7.LLLJIL
            if (r3 != 0) goto L23
            return
        L23:
            int r0 = r3.getVisibility()
            if (r0 == 0) goto L2a
            return
        L2a:
            android.view.ViewParent r1 = r5.getParent()
            boolean r0 = r1 instanceof android.view.View
            r4 = 0
            if (r0 == 0) goto L89
            android.view.View r1 = (android.view.View) r1
        L35:
            r2 = 0
            if (r1 == 0) goto L69
            int r0 = r1.getHeight()
            if (r0 <= 0) goto L69
            int r1 = r1.getHeight()
            int r0 = r5.getTop()
            int r1 = r1 - r0
            if (r1 >= 0) goto L87
        L49:
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            int r2 = r2 + r0
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            boolean r0 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L94
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            if (r1 == 0) goto L94
            int r0 = r1.bottomMargin
            if (r0 != r2) goto L8b
            return
        L69:
            X.14Ju r1 = X.C14K4.LIZ(r6)
            if (r1 == 0) goto L74
            r0 = 7
            X.14Jj r4 = r1.LIZ(r0)
        L74:
            int r1 = r6.getHeight()
            if (r4 == 0) goto L85
            int r0 = r4.LIZLLL
        L7c:
            int r1 = r1 - r0
            int r0 = r5.getTop()
            int r1 = r1 - r0
            if (r1 >= 0) goto L87
            goto L49
        L85:
            r0 = 0
            goto L7c
        L87:
            r2 = r1
            goto L49
        L89:
            r1 = r4
            goto L35
        L8b:
            r1.bottomMargin = r2
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r3)
            r3.setLayoutParams(r1)
            return
        L94:
            return
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicViewV2.LJJLIIIJILLIZJL():void");
    }

    @Override // X.InterfaceC1459070o4X
    public final void U1() {
        C155H c155h = this.LLIZ;
        if (c155h == null) {
            c155h = null;
        }
        c155h.LJIIL.LJ(false);
        LJJJZ(true);
    }

    @Override // X.InterfaceC1459070o4X
    public final void destroy() {
        VideoPlayerComponent videoPlayerComponent;
        Lifecycle lifecycle;
        C20440014yU c20440014yU = C20440014yU.LJIIJ;
        c20440014yU.LIZ = null;
        c20440014yU.LIZIZ = null;
        c20440014yU.LJII.getClass();
        c20440014yU.LJII.getClass();
        ((IMusicService) this.LLJZIJLIL.getValue()).LJIL(null);
        this.LLJJLIIIJLLLLLLLZ.dispose();
        C622680Oba.LIZLLL(this);
        TuxSheet tuxSheet = this.LLJJJJLIIL;
        if (tuxSheet != null && (lifecycle = tuxSheet.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        InterfaceC20500415Jq interfaceC20500415Jq = this.LLJJL;
        if (interfaceC20500415Jq != null) {
            interfaceC20500415Jq.onDestroy();
        }
        if ((C297110Bkj.LIZ() || LJJJJJ()) && (videoPlayerComponent = this.LLJILJIL) != null) {
            ((LinkedHashMap) videoPlayerComponent.LLILZ).clear();
            videoPlayerComponent.LLIZ = -1;
            videoPlayerComponent.LLIZLLLIL = null;
            videoPlayerComponent.LIZIZ().release();
            VideoPlayerComponent.LJFF(videoPlayerComponent, null);
            videoPlayerComponent.LLILZIL = null;
        }
        Iterator it2 = ((ArrayList) this.LLJJI).iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
        }
        LJJJIL(AFwS276S0000000_31.get$arr$(235));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        C155H c155h = this.LLIZ;
        if (c155h == null) {
            c155h = null;
        }
        c155h.LJIILIIL.LIZIZ(this.LLJL, this.LLJLIL, this.LLJLILLLLZIIL, this.LLJLL);
        this.LLJLIL = 0L;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LLJL != null) {
            this.LLJLIL = System.currentTimeMillis();
        }
    }

    @Override // X.InterfaceC1459070o4X
    public final void refresh() {
        C155H c155h = this.LLIZ;
        if (c155h == null) {
            c155h = null;
        }
        if (c155h.LJIIJ) {
            LJJLI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0269  */
    @Override // X.InterfaceC1459070o4X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.tux.sheet.sheet.TuxSheet show() {
        /*
            Method dump skipped, instruction units count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicViewV2.show():com.bytedance.tux.sheet.sheet.TuxSheet");
    }

    @Override // X.InterfaceC1459070o4X
    public final void Fp() {
        C129G c129gLJIILLIIL = LJIILLIIL();
        if (c129gLJIILLIIL == null) {
            return;
        }
        if (c129gLJIILLIIL.LLILZLL) {
            List data = c129gLJIILLIIL.getData();
            if (data == null) {
                data = new ArrayList();
            }
            C129I.LIZ(c129gLJIILLIIL, data);
            return;
        }
        C129G c129gLJIILLIIL2 = LJIILLIIL();
        if (c129gLJIILLIIL2 != null) {
            c129gLJIILLIIL2.notifyDataSetChanged();
        }
    }

    @Override // X.AbstractC204621154x
    public final void LJIILJJIL() {
        VideoPlayerComponent videoPlayerComponent;
        if (!LJJJJJ() || (videoPlayerComponent = this.LLJILJIL) == null || videoPlayerComponent.LLILZLL == null || videoPlayerComponent == null || videoPlayerComponent.LLILZIL != null || videoPlayerComponent == null) {
            return;
        }
        VideoPlayerComponent.LJFF(videoPlayerComponent, null);
    }

    @Override // X.AbstractC204621154x
    public final C129G LJIILLIIL() {
        int currentItem;
        if (LJJJJJ()) {
            C20632315oP c20632315oP = this.LLJJJ;
            currentItem = c20632315oP != null ? c20632315oP.getCurrentItem() : 0;
        } else {
            ViewPager viewPager = this.LLJJIJI;
            if (viewPager == null) {
                viewPager = null;
            }
            currentItem = viewPager.getCurrentItem();
        }
        InterfaceC204626155c interfaceC204626155c = (InterfaceC204626155c) C13LP.LJJJLZIJ(currentItem, this.LLJLLL);
        AbstractC21673619ry<?> abstractC21673619ryLJJLIIIJL = interfaceC204626155c != null ? interfaceC204626155c.LJJLIIIJL() : null;
        if (abstractC21673619ryLJJLIIIJL instanceof C129G) {
            return (C129G) abstractC21673619ryLJJLIIIJL;
        }
        return null;
    }

    @Override // X.AbstractC204621154x
    public final void LJJIII() {
        if (C299130Bnz.LIZ()) {
            C155H c155h = this.LLIZ;
            if (c155h == null) {
                c155h = null;
            }
            if (c155h.LJJIJ.LIZ) {
                this.LLILZIL.Bt();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00b1  */
    @Override // X.AbstractC204621154x, X.InterfaceC1459070o4X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Oj() {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicViewV2.Oj():boolean");
    }

    @Override // X.InterfaceC1459070o4X
    public final List<MusicModel> getMusicList() {
        List<MusicModel> musicList;
        InterfaceC204629155f interfaceC204629155fLJJJJZ = LJJJJZ();
        return (interfaceC204629155fLJJJJZ == null || (musicList = interfaceC204629155fLJJJJZ.getMusicList()) == null) ? C13BV.INSTANCE : musicList;
    }

    @Override // X.AbstractC204621154x, X.InterfaceC1459070o4X
    public final void hide() {
        C0CHQ.LIZ().LJJJJI().sceneReport("click_music_shoot");
        TuxSheet tuxSheet = this.LLJJJJLIIL;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
    }

    @Override // X.InterfaceC1459070o4X
    public final String ib() {
        MusicModel musicModel = LJJL().LJ().LLJILLL;
        if (musicModel != null) {
            return musicModel.getMusicId();
        }
        return null;
    }

    @Override // X.AbstractC204621154x, X.InterfaceC1459070o4X
    public final void mi() {
        VideoPlayerComponent videoPlayerComponent;
        if (LJJJJJ() && (videoPlayerComponent = this.LLJILJIL) != null) {
            VideoPlayerComponent.LJI(videoPlayerComponent);
        }
        LJJJIL(new AwS610S0100000_31(this, 252));
    }

    @Override // X.AbstractC204621154x
    public final EnumC1654750tA9 LJIILL() {
        return this.LLLF;
    }

    @Override // X.AbstractC204621154x
    public final C11NJ LJIIZILJ() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.AbstractC204621154x
    public final C560530Lyd LJIJ() {
        return this.LLLIILIL;
    }

    @Override // X.AbstractC204621154x
    public final boolean LJIJI() {
        return this.LLLILZ;
    }

    @Override // X.AbstractC204621154x
    public final MusicModel LJIL() {
        return this.LLJL;
    }

    @Override // X.AbstractC204621154x
    public final boolean LJJII() {
        return this.LLJLLIL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1459070o4X
    public final void LIZ(String str) {
        InterfaceC204629155f interfaceC204629155fLJJJJZ;
        if (str != null && str.length() != 0 && (interfaceC204629155fLJJJJZ = LJJJJZ()) != null) {
            interfaceC204629155fLJJJJZ.LIZ(str);
        }
    }

    @Override // X.InterfaceC1459070o4X
    public final void LIZIZ(boolean z) {
        C06U1 c06u1 = this.LLLJIL;
        if (c06u1 != null) {
            if (z) {
                int visibility = c06u1.getVisibility();
                c06u1.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c06u1);
                LJJJJJL();
                LJJLIIIJILLIZJL();
                return;
            }
            int visibility2 = c06u1.getVisibility();
            c06u1.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c06u1);
        }
    }

    @Override // X.InterfaceC1459070o4X
    public final void LIZLLL(String str) {
        C129G c129gLJIILLIIL = LJIILLIIL();
        if (c129gLJIILLIIL != null) {
            c129gLJIILLIIL.LLLIIIIL(str);
        }
    }

    @Override // X.InterfaceC1459070o4X
    public final void LJI(C155H c155h) {
        String str;
        C622680Oba.LIZJ(this);
        this.LLIZ = c155h;
        this.LLJ = c155h.LJII;
        IMusicService iMusicService = (IMusicService) this.LLJZIJLIL.getValue();
        C155X c155x = this.LLLL;
        if (c155h.LJIILJJIL == C00IV.RECORDPAGE) {
            str = "video_shoot_page";
        } else {
            str = "video_edit_page";
        }
        AIMusicDownloadPlayHelper aIMusicDownloadPlayHelperLJJJLIIL = iMusicService.LJJJLIIL(c155x, str);
        this.LLJJL = aIMusicDownloadPlayHelperLJJJLIIL;
        if (aIMusicDownloadPlayHelperLJJJLIIL != null) {
            aIMusicDownloadPlayHelperLJJJLIIL.LLJJIII = c155h.LJJIFFI;
        }
        C1DRF c1drf = new C1DRF(new C1664660tQ8("VerticalMusicView"), this.LLILZ);
        C155H c155h2 = this.LLIZ;
        C19561511g5 c19561511g5 = null;
        if (c155h2 == null) {
            c155h2 = null;
        }
        c1drf.LJ(C155H.class, null, c155h2);
        c1drf.LJ(C204639155p.class, null, this.LLJIJIL);
        c1drf.LJFF(C204642155s.class, null, new AvS183S0000000_31(0));
        c1drf.LJFF(C204645155v.class, null, new AvS183S0000000_31(1));
        c1drf.LJ(C155W.class, null, this.LLILZIL);
        c1drf.LJ(AbstractC204621154x.class, null, this);
        VideoPlayerComponent videoPlayerComponent = new VideoPlayerComponent();
        this.LLJILJIL = videoPlayerComponent;
        c1drf.LJ(VideoPlayerComponent.class, null, videoPlayerComponent);
        c1drf.LJ(C204614154q.class, null, this.LLLFF);
        C1DRG c1drgLIZIZ = c1drf.LIZIZ();
        this.LLJILLL = (C204642155s) c1drgLIZIZ.LJII(C204642155s.class, null);
        this.LLJJ = (C204645155v) c1drgLIZIZ.LJII(C204645155v.class, null);
        List<AbstractC204637155n> list = this.LLJJI;
        C204642155s c204642155s = this.LLJILLL;
        if (c204642155s != null) {
            ((ArrayList) list).add(c204642155s);
            List<AbstractC204637155n> list2 = this.LLJJI;
            C204645155v c204645155v = this.LLJJ;
            if (c204645155v != null) {
                ((ArrayList) list2).add(c204645155v);
                Iterator<InterfaceC204626155c> it2 = c155h.LJJIJIIJI.iterator();
                while (it2.hasNext()) {
                    it2.next().LLZLL(c1drgLIZIZ);
                }
                this.LLLIL = c155h.LJIIIIZZ;
                this.LLJJIII = new SafeHandler(c155h.LJI);
                if (c155h.LJIJI.LIZ) {
                    this.LLILZLL = new C155Y(c155h, this.LLILZIL, LJJJJL());
                } else {
                    this.LLILZLL = C786410Ut5.Sd(R.layout.i_g, C786410Ut5.ne(LJJJJL()), null);
                }
                for (AbstractC204637155n abstractC204637155n : (ArrayList) this.LLJJI) {
                    View view = this.LLILZLL;
                    if (view == null) {
                        view = null;
                    }
                    abstractC204637155n.LIZ(view);
                }
                this.LLJLLIL = LJJJJZI().getUnlimitedOnly();
                View view2 = this.LLILZLL;
                if (view2 == null) {
                    view2 = null;
                }
                this.LLIZLLLIL = (C19561511g5) view2.findViewById(R.id.wz8);
                View view3 = this.LLILZLL;
                if (view3 == null) {
                    view3 = null;
                }
                this.LLJJIJI = (ViewPager) view3.findViewById(R.id.tnb);
                View view4 = this.LLILZLL;
                if (view4 == null) {
                    view4 = null;
                }
                this.LLJJJ = (C20632315oP) view4.findViewById(R.id.viewPager2);
                LJJLIIIJJI(c155h);
                if (LJJJJJ()) {
                    ViewPager viewPager = this.LLJJIJI;
                    if (viewPager == null) {
                        viewPager = null;
                    }
                    C337180DJs.LIZ(viewPager);
                    C20632315oP c20632315oP = this.LLJJJ;
                    if (c20632315oP != null) {
                        C337180DJs.LIZJ(c20632315oP);
                    }
                    AbstractC21673619ry<C345870DhB> abstractC21673619ry = new AbstractC21673619ry<C345870DhB>() { // from class: X.0DhA
                        @Override // X.AbstractC21673619ry
                        public final int getItemCount() {
                            return ((ArrayList) this.LL.LLJLLL).size();
                        }

                        @Override // X.AbstractC21673619ry
                        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                            ViewGroup viewGroup;
                            C345870DhB c345870DhB = (C345870DhB) viewHolder;
                            View view5 = ((InterfaceC204626155c) ListProtector.get(this.LL.LLJLLL, i)).getView();
                            View view6 = c345870DhB.LLILLJJLI;
                            if (view6 != null && Intrinsics.LJFF(view6.getParent(), c345870DhB.LL)) {
                                C786410Ut5.LJJJZ(view6, c345870DhB.LL);
                            }
                            if (!Intrinsics.LJFF(view5.getParent(), c345870DhB.LL)) {
                                if (view5.getParent() != null) {
                                    ViewParent parent = view5.getParent();
                                    if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                                        C786410Ut5.LJJJLZIJ(view5, viewGroup);
                                    }
                                }
                                c345870DhB.LL.addView(view5, new FrameLayout.LayoutParams(-1, -1));
                            }
                            c345870DhB.LLILLJJLI = view5;
                        }

                        @Override // X.AbstractC21673619ry
                        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                            C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                            C345870DhB c345870DhB = new C345870DhB(frameLayout);
                            try {
                                View view5 = c345870DhB.itemView;
                                if (view5 != null) {
                                    view5.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                            c345870DhB.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                            try {
                                if (c345870DhB.itemView.getParent() != null) {
                                    try {
                                        SettingsManager.LIZLLL().getClass();
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                    if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                        stringBuffer.append(C345870DhB.class.getName());
                                        stringBuffer.append(" parent ");
                                        stringBuffer.append(viewGroup.getClass().getName());
                                        stringBuffer.append(" viewType ");
                                        stringBuffer.append(i);
                                        C1AF0.LIZJ(stringBuffer.toString());
                                        ViewGroup viewGroup2 = (ViewGroup) c345870DhB.itemView.getParent();
                                        if (viewGroup2 != null) {
                                            C786410Ut5.LJJJLZIJ(c345870DhB.itemView, viewGroup2);
                                        }
                                    }
                                }
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                C2081408Dk.LIZ(e2);
                                C2344809Gs.LIZ(e2);
                            }
                            C20612085q.LIZ = C345870DhB.class.getName();
                            return c345870DhB;
                        }
                    };
                    C20632315oP c20632315oP2 = this.LLJJJ;
                    if (c20632315oP2 != null) {
                        c20632315oP2.setOrientation(0);
                        c20632315oP2.setOffscreenPageLimit(1);
                        c20632315oP2.setAdapter(abstractC21673619ry);
                        AbstractC21673619ry adapter = c20632315oP2.getAdapter();
                        if (adapter != null) {
                            adapter.notifyDataSetChanged();
                        }
                        if (!C297110Bkj.LIZ()) {
                            c20632315oP2.setCurrentItem(0);
                        }
                        c20632315oP2.LIZIZ(new C16H0(this, 5));
                        C19561511g5 c19561511g52 = this.LLIZLLLIL;
                        if (c19561511g52 != null) {
                            c19561511g5 = c19561511g52;
                        }
                        c20632315oP2.LIZIZ(new C19642311t7(c19561511g5));
                    }
                } else {
                    ViewPager viewPager2 = this.LLJJIJI;
                    if (viewPager2 == null) {
                        viewPager2 = null;
                    }
                    C337180DJs.LIZJ(viewPager2);
                    C20632315oP c20632315oP3 = this.LLJJJ;
                    if (c20632315oP3 != null) {
                        C337180DJs.LIZ(c20632315oP3);
                    }
                    PagerAdapter pagerAdapter = new PagerAdapter() { // from class: X.155a
                        @Override // androidx.viewpager.widget.PagerAdapter
                        public final int LJIJJ(Object obj) {
                            return -2;
                        }

                        @Override // androidx.viewpager.widget.PagerAdapter
                        public final int getCount() {
                            return ((ArrayList) this.LLILLJJLI.LLJLLL).size();
                        }

                        @Override // androidx.viewpager.widget.PagerAdapter
                        public final CharSequence LJIJJLI(int i) {
                            return this.LLILLJJLI.LJJJJL().getString(((InterfaceC204626155c) ListProtector.get(this.LLILLJJLI.LLJLLL, i)).LLZLLIL());
                        }

                        @Override // androidx.viewpager.widget.PagerAdapter
                        public final Object LJJI(int i, ViewGroup viewGroup) {
                            View view5 = ((InterfaceC204626155c) ListProtector.get(this.LLILLJJLI.LLJLLL, i)).getView();
                            viewGroup.addView(view5, new ViewPager.LayoutParams());
                            return view5;
                        }

                        @Override // androidx.viewpager.widget.PagerAdapter
                        public final boolean LJJIFFI(View view5, Object obj) {
                            return Intrinsics.LJFF(view5, obj);
                        }

                        @Override // androidx.viewpager.widget.PagerAdapter
                        public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
                            View view5;
                            if (obj instanceof View) {
                                view5 = (View) obj;
                            } else {
                                view5 = null;
                            }
                            C786410Ut5.LJJJLZIJ(view5, viewGroup);
                        }
                    };
                    ViewPager viewPager3 = this.LLJJIJI;
                    if (viewPager3 == null) {
                        viewPager3 = null;
                    }
                    viewPager3.setAdapter(pagerAdapter);
                    ViewPager viewPager4 = this.LLJJIJI;
                    if (viewPager4 == null) {
                        viewPager4 = null;
                    }
                    PagerAdapter adapter2 = viewPager4.getAdapter();
                    if (adapter2 != null) {
                        adapter2.notifyDataSetChanged();
                    }
                    if (!C297110Bkj.LIZ()) {
                        ViewPager viewPager5 = this.LLJJIJI;
                        if (viewPager5 == null) {
                            viewPager5 = null;
                        }
                        viewPager5.setCurrentItem(0);
                    }
                    ViewPager viewPager6 = this.LLJJIJI;
                    if (viewPager6 == null) {
                        viewPager6 = null;
                    }
                    viewPager6.addOnPageChangeListener(new C20749216Hi(this, 2));
                    ViewPager viewPager7 = this.LLJJIJI;
                    if (viewPager7 == null) {
                        viewPager7 = null;
                    }
                    C19561511g5 c19561511g53 = this.LLIZLLLIL;
                    if (c19561511g53 != null) {
                        c19561511g5 = c19561511g53;
                    }
                    viewPager7.addOnPageChangeListener(new C19642311t7(c19561511g5));
                }
                ((IMusicService) this.LLJZIJLIL.getValue()).LJIL(new C155U() { // from class: X.155g
                    @Override // X.C155U
                    public final void LLZIL(String str2, boolean z) {
                        this.LIZ.LJJJLIIL(str2, z);
                        this.LIZ.LJJJIL(new C204631155h(str2, z));
                    }
                });
                VerticalMusicLeakFixHelper verticalMusicLeakFixHelper = this.LLLFZ;
                if (verticalMusicLeakFixHelper != null) {
                    C1205850hU7.LIZ(LJJJJL(), C1201120hMU.LIZ().leakOptCreativeTools, verticalMusicLeakFixHelper, AFwS239S0000000_8.get$arr$(248));
                    return;
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC1459070o4X
    public final void LJII(boolean z) {
        FrameLayout frameLayout;
        int iLIZIZ;
        int iLIZIZ2;
        C204645155v c204645155v = this.LLJJ;
        if (c204645155v != null && (frameLayout = c204645155v.LLJI) != null) {
            if (z) {
                if (frameLayout.getVisibility() == 0 && frameLayout.getTranslationY() == 0.0f) {
                    return;
                }
                frameLayout.animate().cancel();
                C786410Ut5.LJZ(0, frameLayout);
                if (frameLayout.getHeight() > 0) {
                    iLIZIZ2 = frameLayout.getHeight();
                } else {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62));
                }
                float f = iLIZIZ2;
                if (frameLayout.getTranslationY() == 0.0f) {
                    C786410Ut5.fd(frameLayout, f);
                }
                frameLayout.animate().translationY(0.0f).setDuration(300L).setListener(null).start();
                return;
            }
            if (frameLayout.getVisibility() == 8) {
                return;
            }
            frameLayout.animate().cancel();
            if (frameLayout.getHeight() > 0) {
                iLIZIZ = frameLayout.getHeight();
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62));
            }
            frameLayout.animate().translationY(iLIZIZ).setDuration(300L).withEndAction(new ARunnableS102S0100000_2(frameLayout, 66)).start();
        }
    }

    @Override // X.InterfaceC1459070o4X
    public final void LJIIJ(C204628155e c204628155e) {
        this.LLJ = c204628155e;
    }

    @Override // X.AbstractC204621154x
    public final void LJJI(C155H c155h) {
        c155h.LJIIL.LIZLLL();
        c155h.LJIILIIL.LIZ();
    }

    @Override // X.AbstractC204621154x
    public final void LJJIJL(VideoMusicModel videoMusicModel) {
        C0CNO.LIZLLL(0L, new AwS432S0200000_31(this, videoMusicModel, 78));
    }

    @Override // X.AbstractC204621154x
    public final void LJJIJLIJ(String str) {
        this.LLLILZJ = str;
    }

    @Override // X.AbstractC204621154x
    public final void LJJIL(boolean z) {
        this.LLJLLIL = z;
    }

    public final void LJJJIL(Function1<? super InterfaceC204626155c, Unit> function1) {
        C155H c155h = this.LLIZ;
        if (c155h == null) {
            c155h = null;
        }
        Iterator<InterfaceC204626155c> it2 = c155h.LJJIJIIJI.iterator();
        while (it2.hasNext()) {
            function1.invoke(it2.next());
        }
    }

    public final void LJJJJ(int i) {
        Integer num;
        C19471311Fv c19471311Fv;
        String strLIZIZ;
        if (i > 0 && (num = this.LLLII) != null) {
            int iIntValue = num.intValue();
            C19561511g5 c19561511g5 = this.LLIZLLLIL;
            View view = null;
            if (c19561511g5 == null) {
                c19561511g5 = null;
            }
            C12H3 tabAt = c19561511g5.getTabAt(iIntValue);
            if (tabAt != null) {
                view = tabAt.LJ;
            }
            if ((view instanceof C19471311Fv) && (c19471311Fv = (C19471311Fv) view) != null) {
                C01GW c01gw = C265340Aaa.LIZ;
                if (i > ((Number) c01gw.getValue()).intValue()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(((Number) c01gw.getValue()).intValue());
                    sbLIZ.append('+');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('+');
                    sbLIZ2.append(i);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                TuxTextView tuxTextView = c19471311Fv.LLILZ;
                if (tuxTextView != null) {
                    tuxTextView.setText(strLIZIZ);
                }
                TuxTextView tuxTextView2 = c19471311Fv.LLILZ;
                if (tuxTextView2 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView2, 0);
                }
                this.LLLIIIIL = true;
            }
        }
    }

    public final boolean LJJJJI(MusicModel musicModel) {
        String str = this.LLLILZJ;
        String musicId = null;
        if (musicModel != null) {
            musicId = musicModel.getMusicId();
        }
        if (Intrinsics.LJFF(str, musicId)) {
            C155H c155h = this.LLIZ;
            if (c155h != null) {
                c155h.LJIIL.LJIILL(this.LLJLL, true);
            }
            return true;
        }
        return false;
    }

    public final void LJJJZ(boolean z) {
        C204628155e c204628155e;
        Lifecycle lifecycle;
        Dialog dialog;
        View viewFindViewById;
        C16G1 c16g1;
        BottomSheetBehavior bottomSheetBehavior;
        TuxSheetBehavior tuxSheetBehavior;
        Object obj = this.LLLJL;
        C155H c155h = null;
        if (obj != null) {
            this.LLLJL = null;
            TuxSheet tuxSheet = this.LLJJJJLIIL;
            if (tuxSheet != null && (dialog = tuxSheet.getDialog()) != null && (viewFindViewById = dialog.findViewById(R.id.fpl)) != null) {
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if ((layoutParams instanceof C16G1) && (c16g1 = (C16G1) layoutParams) != null) {
                    if (C299110Bnx.LIZ()) {
                        C16BC c16bc = c16g1.LIZ;
                        if ((c16bc instanceof TuxSheetBehavior) && (tuxSheetBehavior = (TuxSheetBehavior) c16bc) != null) {
                            tuxSheetBehavior.LJJIIJ.remove(obj);
                        }
                    } else {
                        C16BC c16bc2 = c16g1.LIZ;
                        if ((c16bc2 instanceof BottomSheetBehavior) && (bottomSheetBehavior = (BottomSheetBehavior) c16bc2) != null) {
                            bottomSheetBehavior.removeBottomSheetCallback((AbstractC1177930gl5) obj);
                        }
                    }
                }
            }
        }
        C06U1 c06u1 = this.LLLJIL;
        if (c06u1 != null) {
            int visibility = c06u1.getVisibility();
            c06u1.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c06u1);
        }
        C155H c155h2 = this.LLIZ;
        if (c155h2 == null) {
            c155h2 = null;
        }
        c155h2.LJIILIIL.z3();
        C155H c155h3 = this.LLIZ;
        if (c155h3 == null) {
            c155h3 = null;
        }
        c155h3.LJIILIIL.LIZIZ(this.LLJL, this.LLJLIL, this.LLJLILLLLZIIL, this.LLJLL);
        this.LLJLIL = 0L;
        this.LLJLLIL = LJJJJZI().getUnlimitedOnly();
        C154M.LIZ = "-1";
        C154M.LIZIZ = 0;
        LJIILJJIL();
        C129G c129gLJIILLIIL = LJIILLIIL();
        if (c129gLJIILLIIL != null) {
            c129gLJIILLIIL.LLLIILIL(-1);
        }
        C204628155e c204628155e2 = this.LLJ;
        if (c204628155e2 == null) {
            c204628155e = null;
        } else {
            c204628155e = c204628155e2;
        }
        boolean z2 = c204628155e.LIZIZ;
        C155H c155h4 = this.LLIZ;
        if (c155h4 == null) {
            c155h4 = null;
        }
        C155Z c155z = c155h4.LJIIL;
        if (c204628155e2 == null) {
            c204628155e2 = null;
        }
        c155z.LJIJ(c204628155e2);
        C155H c155h5 = this.LLIZ;
        if (c155h5 == null) {
            c155h5 = null;
        }
        c155h5.LJIIL.LJJI(false);
        InterfaceC1459100o4a interfaceC1459100o4aLJJJJLI = LJJJJLI();
        if (interfaceC1459100o4aLJJJJLI != null) {
            interfaceC1459100o4aLJJJJLI.LIZIZ();
        }
        C0CHQ.LIZ().LJIIL().updateCurrentScene("music_panel_show", false);
        LJJIFFI();
        if (C298090BmJ.LIZ()) {
            C1661180tKW.LIZ.getClass();
            C1661180tKW.LJ("release listener");
            C1661180tKW.LIZLLL = null;
        }
        TuxSheet tuxSheet2 = this.LLJJJJLIIL;
        if (tuxSheet2 != null && (lifecycle = tuxSheet2.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        C155H c155h6 = this.LLIZ;
        if (c155h6 == null) {
            c155h6 = null;
        }
        c155h6.LJIIL.LJIIJJI(z);
        Iterator it2 = ((ArrayList) this.LLJJI).iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
        }
        C155H c155h7 = this.LLIZ;
        if (c155h7 != null) {
            c155h = c155h7;
        }
        Iterator<InterfaceC204626155c> it3 = c155h.LJJIJIIJI.iterator();
        while (it3.hasNext()) {
            it3.next().z3();
        }
    }

    public final void LJJLIIIJ(MusicModel musicModel) {
        boolean zLIZJ;
        if (musicModel == null) {
            return;
        }
        boolean zJt = this.LLILZIL.Jt();
        InterfaceC1459100o4a interfaceC1459100o4aLJJJJLI = LJJJJLI();
        if (interfaceC1459100o4aLJJJJLI != null) {
            zLIZJ = interfaceC1459100o4aLJJJJLI.LIZJ();
        } else {
            zLIZJ = false;
        }
        if (zJt && zLIZJ) {
            Music music = musicModel.getMusic();
            if (music != null && music.hasLyricSceneCopyRight()) {
                InterfaceC1459100o4a interfaceC1459100o4aLJJJJLI2 = LJJJJLI();
                if (interfaceC1459100o4aLJJJJLI2 != null) {
                    C0CNO.LIZLLL(0L, new AwS275S0300000_31(this, interfaceC1459100o4aLJJJJLI2, musicModel, 29));
                    return;
                }
                return;
            }
            InterfaceC1459100o4a interfaceC1459100o4aLJJJJLI3 = LJJJJLI();
            if (interfaceC1459100o4aLJJJJLI3 != null) {
                interfaceC1459100o4aLJJJJLI3.LJIIL();
            }
        }
    }

    public final void LJJLIIIJJI(C155H c155h) {
        Integer numValueOf;
        C11PQ<Integer> c11pqYt;
        C19471311Fv c19471311Fv;
        C155H c155h2 = null;
        this.LLLII = null;
        this.LLJJJIL.clear();
        final C19561511g5 c19561511g5 = this.LLIZLLLIL;
        if (c19561511g5 == null) {
            c19561511g5 = null;
        }
        c19561511g5.setTabMode(0);
        c19561511g5.removeAllTabs();
        boolean zLIZ = C12DO.LIZ();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c19561511g5.getContext());
        if (numLIZJ != null) {
            numLIZJ.intValue();
            numValueOf = Integer.valueOf(Color.argb(122, Color.red(numLIZJ.intValue()), Color.green(numLIZJ.intValue()), Color.blue(numLIZJ.intValue())));
        } else {
            numValueOf = null;
        }
        if (zLIZ && numValueOf != null && numLIZJ != null) {
            c19561511g5.setTabTextColors(numValueOf.intValue(), numLIZJ.intValue());
            c19561511g5.setSelectedTabIndicatorColor(numLIZJ.intValue());
        }
        List<EnumC1654750tA9> listInvoke = c155h.LJJIJIIJIL.invoke();
        ((ArrayList) this.LLJLLL).clear();
        List<InterfaceC204626155c> list = this.LLJLLL;
        List<InterfaceC204626155c> list2 = c155h.LJJIJIIJI;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC204626155c interfaceC204626155c : list2) {
            if (true ^ listInvoke.contains(interfaceC204626155c.getTabKey())) {
                arrayList.add(interfaceC204626155c);
            }
        }
        ((ArrayList) list).addAll(arrayList);
        int i = 0;
        for (Object obj : (ArrayList) this.LLJLLL) {
            int i2 = i + 1;
            if (i >= 0) {
                final InterfaceC204626155c interfaceC204626155c2 = (InterfaceC204626155c) obj;
                int i3 = C19561511g5.LLILZ;
                C19471311Fv c19471311Fv2 = new C19471311Fv(c19561511g5.getContext());
                if (zLIZ) {
                    AppCompatTextView appCompatTextView = c19471311Fv2.LLILLJJLI;
                    if (appCompatTextView != null) {
                        C786410Ut5.LLILL(appCompatTextView, 8);
                    }
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) c19471311Fv2.findViewById(R.id.wy7);
                    c19471311Fv2.LLILLJJLI = appCompatTextView2;
                    if (appCompatTextView2 != null) {
                        C786410Ut5.LLILL(appCompatTextView2, 0);
                    }
                    c19471311Fv2.LLIZ = true;
                    if (numValueOf != null && numLIZJ != null) {
                        int iIntValue = numValueOf.intValue();
                        c19471311Fv2.LLILZIL = numLIZJ.intValue();
                        c19471311Fv2.LLILZLL = iIntValue;
                    }
                }
                final C12H3 c12h3NewTab = c19561511g5.newTab();
                c12h3NewTab.LJ = c19471311Fv2;
                c12h3NewTab.LIZIZ();
                c19561511g5.addTab(c12h3NewTab);
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.155d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (interfaceC204626155c2.LLZLLLL()) {
                            return;
                        }
                        c19561511g5.selectTab(c12h3NewTab);
                        VerticalMusicViewV2 verticalMusicViewV2 = this;
                        interfaceC204626155c2.getTabKey();
                        verticalMusicViewV2.getClass();
                        this.LJJJJIZL(interfaceC204626155c2.getTabKey(), true);
                    }
                }, (View) c19471311Fv2.getParent());
                View view = c12h3NewTab.LJ;
                if ((view instanceof C19471311Fv) && (c19471311Fv = (C19471311Fv) view) != null) {
                    c19471311Fv.setText(interfaceC204626155c2.LLZLLIL());
                    c19471311Fv.setItemMarginLR(this.LLJILJILJ);
                }
                C426750GoL.LJIIIZ((View) c19471311Fv2.getParent(), 0, null, 0, null, false, 26);
                this.LLJJJIL.add(interfaceC204626155c2.getTabKey());
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C19561511g5 c19561511g52 = this.LLIZLLLIL;
        if (c19561511g52 == null) {
            c19561511g52 = null;
        }
        c19561511g52.setOnTabClickListener(new InterfaceC1638460sjs() { // from class: X.155j
            @Override // X.InterfaceC1638460sjs
            public final void LIZ(C12H3 c12h3) {
            }
        });
        Iterator it2 = ((ArrayList) this.LLJLLL).iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            if (((InterfaceC204626155c) it2.next()).getTabKey() == EnumC1654750tA9.TAB_COLLECT) {
                if (i4 >= 0) {
                    this.LLLII = Integer.valueOf(i4);
                    C01GW c01gw = C299130Bnz.LIZ;
                    if ((((Number) c01gw.getValue()).intValue() == 1 && Intrinsics.LJFF(this.LLLIIIL, Boolean.TRUE)) || ((Number) c01gw.getValue()).intValue() == 2) {
                        C155H c155h3 = this.LLIZ;
                        if (c155h3 != null) {
                            c155h2 = c155h3;
                        }
                        if (c155h2.LJJIJ.LIZ) {
                            Boolean boolDt = this.LLILZIL.Dt();
                            Boolean bool = Boolean.FALSE;
                            if (Intrinsics.LJFF(boolDt, bool) && Intrinsics.LJFF(this.LLILZIL.Ht(), bool) && (c11pqYt = this.LLILZIL.yt()) != null) {
                                Integer numLJLZ = c11pqYt.LJLZ();
                                if (numLJLZ != null) {
                                    LJJJJ(numLJLZ.intValue());
                                    return;
                                } else {
                                    if (this.LLLIIII != null) {
                                        return;
                                    }
                                    InterfaceC420801kM interfaceC420801kMLJJLL = c11pqYt.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS188S0100000_19(this, 68), new C09JN() { // from class: X.00PN
                                        @Override // X.C09JN
                                        public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                                            C1C7U.LIZ("VerticalMusicViewV2@3dcd.updateBadgeView$2");
                                            C1C7U.LIZIZ("VerticalMusicViewV2@3dcd.updateBadgeView$2");
                                        }
                                    });
                                    this.LLJJLIIIJLLLLLLLZ.LIZ(interfaceC420801kMLJJLL);
                                    this.LLLIIII = (C11JF) interfaceC420801kMLJJLL;
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            i4++;
        }
    }

    @Override // X.InterfaceC1459070o4X
    public final boolean LLLLZI(boolean z) {
        return LJJL().LJ().LIZ(z);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCollectEvent(C155V c155v) {
        MusicModel.CollectionType collectionType;
        HashMap<String, MusicModel> map = this.LLLILZLLLI;
        String musicId = c155v.LIZ.getMusicId();
        MusicModel musicModelM317clone = c155v.LIZ.m317clone();
        if (c155v.LIZIZ) {
            collectionType = MusicModel.CollectionType.COLLECTED;
        } else {
            collectionType = MusicModel.CollectionType.NOT_COLLECTED;
        }
        musicModelM317clone.setCollectionType(collectionType);
        map.put(musicId, musicModelM317clone);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0092 A[PHI: r2
      0x0092: PHI (r2v2 boolean) = (r2v1 boolean), (r2v3 boolean) binds: [B:39:0x007f, B:41:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    @X.C14EU(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMusicCollectEvent(X.C629770On1 r11) {
        /*
            r10 = this;
            X.155f r0 = r10.LJJJJZ()
            r5 = 0
            if (r0 == 0) goto L4e
            X.19ry r8 = r0.LJJLIIIJL()
        Lb:
            boolean r0 = r8 instanceof X.C129G
            if (r0 == 0) goto L4c
            X.129G r8 = (X.C129G) r8
        L11:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r11.LIZIZ
            java.lang.String r7 = r0.getMusicId()
            int r0 = r11.LIZ
            r4 = 0
            r3 = 1
            if (r0 != r3) goto L4a
            r9 = 1
        L1e:
            if (r8 == 0) goto L85
            java.util.List r0 = r8.getData()
            if (r0 == 0) goto L7e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r0.iterator()
        L2f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r0
            java.lang.String r0 = r0.getMusicId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r7)
            if (r0 == 0) goto L2f
            r6.add(r1)
            goto L2f
        L4a:
            r9 = 0
            goto L1e
        L4c:
            r8 = r5
            goto L11
        L4e:
            r8 = r5
            goto Lb
        L50:
            java.util.Iterator r7 = r6.iterator()
            r2 = 0
            r6 = 0
        L56:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r2 = r7.next()
            int r1 = r6 + 1
            if (r6 < 0) goto L7a
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r2 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r2
            if (r9 == 0) goto L77
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$CollectionType r0 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType.COLLECTED
        L6a:
            r2.setCollectionType(r0)
            boolean r0 = r8.LLILZLL
            if (r0 != r3) goto L74
            r8.notifyItemChanged(r6)
        L74:
            r2 = 1
            r6 = r1
            goto L56
        L77:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$CollectionType r0 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType.NOT_COLLECTED
            goto L6a
        L7a:
            X.C1697810uHb.LJIJI()
            throw r5
        L7e:
            r2 = 0
            if (r8 == 0) goto L92
        L81:
            boolean r0 = r8.LLILZLL
            if (r0 != r3) goto L92
        L85:
            X.155W r0 = r10.LLILZIL
            X.0nyL r0 = r0.zt()
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r2 = r0.LIZIZ()
            if (r2 != 0) goto L9a
            return
        L92:
            if (r2 == 0) goto L85
            if (r8 == 0) goto L85
            r8.notifyDataSetChanged()
            goto L85
        L9a:
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r1 = com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt.extractAVMusic(r2)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r11.LIZIZ
            java.lang.String r0 = r0.getMusicId()
            if (r1 == 0) goto Laa
            java.lang.String r5 = r1.getMusicId()
        Laa:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto Lbf
            if (r1 == 0) goto Lba
            int r0 = r11.LIZ
            if (r0 != r3) goto Lb7
            r4 = 1
        Lb7:
            r1.setCollected(r4)
        Lba:
            boolean r0 = r2.isPhotoMvModeMusic
            X.C1452640nuA.LJII(r1, r0, r2)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicViewV2.onMusicCollectEvent(X.0On1):void");
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [X.155X] */
    public VerticalMusicViewV2(C1DRG c1drg, C155W c155w) {
        this.LLILZ = c1drg;
        this.LLILZIL = c155w;
        this.LLJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC204613154p.class, null);
        C1664770tQJ.LIZIZ(c1drg, InterfaceC366450EYh.class, null);
        this.LLJIJIL = new C204639155p();
        this.LLJILJILJ = 12.0f;
        this.LLJJI = new ArrayList();
        this.LLJJJIL = new ArrayList<>();
        this.LLJJLIIIJLLLLLLLZ = new C11NJ();
        this.LLJLL = 1;
        this.LLJLLL = new ArrayList();
        this.LLJZ = true;
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(291));
        EnumC1654750tA9 enumC1654750tA9 = EnumC1654750tA9.TAB_AI;
        this.LLL = enumC1654750tA9;
        this.LLLF = enumC1654750tA9;
        this.LLLFF = new C204614154q();
        this.LLLFFI = new LinkedHashMap();
        this.LLLFZ = C1201120hMU.LIZ().leakOptCreativeTools ? new VerticalMusicLeakFixHelper() : null;
        this.LLLI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1177));
        this.LLLIIL = new LinkedHashMap();
        this.LLLIILIL = new C560530Lyd<>();
        this.LLLILZJ = "-1";
        this.LLLILZLLLI = new HashMap<>();
        this.LLLIZZ = System.currentTimeMillis();
        this.LLLJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(290));
        this.LLLL = new InterfaceC20499515Jh() { // from class: X.155X
            @Override // X.InterfaceC20499515Jh
            public final /* synthetic */ void J2(MusicModel musicModel, long j) {
            }

            @Override // X.InterfaceC20499515Jh
            public final MusicModel LJI() {
                return null;
            }

            @Override // X.InterfaceC20499515Jh
            public final /* synthetic */ void ba(MusicModel musicModel) {
            }

            @Override // X.InterfaceC20499515Jh
            public final /* synthetic */ void v2() {
            }

            @Override // X.InterfaceC20499515Jh
            public final Activity LLILLL() {
                C155H c155h = this.LL.LLIZ;
                if (c155h == null) {
                    c155h = null;
                }
                return c155h.LJFF;
            }

            @Override // X.InterfaceC20499515Jh
            public final boolean LLJLLIL() {
                return this.LL.LLJJJJLIIL != null;
            }

            @Override // X.InterfaceC20499515Jh
            public final void LLJILJILJ(MusicModel musicModel, Exception exc) {
                boolean z;
                VerticalMusicViewV2 verticalMusicViewV2 = this.LL;
                C155H c155h = null;
                if (verticalMusicViewV2.LLLF == EnumC1654750tA9.TAB_AI && Intrinsics.LJFF(verticalMusicViewV2.LLLILZJ, musicModel.getMusicId())) {
                    VerticalMusicViewV2 verticalMusicViewV22 = this.LL;
                    C155H c155h2 = verticalMusicViewV22.LLIZ;
                    if (c155h2 == null) {
                        c155h2 = null;
                    }
                    c155h2.LJIIL.LJIILL(verticalMusicViewV22.LLJLL, true);
                    z = true;
                } else {
                    z = false;
                }
                VideoPlayerComponent videoPlayerComponent = this.LL.LLJILJIL;
                if (videoPlayerComponent != null && videoPlayerComponent.LJ(musicModel)) {
                    C0MS9.LIZIZ(this.LL.LLLIILIL, Boolean.FALSE);
                } else {
                    C129G c129gLJIILLIIL = this.LL.LJIILLIIL();
                    if (c129gLJIILLIIL != null) {
                        c129gLJIILLIIL.LLLIILIL(-1);
                    }
                }
                InterfaceC1459100o4a interfaceC1459100o4aLJJJJLI = this.LL.LJJJJLI();
                if (interfaceC1459100o4aLJJJJLI != null) {
                    interfaceC1459100o4aLJJJJLI.LJIIJJI();
                }
                VerticalMusicViewV2 verticalMusicViewV23 = this.LL;
                C155H c155h3 = verticalMusicViewV23.LLIZ;
                if (c155h3 != null) {
                    c155h = c155h3;
                }
                c155h.LJIIL.LJIIIZ(musicModel, z, verticalMusicViewV23.LLLF.getStringValue(), this.LL.LLLIZZ);
            }

            @Override // X.InterfaceC20499515Jh
            public final void LLJJL(MusicModel musicModel, String str, String str2) {
                C155H c155h = this.LL.LLIZ;
                if (c155h == null) {
                    c155h = null;
                }
                c155h.LJIIL.LJIJJLI(new C15KP().apply(musicModel), new AwS114S1200000_31(musicModel, this.LL, str, 7));
            }

            @Override // X.InterfaceC20499515Jh
            public final void y4(Map<String, String> map, MusicModel musicModel, String str) {
                C155H c155h = this.LL.LLIZ;
                if (c155h == null) {
                    c155h = null;
                }
                c155h.LJIIL.LJIJJLI(new C15KP().apply(musicModel), new AwS240S0300000_31(musicModel, (MusicModel) this.LL, (VerticalMusicViewV2) map, (Map<String, String>) 30));
            }
        };
    }

    @Override // X.AbstractC204621154x
    public final C1630570sX9 LJIIJJI(FrameLayout frameLayout, Function1<? super C1630570sX9, Unit> function1) {
        C1630570sX9 c1630570sX9 = new C1630570sX9(LJJJJL(), null, 6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1630570sX9);
        c1630570sX9.setLayoutParams(layoutParams);
        c1630570sX9.setRetryCallback(new AwS432S0200000_31((Function1) function1, (Function1<? super C1630570sX9, Unit>) c1630570sX9, (C1630570sX9) 77));
        C786410Ut5.X1(c1630570sX9, 8);
        frameLayout.addView(c1630570sX9);
        return c1630570sX9;
    }

    @Override // X.AbstractC204621154x
    public final void LJJIJ(String str, boolean z) {
        MusicBuzModel musicBuzModelLIZIZ;
        if (Intrinsics.LJFF(C1429680nJ8.LIZJ(this.LLILZIL.zt().LIZIZ()), str) && (musicBuzModelLIZIZ = this.LLILZIL.zt().LIZIZ()) != null) {
            musicBuzModelLIZIZ.isCollected = z;
        }
    }

    public final void LJJJJIZL(EnumC1654750tA9 enumC1654750tA9, boolean z) {
        if (enumC1654750tA9 != this.LLLF) {
            C154M.LIZ = "-1";
            C154M.LIZIZ = 0;
            LJIILJJIL();
            AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(234);
            Iterator it2 = ((ArrayList) this.LLJLLL).iterator();
            while (it2.hasNext()) {
                aFwS276S0000000_31.invoke(it2.next());
            }
        }
        C1152660g6K.LIZ.clear();
        Iterator it3 = ((ArrayList) this.LLJLLL).iterator();
        int i = 0;
        while (true) {
            if (it3.hasNext()) {
                if (((InterfaceC204626155c) it3.next()).getTabKey() == enumC1654750tA9) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        LJJJLZIJ(i, false, z);
    }

    public final void LJJJLIIL(String str, boolean z) {
        if (str != null) {
            if (C297410BlD.LIZ()) {
                InterfaceC204613154p interfaceC204613154p = (InterfaceC204613154p) ((C0ETY) this.LLILZ.LJII(C0ETY.class, null)).MY1(InterfaceC204613154p.class);
                if (interfaceC204613154p != null) {
                    interfaceC204613154p.Lu0(str, z);
                    return;
                }
                return;
            }
            InterfaceC204613154p interfaceC204613154pLJJJJLL = LJJJJLL();
            if (interfaceC204613154pLJJJJLL == null) {
                return;
            }
            interfaceC204613154pLJJJJLL.Lu0(str, z);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.14ya, X.155R] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC204621154x
    public final void LJJIJIIJI(final C129G c129g, final MusicModel musicModel, final InterfaceC1867560yhO interfaceC1867560yhO) {
        String strEN;
        InterfaceC204613154p interfaceC204613154pLJJJJLL;
        List<MusicModel> data;
        MusicModel.CollectionType collectionType;
        String enterMethod;
        InterfaceC204626155c next;
        if (!C0CHQ.LIZ().getAccountService().isLogin()) {
            int i = C1654760tAA.LIZ[this.LLLF.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        EnumC1654750tA9 enumC1654750tA9 = this.LLLF;
                        C155H c155h = this.LLIZ;
                        if (c155h == null) {
                            c155h = null;
                        }
                        Iterator<InterfaceC204626155c> it2 = c155h.LJJIJIIJI.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (next.getTabKey() == enumC1654750tA9) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        InterfaceC204626155c interfaceC204626155c = next;
                        if (interfaceC204626155c == null || (enterMethod = interfaceC204626155c.getEnterMethod()) == null) {
                            enterMethod = "";
                        }
                    } else {
                        enterMethod = "edit_page_recent";
                    }
                } else {
                    enterMethod = "edit_xpage_recommend_favourite";
                }
            } else {
                enterMethod = "edit_page_recommend";
            }
            C155H c155h2 = this.LLIZ;
            if (c155h2 == null) {
                c155h2 = null;
            }
            C0XPD.LIZIZ(c155h2.LJFF, "video_edit_page", enterMethod, null, new InterfaceC849390XTt() { // from class: X.155S
                @Override // X.InterfaceC849390XTt
                public final void LIZ() {
                    this.LIZ.LJJIJIIJI(c129g, musicModel, interfaceC1867560yhO);
                    this.LIZ.LLILZIL.G5();
                }

                @Override // X.InterfaceC849390XTt
                public final void LIZIZ() {
                    this.LIZ.LLILZIL.G5();
                }
            });
            return;
        }
        this.LLLILZ = true;
        boolean zIsCollected = musicModel.isCollected();
        String musicId = musicModel.getMusicId();
        final boolean z = !zIsCollected;
        LJJIJ(musicId, z);
        LJJJLIIL(musicModel.getMusicId(), z);
        LJJJIL(new AwS115S0110000_29(musicModel, zIsCollected, 3));
        C1152660g6K.LIZ.put(musicModel.getMusicId(), Boolean.valueOf(z));
        if (c129g != null && (data = c129g.getData()) != null) {
            ArrayList<MusicModel> arrayList = new ArrayList();
            for (MusicModel musicModel2 : data) {
                if (Intrinsics.LJFF(musicModel2.getMusicId(), musicModel.getMusicId())) {
                    arrayList.add(musicModel2);
                }
            }
            for (MusicModel musicModel3 : arrayList) {
                if (zIsCollected) {
                    collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                } else {
                    collectionType = MusicModel.CollectionType.COLLECTED;
                }
                musicModel3.setCollectionType(collectionType);
            }
        }
        LJJJIL(new AwS608S0100000_29(musicModel, 310));
        if (!zIsCollected) {
            C155H c155h3 = this.LLIZ;
            if (c155h3 == null) {
                c155h3 = null;
            }
            C155P c155p = c155h3.LJIILIIL;
            String stringValue = this.LLLF.getStringValue();
            if (this.LLLF == EnumC1654750tA9.TAB_RECENT && (interfaceC204613154pLJJJJLL = LJJJJLL()) != null) {
                strEN = interfaceC204613154pLJJJJLL.EN(musicModel.getMusicId());
            } else {
                strEN = null;
            }
            c155p.LJIILL(musicModel, stringValue, strEN, z);
        }
        C20440014yU c20440014yU = C20440014yU.LJIIJ;
        final ?? r4 = new InterfaceC20440614ya() { // from class: X.155R
            @Override // X.InterfaceC20440614ya
            public final void LIZ(boolean z2) {
                if (z2) {
                    musicModel.setCollectionType(MusicModel.CollectionType.COLLECTED);
                    if (this.LJJJJJ()) {
                        InterfaceC1867560yhO interfaceC1867560yhO2 = interfaceC1867560yhO;
                        if (interfaceC1867560yhO2 != null) {
                            interfaceC1867560yhO2.LJFF(musicModel, true);
                        }
                    } else {
                        C20440014yU c20440014yU2 = C20440014yU.LJIIJ;
                        MusicModel musicModel4 = musicModel;
                        c20440014yU2.getClass();
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0P0J(true, c20440014yU2, musicModel4, null), 3);
                    }
                    this.LJJIJ(musicModel.getMusicId(), true);
                    TuxSheet tuxSheet = this.LLJJJJLIIL;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131828942);
                    C1390380mHk.LJ(tuxSheet, 4006, creativeToastBuilder);
                    return;
                }
                TuxSheet tuxSheet2 = this.LLJJJJLIIL;
                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                creativeToastBuilder2.messageRes(2131828935);
                C1390380mHk.LJ(tuxSheet2, 4007, creativeToastBuilder2);
            }

            @Override // X.InterfaceC20440614ya
            public final void LIZIZ(boolean z2) {
                if (z2) {
                    musicModel.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
                    if (this.LJJJJJ()) {
                        InterfaceC1867560yhO interfaceC1867560yhO2 = interfaceC1867560yhO;
                        if (interfaceC1867560yhO2 != null) {
                            interfaceC1867560yhO2.LJFF(musicModel, false);
                        }
                    } else {
                        C20440014yU c20440014yU2 = C20440014yU.LJIIJ;
                        MusicModel musicModel4 = musicModel;
                        c20440014yU2.getClass();
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0P0J(false, c20440014yU2, musicModel4, null), 3);
                    }
                    this.LJJIJ(musicModel.getMusicId(), false);
                    TuxSheet tuxSheet = this.LLJJJJLIIL;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(R.string.f1n);
                    C1390380mHk.LJ(tuxSheet, 4008, creativeToastBuilder);
                    return;
                }
                TuxSheet tuxSheet2 = this.LLJJJJLIIL;
                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                creativeToastBuilder2.messageRes(2131828351);
                C1390380mHk.LJ(tuxSheet2, 4009, creativeToastBuilder2);
            }
        };
        c20440014yU.getClass();
        boolean zLJI = MethodIDManager.LJI(202521);
        c20440014yU.LIZIZ = r4;
        ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJIIZI(musicModel, z ? 1 : 0).LJ(new InterfaceC2385309Wh() { // from class: X.14yZ
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                boolean z2;
                C1C7U.LIZ("CollectMusicManager@c42d.collectMusic$1");
                if (!c15o7.LJIILL() && c15o7.LJIILJJIL()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z) {
                    InterfaceC20440614ya interfaceC20440614ya = C20440014yU.LJIIJ.LIZIZ;
                    if (interfaceC20440614ya != null) {
                        interfaceC20440614ya.LIZ(z2);
                    }
                } else {
                    InterfaceC20440614ya interfaceC20440614ya2 = r4;
                    if (interfaceC20440614ya2 != null) {
                        interfaceC20440614ya2.LIZIZ(z2);
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CollectMusicManager@c42d.collectMusic$1");
                return unit;
            }
        }, C15O7.LJIIIIZZ, null);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJJJLZIJ(int i, boolean z, boolean z2) {
        InterfaceC204626155c interfaceC204626155c = (InterfaceC204626155c) ListProtector.get(this.LLJLLL, i);
        if (!z) {
            if (LJJJJJ()) {
                C20632315oP c20632315oP = this.LLJJJ;
                if (c20632315oP != null) {
                    c20632315oP.LJ(i, z2);
                }
            } else {
                ViewPager viewPager = this.LLJJIJI;
                if (viewPager == null) {
                    viewPager = null;
                }
                viewPager.setCurrentItem(i, z2);
            }
        }
        interfaceC204626155c.LLZILL(z);
        EnumC1654750tA9 tabKey = interfaceC204626155c.getTabKey();
        this.LLLF = tabKey;
        C204657156h c204657156h = (C204657156h) ((LinkedHashMap) this.LLLFF.LIZ).get(tabKey);
        if (c204657156h != null) {
            if (c204657156h.LIZIZ) {
                c204657156h.LJI();
            } else {
                c204657156h.LJII();
            }
        }
    }

    @Override // X.AbstractC204621154x
    public final void LJIIL(C129G c129g, boolean z, boolean z2, MusicModel musicModel, boolean z3) {
        InterfaceC1459100o4a interfaceC1459100o4aLJJJJLI;
        if (c129g == null) {
            return;
        }
        LifecycleCoroutineScope lifecycleCoroutineScopeLJJ = LJJ();
        if (lifecycleCoroutineScopeLJJ != null && (interfaceC1459100o4aLJJJJLI = LJJJJLI()) != null) {
            interfaceC1459100o4aLJJJJLI.LJFF(musicModel, lifecycleCoroutineScopeLJJ, false);
        }
        this.LLILLJJLI.LJIIJ(Unit.LIZ);
        if (z3) {
            C154M.LIZ = "-1";
            C154M.LIZIZ = 0;
        }
        C155H c155h = this.LLIZ;
        if (c155h == null) {
            c155h = null;
        }
        c155h.LJIIL.LJIILL(this.LLJLL, false);
        C155H c155h2 = this.LLIZ;
        if (c155h2 == null) {
            c155h2 = null;
        }
        if (!C580130Mp9.LIZ(c155h2.LIZIZ) && !z) {
            return;
        }
        if (!((Boolean) this.LLLJ.getValue()).booleanValue() && z3) {
            if (c129g.LLILZLL) {
                c129g.LLLIILIL(-1);
            } else {
                c129g.LLIZLLLIL = -1;
                c129g.notifyDataSetChanged();
            }
        }
        if (z2) {
            C155H c155h3 = this.LLIZ;
            if (c155h3 == null) {
                c155h3 = null;
            }
            c155h3.LJIILIIL.LIZIZ(this.LLJL, this.LLJLIL, this.LLJLILLLLZIIL, this.LLJLL);
        }
        this.LLJLIL = 0L;
        C155H c155h4 = this.LLIZ;
        if (c155h4 == null) {
            c155h4 = null;
        }
        c155h4.LJIIL.LJIIIIZZ(null, null, false, false, false, false, this.LLLF.getStringValue(), null, false, musicModel, false, null);
        this.LLJL = null;
        if (((Boolean) this.LLLJ.getValue()).booleanValue() && z3) {
            if (c129g.LLILZLL) {
                c129g.LLLIILIL(-1);
            } else {
                c129g.LLIZLLLIL = -1;
                c129g.notifyDataSetChanged();
            }
        }
    }

    @Override // X.AbstractC204621154x
    public final void LJJIIZ(VideoMusicModel videoMusicModel, EnumC1654750tA9 enumC1654750tA9, int i, String str, String str2) {
        boolean z;
        String aid = videoMusicModel.getAweme().getAid();
        if (aid == null) {
            return;
        }
        MusicModel musicModel = videoMusicModel.getMusicModel();
        Set set = (Set) ((LinkedHashMap) this.LLLIIL).get(enumC1654750tA9);
        if (set != null && set.contains(aid)) {
            return;
        }
        C155H c155h = this.LLIZ;
        String str3 = null;
        if (c155h == null) {
            c155h = null;
        }
        C155P c155p = c155h.LJIILIIL;
        String stringValue = enumC1654750tA9.getStringValue();
        if (musicModel.getMusicItemType() == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
            str3 = "favorite_recommend";
        }
        String stickerIDs = videoMusicModel.getAweme().getStickerIDs();
        if (stickerIDs != null && stickerIDs.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        c155p.LJIIIIZZ(musicModel, stringValue, i, str3, str, new C1458260o3E(Boolean.valueOf(!z), false, str2, aid, 8), null);
        if (!this.LLLIIL.containsKey(enumC1654750tA9)) {
            this.LLLIIL.put(enumC1654750tA9, C093Y.LJ(aid));
            return;
        }
        Set set2 = (Set) ((LinkedHashMap) this.LLLIIL).get(enumC1654750tA9);
        if (set2 == null) {
            return;
        }
        set2.add(aid);
    }

    @Override // X.AbstractC204621154x
    public final void LJJIZ(int i, MusicModel musicModel, String str, boolean z, boolean z2) {
        boolean zLIZJ;
        boolean z3;
        VideoPlayerComponent videoPlayerComponent;
        C155H c155h = null;
        if (!z2 && (videoPlayerComponent = this.LLJILJIL) != null) {
            VideoPlayerComponent.LJFF(videoPlayerComponent, null);
        }
        if (C298080BmI.LIZ()) {
            C155H c155h2 = this.LLIZ;
            if (c155h2 == null) {
                c155h2 = null;
            }
            if (!Intrinsics.LJFF(c155h2.LJJIIJ, musicModel.getMusicId())) {
                C1661180tKW.LIZ.getClass();
                C1661180tKW.LIZ();
            }
        }
        String musicId = musicModel.getMusicId();
        if (musicId == null) {
            musicId = "";
        }
        C154M.LIZ = musicId;
        C154M.LIZIZ = i;
        C155H c155h3 = this.LLIZ;
        if (c155h3 == null) {
            c155h3 = null;
        }
        c155h3.LJIIL.LJIILL(this.LLJLL, false);
        if (!z) {
            this.LLLILZJ = "-1";
        } else {
            C155H c155h4 = this.LLIZ;
            if (c155h4 == null) {
                c155h4 = null;
            }
            c155h4.LJIILIIL.LJFF(musicModel, str, null);
            C155H c155h5 = this.LLIZ;
            if (c155h5 == null) {
                c155h5 = null;
            }
            C155P c155p = c155h5.LJIILIIL;
            InterfaceC1459100o4a interfaceC1459100o4aLJJJJLI = LJJJJLI();
            if (interfaceC1459100o4aLJJJJLI != null) {
                zLIZJ = interfaceC1459100o4aLJJJJLI.LIZJ();
            } else {
                zLIZJ = false;
            }
            c155p.LJII(musicModel, 0, str, z, false, null, new C1458260o3E(null, zLIZJ, null, null, 7), null);
        }
        InterfaceC20500415Jq interfaceC20500415Jq = this.LLJJL;
        if (interfaceC20500415Jq != null) {
            interfaceC20500415Jq.setCreationId(LJJJJZI().getCreationId());
        }
        if (musicModel.hasExtendMusicList() && !musicModel.isLoopMusic()) {
            InterfaceC20500415Jq interfaceC20500415Jq2 = this.LLJJL;
            if (interfaceC20500415Jq2 != null) {
                this.LLILZIL.I5(musicModel);
                interfaceC20500415Jq2.Sf(3, musicModel, false, false, LJJLIIIIJ());
                return;
            }
            return;
        }
        InterfaceC20500415Jq interfaceC20500415Jq3 = this.LLJJL;
        if (interfaceC20500415Jq3 == null) {
            return;
        }
        this.LLILZIL.I5(musicModel);
        boolean zLJJLIIIIJ = LJJLIIIIJ();
        C155H c155h6 = this.LLIZ;
        if (c155h6 == null) {
            c155h6 = null;
        }
        if (!c155h6.LJJI || (((Boolean) C280760AzS.LIZ.getValue()).booleanValue() && TTNetInit.getEffectiveConnectionType() <= 4)) {
            z3 = false;
        } else {
            z3 = true;
        }
        C155H c155h7 = this.LLIZ;
        if (c155h7 != null) {
            c155h = c155h7;
        }
        interfaceC20500415Jq3.Xf(musicModel, 3, false, false, zLJJLIIIIJ, z3, c155h.LJJ);
    }

    @Override // X.AbstractC204621154x
    public final void LJJIIJ(MusicModel musicModel, EnumC1654750tA9 enumC1654750tA9, int i, String str, String str2, String str3, String str4) {
        String str5 = str;
        String musicId = musicModel.getMusicId();
        if (musicId == null) {
            return;
        }
        Set set = (Set) ((LinkedHashMap) this.LLLFFI).get(enumC1654750tA9);
        if (set != null && set.contains(musicId)) {
            return;
        }
        C155H c155h = this.LLIZ;
        if (c155h == null) {
            c155h = null;
        }
        C155P c155p = c155h.LJIILIIL;
        String stringValue = enumC1654750tA9.getStringValue();
        if (str5 == null) {
            if (musicModel.getMusicItemType() == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
                str5 = "favorite_recommend";
            } else {
                str5 = null;
            }
        }
        c155p.LJIIIIZZ(musicModel, stringValue, i, str5, str2, new C1458260o3E(null, false, str4, null, 13), str3);
        if (!this.LLLFFI.containsKey(enumC1654750tA9)) {
            this.LLLFFI.put(enumC1654750tA9, C093Y.LJ(musicId));
            return;
        }
        Set set2 = (Set) ((LinkedHashMap) this.LLLFFI).get(enumC1654750tA9);
        if (set2 == null) {
            return;
        }
        set2.add(musicId);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8  */
    @Override // X.AbstractC204621154x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL(int r21, com.ss.android.ugc.aweme.shortvideo.model.MusicModel r22, X.EnumC1654750tA9 r23, boolean r24, java.lang.String r25, boolean r26, java.lang.String r27, com.ss.android.ugc.aweme.feed.model.Aweme r28) {
        /*
            r20 = this;
            r0 = 72058(0x1197a, float:1.00975E-40)
            boolean r8 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            r5 = r20
            androidx.lifecycle.LifecycleCoroutineScope r2 = r5.LJJ()
            r0 = 1
            r10 = r22
            if (r2 == 0) goto L1b
            X.0o4a r1 = r5.LJJJJLI()
            if (r1 == 0) goto L1b
            r1.LJFF(r10, r2, r0)
        L1b:
            long r1 = java.lang.System.currentTimeMillis()
            r5.LLLIZZ = r1
            r2 = 0
            r3 = r27
            r6 = r23
            if (r6 == 0) goto L36
            X.155H r1 = r5.LLIZ
            if (r1 != 0) goto L2d
            r1 = r2
        L2d:
            X.155P r4 = r1.LJIILIIL
            java.lang.String r1 = r6.getStringValue()
            r4.LJFF(r10, r1, r3)
        L36:
            X.155H r1 = r5.LLIZ
            if (r1 != 0) goto L3b
            r1 = r2
        L3b:
            X.155P r7 = r1.LJIILIIL
            r11 = r21
            int r1 = r11 + 1
            r4 = r25
            r7.LJIILIIL(r1, r4)
            r13 = 0
            X.0tA9 r1 = X.EnumC1654750tA9.TAB_AI
            java.lang.String r17 = r1.getStringValue()
            r19 = r26
            r15 = r11
            r16 = r10
            r18 = r13
            r14 = r5
            r14.LJJIZ(r15, r16, r17, r18, r19)
            X.0tA9 r1 = X.EnumC1654750tA9.TAB_AI
            r5.LLL = r1
            if (r24 == 0) goto Lb6
            X.155H r1 = r5.LLIZ
            if (r1 != 0) goto L63
            r1 = r2
        L63:
            X.155P r9 = r1.LJIILIIL
            if (r6 == 0) goto L6d
            java.lang.String r12 = r6.getStringValue()
            if (r12 != 0) goto L6f
        L6d:
            java.lang.String r12 = ""
        L6f:
            X.155H r1 = r5.LLIZ
            if (r1 != 0) goto L74
            r1 = r2
        L74:
            boolean r14 = r1.LJIIJ
            X.0tA9 r1 = X.EnumC1654750tA9.TAB_RECENT
            if (r6 != r1) goto Lc0
            X.154p r6 = r5.LJJJJLL()
            if (r6 == 0) goto Lc0
            java.lang.String r1 = r10.getMusicId()
            java.lang.String r15 = r6.EN(r1)
        L88:
            X.0o3E r6 = new X.0o3E
            r1 = 0
            if (r28 == 0) goto Lbc
            java.lang.String r7 = r28.getStickerIDs()
            if (r7 == 0) goto Lbc
            int r2 = r7.length()
            if (r2 > 0) goto L9a
            r0 = 0
        L9a:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
        L9e:
            java.lang.String r2 = r28.getAid()
        La2:
            X.0o4a r0 = r5.LJJJJLI()
            if (r0 == 0) goto Lac
            boolean r1 = r0.LIZJ()
        Lac:
            r6.<init>(r7, r1, r3, r2)
            r17 = r4
            r16 = r6
            r9.LJII(r10, r11, r12, r13, r14, r15, r16, r17)
        Lb6:
            if (r8 == 0) goto Lbb
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        Lbb:
            return
        Lbc:
            r7 = r2
            if (r28 == 0) goto La2
            goto L9e
        Lc0:
            r15 = r2
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicViewV2.LJJIJIIJIL(int, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, X.0tA9, boolean, java.lang.String, boolean, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
