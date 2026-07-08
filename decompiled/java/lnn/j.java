package lnn;

import X.C1623130sL9;
import X.C1635820sfc;
import X.C1695930uEZ;
import X.C19GS;
import X.InterfaceC1623100sL6;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625220sOW;
import X.InterfaceC1628180sTI;
import X.InterfaceC1630220sWa;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.sticker_core.RecordFavoriteSticker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class j extends C1623130sL9 {
    public final C19GS LLJILLL;
    public final LifecycleOwner LLJJ;
    public final InterfaceC1624480sNK LLJJI;
    public final InterfaceC1625220sOW LLJJIII;
    public final InterfaceC1628180sTI LLJJIJI;
    public final InterfaceC1630220sWa LLJJIJIIJIL;
    public final Function0<C1635820sfc> LLJJIJIL;
    public final Function2<Effect, Boolean, Unit> LLJJJ;
    public final Function1<Effect, Boolean> LLJJJIL;

    @Override // X.C1623130sL9
    public final InterfaceC1623100sL6 LJJIIZ(View view) {
        return new RecordFavoriteSticker(this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, (FrameLayout) view.findViewById(R.id.mfm), (C1695930uEZ) view.findViewById(R.id.khe), this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ);
    }

    public j(C19GS c19gs, LifecycleOwner lifecycleOwner, InterfaceC1628180sTI interfaceC1628180sTI, InterfaceC1625220sOW interfaceC1625220sOW, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1630220sWa interfaceC1630220sWa, AwS569S0100000_25 awS569S0100000_25, AwS604S0100000_25 awS604S0100000_25, AwS639S0100000_25 awS639S0100000_25) {
        super(c19gs, lifecycleOwner, interfaceC1628180sTI, interfaceC1624480sNK, interfaceC1625220sOW, interfaceC1630220sWa, null, awS604S0100000_25, awS569S0100000_25, 64);
        this.LLJILLL = c19gs;
        this.LLJJ = lifecycleOwner;
        this.LLJJI = interfaceC1624480sNK;
        this.LLJJIII = interfaceC1625220sOW;
        this.LLJJIJI = interfaceC1628180sTI;
        this.LLJJIJIIJIL = interfaceC1630220sWa;
        this.LLJJIJIL = awS569S0100000_25;
        this.LLJJJ = awS639S0100000_25;
        this.LLJJJIL = awS604S0100000_25;
    }
}
