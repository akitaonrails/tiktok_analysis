package com.ss.android.ugc.aweme.notification.module.cell;

import X.C1242230iQn;
import X.C1242260iQq;
import X.C1242290iQt;
import X.C1242300iQu;
import X.C1266090j3H;
import X.C13LE;
import X.C1907040zj4;
import X.C2217381BqS;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity;
import com.ss.android.ugc.aweme.notification.module.NotificationChunkVM;
import com.ss.android.ugc.aweme.notification.vh.MTTemplateNotificationHolder;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class TemplateCell extends NotificationCell<C1242230iQn> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public MTTemplateNotificationHolder LLIZ;
    public final C1266090j3H LLIZLLLIL = new C1266090j3H(this, 4);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TemplateCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/notification/module/NotificationChunk$CellControl;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final C1242300iQu P5() {
        return (C1242300iQu) this.LLIZLLLIL.getValue(this, LLJ[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.notification.module.cell.BaseChunkCell
    public final void L5() {
        super.L5();
        C1242230iQn c1242230iQn = (C1242230iQn) getItem();
        if (c1242230iQn != null) {
            N5(c1242230iQn);
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.module.cell.NotificationCell, com.ss.android.ugc.aweme.notification.module.cell.BaseChunkCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        MTTemplateNotificationHolder mTTemplateNotificationHolder = this.LLIZ;
        if (mTTemplateNotificationHolder == null) {
            mTTemplateNotificationHolder = null;
        }
        mTTemplateNotificationHolder.onAttached();
    }

    @Override // com.ss.android.ugc.aweme.notification.module.cell.NotificationCell, com.ss.android.ugc.aweme.notification.module.cell.BaseChunkCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        MTTemplateNotificationHolder mTTemplateNotificationHolder = this.LLIZ;
        if (mTTemplateNotificationHolder == null) {
            mTTemplateNotificationHolder = null;
        }
        mTTemplateNotificationHolder.onDetached();
    }

    public final void N5(C1242230iQn c1242230iQn) {
        String str;
        NotificationChunkVM notificationChunkVM;
        C1242290iQt c1242290iQt;
        NotificationChunkVM notificationChunkVM2;
        C1242290iQt c1242290iQt2;
        Map<String, String> map;
        MTTemplateNotificationHolder mTTemplateNotificationHolder = this.LLIZ;
        String str2 = null;
        if (mTTemplateNotificationHolder == null) {
            mTTemplateNotificationHolder = null;
        }
        mTTemplateNotificationHolder.bindNotice(c1242230iQn.LLILLJJLI, c1242230iQn.LL - 1);
        C1242300iQu c1242300iQuP5 = P5();
        if (c1242300iQuP5 == null || (notificationChunkVM2 = c1242300iQuP5.LLILLJJLI) == null || (c1242290iQt2 = notificationChunkVM2.LLIZLLLIL) == null || (map = c1242290iQt2.LJII) == null || (str = map.get("enter_from")) == null || str.length() == 0) {
            str = "notification_page";
        }
        MTTemplateNotificationHolder mTTemplateNotificationHolder2 = this.LLIZ;
        if (mTTemplateNotificationHolder2 == null) {
            mTTemplateNotificationHolder2 = null;
        }
        MusNotice musNotice = c1242230iQn.LLILLJJLI;
        int i = c1242230iQn.LL - 1;
        boolean z = c1242230iQn.LLILLL;
        List listLIZ = C1907040zj4.LIZ(musNotice.type);
        C1242300iQu c1242300iQuP52 = P5();
        if (c1242300iQuP52 != null && (notificationChunkVM = c1242300iQuP52.LLILLJJLI) != null && (c1242290iQt = notificationChunkVM.LLIZLLLIL) != null) {
            str2 = c1242290iQt.LJFF;
        }
        String str3 = MusNotificationDetailActivity._pnsPageId;
        MTTemplateNotificationHolder.P5(mTTemplateNotificationHolder2, musNotice, i, "", "", str, z, listLIZ, false, "shop_message", null, str2, C1242260iQq.LIZ(getContext()), 1408);
    }

    @Override // com.ss.android.ugc.aweme.notification.module.cell.BaseChunkCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: R5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1242230iQn c1242230iQn) {
        super.onBindItemView(c1242230iQn);
        MTTemplateNotificationHolder mTTemplateNotificationHolder = this.LLIZ;
        MTTemplateNotificationHolder mTTemplateNotificationHolder2 = null;
        if (mTTemplateNotificationHolder == null) {
            mTTemplateNotificationHolder = null;
        }
        mTTemplateNotificationHolder.mClickListener = P5();
        MTTemplateNotificationHolder mTTemplateNotificationHolder3 = this.LLIZ;
        if (mTTemplateNotificationHolder3 != null) {
            mTTemplateNotificationHolder2 = mTTemplateNotificationHolder3;
        }
        mTTemplateNotificationHolder2.vm = P5().LLILLJJLI;
        N5(c1242230iQn);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aaj, viewGroup, false);
        this.LLIZ = new MTTemplateNotificationHolder(viewTd, new AwS598S0100000_19(this, 196));
        return viewTd;
    }
}
