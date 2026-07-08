package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C069P;
import X.C09R3;
import X.C0ZP4;
import X.C1308910kAL;
import X.C13LE;
import X.C1559260qg8;
import X.C1602160rnK;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C431260Gvc;
import X.C452501pT;
import X.C457780HxI;
import X.C462150IAj;
import X.C462160IAk;
import X.C462180IAm;
import X.C462190IAn;
import X.C462300IAy;
import X.C723590SZx;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C869590Y9l;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC462200IAo;
import X.InterfaceC712990Rxx;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.common.experiment.IMRecallEnhancementConfig;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.common.view.IMSystemMsgTextView;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.recallmessage.ReEditViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.recallmessage.RecallMsgViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.RecallMessageReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS116S1100000_2;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS57S1000000_6;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class RecallMessageReusedUISlotAssem extends ReusedUISlotAssem<RecallMessageReusedUISlotAssem> implements InterfaceC712990Rxx<C462180IAm> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;
    public final C1559260qg8 LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public long LLJLLIL;
    public AnonymousClass0956 LLJLLL;
    public C0ZP4 LLJZ;
    public C869590Y9l LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RecallMessageReusedUISlotAssem.class, "recallMsgViewModel", "getRecallMsgViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/recallmessage/RecallMsgViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(RecallMessageReusedUISlotAssem.class, "reEditViewModel", "getReEditViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/recallmessage/ReEditViewModel;", 0);
        c09r3.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public RecallMessageReusedUISlotAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RecallMsgViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ, 341), AFwS236S0000000_6.get$arr$(185), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ReEditViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ2, 342), AFwS236S0000000_6.get$arr$(186), null, true);
        this.LLJLIL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 340));
        this.LLJLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 339));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.clp;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        AnonymousClass0956 anonymousClass0956 = this.LLJLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C0ZP4 c0zp4 = this.LLJZ;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        this.LLJZ = null;
        this.LLJZIJLIL = null;
    }

    public final ReEditViewModel up() {
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
        return (ReEditViewModel) assemVMLazy.getValue();
    }

    public final IMSystemMsgTextView yp() {
        return (IMSystemMsgTextView) this.LLJLILLLLZIIL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        long j;
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
        C462160IAk c462160IAk = (C462160IAk) assemVMLazy.getValue().getState();
        if (c462160IAk.LL) {
            j = c462160IAk.LLILLJJLI;
        } else {
            j = 0;
        }
        this.LLJLLIL = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C462180IAm r17) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.RecallMessageReusedUISlotAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C462180IAm c462180IAm) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C462180IAm c462180IAm) {
    }

    public final void sp(C869590Y9l c869590Y9l, String str) {
        IMSystemMsgTextView iMSystemMsgTextViewYp = yp();
        int visibility = iMSystemMsgTextViewYp.getVisibility();
        iMSystemMsgTextViewYp.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, iMSystemMsgTextViewYp);
        yp().setText(str);
        yp().setMovementMethod(null);
        C786410Ut5.aa(yp());
        op(c869590Y9l, false, false);
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    public final void zp(final C869590Y9l c869590Y9l, String str) {
        final int i;
        String string;
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(str, "", "im_local_db");
        if (C462300IAy.LIZ()) {
            i = 2131831092;
        } else {
            i = 2131831147;
        }
        if (iMUserLJIIL == null || (string = iMUserLJIIL.getDisplayName()) == null || a0.LJJJIL(string)) {
            string = LJJIJL().getContext().getString(2131831188);
        }
        sp(c869590Y9l, LJJIJL().getContext().getString(i, string));
        if (iMUserLJIIL == null) {
            InterfaceC462200IAo interfaceC462200IAo = new InterfaceC462200IAo() { // from class: X.0IAh
                @Override // X.InterfaceC462200IAo
                public final void LIZ() {
                    RecallMessageReusedUISlotAssem recallMessageReusedUISlotAssem = this.LIZ;
                    recallMessageReusedUISlotAssem.sp(c869590Y9l, recallMessageReusedUISlotAssem.LJJIJL().getContext().getString(i, this.LIZ.LJJIJL().getContext().getString(2131831188)));
                }

                @Override // X.InterfaceC462200IAo
                public final void LIZIZ(IMContact iMContact) {
                    String displayName = iMContact.getDisplayName();
                    if (displayName == null || a0.LJJJIL(displayName)) {
                        displayName = this.LIZ.LJJIJL().getContext().getString(2131831188);
                    }
                    RecallMessageReusedUISlotAssem recallMessageReusedUISlotAssem = this.LIZ;
                    recallMessageReusedUISlotAssem.sp(c869590Y9l, recallMessageReusedUISlotAssem.LJJIJL().getContext().getString(i, displayName));
                }
            };
            AnonymousClass0956 anonymousClass0956 = this.LLJLLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJLLL = C462190IAn.LIZ(((C457780HxI) this.LLJLIL.getValue()).LL, c869590Y9l, interfaceC462200IAo, LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    public final void op(C869590Y9l c869590Y9l, boolean z, boolean z2) {
        String string;
        String str;
        int i = 0;
        if (!z2) {
            ReEditViewModel reEditViewModelUp = up();
            SessionInfo sessionInfo = ((C457780HxI) this.LLJLIL.getValue()).LL;
            String uuid = c869590Y9l.getUuid();
            if (uuid.length() != 0 && (!((C462150IAj) reEditViewModelUp.vmDispatcher.getState()).LL.contains(uuid))) {
                reEditViewModelUp.setStateImmediate(new AwS57S1000000_6(uuid, 1));
                if (z) {
                    str = "unsent_message_with_edit";
                } else {
                    str = "unsent_message";
                }
                reEditViewModelUp.wQ2(sessionInfo, new AwS116S1100000_2(sessionInfo, str, 8));
            }
        }
        TextView textView = (TextView) this.LLJLL.getValue();
        if (((IMRecallEnhancementConfig) C462300IAy.LIZIZ.getValue()).oneHourRecallWindow) {
            string = LJJIJL().getContext().getString(2131831110);
        } else {
            string = LJJIJL().getContext().getString(2131831146);
        }
        textView.setText(string);
        View view = (View) this.LLJLL.getValue();
        if (c869590Y9l.getMsgId() != this.LLJLLIL) {
            i = 8;
        }
        int visibility = view.getVisibility();
        view.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, view);
    }

    public final void tp(final C869590Y9l c869590Y9l, boolean z, boolean z2) {
        String string;
        IMSystemMsgTextView iMSystemMsgTextViewYp = yp();
        int visibility = iMSystemMsgTextViewYp.getVisibility();
        final int iIntValue = 0;
        iMSystemMsgTextViewYp.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, iMSystemMsgTextViewYp);
        if (z) {
            String string2 = LJJIJL().getContext().getString(2131831097);
            String string3 = LJJIJL().getContext().getString(2131831096, string2);
            int iLJJJ = a0.LJJJ(string3, string2, 0, false, 6);
            if (iLJJJ < 0) {
                yp().setText(string3);
                yp().setMovementMethod(null);
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string3);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, LJJIJL().getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                }
                C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0I3F
                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        String text;
                        Object ability;
                        Long l;
                        Object ability2;
                        RecallMessageReusedUISlotAssem recallMessageReusedUISlotAssem = this.LL;
                        C869590Y9l c869590Y9l2 = c869590Y9l;
                        ReEditViewModel reEditViewModelUp = recallMessageReusedUISlotAssem.up();
                        SessionInfo sessionInfo = ((C457780HxI) recallMessageReusedUISlotAssem.LLJLIL.getValue()).LL;
                        reEditViewModelUp.wQ2(sessionInfo, new AwS581S0100000_2(sessionInfo, 429));
                        recallMessageReusedUISlotAssem.up();
                        try {
                            TextContent textContent = (TextContent) C051M.LIZIZ(TextContent.class, c869590Y9l2.getContent());
                            if (textContent != null && (text = textContent.getText()) != null) {
                                if (text.length() > 0) {
                                    C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558520qew.LJIIL(recallMessageReusedUISlotAssem), ChatRoomScope.class);
                                    if (c0qsjLIZJ != null) {
                                        ability = c0qsjLIZJ.getAbility(IInputFieldAbility.class);
                                    } else {
                                        ability = null;
                                    }
                                    if (!(ability instanceof IInputFieldAbility)) {
                                        ability = null;
                                    }
                                    IInputFieldAbility iInputFieldAbility = (IInputFieldAbility) ability;
                                    if (iInputFieldAbility != null) {
                                        iInputFieldAbility.J5(text);
                                        iInputFieldAbility.LLJZIJLIL();
                                        recallMessageReusedUISlotAssem.up();
                                        ReferenceInfo referenceInfo = c869590Y9l2.getReferenceInfo();
                                        if (referenceInfo != null && (l = referenceInfo.referenced_message_id) != null) {
                                            Long lValueOf = Long.valueOf(l.longValue());
                                            if (lValueOf.longValue() > 0) {
                                                long jLongValue = lValueOf.longValue();
                                                C0QSJ c0qsjLIZJ2 = C687700QyG.LIZJ(C1558520qew.LJIIL(recallMessageReusedUISlotAssem), ChatRoomScope.class);
                                                if (c0qsjLIZJ2 != null) {
                                                    ability2 = c0qsjLIZJ2.getAbility(C0I20.class);
                                                } else {
                                                    ability2 = null;
                                                }
                                                if (!(ability2 instanceof C0I20)) {
                                                    ability2 = null;
                                                }
                                                C0I20 c0i20 = (C0I20) ability2;
                                                if (c0i20 != null) {
                                                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(recallMessageReusedUISlotAssem), null, null, new C0I3D(recallMessageReusedUISlotAssem, c869590Y9l2, c0i20, jLongValue, null), 3);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        int i = iIntValue;
                        if (i != 0) {
                            textPaint.setColor(i);
                        }
                        textPaint.setUnderlineText(false);
                    }
                }, iLJJJ, string2.length() + iLJJJ, 33);
                yp().setText(spannableStringBuilder);
                yp().setMovementMethod(C431260Gvc.LIZ);
            }
        } else {
            IMSystemMsgTextView iMSystemMsgTextViewYp2 = yp();
            if (C462300IAy.LIZ()) {
                string = LJJIJL().getContext().getString(2131831095);
            } else {
                string = LJJIJL().getContext().getString(2131831148);
            }
            iMSystemMsgTextViewYp2.setText(string);
            yp().setMovementMethod(null);
        }
        C786410Ut5.aa(yp());
        op(c869590Y9l, z, z2);
    }
}
