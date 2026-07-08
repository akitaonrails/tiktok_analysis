package com.ss.android.ugc.profile.business.ur.aigc;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAigcChooseAvatarFooterCell extends PowerLoadingCell {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final AssemVMLazy LL;
    public TuxIconView LLILLJJLI;
    public TuxSpinner LLILLL;
    public TuxTextView LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProfileAigcChooseAvatarFooterCell.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/aigc/ProfileAigcAvatarViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ProfileAigcChooseAvatarFooterCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileAigcAvatarViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 2215);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(364);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 2200), awS563S0100000_19, AFwS207S0000000_19.get$arr$(406), new AwS563S0100000_19((C03K6) this, 2201), new AwS563S0100000_19((C03K6) this, 2203), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2205), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 2207), null, new AwS563S0100000_19((C03K6) this, 2208));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19((C03K6) this, 2202);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2204);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c19719912DlLIZ, 2206);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS563S0100000_192, 113));
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 2209);
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ, 2210);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 2211);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 2212);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 2213);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS563S0100000_194, awS563S0100000_19, new C452080Ho6(), awS563S0100000_195, awS563S0100000_196, awS563S0100000_193, aFwS257S0000000_19, awS563S0100000_197, awS563S0100000_198, awS563S0100000_199);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 2214), awS563S0100000_19, AFwS207S0000000_19.get$arr$(407), new AwS563S0100000_19((C03K6) this, 2216), new AwS563S0100000_19((C03K6) this, 2217), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2218), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 2219), null, new AwS563S0100000_19((C03K6) this, 2220));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 2221), awS563S0100000_19, AFwS207S0000000_19.get$arr$(408), new AwS563S0100000_19((C03K6) this, 2222), new AwS563S0100000_19((C03K6) this, 2223), new AwS563S0100000_19((C03K6) this, 2224), aFwS257S0000000_19, null, null, new AwS563S0100000_19((C03K6) this, 2199));
        }
        this.LL = assemVMLazy;
    }

    public final ProfileAigcAvatarViewModel P5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        return (ProfileAigcAvatarViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = (TuxIconView) this.itemView.findViewById(R.id.nkt);
        this.LLILLL = (TuxSpinner) this.itemView.findViewById(R.id.vuf);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.text);
        ProfileAigcAvatarViewModel.yQ2(P5(), new C2217381BqS() { // from class: X.0hsk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1221150hsn) obj).LLILZLL;
            }
        }, this, new AwS598S0100000_19(this, 348));
    }

    public final void R5(boolean z) {
        TuxTextView tuxTextView = null;
        if (z) {
            TuxIconView tuxIconView = this.LLILLJJLI;
            if (tuxIconView == null) {
                tuxIconView = null;
            }
            C786410Ut5.x5(tuxIconView, 1.0f);
            TuxTextView tuxTextView2 = this.LLILZ;
            if (tuxTextView2 != null) {
                tuxTextView = tuxTextView2;
            }
            C786410Ut5.B5(tuxTextView, 1.0f);
            return;
        }
        TuxIconView tuxIconView2 = this.LLILLJJLI;
        if (tuxIconView2 == null) {
            tuxIconView2 = null;
        }
        C786410Ut5.x5(tuxIconView2, 0.5f);
        TuxTextView tuxTextView3 = this.LLILZ;
        if (tuxTextView3 != null) {
            tuxTextView = tuxTextView3;
        }
        C786410Ut5.B5(tuxTextView, 0.5f);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ebg, viewGroup, false);
    }
}
