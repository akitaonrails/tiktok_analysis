package com.ss.android.ugc.aweme.im.ui.assem;

import X.C019F;
import X.C06JG;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723580SZw;
import X.C723850SaN;
import X.C724750Sbp;
import X.EnumC904370Zdr;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util.IDetailMediaGridPageCellService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS211S0300000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchMediaGridAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchMediaGridAssem.class, "mediaGridVM", "getMediaGridVM()Lcom/ss/android/ugc/aweme/im/sdk/chatdetail/redesign/detailpage/viewmodel/MediaGridViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchMediaGridAssem() {
        C019F c019f = C019F.LIZ;
        AFwS187S0000000_2 aFwS187S0000000_2 = AFwS187S0000000_2.get$arr$(559);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MediaGridViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 595), AFwS229S0000000_2.get$arr$(331), aFwS187S0000000_2, true);
        this.LLJJIII = new C1559260qg8(new C723580SZw(this, C06JG.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cpf;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        EnumC904370Zdr enumC904370Zdr;
        IDetailMediaGridPageCellService iDetailMediaGridPageCellService;
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        ((MediaGridViewModel) assemVMLazy.getValue()).IQ2();
        C06JG c06jg = (C06JG) this.LLJJIII.getValue();
        if (c06jg != null && (enumC904370Zdr = c06jg.LLILLL) != null && (iDetailMediaGridPageCellService = (IDetailMediaGridPageCellService) PluggableExtentionKt.pluggableSpiForReal(IDetailMediaGridPageCellService.class)) != null) {
            C723850SaN.LIZLLL(this, new AwS211S0300000_2(this, enumC904370Zdr, iDetailMediaGridPageCellService, 6));
        }
    }
}
