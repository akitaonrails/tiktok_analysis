package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C019F;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C259800zU;
import X.C339230DRp;
import X.C442801nu;
import X.C497740JfY;
import X.C500260Jjc;
import X.C504880Jr4;
import X.C505950Jsn;
import X.C505960Jso;
import X.C505970Jsp;
import X.C506060Jsy;
import X.C635860Owq;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment.DetailSettingDialogFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment.NewSubSpaceDetailSheetDialogFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment.SubSpaceDetailDialogFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes8.dex */
public final class DetailTitleAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public C504880Jr4 LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DetailTitleAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/detail/vm/SubSpaceDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public DetailTitleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceDetailVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C505960Jso(c19719912DlLIZ), new C506060Jsy(), null, true);
    }

    public final C504880Jr4 Go() {
        if (this.LLJ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C504880Jr4.class, null);
            this.LLJ = interfaceC1555100qZQLIZIZ != null ? (C504880Jr4) interfaceC1555100qZQLIZIZ.getSource() : null;
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
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.cs1);
        if (!Ho().zQ2()) {
            C786410Ut5.LLJJIJIL(liveIconView, 8);
        } else {
            C504880Jr4 c504880Jr4Go = Go();
            if (c504880Jr4Go != null) {
                boolValueOf = Boolean.valueOf(c504880Jr4Go.LLJILJIL);
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                C786410Ut5.LLJJIJIL(liveIconView, 8);
            } else {
                liveIconView.setIconAttr(R.attr.dmc);
                C635860Owq.LIZ.LIZJ(10, liveIconView);
                C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0Jsm
                    {
                        super(300L);
                    }

                    @Override // X.AbstractViewOnClickListenerC1637610siV
                    public final void LIZ(View view2) {
                        Fragment fragmentLJI;
                        FragmentManager childFragmentManager;
                        if (view2 != null && (fragmentLJI = C724240Sb0.LJI(this.LLILZ)) != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null) {
                            SubSpaceDetailVM subSpaceDetailVMHo = this.LLILZ.Ho();
                            C504880Jr4 c504880Jr4Go2 = this.LLILZ.Go();
                            DetailSettingDialogFragment detailSettingDialogFragment = new DetailSettingDialogFragment();
                            detailSettingDialogFragment.LLIZLLLIL = subSpaceDetailVMHo;
                            detailSettingDialogFragment.LLIZ = c504880Jr4Go2;
                            detailSettingDialogFragment.show(childFragmentManager, "DetailSettingDialogFragment");
                        }
                    }
                }, liveIconView);
                C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0Jsw
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C506340JtQ) obj).LLILZ;
                    }
                }, null, new C339230DRp(), 6);
            }
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        C504880Jr4 c504880Jr4Go2 = Go();
        if (c504880Jr4Go2 != null && (spacePost = c504880Jr4Go2.LLILLL) != null) {
            Jo(spacePost, textView);
        }
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0Jsx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506340JtQ) obj).LLILLL;
            }
        }, null, new C505970Jsp(this, textView), 6);
        final Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            if (fragmentLJI instanceof SubSpaceDetailDialogFragment) {
                View viewFindViewById = view.findViewById(R.id.bn2);
                C635860Owq.LIZ.LIZJ(10, viewFindViewById);
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Jsu
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ((DialogFragment) fragmentLJI).dismissAllowingStateLoss();
                    }
                }, viewFindViewById);
            } else {
                if (!(fragmentLJI instanceof NewSubSpaceDetailSheetDialogFragment)) {
                    return;
                }
                View viewFindViewById2 = view.findViewById(R.id.bn2);
                C635860Owq.LIZ.LIZJ(10, viewFindViewById2);
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Jsv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ((LiveSheetFragment) fragmentLJI).close(1);
                    }
                }, viewFindViewById2);
            }
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
            sbLIZ.append(C497740JfY.LJIJI(2131856514));
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
        C442801nu c442801nu = new C442801nu(textView, colorDrawable, new C505950Jsn(c259800zU));
        spannableStringBuilder.append((CharSequence) e3.d);
        C786410Ut5.q2(spannableStringBuilder, c442801nu, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) strLIZIZ);
        textView.setText(spannableStringBuilder);
    }
}
