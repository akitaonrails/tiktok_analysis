package com.ss.android.ugc.aweme.tako.botpage.components.source;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C07CS;
import X.C0R2I;
import X.C13LE;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C329020Cv6;
import X.C452070Ho5;
import X.C452501pT;
import X.C688770Qzz;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC328990Cv3;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.TakoNimbleVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS692S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoAwemeReferenceAssem extends ReusedUISlotAssem<TakoAwemeReferenceAssem> implements InterfaceC712990Rxx<C0R2I> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public C0R2I LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxIconView LLJLIL;
    public final AssemVMLazy LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public C329020Cv6 LLJLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJLLL;
    public List<? extends Aweme> LLJZ;
    public List<String> LLJZIJLIL;
    public final C01GW LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoAwemeReferenceAssem.class, "takoNimbleVM", "getTakoNimbleVM()Lcom/ss/android/ugc/aweme/tako/nimblecard/flexnimble/vm/TakoNimbleVM;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.flx;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public TakoAwemeReferenceAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoNimbleVM.class);
        AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(c19719912DlLIZ, 264);
        AFwS232S0000000_4 aFwS232S0000000_4 = AFwS232S0000000_4.get$arr$(81);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS548S0100000_4, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((AbstractC738140SxQ) this, 855), aFwS232S0000000_4, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJLILLLLZIIL = assemVMLazy;
        this.LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 853));
        this.LLL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 263));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.xcj);
        this.LLJL = tuxTextView;
        if (tuxTextView != null) {
            C786410Ut5.I7(new AbS692S0100000_10(this, 22), tuxTextView);
        }
        this.LLJLIL = (TuxIconView) view.findViewById(R.id.xck);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(C0R2I c0r2i) {
        C0R2I c0r2i2 = c0r2i;
        this.LLJJLIIIJLLLLLLLZ = c0r2i2;
        if (c0r2i2.LIZ() != null && (!r0.isEmpty()) && !Intrinsics.LJFF(c0r2i2.LIZ(), this.LLJZIJLIL) && this.LLJZ == null && C07CS.LIZ()) {
            this.LLJLLIL = new C329020Cv6("", C2097608Jq.LJIIIIZZ(new Pair("count", "5"), new Pair("video_ids", C688770Qzz.LIZIZ(c0r2i2.LIZ())), new Pair(Scene.SCENE_SERVICE, "24")));
            AssemVMLazy assemVMLazy = this.LLJLILLLLZIIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLF;
            TakoNimbleVM takoNimbleVM = (TakoNimbleVM) assemVMLazy.getValue();
            C329020Cv6 c329020Cv6 = this.LLJLLIL;
            if (c329020Cv6 != null) {
                TakoNimbleVM.vQ2(takoNimbleVM, c329020Cv6, EnumC328990Cv3.LOAD_MORE, 0, new AwS589S0100000_10(this, 386));
                this.LLJZIJLIL = c0r2i2.LIZ();
            } else {
                return;
            }
        }
        TuxTextView tuxTextView = this.LLJL;
        if (tuxTextView != null) {
            tuxTextView.setText(tuxTextView.getContext().getString(2131847093));
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        TuxIconView tuxIconView = this.LLJLIL;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0R2I c0r2i) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0R2I c0r2i) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        tp(interfaceC1587906Jp);
    }
}
