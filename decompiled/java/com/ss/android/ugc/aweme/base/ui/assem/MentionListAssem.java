package com.ss.android.ugc.aweme.base.ui.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0P0T;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20603715jn;
import X.C20610815kw;
import X.C20612815lG;
import X.C21411818qq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C452501pT;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.base.vm.MentionContainerViewModel;
import com.ss.android.ugc.aweme.base.vm.MentionListViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.service.IStoryMentionShareService;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class MentionListAssem extends UIListContentAssem<MentionListViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public C20612815lG LLJ;
    public String LLJI;
    public C0P0T LLJILLL;
    public final AssemVMLazy LLJJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS23S0600000_19(this, C13LE.LIZ(MentionContainerViewModel.class), C1637806bA.LIZ, new AwS575S0100000_31(this, 233), AFwS276S0000000_31.get$arr$(290), (Function0) null, 1));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 378));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 379));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 234));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MentionListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/base/vm/MentionListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MentionListAssem() {
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 236);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MentionListViewModel.class);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(50);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS575S0100000_31, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((AbstractC738140SxQ) this, 380), aFwS276S0000000_31, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJ = assemVMLazy;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        String str;
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 10;
        C20612815lG c20612815lG = this.LLJ;
        c20603715jn.LIZJ = c20612815lG != null && c20612815lG.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C20612815lG c20612815lG2 = this.LLJ;
        if (c20612815lG2 == null || (str = c20612815lG2.LIZJ) == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append("_mention_list_fps");
        c20603715jn.LJIIIZ = C2188811AlT.LIZIZ(sbLIZ);
        C20612815lG c20612815lG3 = this.LLJ;
        if (c20612815lG3 != null && c20612815lG3.LJ == 1) {
            c20603715jn.LIZLLL = LoadingFooterCell.class;
        }
        return c20603715jn;
    }

    public final void Lo() {
        String strZo;
        C20610815kw.LIZ.getClass();
        if (C20610815kw.LIZIZ == null || (strZo = Zo()) == null) {
            return;
        }
        C20610815kw.LIZ(Jo().LLILLJJLI, strZo, null);
        this.LLJI = null;
    }

    public final MentionContainerViewModel No() {
        return (MentionContainerViewModel) this.LLIZLLLIL.getValue();
    }

    public final C21411818qq Oo() {
        return (C21411818qq) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: So, reason: merged with bridge method [inline-methods] */
    public final MentionListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (MentionListViewModel) assemVMLazy.getValue();
    }

    public final void Vo() {
        C0P0T c0p0t = this.LLJILLL;
        if (c0p0t == null || !c0p0t.isShowing()) {
            return;
        }
        C0P0T c0p0t2 = this.LLJILLL;
        if (c0p0t2 != null) {
            c0p0t2.dismiss();
        }
        IStoryMentionShareService iStoryMentionShareService = (IStoryMentionShareService) PluggableExtentionKt.pluggableSpi$default(IStoryMentionShareService.class, false, false, false, 14, null);
        if (iStoryMentionShareService != null) {
            iStoryMentionShareService.LJIILIIL();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String Zo() {
        String str;
        String str2;
        Map<String, String> map;
        C20612815lG c20612815lG = this.LLJ;
        String str3 = null;
        if (c20612815lG != null && (str = c20612815lG.LIZJ) != null) {
            switch (str.hashCode()) {
                case -1890252483:
                    if (str.equals("sticker")) {
                        return "sticker_mention";
                    }
                    break;
                case -1717040940:
                    if (str.equals("text_caption")) {
                        C20612815lG c20612815lG2 = this.LLJ;
                        if (c20612815lG2 != null && (map = c20612815lG2.LIZLLL) != null) {
                            str3 = map.get("is_note");
                        }
                        return Intrinsics.LJFF(str3, "1") ? "story_note_mention" : "text_mention";
                    }
                    break;
                case 178010482:
                    if (str.equals("profile_bio")) {
                        return "bio_mention";
                    }
                    break;
                case 640943257:
                    if (str.equals("repost_text")) {
                        C20612815lG c20612815lG3 = this.LLJ;
                        return (c20612815lG3 == null || (str2 = c20612815lG3.LJIIL) == null || str2.length() <= 0) ? "repost_mention" : str2;
                    }
                    break;
            }
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Lo();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0197  */
    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r22) {
        /*
            Method dump skipped, instruction units count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.ui.assem.MentionListAssem.onViewCreated(android.view.View):void");
    }
}
