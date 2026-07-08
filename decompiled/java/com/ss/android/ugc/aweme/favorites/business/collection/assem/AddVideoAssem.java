package com.ss.android.ugc.aweme.favorites.business.collection.assem;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C1749280vcc;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS52S0500000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class AddVideoAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddVideoAssem.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/favorites/business/collection/vm/VideoCollectionContentViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AddVideoAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoCollectionContentViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 275), AFwS256S0000000_18.get$arr$(93), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 271));
    }

    public final VideoCollectionContentViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (VideoCollectionContentViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1749280vcc c1749280vcc = (C1749280vcc) view.findViewById(R.id.w28);
        View viewFindViewById = view.findViewById(R.id.whe);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.tv_submit);
        c197039127h.setText(C786410Ut5.j4(view.getContext().getString(2131834466), Arrays.copyOf(new Object[]{CardStruct.IStatusCode.DEFAULT}, 1)));
        C786410Ut5.I7(new AbS699S0100000_18(this, 2, 42), c197039127h);
        Context context = view.getContext();
        AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0gZG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1170570gZD) obj).LLILLJJLI;
            }
        }, null, new AwS227S0300000_18(context, c1749280vcc, this, 15), new AwS562S0100000_18(c1749280vcc, 274), new AwS52S0500000_18(this, viewFindViewById, c1749280vcc, context, c197039127h, 2), 2, null);
    }
}
