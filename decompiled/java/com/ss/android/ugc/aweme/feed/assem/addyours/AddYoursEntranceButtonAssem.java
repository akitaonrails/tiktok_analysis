package com.ss.android.ugc.aweme.feed.assem.addyours;

import X.C01GW;
import X.C0NNE;
import X.C0NNF;
import X.C0NNH;
import X.C0NNI;
import X.C0OB6;
import X.C0P4J;
import X.C0QSJ;
import X.C123100dR;
import X.C13LE;
import X.C1554610qYd;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2276471E8n;
import X.C267620AeG;
import X.C600100NgG;
import X.C608390Ntd;
import X.C673150Qan;
import X.C687700QyG;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC700430Rdh;
import X.InterfaceC1146704e9;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import Y.AAListenerS320S0100000_9;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.addyours.model.AddYoursRecommendation;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.addyours.mob.AddYoursBottomButtonProvider;
import com.ss.android.ugc.aweme.feed.assem.addyours.mob.AddYoursBottomButtonScope;
import com.ss.android.ugc.aweme.feed.assem.addyours.mob.IAddYoursBottomButtonProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import g1c.AjS64S0100000_9;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursEntranceButtonAssem extends BaseCellSlotComponent<AddYoursEntranceButtonAssem> implements C0QSJ, InterfaceC1146704e9 {
    public View LLJLLIL;
    public TuxIconView LLJLLL;
    public TuxTextView LLJZ;
    public View LLJZIJLIL;
    public TuxIconView LLL;
    public TuxTextView LLLF;
    public View LLLFF;
    public final C01GW LLLFFI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS240S0000000_9.get$arr$(85));
    public final C01GW LLLFZ = C737910Sx3.LIZJ(this, C13LE.LIZ(AddYoursEntranceButtonVM.class), AFwS240S0000000_9.get$arr$(86));
    public AnimatorSet LLLI;
    public boolean LLLII;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b8l;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{AddYoursBottomButtonScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AddYoursBottomButtonScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AddYoursBottomButtonScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final void Bp() {
        if (this.LLLI != null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.LLLFF;
        if (view == null) {
            view = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        View view2 = this.LLJZIJLIL;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2 != null ? view2 : null, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.addListener(new AAListenerS320S0100000_9(this, 0));
        objectAnimatorOfFloat2.addListener(new AAListenerS320S0100000_9(this, 1));
        animatorSet.setDuration(300L);
        animatorSet.setStartDelay(Mp4ScreenVideoLoadTimeout.CONTROL);
        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.LLLI = animatorSet;
    }

    public final AddYoursEntranceButtonVM Ep() {
        return (AddYoursEntranceButtonVM) this.LLLFZ.getValue();
    }

    public final void Fp() {
        AnimatorSet animatorSet = this.LLLI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        View view = this.LLJZIJLIL;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(8, view);
        View view2 = this.LLJZIJLIL;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.T4(view2, 0.0f);
        View view3 = this.LLLFF;
        if (view3 == null) {
            view3 = null;
        }
        C786410Ut5.LJLLLLLL(0, view3);
        View view4 = this.LLLFF;
        C786410Ut5.T4(view4 != null ? view4 : null, 1.0f);
    }

    public final void Gp() {
        if (((Boolean) C267620AeG.LIZ.getValue()).booleanValue()) {
            return;
        }
        AnimatorSet animatorSet = this.LLLI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.LLLI == null && LJJIJL().getMeasuredWidth() <= 0) {
            LJJIJL().addOnLayoutChangeListener(new C0P4J(this, 0));
            return;
        }
        C2276471E8n.LIZIZ.d("AddYoursEntranceButtonAssem", "safelyStartAnimator, animator start directly");
        Bp();
        AnimatorSet animatorSet2 = this.LLLI;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJLLIL = view.findViewById(R.id.ahl);
        this.LLJLLL = (TuxIconView) view.findViewById(R.id.f665aho);
        this.LLJZ = (TuxTextView) view.findViewById(R.id.ahp);
        this.LLJZIJLIL = view.findViewById(R.id.ahn);
        this.LLL = (TuxIconView) view.findViewById(R.id.ahr);
        this.LLLF = (TuxTextView) view.findViewById(R.id.ahs);
        this.LLLFF = view.findViewById(R.id.ahq);
        TuxIconView tuxIconView = this.LLJLLL;
        View view2 = null;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        tuxIconView.setIconRes(R.raw.icon_camera_plus_fill);
        TuxIconView tuxIconView2 = this.LLL;
        if (tuxIconView2 == null) {
            tuxIconView2 = null;
        }
        tuxIconView2.setIconRes(R.raw.icon_camera_plus_fill);
        TuxTextView tuxTextView = this.LLJZ;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(2131825072);
        View view3 = this.LLJLLIL;
        if (view3 == null) {
            view3 = null;
        }
        setComponentClickStatusExperimental(view3, EnumC700430Rdh.POSITIVE);
        View view4 = this.LLJLLIL;
        if (view4 != null) {
            view2 = view4;
        }
        C786410Ut5.I7(new AjS64S0100000_9(this, 0), view2);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFFI.getValue(), new C2217381BqS() { // from class: X.0Ntc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS292S0000000_9.get$arr$(5), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFFI.getValue(), new C2217381BqS() { // from class: X.0NtQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), AFwS292S0000000_9.get$arr$(6), 4);
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, IAddYoursBottomButtonProtocol.class, C1697810uHb.LJIILJJIL(new AddYoursBottomButtonProvider(interfaceC665370Q7zLJIIL)));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        Aweme aweme;
        String topicText;
        C0NNE c0nneLIZ;
        C0NNI c0nnf;
        String strLIZIZ;
        AddYoursRecommendation addYoursRecommendation;
        AddYoursRecommendation addYoursRecommendation2;
        VideoItemParams videoItemParams2 = videoItemParams;
        C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
        c2276471E8n.d("AddYoursEntranceButtonAssem", "onBind");
        Aweme aweme2 = videoItemParams2.getAweme();
        if ((aweme2 != null && C608390Ntd.LIZ(aweme2)) || ((aweme = videoItemParams2.getAweme()) != null && C608390Ntd.LIZIZ(aweme))) {
            Aweme aweme3 = videoItemParams2.getAweme();
            TuxTextView tuxTextView = null;
            if (aweme3 != null && (addYoursRecommendation2 = aweme3.getAddYoursRecommendation()) != null) {
                topicText = addYoursRecommendation2.getTopicText();
            } else {
                topicText = null;
            }
            if (C123100dR.LIZ(topicText)) {
                Aweme aweme4 = videoItemParams2.getAweme();
                if (aweme4 != null) {
                    addYoursRecommendation = aweme4.getAddYoursRecommendation();
                } else {
                    addYoursRecommendation = null;
                }
                c0nnf = new C0NNH(addYoursRecommendation);
            } else {
                Aweme aweme5 = videoItemParams2.getAweme();
                if (aweme5 == null || (c0nneLIZ = C600100NgG.LIZ(aweme5)) == null) {
                    return;
                } else {
                    c0nnf = new C0NNF(c0nneLIZ);
                }
            }
            AddYoursEntranceButtonVM addYoursEntranceButtonVMEp = Ep();
            addYoursEntranceButtonVMEp.getClass();
            addYoursEntranceButtonVMEp.setState(new AwS588S0100000_9(c0nnf, 670));
            C1554960qZC.LIZ(C1558520qew.LJIIL(this), c0nnf, C0NNI.class, "source_default_key");
            C1554960qZC.LIZ(C1558520qew.LJIIL(this), new C0OB6(videoItemParams2.mEventType, null, null, 14), C0OB6.class, "source_default_key");
            C1554960qZC.LIZ(C1558520qew.LJIIL(this), videoItemParams2.getAweme(), Aweme.class, "source_default_key");
            Fp();
            C786410Ut5.LJLLLLLL(0, getContentView());
            TuxTextView tuxTextView2 = this.LLLF;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            if (((Boolean) C267620AeG.LIZ.getValue()).booleanValue()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                TuxTextView tuxTextView3 = this.LLLF;
                if (tuxTextView3 != null) {
                    tuxTextView = tuxTextView3;
                }
                sbLIZ.append(tuxTextView.getContext().getResources().getString(2131825068));
                sbLIZ.append(' ');
                sbLIZ.append(c0nnf.LLILLJJLI);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = c0nnf.LLILLJJLI;
            }
            tuxTextView2.setText(strLIZIZ);
            if (this.LLLII) {
                c2276471E8n.d("AddYoursEntranceButtonAssem", "compensate animation once more when isAlreadySelected");
                Gp();
                return;
            }
            return;
        }
        C786410Ut5.LJLLLLLL(8, getContentView());
    }
}
