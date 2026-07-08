package com.ss.android.ugc.aweme.shortvideo.image.desc;

import X.AnonymousClass1971;
import X.C013C;
import X.C01GW;
import X.C09JN;
import X.C0C64;
import X.C0CHQ;
import X.C0DU1;
import X.C0WZX;
import X.C0ZI0;
import X.C0ZIO;
import X.C1295960jpS;
import X.C12C5;
import X.C1383370m6R;
import X.C13LP;
import X.C13LQ;
import X.C1411690mq7;
import X.C1428170nGh;
import X.C1428240nGo;
import X.C1428310nGv;
import X.C1437510nVl;
import X.C1466550oGb;
import X.C1466570oGd;
import X.C15438062q;
import X.C1659630tI1;
import X.C1697810uHb;
import X.C197039127h;
import X.C19EG;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C337180DJs;
import X.C339820DTw;
import X.C339850DTz;
import X.C418440Gaw;
import X.C444830HcP;
import X.C444960Hcc;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C855980Xi0;
import X.C960203pA;
import X.C995240c0Q;
import X.EnumC1411760mqE;
import X.InterfaceC1428190nGj;
import X.InterfaceC339840DTy;
import Y.ALAdapterS17S0200000_22;
import Y.AObserverS218S0100000_14;
import Y.AObserverS225S0100000_22;
import Y.ARunnableS122S0100000_22;
import Y.ARunnableS33S0101000_22;
import Y.ARunnableS91S0200000_22;
import Y.AUListenerS271S0100000_22;
import Y.AfS183S0100000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.photomode.GenItem;
import com.ss.android.ugc.aweme.creative.model.photomode.ImagePublishBackSaveModel;
import com.ss.android.ugc.aweme.lexical.platform.span.AiCopyWritingSpan;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandTextViewModel;
import com.ss.android.ugc.aweme.shortvideo.image.desc.DescIdeasModule;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes23.dex */
public final class DescIdeasModule implements GenericLifecycleObserver {
    public static final /* synthetic */ int LLLFZ = 0;
    public final Scene LL;
    public VideoPublishEditModel LLILLJJLI;
    public final ViewGroup LLILLL;
    public final View LLILZ;
    public final InterfaceC1428190nGj LLILZIL;
    public final C19EG LLILZLL;
    public final EditText LLIZ;
    public final C0ZI0 LLIZLLLIL;
    public final View LLJ;
    public final TextView LLJI;
    public final TextView LLJIJIL;
    public final C01GW LLJILJIL;
    public final TuxTextView LLJILJILJ;
    public final View LLJILLL;
    public final View LLJJ;
    public final View LLJJI;
    public final C1295960jpS LLJJIII;
    public final RecyclerView LLJJIJI;
    public final View LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final View LLJJJ;
    public final RecyclerView LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C197039127h LLJJLIIIJLLLLLLLZ;
    public final C197039127h LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public int LLJLLL;
    public final long LLJZ;
    public ExpandTextViewModel LLJZIJLIL;
    public boolean LLL;
    public int LLLF;
    public int LLLFF;
    public boolean LLLFFI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            release();
        }
    }

    public final String LIZIZ() {
        return String.valueOf(C2204961BRm.p(this.LLIZLLLIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhlc/EjolTDf/r1OaIoP8GH3bjyG+XE6ZwVIw=", null)));
    }

    public final boolean LIZJ() {
        return ((Boolean) this.LLJJJJLIIL.getValue()).booleanValue();
    }

    public final boolean LIZLLL() {
        return ((Boolean) this.LLJJL.getValue()).booleanValue();
    }

    public final C339850DTz LJ() {
        return (C339850DTz) this.LLJJJJ.getValue();
    }

    public final C339820DTw LJFF() {
        return (C339820DTw) this.LLJJIJIL.getValue();
    }

    public final String LJI() {
        return C2204961BRm.LLJILLL(this.LLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhlc/EjolTDf/r1OaIoP8GH3bjyG+XE6ZwVIw=", null)).toString();
    }

    public final void LJII() {
        RecyclerView recyclerView;
        ExpandTextViewModel expandTextViewModel;
        if (!C855980Xi0.LIZIZ(this.LLILLJJLI)) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_ai_copy_writing_show_moment", true) == 0) {
                return;
            }
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_ai_copy_writing_show_moment", true) == 1 && ((expandTextViewModel = this.LLJZIJLIL) == null || !expandTextViewModel.wQ2())) {
                return;
            }
        }
        if (this.LLILZIL.LLIFFJFJJ()) {
            return;
        }
        if (this.LLJLLIL) {
            this.LLJLLIL = false;
            return;
        }
        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("ai_tip label", "ai_tip show ai tip");
        if (this.LLJJIJI.getVisibility() == 0 || (((recyclerView = this.LLJJJIL) != null && recyclerView.getVisibility() == 0) || this.LLJJI.getVisibility() == 0)) {
            LJIILIIL(true);
            return;
        }
        C1428170nGh.LIZ.getClass();
        if ((C1428170nGh.LIZ() || C855980Xi0.LIZIZ(this.LLILLJJLI)) && LIZJ()) {
            C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ai_tip isLoadingData = ");
            sbLIZ.append(this.LLJLIL);
            c1437510nVlLJJLIIIJ.LIZ("ai_tip label", C2188811AlT.LIZIZ(sbLIZ));
            if (this.LLJLIL) {
                LJIIIIZZ(true);
            } else if (LJFF().getItemCount() > 0) {
                LJIIIZ(this, true, true, 2);
            } else {
                LJIIIIZZ(true);
                LJIIL();
            }
        }
    }

    public final void LJIIL() {
        C1428170nGh.LIZ.getClass();
        if (C1428170nGh.LIZ() || C855980Xi0.LIZIZ(this.LLILLJJLI)) {
            int i = 0;
            if (!C855980Xi0.LIZIZ(this.LLILLJJLI)) {
                if (!this.LLILLJJLI.creativeModel.imagePublishBackSaveModel.lastGenerateInspiration.isEmpty()) {
                    this.LLJLIL = false;
                    LJIILLIIL(this.LLILLJJLI.creativeModel.imagePublishBackSaveModel.lastGenerateInspiration);
                    return;
                }
                this.LLJLIL = true;
                C1411690mq7 c1411690mq7 = (C1411690mq7) this.LLJJJJJIL.getValue();
                VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
                String strLJI = LJI();
                String strLIZIZ = LIZIZ();
                int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_ai_copy_writing_prompt_type", true);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("{\"prompt_type\":");
                sbLIZ.append(iLJIJ);
                sbLIZ.append('}');
                c1411690mq7.LJFF(videoPublishEditModel, strLJI, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ), EnumC1411760mqE.PUBLISH, new AwS601S0100000_22(this, 207), new AwS601S0100000_22(this, 208));
                return;
            }
            this.LLJLIL = false;
            ImagePublishBackSaveModel imagePublishBackSaveModel = this.LLILLJJLI.creativeModel.imagePublishBackSaveModel;
            List<String> list = imagePublishBackSaveModel.topicInspirations;
            List<String> list2 = imagePublishBackSaveModel.topicInspirationDescriptions;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (String str : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                arrayList.add(new GenItem(str, (String) ListProtector.get(list2, i), i));
                i = i2;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.LLILLJJLI.creativeModel.imagePublishBackSaveModel.lastGenerateInspiration = arrayList2;
            LJIILLIIL(arrayList2);
        }
    }

    public final void LJIILJJIL() {
        if (this.LLJJI.getVisibility() == 0 || this.LLJJIJI.getVisibility() == 0 || this.LLJJ.getVisibility() == 0) {
            LJIILIIL(true);
        } else {
            LJIILIIL(false);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void release() {
        C1411690mq7 c1411690mq7 = (C1411690mq7) this.LLJJJJJIL.getValue();
        c1411690mq7.LIZJ.dispose();
        c1411690mq7.LIZLLL.dispose();
        this.LLJLIL = false;
    }

    public final void LIZ(boolean z) {
        boolean z2;
        int i;
        CharSequence text;
        C013C c013c = new C013C();
        c013c.element = z;
        C197039127h c197039127h = this.LLJL;
        if (c197039127h != null && c197039127h.getVisibility() == 0 && (text = c197039127h.getText()) != null && text.length() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((this.LLJJLIIIJLLLLLLLZ.getVisibility() == 0 && this.LLJJLIIIJLLLLLLLZ.getText().length() != 0) || z2) {
            c013c.element = true;
        }
        int width = this.LLJILJILJ.getWidth();
        if (this.LLILZIL.LLD() == 1) {
            i = C995240c0Q.LIZ;
        } else {
            i = C995240c0Q.LIZIZ;
        }
        if (this.LLJILJILJ.getText().length() > 0) {
            this.LLJLLL = width;
        }
        if (!c013c.element) {
            if (this.LLJLLL == 0) {
                TuxTextView tuxTextView = this.LLJILJILJ;
                C1428240nGo c1428240nGo = new C1428240nGo(C1383370m6R.LJIIJ(2131830576), 62, null, 4);
                C444830HcP c444830HcP = new C444830HcP();
                c444830HcP.LJIILIIL(c1428240nGo.LIZ);
                c444830HcP.LJII(c1428240nGo.LIZIZ);
                c444830HcP.LIZIZ.LJ = tuxTextView.getMaxWidth();
                c444830HcP.LJIIIZ(tuxTextView.getMaxLines());
                c444830HcP.LIZIZ.LJII = tuxTextView.getEllipsize();
                this.LLJLLL = c444830HcP.LIZIZ().getWidth() + tuxTextView.getTotalPaddingStart() + tuxTextView.getTotalPaddingEnd();
            }
            i = this.LLJLLL;
        }
        if (width == i) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(width, i);
        valueAnimatorOfInt.setDuration(this.LLJZ);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS271S0100000_22(this, 0));
        valueAnimatorOfInt.addListener(new ALAdapterS17S0200000_22(this, c013c, 1));
        valueAnimatorOfInt.start();
    }

    public final void LJIIIIZZ(boolean z) {
        boolean z2;
        int i;
        Drawable drawableMutate;
        if (this.LLJJ.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            if (z && !this.LLIZLLLIL.hasFocus()) {
                return;
            }
            C1428310nGv.LJIIIIZZ(this.LLJJ, z);
            if (z) {
                i = 0;
            } else {
                i = 255;
            }
            Drawable drawable = (Drawable) C13LQ.LJJIIZ(0, this.LLJILJILJ.getCompoundDrawablesRelative());
            if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
                drawableMutate.setAlpha(i);
            }
            this.LLJILJILJ.setCompoundDrawablesRelative(drawable, null, null, null);
            LJIILJJIL();
        }
    }

    public final void LJIILIIL(boolean z) {
        if (this.LLILZIL.LLD() == 1) {
            this.LLJLL = false;
        } else {
            this.LLJLL = z;
        }
    }

    public final void LJIILL(boolean z) {
        int i;
        if (z) {
            i = R.raw.icon_ai_insight_fill;
        } else {
            i = R.raw.icon_ai_insight;
        }
        this.LLJILJILJ.setCompoundDrawablesRelative(C0ZIO.LIZIZ(C0ZIO.LIZ, this.LLILZLL, i, 0, 12), null, null, null);
    }

    public final void LJIILLIIL(List<GenItem> list) {
        LinearLayoutManager linearLayoutManager;
        LinearLayoutManager linearLayoutManager2;
        RecyclerView.LayoutManager layoutManager = null;
        if (LIZJ()) {
            C339820DTw c339820DTwLJFF = LJFF();
            c339820DTwLJFF.getClass();
            c339820DTwLJFF.LLILLJJLI = new ArrayList(list);
            c339820DTwLJFF.notifyDataSetChanged();
            RecyclerView.LayoutManager layoutManager2 = this.LLJJIJI.getLayoutManager();
            if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager2) != null) {
                linearLayoutManager2.scrollToPositionWithOffset(0, 0);
            }
            if (this.LLJJI.getVisibility() == 0 || (this.LLJLL && this.LLILZIL.LLD() != 1)) {
                LJIIIZ(this, true, false, 2);
                return;
            }
            return;
        }
        if (!LIZLLL()) {
            return;
        }
        C339850DTz c339850DTzLJ = LJ();
        c339850DTzLJ.getClass();
        c339850DTzLJ.LL = new ArrayList(list);
        c339850DTzLJ.notifyDataSetChanged();
        RecyclerView recyclerView = this.LLJJJIL;
        if (recyclerView != null) {
            layoutManager = recyclerView.getLayoutManager();
        }
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        linearLayoutManager.scrollToPositionWithOffset(0, 0);
    }

    public final void LJIIJ(boolean z, boolean z2) {
        boolean z3;
        if (this.LLJJI.getVisibility() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 == z) {
            return;
        }
        C1428310nGv.LJIIIIZZ(this.LLJJI, z);
        LJIILL(z);
        if (z) {
            if (!this.LLJJIII.isAnimating()) {
                this.LLJJIII.cancelAnimation();
                C786410Ut5.LLD(0, this.LLJJIII);
                this.LLJJIII.setProgress(0.0f);
                this.LLJJIII.playAnimation();
            }
            LJIIIZ(this, false, false, 4);
            C1428310nGv.LJIIIIZZ(this.LLJI, false);
            C1428310nGv.LJIIIIZZ(this.LLJIJIL, false);
            this.LLLFFI = true;
        } else {
            this.LLJJIII.cancelAnimation();
            C786410Ut5.LLD(8, this.LLJJIII);
            if (this.LLLFFI) {
                C1428310nGv.LJIIIIZZ(this.LLJI, true);
                this.LLLFFI = false;
                this.LLILZIL.LLFFF();
            }
        }
        if (z2) {
            LJIILJJIL();
            if (this.LLILZIL.LLD() != 1) {
                this.LLILZIL.LLF();
            }
        }
    }

    public final void LJIIJJI(boolean z, boolean z2) {
        LinearLayoutManager linearLayoutManager;
        C0DU1 c0du1;
        boolean z3;
        C337180DJs.LIZ(this.LLJJJ);
        if (this.LLJLIL && !z) {
            this.LLJLILLLLZIIL = true;
        }
        RecyclerView recyclerView = this.LLJJJIL;
        if (recyclerView != null) {
            if (recyclerView.getVisibility() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 == z) {
                return;
            }
        }
        RecyclerView recyclerView2 = this.LLJJJIL;
        if (recyclerView2 != null) {
            C1428310nGv.LJIIIIZZ(recyclerView2, z);
        }
        if (z) {
            LJIILIIL(true);
            if (z2) {
                RecyclerView recyclerView3 = this.LLJJJIL;
                RecyclerView.LayoutManager layoutManager = null;
                if (recyclerView3 != null) {
                    layoutManager = recyclerView3.getLayoutManager();
                }
                if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                    int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    C339850DTz c339850DTzLJ = LJ();
                    if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                        c339850DTzLJ.getClass();
                        return;
                    }
                    while (true) {
                        GenItem genItem = (GenItem) C13LP.LJJJLZIJ(iFindFirstVisibleItemPosition, c339850DTzLJ.LL);
                        if (genItem != null && (c0du1 = c339850DTzLJ.LLILLJJLI) != null) {
                            c0du1.LIZ(genItem);
                        }
                        if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                            return;
                        } else {
                            iFindFirstVisibleItemPosition++;
                        }
                    }
                }
            }
        } else {
            LJIILIIL(false);
        }
    }

    public static void LJIIIZ(DescIdeasModule descIdeasModule, boolean z, boolean z2, int i) {
        boolean z3;
        boolean z4;
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        LinearLayoutManager linearLayoutManager2;
        InterfaceC339840DTy interfaceC339840DTy;
        LinearLayoutManager linearLayoutManager3;
        if ((i & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if (descIdeasModule.LLJJIJI.getVisibility() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 != z) {
            if (z && !descIdeasModule.LLIZLLLIL.hasFocus()) {
                descIdeasModule.LJIIJ(false, false);
                descIdeasModule.LJIIIIZZ(false);
                return;
            }
            View viewFindViewByPosition = null;
            if (z) {
                descIdeasModule.LJIIJ(false, false);
                descIdeasModule.LJIIIIZZ(false);
                C337180DJs.LIZJ(descIdeasModule.LLJJIJIIJIL);
                C12C5.LIZLLL(descIdeasModule.LLJJIJI, 200L, C418440Gaw.LIZIZ(28), 0.0f, null, null, 56);
                if (descIdeasModule.LLLF != 0 && descIdeasModule.LLLFF != 0) {
                    RecyclerView.LayoutManager layoutManager = descIdeasModule.LLJJIJI.getLayoutManager();
                    if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager3 = (LinearLayoutManager) layoutManager) != null) {
                        linearLayoutManager3.scrollToPositionWithOffset(descIdeasModule.LLLF, descIdeasModule.LLLFF);
                    }
                    descIdeasModule.LLLF = 0;
                    descIdeasModule.LLLFF = 0;
                }
                C1428310nGv.LJIIIIZZ(descIdeasModule.LLJI, false);
                C1428310nGv.LJIIIIZZ(descIdeasModule.LLJIJIL, false);
                descIdeasModule.LLLFFI = true;
                if (z2) {
                    RecyclerView.LayoutManager layoutManager2 = descIdeasModule.LLJJIJI.getLayoutManager();
                    if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager2) != null) {
                        int iFindFirstVisibleItemPosition2 = linearLayoutManager2.findFirstVisibleItemPosition();
                        int iFindLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
                        C339820DTw c339820DTwLJFF = descIdeasModule.LJFF();
                        if (iFindFirstVisibleItemPosition2 <= iFindLastVisibleItemPosition) {
                            while (true) {
                                GenItem genItem = (GenItem) C13LP.LJJJLZIJ(iFindFirstVisibleItemPosition2, c339820DTwLJFF.LLILLJJLI);
                                if (genItem != null && (interfaceC339840DTy = c339820DTwLJFF.LLILLL) != null) {
                                    interfaceC339840DTy.LIZLLL(genItem);
                                }
                                if (iFindFirstVisibleItemPosition2 == iFindLastVisibleItemPosition) {
                                    break;
                                } else {
                                    iFindFirstVisibleItemPosition2++;
                                }
                            }
                        } else {
                            c339820DTwLJFF.getClass();
                        }
                    }
                }
            } else {
                RecyclerView.LayoutManager layoutManager3 = descIdeasModule.LLJJIJI.getLayoutManager();
                if (layoutManager3 instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) layoutManager3;
                } else {
                    linearLayoutManager = null;
                }
                descIdeasModule.LLLF = 0;
                if (linearLayoutManager != null) {
                    iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                } else {
                    iFindFirstVisibleItemPosition = 0;
                }
                descIdeasModule.LLLF = iFindFirstVisibleItemPosition;
                if (linearLayoutManager != null) {
                    viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                }
                descIdeasModule.LLLFF = 0;
                if (viewFindViewByPosition != null) {
                    if (C444960Hcc.LIZJ(descIdeasModule.LLILZLL)) {
                        descIdeasModule.LLLFF = viewFindViewByPosition.getRight() - descIdeasModule.LLJJIJI.getPaddingRight();
                    } else {
                        descIdeasModule.LLLFF = viewFindViewByPosition.getLeft() - descIdeasModule.LLJJIJI.getPaddingLeft();
                    }
                }
                C337180DJs.LIZ(descIdeasModule.LLJJIJI);
                if (descIdeasModule.LLLFFI) {
                    C1428310nGv.LJIIIIZZ(descIdeasModule.LLJI, true);
                    descIdeasModule.LLLFFI = false;
                    descIdeasModule.LLILZIL.LLFFF();
                }
            }
            descIdeasModule.LJIILL(z);
            if (!z3) {
                return;
            }
            descIdeasModule.LJIILJJIL();
            if (descIdeasModule.LLILZIL.LLD() == 1) {
                return;
            }
            descIdeasModule.LLILZIL.LLF();
        }
    }

    public DescIdeasModule(Scene scene, VideoPublishEditModel videoPublishEditModel, ViewGroup viewGroup, View view, AnonymousClass1971 anonymousClass1971) {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData mutableLiveData2;
        MutableLiveData mutableLiveData3;
        MutableLiveData mutableLiveData4;
        MutableLiveData mutableLiveData5;
        MutableLiveData mutableLiveData6;
        this.LL = scene;
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = viewGroup;
        this.LLILZ = view;
        this.LLILZIL = anonymousClass1971;
        this.LLILZLL = (C19EG) scene.requireActivity();
        this.LLIZ = (EditText) viewGroup.findViewById(R.id.guj);
        C0ZI0 c0zi0 = (C0ZI0) viewGroup.findViewById(R.id.guf);
        this.LLIZLLLIL = c0zi0;
        viewGroup.findViewById(R.id.gse);
        viewGroup.findViewById(R.id.kf0);
        this.LLJ = viewGroup.findViewById(R.id.k07);
        this.LLJI = (TextView) viewGroup.findViewById(R.id.fmr);
        this.LLJIJIL = (TextView) viewGroup.findViewById(R.id.fmq);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 850));
        this.LLJILJILJ = (TuxTextView) view.findViewById(R.id.fnd);
        this.LLJILLL = view.findViewById(R.id.o16);
        this.LLJJ = view.findViewById(R.id.fnf);
        this.LLJJI = view.findViewById(R.id.wmf);
        TextView textView = (TextView) view.findViewById(R.id.wmh);
        C1295960jpS c1295960jpS = (C1295960jpS) view.findViewById(R.id.wmg);
        this.LLJJIII = c1295960jpS;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.wmp);
        this.LLJJIJI = recyclerView;
        view.findViewById(R.id.ano);
        this.LLJJIJIIJIL = view.findViewById(R.id.vry);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 855));
        View viewFindViewById = view.findViewById(R.id.wba);
        this.LLJJJ = viewFindViewById;
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.wb_);
        this.LLJJJIL = recyclerView2;
        this.LLJJJJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3298));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(339));
        this.LLJJJJJIL = c01gwLIZIZ;
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 852));
        this.LLJJL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 853));
        this.LLJJLIIIJLLLLLLLZ = (C197039127h) view.findViewById(R.id.ar1);
        this.LLJL = (C197039127h) view.findViewById(R.id.voice_input_icon);
        this.LLJZ = 250L;
        if (!scene.mViewDestroyed) {
            ExpandTextViewModel expandTextViewModel = (ExpandTextViewModel) C1659630tI1.LJIIIIZZ(scene, null, null, 6).get(ExpandTextViewModel.class);
            this.LLJZIJLIL = expandTextViewModel;
            if (expandTextViewModel != null) {
                expandTextViewModel.LL.LJJJZ(VideoPublishEditModel.class).LJJLL(new AfS183S0100000_14(this, 6), new C09JN() { // from class: X.08pm
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("DescIdeasModule@4c37.initObserve$2");
                        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("DescIdeasModule initObserve error");
                        sbLIZ.append(obj);
                        C201955140j.LJIILJJIL(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
                        C1C7U.LIZIZ("DescIdeasModule@4c37.initObserve$2");
                    }
                });
            }
            ExpandTextViewModel expandTextViewModel2 = this.LLJZIJLIL;
            if (expandTextViewModel2 != null && (mutableLiveData6 = expandTextViewModel2.LLJ) != null) {
                mutableLiveData6.observe(this.LL, new AObserverS225S0100000_22(this, 151));
            }
            ExpandTextViewModel expandTextViewModel3 = this.LLJZIJLIL;
            if (expandTextViewModel3 != null && (mutableLiveData5 = expandTextViewModel3.LLJILJILJ) != null) {
                mutableLiveData5.observe(this.LL, new AObserverS225S0100000_22(this, 152));
            }
            ExpandTextViewModel expandTextViewModel4 = this.LLJZIJLIL;
            if (expandTextViewModel4 != null && (mutableLiveData4 = expandTextViewModel4.LLJJ) != null) {
                mutableLiveData4.observe(this.LL, new AObserverS218S0100000_14(this, 27));
            }
            ExpandTextViewModel expandTextViewModel5 = this.LLJZIJLIL;
            if (expandTextViewModel5 != null && (mutableLiveData3 = expandTextViewModel5.LLJIJIL) != null) {
                mutableLiveData3.observe(this.LL, new AObserverS225S0100000_22(this, 153));
            }
            ExpandTextViewModel expandTextViewModel6 = this.LLJZIJLIL;
            if (expandTextViewModel6 != null && (mutableLiveData2 = expandTextViewModel6.LLJJIII) != null) {
                mutableLiveData2.observe(this.LL, new AObserverS225S0100000_22(this, 154));
            }
            ExpandTextViewModel expandTextViewModel7 = this.LLJZIJLIL;
            if (expandTextViewModel7 != null && (mutableLiveData = expandTextViewModel7.LLIZ) != null) {
                mutableLiveData.observe(this.LL, new AObserverS225S0100000_22(this, 155));
            }
            final int selectionEnd = c0zi0.getSelectionEnd();
            c0zi0.setOnTouchListener(new View.OnTouchListener() { // from class: X.0nGi
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        DescIdeasModule descIdeasModule = this;
                        HandlerHook.viewPostDelay(descIdeasModule.LLIZLLLIL, new ARunnableS33S0101000_22(selectionEnd, descIdeasModule, 7), 100L);
                        return false;
                    }
                    return false;
                }
            });
        }
        if (LIZJ()) {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_7137348693_desc_ideas_loading_title", true, true)) {
                textView.setText(2131830574);
            }
            Context context = c1295960jpS.getContext();
            if (context != null && C960203pA.LIZIZ(context)) {
                c1295960jpS.setAnimation("search_tako_dots_loading_darkmode_tux_lottie.json");
            } else {
                c1295960jpS.setAnimation("search_tako_dots_loading_lightmode_tux_lottie.json");
            }
            c1295960jpS.setRepeatCount(-1);
            c1295960jpS.setRepeatMode(1);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.setAdapter(LJFF());
            recyclerView.setFadingEdgeLength(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            recyclerView.addItemDecoration(new C1466550oGb(recyclerView, this, 0));
            C339820DTw c339820DTwLJFF = LJFF();
            List<GenItem> list = this.LLILLJJLI.creativeModel.imagePublishBackSaveModel.lastGenerateInspiration;
            c339820DTwLJFF.getClass();
            c339820DTwLJFF.LLILLJJLI = new ArrayList(list);
            c339820DTwLJFF.notifyDataSetChanged();
            c339820DTwLJFF.LLILLL = new InterfaceC339840DTy() { // from class: X.0nGl
                @Override // X.InterfaceC339840DTy
                public final void LIZ() {
                    DescIdeasModule.LJIIIZ(this.LIZ, false, false, 6);
                }

                @Override // X.InterfaceC339840DTy
                public final void LIZIZ(List<GenItem> list2) {
                    this.LIZ.LLILLJJLI.creativeModel.imagePublishBackSaveModel.lastGenerateInspiration = new ArrayList(list2);
                }

                @Override // X.InterfaceC339840DTy
                public final void LIZJ(GenItem genItem) throws Throwable {
                    C1406110mh7 c1406110mh7 = C1406110mh7.LIZ;
                    DescIdeasModule descIdeasModule = this.LIZ;
                    VideoPublishEditModel videoPublishEditModel2 = descIdeasModule.LLILLJJLI;
                    String strLIZIZ = descIdeasModule.LIZIZ();
                    AwS388S0200000_22 awS388S0200000_22 = new AwS388S0200000_22(genItem, this.LIZ, 166);
                    c1406110mh7.getClass();
                    C0LAB c0labLJFF = C1406110mh7.LJFF(videoPublishEditModel2);
                    awS388S0200000_22.invoke(c0labLJFF);
                    c0labLJFF.LIZ(videoPublishEditModel2.hasTextSticker() ? 1 : 0, "with_text_sticker");
                    c0labLJFF.LIZ(C1406110mh7.LJ(videoPublishEditModel2, strLIZIZ) ? 1 : 0, "is_photo_text_added");
                    C20684815ws.LJIILLIIL("click_inspired_title", c0labLJFF.LIZ);
                    this.LIZ.LLIZLLLIL.setSelection(this.LIZ.LLIZLLLIL.getSelectionEnd());
                    this.LIZ.LLL = true;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(genItem.text);
                    sbLIZ.append(':');
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                    C0ZI0 c0zi02 = this.LIZ.LLIZLLLIL;
                    if (!c0zi02.LLJILJILJ) {
                        int selectionStart = c0zi02.getSelectionStart();
                        Editable editableQ = C2204961BRm.q(c0zi02, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsIwDPTs3qeiqE6VNM30kT0=", null));
                        if (editableQ != null) {
                            SpannableString spannableString = new SpannableString(strLIZIZ2);
                            AiCopyWritingSpan aiCopyWritingSpan = new AiCopyWritingSpan(c0zi02.LLJ, spannableString.toString(), 6553);
                            aiCopyWritingSpan.subType = 521;
                            aiCopyWritingSpan.mStruct.setSubType(521);
                            C786410Ut5.p2(spannableString, aiCopyWritingSpan, 0, spannableString.length(), 33);
                            if (TextUtils.isEmpty(editableQ)) {
                                editableQ.insert(0, spannableString);
                                editableQ.append(" ");
                            } else if (selectionStart <= editableQ.length() && selectionStart >= 0) {
                                int iMin = Math.min(editableQ.length(), selectionStart);
                                if (iMin > 0 && !TextUtils.equals(editableQ.subSequence(iMin - 1, iMin), "\n")) {
                                    editableQ.insert(iMin, "\n\n");
                                    iMin += 2;
                                }
                                int iMin2 = Math.min(editableQ.length(), Math.max(0, iMin));
                                editableQ.insert(iMin2, spannableString);
                                editableQ.insert(Math.min(iMin2 + spannableString.length(), editableQ.length()), " ");
                            }
                        }
                    }
                    if (!C855980Xi0.LIZIZ(this.LIZ.LLILLJJLI) || (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_ai_copy_writing_prompt_type", true) >= 2 && C855980Xi0.LIZIZ(this.LIZ.LLILLJJLI))) {
                        HashMap<String, String> map = this.LIZ.LLILLJJLI.creativeModel.imagePublishBackSaveModel.aiTipsMap;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(genItem.text);
                        sbLIZ2.append(':');
                        map.put(C2188811AlT.LIZIZ(sbLIZ2), genItem.tip);
                        DescIdeasModule descIdeasModule2 = this.LIZ;
                        HandlerHook.viewPost(descIdeasModule2.LLJJIJI, new ARunnableS91S0200000_22(descIdeasModule2, genItem, 31));
                    }
                    DescIdeasModule descIdeasModule3 = this.LIZ;
                    descIdeasModule3.LLL = false;
                    descIdeasModule3.LLILLJJLI.creativeModel.imagePublishBackSaveModel.inspirations.add(genItem.text);
                }

                @Override // X.InterfaceC339840DTy
                public final void LIZLLL(GenItem genItem) {
                    C1406110mh7 c1406110mh7 = C1406110mh7.LIZ;
                    DescIdeasModule descIdeasModule = this.LIZ;
                    VideoPublishEditModel videoPublishEditModel2 = descIdeasModule.LLILLJJLI;
                    AwS388S0200000_22 awS388S0200000_22 = new AwS388S0200000_22(genItem, descIdeasModule, 167);
                    c1406110mh7.getClass();
                    C0LAB c0labLJFF = C1406110mh7.LJFF(videoPublishEditModel2);
                    awS388S0200000_22.invoke(c0labLJFF);
                    c0labLJFF.LIZ(videoPublishEditModel2.hasTextSticker() ? 1 : 0, "with_text_sticker");
                    C20684815ws.LJIILLIIL("show_inspired_title", c0labLJFF.LIZ);
                }
            };
            if (this.LLILLJJLI.creativeModel.imagePublishBackSaveModel.lastGenerateInspiration.isEmpty()) {
                C1428170nGh.LIZ.getClass();
                if (C1428170nGh.LIZ() || C855980Xi0.LIZIZ(this.LLILLJJLI)) {
                    HandlerHook.viewPost(this.LLIZLLLIL, new ARunnableS122S0100000_22(this, 97));
                }
            }
            ((C1411690mq7) c01gwLIZIZ.getValue()).LJ(this.LLILLJJLI, EnumC1411760mqE.PUBLISH, new AwS601S0100000_22(this, 651), new AwS601S0100000_22(this, 652));
        }
        if (LIZLLL()) {
            if (recyclerView2 != null) {
                recyclerView2.setHasFixedSize(true);
                recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 0, false));
                recyclerView2.setAdapter(LJ());
            }
            C339850DTz c339850DTzLJ = LJ();
            List<GenItem> list2 = this.LLILLJJLI.creativeModel.imagePublishBackSaveModel.lastGenerateInspiration;
            c339850DTzLJ.getClass();
            c339850DTzLJ.LL = new ArrayList(list2);
            c339850DTzLJ.notifyDataSetChanged();
            c339850DTzLJ.LLILLJJLI = new C0DU1() { // from class: X.0nGk
                @Override // X.C0DU1
                public final void LIZ(GenItem genItem) {
                    if (genItem.text.length() > 0) {
                        C1406110mh7 c1406110mh7 = C1406110mh7.LIZ;
                        DescIdeasModule descIdeasModule = this.LIZ;
                        VideoPublishEditModel videoPublishEditModel2 = descIdeasModule.LLILLJJLI;
                        AwS388S0200000_22 awS388S0200000_22 = new AwS388S0200000_22(genItem, descIdeasModule, 165);
                        c1406110mh7.getClass();
                        C0LAB c0labLJFF = C1406110mh7.LJFF(videoPublishEditModel2);
                        awS388S0200000_22.invoke(c0labLJFF);
                        c0labLJFF.LIZ(videoPublishEditModel2.hasTextSticker() ? 1 : 0, "with_text_sticker");
                        C20684815ws.LJIILLIIL("show_inspired_template", c0labLJFF.LIZ);
                    }
                }

                @Override // X.C0DU1
                public final void LIZIZ(GenItem genItem) throws Throwable {
                    Editable editableP;
                    C1406110mh7 c1406110mh7 = C1406110mh7.LIZ;
                    DescIdeasModule descIdeasModule = this.LIZ;
                    VideoPublishEditModel videoPublishEditModel2 = descIdeasModule.LLILLJJLI;
                    String strLIZIZ = descIdeasModule.LIZIZ();
                    AwS388S0200000_22 awS388S0200000_22 = new AwS388S0200000_22(genItem, this.LIZ, 164);
                    c1406110mh7.getClass();
                    C0LAB c0labLJFF = C1406110mh7.LJFF(videoPublishEditModel2);
                    awS388S0200000_22.invoke(c0labLJFF);
                    c0labLJFF.LIZ(videoPublishEditModel2.hasTextSticker() ? 1 : 0, "with_text_sticker");
                    c0labLJFF.LIZ(C1406110mh7.LJ(videoPublishEditModel2, strLIZIZ) ? 1 : 0, "is_photo_text_added");
                    C20684815ws.LJIILLIIL("click_inspired_template", c0labLJFF.LIZ);
                    DescIdeasModule descIdeasModule2 = this.LIZ;
                    descIdeasModule2.LLJLLIL = true;
                    String strLIZIZ2 = genItem.text;
                    int selectionEnd2 = descIdeasModule2.LLIZLLLIL.getSelectionEnd();
                    if (selectionEnd2 != 0 && ((editableP = C2204961BRm.p(descIdeasModule2.LLIZLLLIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhlc/EjolTDf/r1OaIoP8GH3bjyG+XE6ZwVIw=", null))) == null || editableP.charAt(selectionEnd2 - 1) != '\n')) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('\n');
                        sbLIZ.append(strLIZIZ2);
                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    descIdeasModule2.LLIZLLLIL.setSelection(selectionEnd2);
                    Editable editableP2 = C2204961BRm.p(descIdeasModule2.LLIZLLLIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhlc/EjolTDf/r1OaIoP8GH3bjyG+XE6ZwVIw=", null));
                    if (editableP2 != null) {
                        editableP2.insert(selectionEnd2, strLIZIZ2);
                    }
                    this.LIZ.LLILZIL.LIZ();
                    this.LIZ.LLILLJJLI.creativeModel.imagePublishBackSaveModel.inspirations.addAll(a0.LJJLIIIJILLIZJL(genItem.text, new String[]{"\n"}, 0, 6));
                }
            };
            if (viewFindViewById != null) {
                C786410Ut5.I7(new C1466570oGd(this, 25, 42), viewFindViewById);
            }
        }
    }
}
