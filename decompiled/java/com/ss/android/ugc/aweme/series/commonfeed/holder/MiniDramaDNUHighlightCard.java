package com.ss.android.ugc.aweme.series.commonfeed.holder;

import X.AbstractC1585810rMx;
import X.C01GW;
import X.C098200Yq;
import X.C0RF0;
import X.C1308910kAL;
import X.C1324840ka2;
import X.C1361400lX0;
import X.C13BV;
import X.C15438062q;
import X.C1577330r9H;
import X.C1577460r9U;
import X.C1580080rDi;
import X.C189200o6;
import X.C197039127h;
import X.C1A5L;
import X.C20600815jK;
import X.C20635115or;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C418440Gaw;
import X.C421930GgZ;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1577340r9I;
import X.InterfaceC1891350zJl;
import X.InterfaceC447230HgH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS158S0100000_24;
import Y.ARunnableS105S0100000_5;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.MiniDramaCardInfo;
import com.ss.android.ugc.aweme.feed.model.MiniDramaOverview;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.series.commonfeed.holder.MiniDramaDNUHighlightCard;
import com.ss.android.ugc.aweme.series.specialcard.component.MiniDramaHighlightCardItemCell;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS145S0101000_5;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaDNUHighlightCard extends VideoViewCell implements InterfaceC1577340r9I {
    public final C421930GgZ T0;
    public final ViewOnAttachStateChangeListenerC20604515jv U0;
    public final View V0;
    public int W0;
    public long X0;
    public long Y0;
    public final C01GW Z0;
    public final C01GW a1;
    public final C01GW b1;
    public final C01GW c1;
    public final C01GW d1;
    public boolean e1;
    public boolean f1;
    public final AtomicReference<UrlModel> g1;

    @Override // X.InterfaceC1577340r9I
    public final void LIZLLL() {
        this.e1 = true;
    }

    public final C1577330r9H p1() {
        return (C1577330r9H) this.d1.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void onPause() {
        super.onPause();
        p1().LIZLLL(false);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void onResume() {
        super.onResume();
        p1().LIZLLL(true);
        if (this.e1) {
            this.e1 = false;
            this.f1 = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void unBind() {
        super.unBind();
        p1().LIZJ = null;
    }

    public MiniDramaDNUHighlightCard(C0RF0 c0rf0) {
        ViewGroup viewGroup;
        super(c0rf0);
        this.Z0 = C452501pT.LIZIZ(new AwS556S0100000_12(this, 580));
        this.a1 = C452501pT.LIZIZ(new AwS556S0100000_12(this, 581));
        this.b1 = C452501pT.LIZIZ(new AwS556S0100000_12(this, 579));
        this.c1 = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(200));
        this.d1 = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(261));
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLLLLLLLLL), R.layout.bgs, null, false);
        View view = c0rf0.LIZ;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.addView(viewTd);
        }
        C1361400lX0 c1361400lX0 = new C1361400lX0(viewTd.getContext(), R.style.z4);
        C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.odt);
        C197039127h c197039127h2 = (C197039127h) viewTd.findViewById(R.id.odu);
        if (c197039127h != null) {
            c197039127h.setTag(R.id.g96, "not_interested");
        }
        if (c197039127h2 != null) {
            c197039127h2.setTag(R.id.g96, "explore_more");
        }
        C2271391DvN.LIZ(c197039127h, (C1A5L) C2271381DvM.x0.getValue());
        C2271391DvN.LIZ(c197039127h2, (C1A5L) C2271381DvM.y0.getValue());
        if (c197039127h != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, c1361400lX0);
            if (numLIZJ != null) {
                gradientDrawable.setColor(numLIZJ.intValue());
            }
            c197039127h.setBackground(gradientDrawable);
        }
        if (c197039127h2 != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
            gradientDrawable2.setColor(-1);
            c197039127h2.setBackground(gradientDrawable2);
        }
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS158S0100000_24(this, 31));
        }
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS158S0100000_24(this, 32));
        }
        this.V0 = viewTd.findViewById(R.id.odw);
        this.T0 = (C421930GgZ) viewTd.findViewById(R.id.g98);
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewTd.findViewById(R.id.g9e);
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(MiniDramaHighlightCardItemCell.class);
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new WrapLinearLayoutManager(viewTd.getContext(), 0));
            final C20635115or c20635115or = new C20635115or();
            c20635115or.LIZIZ(viewOnAttachStateChangeListenerC20604515jv);
            viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0rDg
                @Override // X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView, int i) {
                    View viewLJFF;
                    int position;
                    if (i == 0 && (viewLJFF = c20635115or.LJFF(viewOnAttachStateChangeListenerC20604515jv.getLayoutManager())) != null) {
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = viewOnAttachStateChangeListenerC20604515jv;
                        MiniDramaDNUHighlightCard miniDramaDNUHighlightCard = this;
                        RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv2.getLayoutManager();
                        if (layoutManager != null) {
                            position = layoutManager.getPosition(viewLJFF);
                        } else {
                            position = 0;
                        }
                        if (position != miniDramaDNUHighlightCard.W0) {
                            miniDramaDNUHighlightCard.W0 = position;
                            C421930GgZ c421930GgZ = miniDramaDNUHighlightCard.T0;
                            if (c421930GgZ != null) {
                                c421930GgZ.LIZ(position);
                            }
                            miniDramaDNUHighlightCard.s1(position, true);
                            C1577310r9F c1577310r9F = C1577310r9F.LIZ;
                            Aweme aweme = miniDramaDNUHighlightCard.LLJJ;
                            c1577310r9F.getClass();
                            C1577310r9F.LIZLLL(aweme, "swipe", "", "", "");
                        }
                    }
                }
            });
            C2271391DvN.LIZ(viewOnAttachStateChangeListenerC20604515jv, (C1A5L) C2271381DvM.w0.getValue());
        } else {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        this.U0 = viewOnAttachStateChangeListenerC20604515jv;
        this.g1 = new AtomicReference<>(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJI(Aweme aweme) {
        List<MiniDramaOverview> list;
        C20600815jK<InterfaceC1891350zJl> state;
        ?? arrayList;
        C20600815jK<InterfaceC1891350zJl> state2;
        int size;
        PaidContentInfo paidContentInfo;
        MiniDramaCardInfo miniDramaCardInfo;
        super.LJI(aweme);
        Runnable runnable = null;
        Ft2(null);
        if (aweme != null && (paidContentInfo = aweme.mPaidContentInfo) != null && (miniDramaCardInfo = paidContentInfo.getMiniDramaCardInfo()) != null) {
            list = miniDramaCardInfo.dramas;
        } else {
            list = null;
        }
        C421930GgZ c421930GgZ = this.T0;
        if (c421930GgZ != null) {
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            c421930GgZ.setDotCount(size);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.U0;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state2 = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state2.LJFF(null);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.U0;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (MiniDramaOverview miniDramaOverview : list) {
                    arrayList.add(new C1580080rDi(miniDramaOverview.collectionId, miniDramaOverview.title, miniDramaOverview.cover, miniDramaOverview.numWatched, miniDramaOverview.themeTagList, miniDramaOverview.startTimeInMs, miniDramaOverview.endTimeInMs, miniDramaOverview.videoId, aweme, p1()));
                    runnable = null;
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            state.LIZLLL(arrayList, runnable);
        }
        p1().LIZJ = this;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        C1577460r9U.LLILLJJLI.LIZLLL();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.U0;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(0);
        }
        C421930GgZ c421930GgZ = this.T0;
        if (c421930GgZ != null) {
            c421930GgZ.LIZ(0);
        }
        this.W0 = 0;
        s1(0, false);
        p1().LIZIZ = null;
    }

    public final void s1(int i, boolean z) {
        int iLJIIIIZZ;
        InterfaceC1891350zJl interfaceC1891350zJlLJI;
        C1580080rDi c1580080rDi;
        long jLongValue;
        long jLongValue2;
        Object c098200Yq;
        final UrlModel urlModel;
        InterfaceC1891350zJl interfaceC1891350zJlLJI2;
        C20600815jK<InterfaceC1891350zJl> state;
        IPlayerComponentAbility iPlayerComponentAbility;
        IPlayerComponentAbility iPlayerComponentAbility2;
        C20600815jK<InterfaceC1891350zJl> state2;
        C20600815jK<InterfaceC1891350zJl> state3;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.U0;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state3 = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            iLJIIIIZZ = state3.LJIIIIZZ();
        } else {
            iLJIIIIZZ = 0;
        }
        if (i >= 0 && i < iLJIIIIZZ) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.U0;
            Object obj = null;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state2 = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                interfaceC1891350zJlLJI = state2.LJI(i);
            } else {
                interfaceC1891350zJlLJI = null;
            }
            if ((interfaceC1891350zJlLJI instanceof C1580080rDi) && (c1580080rDi = (C1580080rDi) interfaceC1891350zJlLJI) != null) {
                Long l = c1580080rDi.LLILZLL;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                this.X0 = jLongValue;
                Long l2 = c1580080rDi.LLIZ;
                if (l2 != null) {
                    jLongValue2 = l2.longValue();
                } else {
                    jLongValue2 = 0;
                }
                this.Y0 = jLongValue2;
                if (z && (iPlayerComponentAbility = (IPlayerComponentAbility) this.a1.getValue()) != null) {
                    long jTe = iPlayerComponentAbility.te();
                    if (jTe > 0 && (iPlayerComponentAbility2 = (IPlayerComponentAbility) this.a1.getValue()) != null) {
                        iPlayerComponentAbility2.dO0((this.X0 / jTe) * 100);
                    }
                }
                try {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.U0;
                    if (viewOnAttachStateChangeListenerC20604515jv3 != null && (state = viewOnAttachStateChangeListenerC20604515jv3.getState()) != null) {
                        interfaceC1891350zJlLJI2 = state.LJI(i);
                    } else {
                        interfaceC1891350zJlLJI2 = null;
                    }
                    if (interfaceC1891350zJlLJI2 instanceof C1580080rDi) {
                        c098200Yq = (C1580080rDi) interfaceC1891350zJlLJI2;
                    } else {
                        c098200Yq = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                C1580080rDi c1580080rDi2 = (C1580080rDi) obj;
                if (c1580080rDi2 != null && (urlModel = c1580080rDi2.LLILLL) != null) {
                    this.g1.set(urlModel);
                    C1324840ka2.LJIJ(urlModel, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), new InterfaceC447230HgH() { // from class: X.0Gz9
                        @Override // X.InterfaceC447230HgH
                        public final void accept(Object obj2) {
                            int color;
                            Bitmap bitmap = (Bitmap) obj2;
                            if (Intrinsics.LJFF(urlModel, this.g1.get())) {
                                C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, null));
                                c204674156yLIZ.LJFF(20.0f);
                                c204674156yLIZ.LJ(0.04f, 0.16f, 0.52f, 0.8f, 0.0f);
                                c204674156yLIZ.LJI(99.0f);
                                Integer numLJJIIJ = C13LQ.LJJIIJ(1, c204674156yLIZ.LIZ());
                                if (numLJJIIJ != null) {
                                    color = numLJJIIJ.intValue();
                                } else {
                                    color = ColorProtector.parseColor("#FF2A1001");
                                }
                                int iLJI = C2441009hQ.LJI(0.6f, color, -16777216);
                                MiniDramaDNUHighlightCard miniDramaDNUHighlightCard = this;
                                AwS145S0101000_5 awS145S0101000_5 = new AwS145S0101000_5(miniDramaDNUHighlightCard, iLJI, 0);
                                miniDramaDNUHighlightCard.getClass();
                                if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                                    awS145S0101000_5.invoke();
                                } else {
                                    C786410Ut5.LJJZZIII((Handler) miniDramaDNUHighlightCard.c1.getValue(), new ARunnableS105S0100000_5(awS145S0101000_5, 11));
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        IPlayerComponentAbility iPlayerComponentAbility;
        super.onPlayProgressChange(str, j, j2);
        if (this.f1) {
            this.f1 = false;
            s1(this.W0, true);
            return;
        }
        IPlayerComponentAbility iPlayerComponentAbility2 = (IPlayerComponentAbility) this.a1.getValue();
        if (iPlayerComponentAbility2 == null) {
            return;
        }
        long jTe = iPlayerComponentAbility2.te();
        if (jTe <= 0 || j < this.Y0 || (iPlayerComponentAbility = (IPlayerComponentAbility) this.a1.getValue()) == null) {
            return;
        }
        iPlayerComponentAbility.dO0((this.X0 / jTe) * 100);
    }
}
