package com.ss.android.ugc.aweme.notification.model;

import X.AbstractC1255880imo;
import X.AbstractC2098408Jy;
import X.C086I;
import X.C08XD;
import X.C098200Yq;
import X.C0XIR;
import X.C13LP;
import X.C13LZ;
import X.C15438062q;
import X.C189200o6;
import X.C1902590zbt;
import X.C1904270zeb;
import X.C1908260zl2;
import X.C1908300zl6;
import X.C20085613iQ;
import X.C793770VBv;
import X.InterfaceC1294060jmO;
import X.InterfaceC1526205yG;
import android.os.Message;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MessageItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.UnsubscribeSettingMetadata;
import com.ss.android.ugc.aweme.notification.bean.LiveNoticeMessageResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
@InterfaceC1294060jmO
public final class MusNewNotificationModel extends AbstractC1255880imo<MusNotice, MessageResponse> {
    public static final int $stable = 8;
    public final List<NoticeItems> collapseNotices;
    public int currentType;
    public String lastGroupApiLogId;
    public final MutableLiveData<NoticeCombineDatas> liveData;
    public final Map<Integer, List<MusNotice>> mDataMap;
    public boolean mHasMore;
    public long mLastReadTime;
    public long mMaxTime;
    public long mMinTime;
    public int mTotal;
    public UnsubscribeSettingMetadata unsubscribeSetting;
    public final MutableLiveData<LiveNoticeMessageResponse> updateLiveData;

    @Override // X.AbstractC1255880imo
    public List<MusNotice> getItems() {
        return getItemsFromGroup(this.currentType);
    }

    public MusNewNotificationModel() {
        int i = C1904270zeb.LIZ;
        this.currentType = C1904270zeb.LIZJ;
        this.mDataMap = new LinkedHashMap();
        this.liveData = new MutableLiveData<>();
        this.updateLiveData = new MutableLiveData<>();
        this.collapseNotices = new ArrayList();
    }

    public final String getLastGroupApiLogId() {
        return this.lastGroupApiLogId;
    }

    public final MutableLiveData<NoticeCombineDatas> getLiveData() {
        return this.liveData;
    }

    public final int getTotal() {
        return this.mTotal;
    }

    public final UnsubscribeSettingMetadata getUnsubscribeSetting() {
        return this.unsubscribeSetting;
    }

    public final MutableLiveData<LiveNoticeMessageResponse> getUpdateLiveData() {
        return this.updateLiveData;
    }

    @Override // X.AbstractC1255880imo
    public boolean isHasMore() {
        return this.mHasMore;
    }

