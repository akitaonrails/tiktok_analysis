package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.assem;

import X.C019F;
import X.C0K3S;
import X.C0K51;
import X.C0XQS;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C259800zU;
import X.C419910GdJ;
import X.C426930God;
import X.C442901nv;
import X.C511520K4g;
import X.C515640KKc;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS142S0100000_7;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.fragment.SubSpaceDetailDialogFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AFwS287S0000000_4;
import kotlin.jvm.internal.AwS443S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import ttpobfuscated.e3;
import wh6.AbS689S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class DetailTitleAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public C0K3S LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DetailTitleAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/perks/subspace/detail/vm/SubSpaceDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public DetailTitleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceDetailVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 463), AFwS237S0000000_7.get$arr$(214), null, true);
    }

    public final C0K3S Go() {
        if (this.LLJ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0K3S.class, null);
            this.LLJ = interfaceC1555100qZQLIZIZ != null ? (C0K3S) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJ;
    }

    public final SubSpaceDetailVM Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (SubSpaceDetailVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Boolean boolValueOf;
        SpacePost spacePost;
        super.onViewCreated(view);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.cs1);
        if (!Ho().BQ2()) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        } else {
            C0K3S c0k3sGo = Go();
            if (c0k3sGo != null) {
                boolValueOf = Boolean.valueOf(c0k3sGo.LLJILJIL);
            } else {
                boolValueOf = null;
            }
            if (C0K51.LJI(boolValueOf)) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            } else {
                int iLIZLLL = C426930God.LIZLLL(R.attr.f98, tuxIconView.getContext());
                if (iLIZLLL != 0) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = iLIZLLL;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.f_f);
                    tuxIconView.setTuxIcon(c419910GdJ);
                }
                C515640KKc.LIZ(10, tuxIconView);
                C786410Ut5.I7(new AbS689S0100000_7(this, 11), tuxIconView);
                C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0Jtn
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C506360JtS) obj).LLILZ;
                    }
                }, null, AFwS287S0000000_4.get$arr$(23), 6);
            }
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        C0K3S c0k3sGo2 = Go();
        if (c0k3sGo2 != null && (spacePost = c0k3sGo2.LLILLL) != null) {
            Jo(spacePost, textView);
        }
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0Jto
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506360JtS) obj).LLILLL;
            }
        }, null, new AwS443S0200000_7(this, textView, 8), 6);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (fragmentLJI instanceof SubSpaceDetailDialogFragment)) {
            View viewFindViewById = view.findViewById(R.id.bn2);
            C515640KKc.LIZ(10, viewFindViewById);
            C786410Ut5.I7(new ACListenerS142S0100000_7(fragmentLJI, 174), viewFindViewById);
        }
    }

    public final void Jo(SpacePost spacePost, TextView textView) {
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ColorDrawable colorDrawable = new ColorDrawable(0);
        colorDrawable.setBounds(0, 0, (int) textView.getTextSize(), (int) textView.getTextSize());
        C259800zU c259800zU = new C259800zU();
        String strLIZIZ = "";
        c259800zU.element = "";
        if (spacePost.pollInfo != null) {
            c259800zU.element = "ttlive_sub_space_ic_poll.png";
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('#');
            sbLIZ.append(C511520K4g.LJII(2131839558));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            c259800zU.element = "ttlive_sub_space_ic_chat.png";
            SpaceTopicCategory spaceTopicCategory = spacePost.category;
            if (spaceTopicCategory != null && (str = spaceTopicCategory.topicCategoryText) != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('#');
                sbLIZ2.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        C442901nv c442901nv = new C442901nv(textView, colorDrawable, new AwS551S0100000_7(c259800zU, (C259800zU<C0XQS>) 464));
        spannableStringBuilder.append((CharSequence) e3.d);
        C786410Ut5.q2(spannableStringBuilder, c442901nv, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) strLIZIZ);
        textView.setText(spannableStringBuilder);
    }
}
