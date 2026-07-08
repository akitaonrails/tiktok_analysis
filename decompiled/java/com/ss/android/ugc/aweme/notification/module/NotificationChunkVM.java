package com.ss.android.ugc.aweme.notification.module;

import X.C01GW;
import X.C123100dR;
import X.C1242230iQn;
import X.C1242250iQp;
import X.C1242280iQs;
import X.C1242290iQt;
import X.C1242410iR5;
import X.C13BV;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C452501pT;
import X.EnumC1223070hvt;
import X.EnumC1242330iQx;
import X.EnumC1242340iQy;
import X.EnumC1242370iR1;
import X.InterfaceC336510DHd;
import androidx.lifecycle.LiveData;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class NotificationChunkVM extends BaseNotificationVM implements InterfaceC336510DHd {
    public final C1242290iQt LLIZLLLIL;
    public final EnumC1242370iR1 LLJ;
    public final NextLiveData<EnumC1242340iQy> LLJI;
    public EnumC1242330iQx LLJIJIL = EnumC1242330iQx.UNKNOWN;
    public volatile C1242280iQs LLJILJIL = new C1242280iQs(0);
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(263));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(261));
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(262));

    public final NextLiveData<EnumC1223070hvt> yQ2() {
        return (NextLiveData) this.LLJJ.getValue();
    }

    public final String zQ2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://notice/detail?title=");
        sbLIZ.append(this.LLIZLLLIL.LIZJ);
        sbLIZ.append("&from_where=");
        sbLIZ.append(this.LLIZLLLIL.LIZ);
        sbLIZ.append("&ec_merged_tiktok_shop=");
        sbLIZ.append(this.LLIZLLLIL.LJI);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!C123100dR.LIZ(this.LLIZLLLIL.LJ)) {
            return strLIZIZ;
        }
        C1242290iQt c1242290iQt = this.LLIZLLLIL;
        if (c1242290iQt.LIZ != 210) {
            return strLIZIZ;
        }
        String strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken("a2270.b76963.c4379.d4875", PageFinder.via(c1242290iQt.LJ), null);
        if (!C123100dR.LIZ(strCreateJumpSourceBtmToken)) {
            return strLIZIZ;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("&source_btm_token=");
        sbLIZ2.append(strCreateJumpSourceBtmToken);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void xQ2(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ListIterator listIterator = list.listIterator();
        int i = 1;
        while (listIterator.hasNext()) {
            MusNotice musNotice = (MusNotice) listIterator.next();
            if (musNotice.templateNotice == null) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Only support template type:");
                sbLIZ.append(musNotice.nid);
                sbLIZ.append(", ");
                sbLIZ.append(musNotice.type);
                C1720106oR.LIZ("NotificationChunkVM", C2188811AlT.LIZIZ(sbLIZ));
                listIterator.remove();
            }
            if (linkedHashMap.get(Long.valueOf(musNotice.getUniqueId())) != null) {
                musNotice.hackUniqueId(musNotice.getUniqueId() + ((long) i));
                i = (i * 31) + 1;
            }
            linkedHashMap.put(Long.valueOf(musNotice.getUniqueId()), musNotice);
        }
    }

    public final void BQ2(EnumC1242330iQx enumC1242330iQx) {
        List<C1242250iQp> list;
        this.LLJIJIL = enumC1242330iQx;
        LiveData liveData = (LiveData) this.LLJILJILJ.getValue();
        if (enumC1242330iQx == EnumC1242330iQx.COLLAPSE) {
            list = this.LLJILJIL.LIZIZ;
        } else {
            list = this.LLJILJIL.LIZ;
        }
        liveData.setValue(list);
    }

    public final String wQ2(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", style:");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(", data:");
        sbLIZ.append(this.LLJILJIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final synchronized void AQ2(NoticeListsResponse noticeListsResponse, boolean z) {
        NoticeItems next;
        boolean z2;
        C1242410iR5 c1242410iR5;
        List listSubList;
        List<NoticeItems> notices = noticeListsResponse.getNotices();
        final int i = 1;
        if (notices != null) {
            Iterator<NoticeItems> it2 = notices.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.group == this.LLIZLLLIL.LIZ) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NoticeItems noticeItems = next;
            if (noticeItems != null) {
                C1242280iQs c1242280iQs = new C1242280iQs(0);
                c1242280iQs.LIZLLL = noticeItems.hasMore;
                c1242280iQs.LJ = noticeItems.maxTime;
                c1242280iQs.LJFF = noticeItems.minTime;
                if (!z) {
                    c1242280iQs.LIZJ.addAll(this.LLJILJIL.LIZJ);
                }
                List<MusNotice> list = c1242280iQs.LIZJ;
                Collection<? extends MusNotice> collection = noticeItems.items;
                if (collection == null) {
                    collection = C13BV.INSTANCE;
                }
                list.addAll(collection);
                xQ2(c1242280iQs.LIZJ);
                if (c1242280iQs.LIZJ.isEmpty()) {
                    this.LLJILJIL = c1242280iQs;
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("processResp empty, isRefresh:");
                    sbLIZ.append(z);
                    C1720106oR.LIZ("NotificationChunkVM", wQ2(C2188811AlT.LIZIZ(sbLIZ)));
                    return;
                }
                if (c1242280iQs.LIZJ.size() > 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                List<C1242250iQp> list2 = c1242280iQs.LIZIZ;
                if (z2) {
                    C1242290iQt c1242290iQt = this.LLIZLLLIL;
                    c1242410iR5 = new C1242410iR5(c1242290iQt.LIZJ, c1242290iQt.LIZLLL, zQ2());
                } else {
                    c1242410iR5 = new C1242410iR5(this.LLIZLLLIL.LIZJ, null, null);
                }
                list2.add(c1242410iR5);
                c1242280iQs.LIZ.add(new C1242410iR5(this.LLIZLLLIL.LIZJ, null, null));
                ArrayList arrayList = new ArrayList();
                Iterator<MusNotice> it3 = c1242280iQs.LIZJ.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new C1242230iQn(it3.next(), this.LLIZLLLIL.LIZIZ, i));
                    i++;
                }
                List<C1242250iQp> list3 = c1242280iQs.LIZIZ;
                if (z2) {
                    listSubList = arrayList.subList(0, 2);
                } else {
                    listSubList = arrayList;
                }
                list3.addAll(listSubList);
                c1242280iQs.LIZ.addAll(arrayList);
                if (c1242280iQs.LIZLLL) {
                    c1242280iQs.LIZ.add(new C1242250iQp(i) { // from class: X.0iR6
                    });
                }
                this.LLJILJIL = c1242280iQs;
                return;
            }
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("processResp invalid, isRefresh:");
        sbLIZ2.append(z);
        C1720106oR.LIZ("NotificationChunkVM", wQ2(C2188811AlT.LIZIZ(sbLIZ2)));
    }

    public NotificationChunkVM(C1242290iQt c1242290iQt, EnumC1242370iR1 enumC1242370iR1, NextLiveData<EnumC1242340iQy> nextLiveData) {
        this.LLIZLLLIL = c1242290iQt;
        this.LLJ = enumC1242370iR1;
        this.LLJI = nextLiveData;
    }
}
