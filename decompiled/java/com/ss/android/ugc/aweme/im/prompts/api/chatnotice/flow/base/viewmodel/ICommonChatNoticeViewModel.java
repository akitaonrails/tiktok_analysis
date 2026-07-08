package com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel;

import X.C069B;
import X.C06NH;
import X.C06O6;
import X.C06OD;
import X.C06OO;
import X.C09AE;
import X.C1600706On;
import X.C23118094a;
import X.EnumC15556067e;
import X.EnumC1596306Mv;
import X.InterfaceC1364105Vn;
import X.InterfaceC904740ZeS;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public class ICommonChatNoticeViewModel extends AssemViewModel<C069B> {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final IChatNoticeFlowEngine LL;

    public void DQ2(EnumC15556067e enumC15556067e, String str, String str2, long j) {
    }

    public EnumC1596306Mv FQ2(C06NH c06nh) {
        return null;
    }

    public void GQ2(Context context, boolean z) {
    }

    public <T extends C06OO> void HQ2(C06OD<T> c06od) {
    }

    public void KQ2() {
    }

    public void LQ2() {
    }

    public void MQ2(String str) {
    }

    public void NQ2(boolean z) {
    }

    public void OQ2(boolean z) {
    }

    public void df1(InterfaceC904740ZeS interfaceC904740ZeS) {
    }

    public boolean ny() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* JADX INFO: renamed from: zQ2, reason: merged with bridge method [inline-methods] */
    public C069B defaultState() {
        return new C069B(false, null, null, null);
    }

    public void AQ2() {
        C23118094a.LIZ();
    }

    public void CQ2() {
        C23118094a.LIZ();
    }

    public void PQ2() {
        C23118094a.LIZ();
    }

    public ICommonChatNoticeViewModel(IChatNoticeFlowEngine iChatNoticeFlowEngine) {
        this.LL = iChatNoticeFlowEngine;
    }

    public void BQ2(EnumC1596306Mv enumC1596306Mv) {
        C23118094a.LIZ();
    }

    public C09AE JQ2(EnumC1596306Mv enumC1596306Mv) {
        return C23118094a.LIZ();
    }

    public C09AE vQ2(Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2) {
        return C23118094a.LIZ();
    }

    public C09AE xQ2(C06OO c06oo) {
        return C23118094a.LIZ();
    }

    public IChatNoticeFlowEngine IQ2(C1600706On c1600706On, List<? extends C06O6<? extends C06OO>> list) {
        return this.LL;
    }

    public C09AE wQ2(List<IMNoticeMsgStruct> list, Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2) {
        return C23118094a.LIZ();
    }

    public C09AE yQ2(Function2 function2, boolean z) {
        return C23118094a.LIZ();
    }
}
