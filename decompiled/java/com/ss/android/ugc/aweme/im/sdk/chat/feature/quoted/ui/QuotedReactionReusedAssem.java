package com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C09R3;
import X.C0HHT;
import X.C0I3J;
import X.C0I67;
import X.C0I68;
import X.C0I6S;
import X.C0I6U;
import X.C0I6V;
import X.C0IB1;
import X.C0Y3I;
import X.C0Y3R;
import X.C0YNY;
import X.C0ZDX;
import X.C127G;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1332130kln;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C1AF0;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C421710GgD;
import X.C426750GoL;
import X.C438710HIf;
import X.C461000I5y;
import X.C461020I6a;
import X.C462520IBu;
import X.C603540Nlo;
import X.C723590SZx;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C869590Y9l;
import X.C898900ZOe;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC712990Rxx;
import X.InterfaceC719640SKs;
import X.InterfaceC874680YTa;
import Y.ACListenerS73S0300000_6;
import Y.AObjectS59S0000000_6;
import Y.ARunnableS5S0310000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IStoryV2AnimViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class QuotedReactionReusedAssem extends ReusedUIContentAssem<QuotedReactionReusedAssem> implements InterfaceC712990Rxx<InterfaceC461380I7k> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public TuxTextView LLJJJJ;
    public SmartImageView LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public C421710GgD LLJJLIIIJLLLLLLLZ;
    public final C1559260qg8 LLJL;
    public C127G LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(QuotedReactionReusedAssem.class, "quotedAreaViewModel", "getQuotedAreaViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/quoted/ui/QuotedAreaViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(QuotedReactionReusedAssem.class, "storyV2AnimViewModel", "getStoryV2AnimViewModel()Lcom/ss/android/ugc/aweme/im/messagelist/api/viewmodel/IStoryV2AnimViewModel;", 0);
        c09r3.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public QuotedReactionReusedAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuotedAreaViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJJLIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ, 209), null, AFwS236S0000000_6.get$arr$(110));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(IStoryV2AnimViewModel.class);
        this.LLJJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ2, 210), null, AFwS236S0000000_6.get$arr$(111));
        this.LLJL = new C1559260qg8(new C723590SZx(this, C898900ZOe.class, null), checkSupervisorPrepared());
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IStoryV2AnimViewModel.class, new AObjectS59S0000000_6(this, 10)}, defaultViewModelProviderFactory);
                    this.LLJLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public static void cp(LifecycleOwner lifecycleOwner) {
        String name;
        if (!(lifecycleOwner instanceof Fragment) && !(lifecycleOwner instanceof C19EG)) {
            if (lifecycleOwner instanceof AbstractC738140SxQ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Current is Assem and parent=");
                AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) lifecycleOwner;
                sbLIZ.append(abstractC738140SxQ.getParent().getClass().getName());
                C2188811AlT.LIZIZ(sbLIZ);
                cp(abstractC738140SxQ.getParent());
                return;
            }
            if (!(lifecycleOwner instanceof InterfaceC719640SKs)) {
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Current is IAssembleContainer and parentAssemOwner is ");
            InterfaceC719640SKs interfaceC719640SKs = (InterfaceC719640SKs) lifecycleOwner;
            LifecycleOwner lifecycleOwnerE82 = interfaceC719640SKs.E82();
            if (lifecycleOwnerE82 != null) {
                name = lifecycleOwnerE82.getClass().getName();
            } else {
                name = null;
            }
            sbLIZ2.append(name);
            C2188811AlT.LIZIZ(sbLIZ2);
            LifecycleOwner lifecycleOwnerE822 = interfaceC719640SKs.E82();
            if (lifecycleOwnerE822 != null) {
                cp(lifecycleOwnerE822);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.h08);
        this.LLJJJJ = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.LJJJJI(48.0f);
        }
        this.LLJJJJJIL = (SmartImageView) view.findViewById(R.id.aum);
        this.LLJJLIIIJLLLLLLLZ = new C421710GgD(((C898900ZOe) this.LLJL.getValue()).LL);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC461380I7k interfaceC461380I7k) {
        sr(interfaceC461380I7k, null);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC461380I7k interfaceC461380I7k) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC461380I7k interfaceC461380I7k) {
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: dp, reason: merged with bridge method [inline-methods] */
    public final void sr(InterfaceC461380I7k interfaceC461380I7k, List<? extends Object> list) {
        Object obj;
        Object obj2;
        int i;
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int iLIZIZ4;
        C462520IBu c462520IBu = C462520IBu.LIZ;
        if (C0IB1.LIZJ(list, c462520IBu)) {
            C869590Y9l c869590Y9l = interfaceC461380I7k.LLILII().LIZ.LIZ;
            C461020I6a<? extends Object> c461020I6a = interfaceC461380I7k.LLILII().LIZJ.get(c462520IBu);
            FrameLayout.LayoutParams layoutParams = null;
            if (c461020I6a != null) {
                obj = c461020I6a.LIZ;
            } else {
                obj = null;
            }
            C461000I5y c461000I5y = (C461000I5y) obj;
            boolean zLJJJJIZL = C0ZDX.LJJJJIZL(c869590Y9l);
            ViewGroup.LayoutParams layoutParams2 = LJJIJL().getLayoutParams();
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                layoutParams = (FrameLayout.LayoutParams) layoutParams2;
            }
            if (layoutParams != null) {
                if (zLJJJJIZL) {
                    i = 8388611;
                } else {
                    i = 8388613;
                }
                layoutParams.gravity = i | 80;
                if (zLJJJJIZL) {
                    Context context = LJJIJL().getContext();
                    C0I6V c0i6v = c461000I5y.LLILLJJLI.LL;
                    if (!(c0i6v instanceof C0I6S) && !(c0i6v instanceof C0I6U)) {
                        if (Intrinsics.LJFF(c0i6v, C0I68.LIZ)) {
                            iLIZIZ3 = 0;
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
                    }
                    Integer numValueOf = Integer.valueOf(iLIZIZ3);
                    if (c461000I5y.LLILLJJLI.LL instanceof C0I6S) {
                        iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-6));
                    } else {
                        iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    }
                    C426750GoL.LJIIJ(layoutParams, context, null, null, numValueOf, Integer.valueOf(iLIZIZ4), 38);
                } else {
                    Context context2 = LJJIJL().getContext();
                    C0I6V c0i6v2 = c461000I5y.LLILLJJLI.LL;
                    if (!(c0i6v2 instanceof C0I6S) && !(c0i6v2 instanceof C0I6U)) {
                        if (Intrinsics.LJFF(c0i6v2, C0I68.LIZ)) {
                            iLIZIZ = 0;
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
                    }
                    Integer numValueOf2 = Integer.valueOf(iLIZIZ);
                    if (c461000I5y.LLILLJJLI.LL instanceof C0I6S) {
                        iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-6));
                    } else {
                        iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    }
                    C426750GoL.LJIIJ(layoutParams, context2, numValueOf2, null, null, Integer.valueOf(iLIZIZ2), 44);
                }
            }
            LJJIJL().requestLayout();
            C0I6V c0i6v3 = c461000I5y.LLILLJJLI.LL;
            if (c0i6v3 instanceof C0I6S) {
                TuxTextView tuxTextView = this.LLJJJJ;
                if (tuxTextView != null) {
                    C786410Ut5.LJLLLLLL(8, tuxTextView);
                }
                SmartImageView smartImageView = this.LLJJJJJIL;
                if (smartImageView != null) {
                    C786410Ut5.LJLLLLLL(0, smartImageView);
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(C0I3J.LIZ(((C0I6S) c0i6v3).LIZ.imageComponent.urls)));
                    c1331670kl3LJIIIIZZ.LIZLLL = true;
                    c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
                    c1331670kl3LJIIIIZZ.LJJ(smartImageView);
                    C1332130kln.LJFF(c1331670kl3LJIIIIZZ, "StoryReaction", null, false, null, null, null, 62);
                    C786410Ut5.Q8(smartImageView, new ACListenerS73S0300000_6(smartImageView, c869590Y9l, c0i6v3, 3));
                }
            } else if (c0i6v3 instanceof C0I6U) {
                SmartImageView smartImageView2 = this.LLJJJJJIL;
                if (smartImageView2 != null) {
                    C786410Ut5.LJLLLLLL(8, smartImageView2);
                }
                TuxTextView tuxTextView2 = this.LLJJJJ;
                if (tuxTextView2 != null) {
                    C786410Ut5.LJLLLLLL(0, tuxTextView2);
                }
                TuxTextView tuxTextView3 = this.LLJJJJ;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(((C0I6U) c0i6v3).LIZ);
                }
            } else {
                SmartImageView smartImageView3 = this.LLJJJJJIL;
                if (smartImageView3 != null) {
                    C786410Ut5.LJLLLLLL(8, smartImageView3);
                }
                TuxTextView tuxTextView4 = this.LLJJJJ;
                if (tuxTextView4 != null) {
                    C786410Ut5.LJLLLLLL(8, tuxTextView4);
                }
            }
            C0I67 c0i67 = c461000I5y.LLILLJJLI;
            if (c0i67.LLILLJJLI) {
                boolean z = c0i67.LL instanceof C0I6S;
                if (z) {
                    obj2 = this.LLJJJJJIL;
                } else {
                    obj2 = this.LLJJJJ;
                }
                if (obj2 != null) {
                    InterfaceC1731706qJ interfaceC1731706qJ = this.LLJJJJLIIL;
                    InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
                    View view = ((QuotedAreaViewModel) interfaceC1731706qJ.getValue(this, interfaceC2217461BqaArr[0])).LL;
                    if (view != null) {
                        try {
                            ((IStoryV2AnimViewModel) this.LLJJL.getValue(this, interfaceC2217461BqaArr[1])).vQ2();
                        } catch (IllegalArgumentException e) {
                            TryCatchGuardChecker.doCheck(e);
                            cp(this);
                            C1AF0.LJFF(e, "AssemNullFragment");
                        }
                        C421710GgD c421710GgD = this.LLJJLIIIJLLLLLLLZ;
                        if (c421710GgD != null) {
                            c869590Y9l.getLocalExt().put("reaction_anim", "1");
                            C603540Nlo.LIZ(C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ(), c869590Y9l, "reaction_anim", new C0Y3R("1"), new C0Y3I("story v2 start animation, update localExt reaction_anim"));
                            HandlerHook.viewPost(c421710GgD.LIZ, new ARunnableS5S0310000_6(c421710GgD, z, obj2, view, 3));
                        }
                    }
                }
            }
        }
    }
}