    private final void handleCombineResponse(Message message) {
        List<NoticeItems> notices;
        if (message != null && (HandlerHook.getMessageObj(message.obj) instanceof NoticeListsResponse)) {
            NoticeListsResponse noticeListsResponse = (NoticeListsResponse) HandlerHook.getMessageObj(message.obj);
            List<NoticeItems> list = this.collapseNotices;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<NoticeItems> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(it2.next().group));
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            List<NoticeItems> collapseNotices = noticeListsResponse.getCollapseNotices();
            if (collapseNotices != null) {
                ArrayList arrayList3 = new ArrayList();
                for (NoticeItems noticeItems : collapseNotices) {
                    if (!arrayList2.contains(Integer.valueOf(noticeItems.group))) {
                        arrayList3.add(noticeItems);
                    }
                }
                this.collapseNotices.addAll(arrayList3);
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(Integer.valueOf(((NoticeItems) it3.next()).group));
                }
                arrayList2.addAll(arrayList4);
            }
            int i = message.what;
            int i2 = C1904270zeb.LIZ;
            NoticeItems noticeItems2 = null;
            if (i == C1904270zeb.LIZJ) {
                if (this.mListQueryType == 1 && (notices = noticeListsResponse.getNotices()) != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (NoticeItems noticeItems3 : notices) {
                        int i3 = noticeItems3.group;
                        int i4 = C1904270zeb.LIZ;
                        if (i3 != C1904270zeb.LIZJ) {
                            arrayList5.add(noticeItems3);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj : arrayList5) {
                        if (!arrayList2.contains(Integer.valueOf(((NoticeItems) obj).group))) {
                            arrayList6.add(obj);
                        }
                    }
                    this.collapseNotices.addAll(arrayList6);
                }
                List<NoticeItems> notices2 = noticeListsResponse.getNotices();
                if (notices2 != null) {
                    Iterator<NoticeItems> it4 = notices2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        NoticeItems next = it4.next();
                        if (next.group == message.what) {
                            noticeItems2 = next;
                            break;
                        }
                    }
                    noticeItems2 = noticeItems2;
                }
            } else {
                List<NoticeItems> notices3 = noticeListsResponse.getNotices();
                if (notices3 != null) {
                    Iterator<NoticeItems> it5 = notices3.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        NoticeItems next2 = it5.next();
                        if (next2.group == message.what) {
                            noticeItems2 = next2;
                            break;
                        }
                    }
                    noticeItems2 = noticeItems2;
                }
            }
            message.obj = new MessageResponse(new MessageItem(noticeItems2), noticeListsResponse.getLobPb());
            this.unsubscribeSetting = noticeListsResponse.getUnsubscribeSetting();
        }
    }

    private final void handleExtractLogId(Message message) {
        this.lastGroupApiLogId = null;
        try {
            this.lastGroupApiLogId = ((BaseResponse) HandlerHook.getMessageObj(message.obj)).extra.logid;
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        try {
            this.lastGroupApiLogId = ((BaseResponse) ((C0XIR) HandlerHook.getMessageObj(message.obj)).getRawResponse()).extra.logid;
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    private final void sortByTime(List<MusNotice> list) {
        if (C086I.LIZIZ(list)) {
            return;
        }
        C08XD.LJJ(list, new Comparator() { // from class: com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel.sortByTime.1
            @Override // java.util.Comparator
            public final int compare(MusNotice musNotice, MusNotice musNotice2) {
                long j = musNotice2.createTime - musNotice.createTime;
                if (j > 0) {
                    return 1;
                }
                if (j < 0) {
                    return -1;
                }
                return 0;
            }
        });
    }

    @InterfaceC1294060jmO
    private final void tryChangePositionForce(int i) {
        List<MusNotice> itemsFromGroup;
        Integer next;
        int i2 = C1904270zeb.LIZ;
        if (i == C1904270zeb.LIZJ && (itemsFromGroup = getItemsFromGroup(i)) != null && !itemsFromGroup.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it2 = C13LZ.LJIIIZ(itemsFromGroup.size() - 1, 0).iterator();
            while (it2.hasNext()) {
                int iNextInt = ((AbstractC2098408Jy) it2).nextInt();
                if (((BaseNotice) ListProtector.get(itemsFromGroup, iNextInt)).needForceInsert()) {
                    arrayList.add(ListProtector.get(itemsFromGroup, iNextInt));
                    ListProtector.remove(itemsFromGroup, iNextInt);
                }
            }
            if (arrayList.size() > 1) {
                C08XD.LJJ(arrayList, new Comparator() { // from class: com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel$tryChangePositionForce$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return C20085613iQ.LIZIZ(Integer.valueOf(((BaseNotice) t).lowestPosition), Integer.valueOf(((BaseNotice) t2).lowestPosition));
                    }
                });
            }
            Iterator<Integer> it3 = C13LZ.LJIILJJIL(0, arrayList.size()).iterator();
            while (it3.hasNext()) {
                BaseNotice baseNotice = (BaseNotice) ListProtector.get(arrayList, ((AbstractC2098408Jy) it3).nextInt());
                int iMin = Math.min(baseNotice.lowestPosition - 1, itemsFromGroup.size());
                Iterator<Integer> it4 = C13LZ.LJIILJJIL(0, iMin).iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next = it4.next();
                        int iIntValue = next.intValue();
                        if (((BaseNotice) ListProtector.get(itemsFromGroup, iIntValue)).lowestPosition == 0 && ((BaseNotice) ListProtector.get(itemsFromGroup, iIntValue)).createTime < baseNotice.createTime) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Integer num = next;
                if (num != null) {
                    iMin = num.intValue();
                }
                ListProtector.add(itemsFromGroup, iMin, baseNotice);
            }
        }
    }

    @Override // X.AbstractC666100QAu
    public boolean checkParams(Object... objArr) {
        if (objArr.length <= 5) {
            return true;
        }
        return false;
    }

    public final List<MusNotice> getItemsFromGroup(int i) {
        List<MusNotice> list = this.mDataMap.get(Integer.valueOf(i));
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.mDataMap.put(Integer.valueOf(i), arrayList);
            return arrayList;
        }
        return list;
    }

    @Override // X.AbstractC666100QAu, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) throws JSONException {
        BaseResponse baseResponse;
        String string;
        Exception exc;
        this.mIsLoading = false;
        if (message == null) {
            return;
        }
        Object messageObj = HandlerHook.getMessageObj(message.obj);
        if (messageObj instanceof BaseResponse) {
            baseResponse = (BaseResponse) messageObj;
        } else {
            baseResponse = null;
        }
        AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(baseResponse, 183);
        C1908260zl2 c1908260zl2 = C1908300zl6.LIZ;
        if (c1908260zl2 != null) {
            awS607S0100000_28.invoke(c1908260zl2);
        }
        handleExtractLogId(message);
        if (HandlerHook.getMessageObj(message.obj) instanceof Exception) {
            HandlerHook.getMessageObj(message.obj);
            List<InterfaceC1526205yG> list = this.mNotifyListeners;
            if (list != null) {
                Iterator<InterfaceC1526205yG> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().onFailed((Exception) HandlerHook.getMessageObj(message.obj));
                }
            }
            C1902590zbt.LIZ(message.what, null, HandlerHook.getMessageObj(message.obj).toString());
            return;
        }
        int i = message.what;
        Long l = C1902590zbt.LIZ;
        if (l != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            Integer numValueOf = Integer.valueOf(i);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("notice_duration_type", "notice_type_list_net");
            jSONObject.put("notice_duration", jCurrentTimeMillis);
            if (numValueOf != null) {
                jSONObject.put("notice_group", numValueOf.intValue());
            }
            C793770VBv.LJII("notice_monitor_list_duration", null, null, jSONObject);
        }
        C1902590zbt.LIZ = null;
        handleCombineResponse(message);
        if (!(HandlerHook.getMessageObj(message.obj) instanceof MessageResponse)) {
            List<InterfaceC1526205yG> list2 = this.mNotifyListeners;
            if (list2 != null) {
                for (InterfaceC1526205yG interfaceC1526205yG : list2) {
                    Object messageObj2 = HandlerHook.getMessageObj(message.obj);
                    if (messageObj2 instanceof Exception) {
                        exc = (Exception) messageObj2;
                    } else {
                        exc = null;
                    }
                    interfaceC1526205yG.onFailed(exc);
                }
            }
            int i2 = message.what;
            Object messageObj3 = HandlerHook.getMessageObj(message.obj);
            if (messageObj3 != null) {
                string = messageObj3.toString();
            } else {
                string = null;
            }
            C1902590zbt.LIZ(i2, null, string);
            return;
        }
        if (message.what == this.currentType) {
            handleData((MessageResponse) HandlerHook.getMessageObj(message.obj), message.what, true);
            List<InterfaceC1526205yG> list3 = this.mNotifyListeners;
            if (list3 != null) {
                Iterator<InterfaceC1526205yG> it3 = list3.iterator();
                while (it3.hasNext()) {
                    it3.next().onSuccess();
                }
                return;
            }
            return;
        }
        handleData((MessageResponse) HandlerHook.getMessageObj(message.obj), message.what, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    @Override // X.AbstractC1255880imo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void loadMoreList(java.lang.Object... r15) {
        /*
            r14 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.C1902590zbt.LIZ = r0
            r13 = 1
            r0 = r15[r13]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r7 = r0.intValue()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MultiNotice r6 = new com.ss.android.ugc.aweme.notice.repo.list.bean.MultiNotice
            long r8 = r14.mMaxTime
            long r10 = r14.mMinTime
            r5 = 0
            r12 = 20
            r6.<init>(r7, r8, r10, r12, r13)
            int r0 = r15.length
            r2 = 4
            r4 = 0
            if (r0 < r2) goto L60
            r0 = 3
            r1 = r15[r0]
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 != 0) goto L31
            r1 = r5
        L31:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L60
        L39:
            r6.mayWithMergedTTShopArg(r13)
            r3.add(r6)
            int r1 = r15.length
            r0 = 5
            if (r1 < r0) goto L51
            r1 = r15[r2]
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L51
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L51
            int r4 = r1.intValue()
        L51:
            X.1BVK r2 = X.C1BVK.LIZIZ()
            com.bytedance.common.utility.collection.WeakHandler r1 = r14.mHandler
            com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel$loadMoreList$1 r0 = new com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel$loadMoreList$1
            r0.<init>()
            r2.LIZ(r1, r0, r7)
            return
        L60:
            r13 = 0
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel.loadMoreList(java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    @Override // X.AbstractC1255880imo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void refreshList(java.lang.Object... r15) {
        /*
            r14 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.C1902590zbt.LIZ = r0
            r13 = 1
            r0 = r15[r13]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r7 = r0.intValue()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MultiNotice r6 = new com.ss.android.ugc.aweme.notice.repo.list.bean.MultiNotice
            r5 = 0
            r8 = 0
            r12 = 20
            r10 = r8
            r6.<init>(r7, r8, r10, r12, r13)
            int r0 = r15.length
            r4 = 0
            r2 = 4
            if (r0 < r2) goto L5f
            r0 = 3
            r1 = r15[r0]
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 != 0) goto L30
            r1 = r5
        L30:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L5f
        L38:
            r6.mayWithMergedTTShopArg(r13)
            r3.add(r6)
            int r1 = r15.length
            r0 = 5
            if (r1 < r0) goto L50
            r1 = r15[r2]
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L50
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L50
            int r4 = r1.intValue()
        L50:
            X.1BVK r2 = X.C1BVK.LIZIZ()
            com.bytedance.common.utility.collection.WeakHandler r1 = r14.mHandler
            com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel$refreshList$1 r0 = new com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel$refreshList$1
            r0.<init>()
            r2.LIZ(r1, r0, r7)
            return
        L5f:
            r13 = 0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel.refreshList(java.lang.Object[]):void");
    }

    public final void setCurrentNoticeGroup(int i) {
        this.collapseNotices.clear();
        this.currentType = i;
    }

    public final void setUnsubscribeSetting(UnsubscribeSettingMetadata unsubscribeSettingMetadata) {
        this.unsubscribeSetting = unsubscribeSettingMetadata;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleCombineData(int i, NoticeItems noticeItems, List<MusNotice> list) {
        BaseNotice baseNotice;
        BaseNotice baseNotice2;
        if (noticeItems != null && noticeItems.hasMore) {
            Iterator<NoticeItems> it2 = this.collapseNotices.iterator();
            while (it2.hasNext()) {
                NoticeItems next = it2.next();
                List<? extends MusNotice> list2 = next.items;
                if (list2 != null && (baseNotice2 = (BaseNotice) C13LP.LJJJLL(list2)) != null && (baseNotice2.createTime >= noticeItems.maxTime || (next.listType == 2 && !baseNotice2.hasRead))) {
                    list.add(baseNotice2);
                    baseNotice2.noticeListType = next.listType;
                    GeneralTemplateNotice generalTemplateNotice = baseNotice2.templateNotice;
                    if (generalTemplateNotice != null) {
                        generalTemplateNotice.LIZ = next.group;
                    }
                    it2.remove();
                }
            }
            return;
        }
        for (NoticeItems noticeItems2 : this.collapseNotices) {
            List<? extends MusNotice> list3 = noticeItems2.items;
            if (list3 != null && (baseNotice = (BaseNotice) C13LP.LJJJLL(list3)) != null) {
                list.add(baseNotice);
                baseNotice.noticeListType = noticeItems2.listType;
                GeneralTemplateNotice generalTemplateNotice2 = baseNotice.templateNotice;
                if (generalTemplateNotice2 != null) {
                    generalTemplateNotice2.LIZ = noticeItems2.group;
                }
            }
        }
        this.collapseNotices.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void handleData(MessageResponse messageResponse, int i, boolean z) throws JSONException {
        String imprId;
        String str;
        LogPbBean mLogPbBean;
        MessageItem item;
        boolean z2;
        NoticeItems noticeItems;
        List<? extends MusNotice> list;
        NoticeItems noticeItems2;
        NoticeItems noticeItems3;
        LogPbBean mLogPbBean2;
        MessageItem item2;
        NoticeItems noticeItems4;
        List<? extends MusNotice> list2;
        long j;
        NoticeItems noticeItems5;
        NoticeItems noticeItems6;
        NoticeItems noticeItems7;
        LogPbBean mLogPbBean3;
        NoticeItems noticeItems8 = null;
        imprId = null;
        String imprId2 = null;
        NoticeItems noticeItems9 = null;
        imprId = null;
        String imprId3 = null;
        if (messageResponse == null || messageResponse.status_code != 0) {
            if (messageResponse != null && (mLogPbBean = messageResponse.getMLogPbBean()) != null) {
                imprId = mLogPbBean.getImprId();
            } else {
                imprId = null;
                if (messageResponse == null) {
                    str = null;
                }
                C1902590zbt.LIZ(i, imprId, str);
            }
            str = messageResponse.status_msg;
            C1902590zbt.LIZ(i, imprId, str);
        }
        if (messageResponse == null) {
            List<NoticeItems> list3 = this.collapseNotices;
            if (list3 != null && !list3.isEmpty()) {
                item = null;
            } else {
                this.mIsNewDataEmpty = true;
                return;
            }
        } else {
            item = messageResponse.getItem();
        }
        List<NoticeItems> list4 = this.collapseNotices;
        if ((list4 == null || list4.isEmpty()) && (item == null || (noticeItems = item.notices) == null || (list = noticeItems.items) == null || list.isEmpty())) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mIsNewDataEmpty = z2;
        int i2 = this.mListQueryType;
        if (i2 == 1) {
            if (z2) {
                if (item != null && (noticeItems7 = item.notices) != null && noticeItems7.hasMore) {
                    if (messageResponse != null && (mLogPbBean3 = messageResponse.getMLogPbBean()) != null) {
                        imprId2 = mLogPbBean3.getImprId();
                    }
                    C1902590zbt.LIZ(i, imprId2, "hasMore = true but data is Empty");
                }
                getItemsFromGroup(i).clear();
                return;
            }
            List<MusNotice> itemsFromGroup = getItemsFromGroup(i);
            if (item != null && (noticeItems6 = item.notices) != null) {
                j = noticeItems6.lastReadTime;
            } else {
                j = 0;
            }
            this.mLastReadTime = j;
            itemsFromGroup.clear();
            if (item != null) {
                noticeItems9 = item.notices;
            }
            handleCombineData(i, noticeItems9, itemsFromGroup);
            if (item != null && (noticeItems5 = item.notices) != null) {
                Iterator it2 = getItems().iterator();
                while (it2.hasNext()) {
                    ((BaseNotice) it2.next()).lastReadTime = this.mLastReadTime;
                }
                if (z) {
                    this.mHasMore = noticeItems5.hasMore;
                    this.mMaxTime = noticeItems5.maxTime;
                    this.mMinTime = noticeItems5.minTime;
                    this.mTotal = noticeItems5.total;
                }
                Collection<? extends MusNotice> collection = noticeItems5.items;
                if (collection != null) {
                    itemsFromGroup.addAll(collection);
                }
            }
            Iterator<MusNotice> it3 = itemsFromGroup.iterator();
            while (it3.hasNext()) {
                it3.next().lastReadTime = this.mLastReadTime;
            }
        } else if (i2 == 4) {
            if (z2) {
                if (item != null && (noticeItems3 = item.notices) != null && noticeItems3.hasMore) {
                    if (messageResponse != null && (mLogPbBean2 = messageResponse.getMLogPbBean()) != null) {
                        imprId3 = mLogPbBean2.getImprId();
                    }
                    C1902590zbt.LIZ(i, imprId3, "hasMore = true but data is Empty");
                }
                if (z) {
                    this.mHasMore = false;
                    return;
                }
                return;
            }
            List<MusNotice> itemsFromGroup2 = getItemsFromGroup(i);
            if (item != null) {
                noticeItems8 = item.notices;
            }
            handleCombineData(i, noticeItems8, itemsFromGroup2);
            if (item != null && (noticeItems2 = item.notices) != null) {
                if (z) {
                    this.mHasMore = noticeItems2.hasMore;
                    this.mMaxTime = noticeItems2.maxTime;
                    this.mMinTime = noticeItems2.minTime;
                    this.mTotal = noticeItems2.total;
                }
                Iterator it4 = getItems().iterator();
                while (it4.hasNext()) {
                    ((BaseNotice) it4.next()).lastReadTime = this.mLastReadTime;
                }
                List<? extends MusNotice> list5 = noticeItems2.items;
                if (list5 != null) {
                    if (i == C1904270zeb.LIZJ) {
                        ArrayList<BaseNotice> arrayList = new ArrayList();
                        for (MusNotice musNotice : list5) {
                            MusNotice musNotice2 = musNotice;
                            if (!(itemsFromGroup2 instanceof Collection) || !itemsFromGroup2.isEmpty()) {
                                Iterator it5 = itemsFromGroup2.iterator();
                                while (it5.hasNext()) {
                                    if (Intrinsics.LJFF(((BaseNotice) it5.next()).nid, musNotice2.nid)) {
                                        break;
                                    }
                                }
                            }
                            arrayList.add(musNotice);
                        }
                        for (BaseNotice baseNotice : arrayList) {
                            int i3 = baseNotice.type;
                            if (i3 != 1 && i3 != 2) {
                                itemsFromGroup2.add(baseNotice);
                            } else {
                                Iterator it6 = itemsFromGroup2.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        if (baseNotice.type == ((BaseNotice) it6.next()).type) {
                                            break;
                                        }
                                    } else {
                                        itemsFromGroup2.add(baseNotice);
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        for (MusNotice musNotice3 : list5) {
                            MusNotice musNotice4 = musNotice3;
                            if (!(itemsFromGroup2 instanceof Collection) || !itemsFromGroup2.isEmpty()) {
                                Iterator it7 = itemsFromGroup2.iterator();
                                while (it7.hasNext()) {
                                    if (Intrinsics.LJFF(((BaseNotice) it7.next()).nid, musNotice4.nid)) {
                                        break;
                                    }
                                }
                            }
                            arrayList2.add(musNotice3);
                        }
                        Iterator it8 = arrayList2.iterator();
                        while (it8.hasNext()) {
                            itemsFromGroup2.add(it8.next());
                        }
                    }
                }
            }
        }
        if (messageResponse != null && (item2 = messageResponse.getItem()) != null && (noticeItems4 = item2.notices) != null && (list2 = noticeItems4.items) != null) {
            Iterator<? extends MusNotice> it9 = list2.iterator();
            while (it9.hasNext()) {
                it9.next().logPbBean = messageResponse.getMLogPbBean();
            }
        }
        sortByTime(getItemsFromGroup(i));
    }
}
