package com.ss.android.ugc.aweme.im.ai.impl.bot.chat.title;

import X.C019F;
import X.C01GW;
import X.C0ZK1;
import X.C0ZKF;
import X.C13LE;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1660206em;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C419060Gbw;
import X.C457780HxI;
import X.C723580SZw;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public class BotTitleBarCenterAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723580SZw(this, C1660206em.class, null), checkSupervisorPrepared());
    public final C01GW LLJJIJI = C1509305vX.LIZ(new AwS546S0100000_2(this, 240));
    public final AssemVMLazy LLJJIJIIJIL;
    public ConstraintLayout LLJJIJIL;
    public TuxTextView LLJJJ;
    public C419060Gbw LLJJJIL;
    public ConstraintLayout LLJJJJ;
    public AvatarComponentView LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BotTitleBarCenterAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/im/ai/impl/bot/chat/title/BotTitleBarViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BotTitleBarCenterAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BotTitleBarViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 241), AFwS229S0000000_2.get$arr$(196), null, true);
        this.LLJJJJLIIL = C1509305vX.LIZ(new AwS546S0100000_2(this, 242));
        this.LLJJL = C1509305vX.LIZ(new AwS546S0100000_2(this, 239));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cqc;
    }

    public void hp() {
    }

    public void ip() {
    }

    public final void kp(IMUser iMUser) {
        if (iMUser == null) {
            return;
        }
        IDMAvatarLoader iDMAvatarLoader = (IDMAvatarLoader) this.LLJJL.getValue();
        if (iDMAvatarLoader != null) {
            iDMAvatarLoader.LIZIZ(null, iMUser.getDisplayAvatar(), new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
        }
        AvatarComponentView avatarComponentView = this.LLJJJJJIL;
        if (avatarComponentView != null) {
            avatarComponentView.setContentDescription(iMUser.getDisplayName());
        }
        TuxTextView tuxTextView = this.LLJJJ;
        if (tuxTextView != null) {
            tuxTextView.setText(iMUser.getDisplayName());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[PHI: r0
      0x007c: PHI (r0v32 X.06en) = (r0v17 X.06en), (r0v34 X.06en) binds: [B:35:0x00fe, B:19:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.ai.impl.bot.chat.title.BotTitleBarCenterAssem.onViewCreated(android.view.View):void");
    }
}
