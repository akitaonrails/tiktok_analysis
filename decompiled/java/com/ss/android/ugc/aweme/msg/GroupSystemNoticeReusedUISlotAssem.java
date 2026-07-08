package com.ss.android.ugc.aweme.msg;

import X.C01GW;
import X.C1559260qg8;
import X.C1587706Jn;
import X.C1683906ib;
import X.C1718106o7;
import X.C452501pT;
import X.C457780HxI;
import X.C723590SZx;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import X.ViewOnLongClickListenerC1767306w3;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.debug.api.IIMDebugService;
import com.ss.android.ugc.aweme.im.message.content.GroupSystemContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupSystemNoticeReusedUISlotAssem extends ReusedUISlotAssem<GroupSystemNoticeReusedUISlotAssem> implements InterfaceC712990Rxx<C1718106o7> {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 692));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cm9;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final TuxTextView op() {
        return (TuxTextView) this.LLJL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        op().setMovementMethod(LinkMovementMethod.getInstance());
        op().setHighlightColor(0);
        C786410Ut5.LLLLZLL(op(), 0);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1718106o7 c1718106o7) {
        SpannableStringBuilder spannableStringBuilderLIZJ;
        int i;
        C1718106o7 c1718106o72 = c1718106o7;
        GroupSystemContent groupSystemContent = (GroupSystemContent) BaseContentParserKt.getOrParseJsonContent(c1718106o72.LL.LIZ, GroupSystemContent.class);
        if (groupSystemContent != null) {
            spannableStringBuilderLIZJ = C1683906ib.LIZJ(groupSystemContent, true, true, c1718106o72.LL.LIZ);
        } else {
            spannableStringBuilderLIZJ = null;
        }
        TuxTextView tuxTextViewOp = op();
        if (spannableStringBuilderLIZJ == null) {
            i = 8;
        } else {
            i = 0;
        }
        C786410Ut5.LLLLZLL(tuxTextViewOp, i);
        op().setText(spannableStringBuilderLIZJ);
        IIMDebugService.LIZ.getClass();
        IIMDebugService iIMDebugService = C1587706Jn.LIZIZ;
        if (iIMDebugService != null && iIMDebugService.LIZJ()) {
            op().setOnLongClickListener(new ViewOnLongClickListenerC1767306w3(this, c1718106o72, 0));
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1718106o7 c1718106o7) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1718106o7 c1718106o7) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
