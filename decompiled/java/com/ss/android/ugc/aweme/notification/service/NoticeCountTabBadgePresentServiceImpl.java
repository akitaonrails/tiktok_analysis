package com.ss.android.ugc.aweme.notification.service;

import X.C1618510sDh;
import X.C1618800sEA;
import X.C1618830sED;
import X.C1904220zeW;
import X.C19212010Ec;
import X.EnumC1904390zen;
import android.os.SystemClock;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService;

/* JADX INFO: loaded from: classes25.dex */
public final class NoticeCountTabBadgePresentServiceImpl implements INoticeCountTabBadgePresentService {
    public C1618830sED LIZ;
    public boolean LIZIZ;
    public boolean LIZJ = true;

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService
    public final void LIZ() {
        C1618830sED c1618830sED = this.LIZ;
        if (c1618830sED != null) {
            c1618830sED.LJIILIIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService
    public final void LIZIZ() {
        C1618830sED c1618830sED = this.LIZ;
        if (c1618830sED != null) {
            c1618830sED.LJJIIZI(2);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService
    public final void LIZLLL() {
        C1618830sED c1618830sED = this.LIZ;
        if (c1618830sED != null) {
            c1618830sED.LLJJJJJIL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService
    public final void LJ() {
        C1618830sED c1618830sED = this.LIZ;
        if (c1618830sED != null) {
            c1618830sED.LJIILL();
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService
    public final boolean isShowing() {
        C1618830sED c1618830sED = this.LIZ;
        if (c1618830sED != null) {
            return c1618830sED.LLJJIJIL;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService
    public final void onReset() {
        C1904220zeW.LL.LJII();
        C1618830sED c1618830sED = this.LIZ;
        if (c1618830sED != null) {
            int i = C1618830sED.LLLIZZ;
            c1618830sED.LJJIIJZLJL(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService
    public final void onResume() {
        C1618830sED c1618830sED = this.LIZ;
        if (c1618830sED != null) {
            int i = C1618830sED.LLLIZZ;
            c1618830sED.LJJIIJZLJL(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService
    public final void LIZJ(boolean z) {
        C1618830sED c1618830sED = this.LIZ;
        if (c1618830sED != null) {
            c1618830sED.LLJJJIL = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService
    public final void LJIIIZ(boolean z) {
        if (this.LIZIZ) {
            this.LIZIZ = false;
            return;
        }
        C1618830sED c1618830sED = this.LIZ;
        if (c1618830sED != null) {
            c1618830sED.LJJIFFI(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService
    public final void LJFF(AbsFragment absFragment, ScrollSwitchStateManager scrollSwitchStateManager, C1618510sDh c1618510sDh) {
        C1618800sEA.LIZ = SystemClock.uptimeMillis();
        C19212010Ec.LIZJ.LJLJI();
        EnumC1904390zen.MAIN_ACTIVITY_TIMESTAMP.trackTime();
        C1618830sED c1618830sED = this.LIZ;
        if (c1618830sED != null) {
            this.LIZIZ = true;
            int i = C1618830sED.LLLIZZ;
            c1618830sED.LJJIFFI(false);
        }
        this.LIZ = new C1618830sED(absFragment, scrollSwitchStateManager, c1618510sDh, this.LIZJ);
        this.LIZJ = false;
    }
}
