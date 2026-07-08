package com.ss.android.ugc.aweme.inbox.bulletin.assem.publishpanel;

import X.C019F;
import X.C09M6;
import X.C0I7D;
import X.C0P4X;
import X.C1336205Ku;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.Window;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.ability.RequestKeyboardAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.publishpanel.BulletinPublishPanelViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS17S0010000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPublishPanelInputAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public C0I7D LLJJI;
    public Integer LLJJIII;
    public final AssemVMLazy LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinPublishPanelInputAssem.class, "bulletinPublishEditVM", "getBulletinPublishEditVM()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/publishpanel/BulletinPublishPanelViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BulletinPublishPanelInputAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinPublishPanelViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 620), AFwS240S0000000_9.get$arr$(272), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a80;
    }

    public final BulletinPublishPanelViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (BulletinPublishPanelViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        Window window;
        Integer num = this.LLJJIII;
        if (num != null) {
            int iIntValue = num.intValue();
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null && (window = c19egLIZ.getWindow()) != null) {
                window.setSoftInputMode(iIntValue);
            }
        }
        super.onDestroy();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Window window;
        super.onViewCreated(view);
        this.LLJJI = (C0I7D) view.findViewById(R.id.d4b);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (window = c19egLIZ.getWindow()) != null) {
            this.LLJJIII = Integer.valueOf(window.getAttributes().softInputMode);
            window.setSoftInputMode(48);
        }
        C1336205Ku.LIZ(false).getAssembleEmojiPanelService().LIZIZ(this, new RequestKeyboardAbility() { // from class: com.ss.android.ugc.aweme.inbox.bulletin.assem.publishpanel.BulletinPublishPanelInputAssem$initEmoji$1$1
            @Override // com.ss.android.ugc.aweme.im.ability.RequestKeyboardAbility
            public final void Fr() {
                this.LL.hp().setState(new AwS17S0010000_2(true, 17));
            }
        }, R.id.d4d);
        C0I7D c0i7d = this.LLJJI;
        if (c0i7d != null) {
            c0i7d.setFilters(new C09M6[]{new C09M6(LSPassThroughRecordSizeConfig.DEFAULT, C724240Sb0.LJI(this))});
            c0i7d.addTextChangedListener(new C0P4X(this, 5));
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0OWT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1588106Jr) obj).LLILLJJLI;
            }
        }, null, new AwS618S0100000_4(this, 70), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0OWU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1588106Jr) obj).LLILZ;
            }
        }, null, new AwS623S0100000_9(this, 196), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0OWV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1588106Jr) obj).LLILLL;
            }
        }, null, new AwS616S0100000_2(this, 109), 6);
    }
}
