package com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.protocol;

import X.C03H5;
import X.C0PHI;
import X.C0PU4;
import X.C0PUB;
import X.C13IQ;
import X.C13LE;
import X.C1822907Bz;
import X.C19719912Dl;
import X.C643150PKn;
import X.EnumC1999307sN;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.ui.opt.SearchCSCardSingleAssem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCSSingleCardProtocol implements ISearchCardProtocol<C0PU4> {
    public final C19719912Dl LL = C13LE.LIZ(C0PU4.class);
    public final C643150PKn LLILLJJLI = new C0PHI<C0PU4>() { // from class: X.0PKn
        @Override // X.C0PHI
        public final C0PHM LIZLLL() {
            return C0PHM.ALL_COLUMNS;
        }

        @Override // X.C0PHI
        public final List LIZIZ(InterfaceC594520NTm interfaceC594520NTm, C0PHT c0pht) {
            return C13BV.INSTANCE;
        }
    };

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final Class<? extends PowerCell<? extends InterfaceC1891350zJl>> T2() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final String Zm1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final ReusedUIAssem<? extends C03H5> IM2() {
        return new SearchCSCardSingleAssem();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C0PHI<C0PU4> getConfig() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C13IQ<C0PU4> getDataType() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        String str;
        C0PUB c0pub = ((C0PU4) interfaceC594520NTm).LL.LJIIIZ;
        if (c0pub != null) {
            str = c0pub.LIZJ;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, EnumC1999307sN.CLICK.getValue())) {
            return C1822907Bz.LIZIZ();
        }
        if (Intrinsics.LJFF(str, EnumC1999307sN.AUTO_PLAY.getValue())) {
            return C1822907Bz.LIZ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        return (C0PU4) interfaceC594520NTm;
    }
}
