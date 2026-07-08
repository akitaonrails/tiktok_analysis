package com.ss.android.ugc.aweme.invitation.newdesign.assem;

import X.AbstractC1230540i7w;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C019F;
import X.C1229810i6l;
import X.C1230090i7D;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C874100YQu;
import X.C899340ZPw;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.invitation.newdesign.assem.GroupInvitationPreviewEntryAssem;
import com.ss.android.ugc.aweme.invitation.newdesign.vm.GroupInvitationVM;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupInvitationPreviewEntryAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, AbstractC1230540i7w.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupInvitationPreviewEntryAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/invitation/newdesign/vm/GroupInvitationVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupInvitationPreviewEntryAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupInvitationVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1593), AFwS257S0000000_19.get$arr$(221), null, true);
    }

    public final Long Go() {
        C1230090i7D groupMetaData;
        C1229810i6l c1229810i6l;
        AbstractC1230540i7w abstractC1230540i7w = (AbstractC1230540i7w) this.LLIZLLLIL.getValue();
        if (abstractC1230540i7w == null || (groupMetaData = abstractC1230540i7w.getGroupMetaData()) == null || (c1229810i6l = groupMetaData.LIZ) == null) {
            return null;
        }
        Long lValueOf = Long.valueOf(c1229810i6l.LIZ);
        if (lValueOf.longValue() > 0) {
            return lValueOf;
        }
        return null;
    }

    public final GroupInvitationVM Jo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (GroupInvitationVM) assemVMLazy.getValue();
    }

    public final TuxTextView Ho() {
        return (TuxTextView) LJJIJL();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        Long lGo = Go();
        if (lGo != null) {
            long jLongValue = lGo.longValue();
            C899340ZPw.LIZ.remove(Long.valueOf(jLongValue));
            C874100YQu.LIZ.getClass();
            C874100YQu.LIZJ.remove(Long.valueOf(jLongValue));
        }
        super.onDestroy();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Long lGo;
        super.onViewCreated(view);
        final AbstractC1230540i7w abstractC1230540i7w = (AbstractC1230540i7w) this.LLIZLLLIL.getValue();
        if (abstractC1230540i7w != null && (lGo = Go()) != null) {
            final long jLongValue = lGo.longValue();
            C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0i8C
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1230460i7o) obj).LLJIJIL;
                }
            }, null, new AwS633S0100000_19(this, 58), 6);
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0i7j
                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view2) {
                    if (view2 != null) {
                        GroupInvitationPreviewEntryAssem groupInvitationPreviewEntryAssem = this.LLILZ;
                        AbstractC1230540i7w abstractC1230540i7w2 = abstractC1230540i7w;
                        String strValueOf = String.valueOf(jLongValue);
                        groupInvitationPreviewEntryAssem.getClass();
                        HashMap map = new HashMap(C1230370i7f.LIZ(abstractC1230540i7w2, strValueOf));
                        map.put("user_group_status", String.valueOf(groupInvitationPreviewEntryAssem.Jo().getState().LLILLJJLI));
                        Set<String> set = C06KF.LIZ;
                        C830490Whz c830490Whz = new C830490Whz();
                        c830490Whz.putAll(map);
                        C06KF.LIZIZ("ttsocial_group_intro_popup_preview_btn_click", c830490Whz);
                        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILZ), null, null, new C1230400i7i(jLongValue, this.LLILZ, abstractC1230540i7w, map, null), 3);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(300L);
                }
            }, Ho());
        }
    }
}
