package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.account;

import X.C07E5;
import X.C0DYK;
import X.C0QSJ;
import X.C1010610cPD;
import X.C1011980cRQ;
import X.C1012300cRw;
import X.C14EU;
import X.C1558520qew;
import X.C1DWF;
import X.C418440Gaw;
import X.C444960Hcc;
import X.C655610Pnb;
import X.C659080PtC;
import X.C661470Px3;
import X.C661490Px5;
import X.C661510Px7;
import X.C673150Qan;
import X.C687700QyG;
import X.C723830SaL;
import X.C724270Sb3;
import X.C737030Svd;
import X.C786410Ut5;
import X.C814420VxA;
import X.C820940WIi;
import X.EnumC1012120cRe;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC435460H5s;
import X.InterfaceC652490PiZ;
import X.InterfaceC657480Pqc;
import X.InterfaceC657490Pqd;
import X.InterfaceC657510Pqf;
import X.InterfaceC687730QyJ;
import X.InterfaceC712990Rxx;
import Y.ACListenerS114S0200000_10;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$IPlayerStateHostAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.api.IHorizonAggregatedVideoInteractCallback;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.common.ui.BaseAggregatedVideoRootAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.common.ui.VideoSubCardScope;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.api.IAdBrandZoneLoggerAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes11.dex */
public final class BrandZoneAccountVideoSingleRootAssem extends ReusedUISlotAssem<BaseAggregatedVideoRootAssem> implements InterfaceC712990Rxx<InterfaceC652490PiZ>, IHorizonAggregatedVideoInteractCallback, C1DWF, SearchComponentCenter$Player$IPlayerStateHostAbility, C0QSJ, InterfaceC1146704e9 {
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public C1012300cRw LLJL;
    public InterfaceC657480Pqc LLJLIL;

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$IPlayerStateHostAbility
    public final void LJJZ() {
        sp(true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.et6;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoSubCardScope.class});
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$IPlayerStateHostAbility
    public final void gN0() {
        sp(false);
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoSubCardScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoSubCardScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.C1DWF
    public final void N6() {
        InterfaceC657480Pqc interfaceC657480Pqc = this.LLJLIL;
        if (interfaceC657480Pqc != null) {
            interfaceC657480Pqc.onViewDetachedFromWindow();
        }
        EventBus.LIZLLL().LJJI(this);
    }

    public final void op() {
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            C724270Sb3 c724270Sb3 = this.LLJI;
            AwemeStatistics statistics = ((InterfaceC435460H5s) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getStatistics();
            tuxTextView.setText(C820940WIi.LIZ(statistics != null ? statistics.getDiggCount() : 0L));
            Context context = tuxTextView.getContext();
            C724270Sb3 c724270Sb32 = this.LLJI;
            TuxIconDrawable tuxIconDrawableLIZIZ = C0DYK.LIZIZ(context, ((InterfaceC435460H5s) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme());
            tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            if (C444960Hcc.LIZIZ()) {
                tuxTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawableLIZIZ, (Drawable) null);
            } else {
                tuxTextView.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawableLIZIZ, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        InterfaceC657480Pqc interfaceC657480Pqc = this.LLJLIL;
        if (interfaceC657480Pqc != null) {
            interfaceC657480Pqc.onViewAttachedToWindow();
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.api.IHorizonAggregatedVideoInteractCallback
    public final void Uq1(Aweme aweme) {
        C661470Px3 c661470Px3;
        C661490Px5 dataProvider;
        if (aweme == null) {
            return;
        }
        View viewLLLLLLLZIL = null;
        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = (SearchComponentCenter$Player$PlayerControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchComponentCenter$Player$PlayerControlAbility.class, null);
        if (searchComponentCenter$Player$PlayerControlAbility != null) {
            viewLLLLLLLZIL = searchComponentCenter$Player$PlayerControlAbility.LLLLLLLZIL();
        }
        if ((viewLLLLLLLZIL instanceof C661470Px3) && (c661470Px3 = (C661470Px3) viewLLLLLLLZIL) != null && (dataProvider = c661470Px3.getDataProvider()) != null) {
            C661510Px7.LIZ.getClass();
            C661510Px7.LIZ(dataProvider, false, false);
            InterfaceC657480Pqc interfaceC657480Pqc = this.LLJLIL;
            if (interfaceC657480Pqc != null) {
                interfaceC657480Pqc.LJIJI();
            }
            sp(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.api.IHorizonAggregatedVideoInteractCallback
    public final void WP2(Aweme aweme) {
        IAdBrandZoneLoggerAbility iAdBrandZoneLoggerAbility = (IAdBrandZoneLoggerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IAdBrandZoneLoggerAbility.class, null);
        if (iAdBrandZoneLoggerAbility != null) {
            iAdBrandZoneLoggerAbility.ws1(aweme, "video", false);
        }
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        Object obj;
        Aweme aweme;
        if (!this.LLJJIII || c737030Svd.LIZ != 13) {
            return;
        }
        Object obj2 = c737030Svd.LIZIZ;
        String aid = null;
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        InterfaceC435460H5s interfaceC435460H5s = (InterfaceC435460H5s) obj;
        if (interfaceC435460H5s != null && (aweme = interfaceC435460H5s.getAweme()) != null) {
            aid = aweme.getAid();
        }
        if (!Intrinsics.LJFF(aid, obj2)) {
            return;
        }
        op();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.bc3);
        this.LLJL = (C1012300cRw) view.findViewById(R.id.cip);
        C723830SaL.LIZ(this, null, new AwS376S0200000_10(this, view, 54));
        C1558520qew.LJII(C1558520qew.LJIIL(this), this, IHorizonAggregatedVideoInteractCallback.class, null, null);
        C1558520qew.LJII(C1558520qew.LJIIL(this), this, SearchComponentCenter$Player$IPlayerStateHostAbility.class, null, null);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC652490PiZ interfaceC652490PiZ) {
        C1010610cPD c1010610cPDLJIIJJI;
        View viewLLLLLLLZIL;
        C661470Px3 c661470Px3;
        final InterfaceC652490PiZ interfaceC652490PiZ2 = interfaceC652490PiZ;
        C1012300cRw c1012300cRw = this.LLJL;
        if (c1012300cRw != null) {
            C786410Ut5.Ja(c1012300cRw, new ACListenerS114S0200000_10(interfaceC652490PiZ2, this, 36));
        }
        op();
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        Object obj = null;
        if (interfaceC657510PqfLIZLLL != null) {
            c1010610cPDLJIIJJI = interfaceC657510PqfLIZLLL.LJIIJJI(new InterfaceC657490Pqd(interfaceC652490PiZ2, this) { // from class: X.0Pqb
                public final Aweme LIZ;
                public final Context LIZIZ;

                @Override // X.InterfaceC1010250cOd
                public final Aweme getAweme() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC1010250cOd
                public final Context getContext() {
                    return this.LIZIZ;
                }

                {
                    this.LIZ = interfaceC652490PiZ2.getAweme();
                    this.LIZIZ = this.LJJIJL().getContext();
                }
            });
        } else {
            c1010610cPDLJIIJJI = null;
        }
        this.LLJLIL = c1010610cPDLJIIJJI;
        if (c1010610cPDLJIIJJI != null) {
            c1010610cPDLJIIJJI.bind();
        }
        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = (SearchComponentCenter$Player$PlayerControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchComponentCenter$Player$PlayerControlAbility.class, null);
        if (searchComponentCenter$Player$PlayerControlAbility != null) {
            viewLLLLLLLZIL = searchComponentCenter$Player$PlayerControlAbility.LLLLLLLZIL();
        } else {
            viewLLLLLLLZIL = null;
        }
        if ((viewLLLLLLLZIL instanceof C661470Px3) && (c661470Px3 = (C661470Px3) viewLLLLLLLZIL) != null) {
            InterfaceC657480Pqc interfaceC657480Pqc = this.LLJLIL;
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            }
            C661470Px3.LJII(c661470Px3, interfaceC657480Pqc, false, ((InterfaceC435460H5s) obj).getAweme(), 5);
        }
    }

    public final void sp(boolean z) {
        int i;
        C1012300cRw c1012300cRw = this.LLJL;
        if (c1012300cRw == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.r1(c1012300cRw, i);
        if (z) {
            C1011980cRQ c1011980cRQ = EnumC1012120cRe.Companion;
            C659080PtC.LJFF();
            int i2 = C659080PtC.LIZIZ;
            c1011980cRQ.getClass();
            EnumC1012120cRe enumC1012120cReLIZ = C1011980cRQ.LIZ(i2);
            if (enumC1012120cReLIZ != null) {
                c1012300cRw.LIZ(enumC1012120cReLIZ, false);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC652490PiZ interfaceC652490PiZ) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC652490PiZ interfaceC652490PiZ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
