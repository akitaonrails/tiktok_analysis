package com.ss.android.ugc.aweme.im.sticker.impl.panel.ui.adapter.poweritems;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C424250GkJ;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS110S0200000_6;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.stickerpanel.ISysSmallEmojiPageCellVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class SystemSmallEmojiCell extends PowerCell<C424250GkJ> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final AssemVMLazy LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SystemSmallEmojiCell.class, "smallEmojiPageViewModel", "getSmallEmojiPageViewModel()Lcom/ss/android/ugc/aweme/stickerpanel/ISysSmallEmojiPageCellVM;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SystemSmallEmojiCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ISysSmallEmojiPageCellVM.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 2461);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(179);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2472), awS577S0100000_33, AFwS224S0000000_33.get$arr$(348), new AwS577S0100000_33((C03K6) this, 2447), new AwS577S0100000_33((C03K6) this, 2449), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2451), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2453), null, new AwS577S0100000_33((C03K6) this, 2454));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 2448);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2450);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 2452);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 94));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2455);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 2456);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 2457);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 2458);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 2459);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2460), awS577S0100000_33, AFwS224S0000000_33.get$arr$(346), new AwS577S0100000_33((C03K6) this, 2462), new AwS577S0100000_33((C03K6) this, 2463), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2464), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2465), null, new AwS577S0100000_33((C03K6) this, 2466));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2467), awS577S0100000_33, AFwS224S0000000_33.get$arr$(347), new AwS577S0100000_33((C03K6) this, 2468), new AwS577S0100000_33((C03K6) this, 2469), new AwS577S0100000_33((C03K6) this, 2470), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 2471));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        ((TuxTextView) this.itemView.findViewById(R.id.h0m)).LJJJJI(20.0f);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C424250GkJ c424250GkJ = (C424250GkJ) interfaceC1891350zJl;
        ((TextView) this.itemView.findViewById(R.id.h0m)).setText(c424250GkJ.LLILLJJLI);
        this.itemView.setContentDescription(c424250GkJ.LLILLJJLI);
        C786410Ut5.I7(new ACListenerS110S0200000_6(this, c424250GkJ, 12), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c3q, viewGroup, false);
    }
}
