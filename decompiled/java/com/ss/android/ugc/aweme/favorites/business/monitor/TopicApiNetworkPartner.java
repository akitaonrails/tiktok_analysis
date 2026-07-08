package com.ss.android.ugc.aweme.favorites.business.monitor;

import X.AbstractC1604130rqV;
import X.C01GW;
import X.C098200Yq;
import X.C0O4Z;
import X.C0X52;
import X.C0XIR;
import X.C15438062q;
import X.C189200o6;
import X.C2188811AlT;
import X.C23112093u;
import X.C452501pT;
import android.net.Uri;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.topic.book.detail.api.BookDetailResp;
import com.ss.android.ugc.aweme.topic.book.detail.api.BookVideosResp;
import com.ss.android.ugc.aweme.topic.book.favorite.api.BookCollectionListResponse;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final class TopicApiNetworkPartner implements NetworkPartner.Bystander {
    public final C01GW LIZ = C452501pT.LIZIZ(new C0O4Z());

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LIZLLL(C0X52<?> c0x52) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJI(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJ(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void onException(Throwable th) {
    }

    public final void LIZIZ(String str, C0X52<?> c0x52, Throwable th) {
        int errorCode;
        String strValueOf;
        if (c0x52 != null) {
            errorCode = c0x52.LIZ.LIZIZ;
        } else {
            if (th != null) {
                if (th instanceof C0XIR) {
                    errorCode = ((C23112093u) th).getErrorCode();
                } else {
                    errorCode = -1002;
                }
                if (th instanceof C0XIR) {
                    strValueOf = ((C0XIR) th).getErrorMsg();
                } else {
                    strValueOf = String.valueOf(th.getCause());
                }
                AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LIZ.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TopicApiNetworkPartner path: ");
                sbLIZ.append(str);
                sbLIZ.append(", statusCode: ");
                sbLIZ.append(errorCode);
                sbLIZ.append(", statusMsg: ");
                sbLIZ.append(strValueOf);
                abstractC1604130rqV.LJ(C2188811AlT.LIZIZ(sbLIZ));
            }
            errorCode = -1001;
        }
        strValueOf = "unknown";
        AbstractC1604130rqV abstractC1604130rqV2 = (AbstractC1604130rqV) this.LIZ.getValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("TopicApiNetworkPartner path: ");
        sbLIZ2.append(str);
        sbLIZ2.append(", statusCode: ");
        sbLIZ2.append(errorCode);
        sbLIZ2.append(", statusMsg: ");
        sbLIZ2.append(strValueOf);
        abstractC1604130rqV2.LJ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJJI(Request request, C0X52<?> c0x52, Throwable th) {
        Object obj;
        ArrayList arrayList;
        Integer numValueOf;
        Integer numValueOf2;
        ArrayList arrayList2;
        if (c0x52 == null) {
            obj = null;
        } else {
            try {
                obj = c0x52.LIZIZ;
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        String path = request.getPath();
        if (path != null) {
            int iHashCode = path.hashCode();
            try {
                if (iHashCode != -568772806) {
                    if (iHashCode != 1174723766) {
                        if (iHashCode == 1743070870 && path.equals("/tiktok/topic/book/itemlist/v1/")) {
                            if (obj instanceof BookVideosResp) {
                                String str = ((BookVideosResp) obj).pageExtra;
                                List<Aweme> list = ((BookVideosResp) obj).awemeList;
                                boolean z = ((BookVideosResp) obj).hasMore;
                                if (list != null) {
                                    numValueOf2 = Integer.valueOf(list.size());
                                    arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                                    Iterator<Aweme> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(it2.next().getAid());
                                    }
                                } else {
                                    numValueOf2 = null;
                                    arrayList2 = null;
                                }
                                Uri uri = UriProtector.parse(request.getUrl());
                                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "book_id");
                                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "count");
                                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "page_extra");
                                ((AbstractC1604130rqV) this.LIZ.getValue()).LJ("TopicApiNetworkPartner path: " + path + ", statusCode: " + ((BookVideosResp) obj).status_code + ", statusMsg: " + ((BookVideosResp) obj).status_msg + ", logId: " + ((BookVideosResp) obj).extra.logid + ", req {bookId: " + strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter + ", count: " + strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 + ", pageExtra: " + strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 + "}, res {pageExtra: " + str + ", hasmore: " + z + ", length: " + numValueOf2 + ", archiveIDList: " + arrayList2 + '}');
                            } else {
                                LIZIZ(path, c0x52, th);
                            }
                        }
                    } else if (path.equals("/tiktok/topic/book/detail/v1/")) {
                        if (obj instanceof BookDetailResp) {
                            boolean z2 = ((BookDetailResp) obj).isCollected;
                            String str2 = ((BookDetailResp) obj).detail.title;
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(request.getUrl()), "book_id");
                            AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LIZ.getValue();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("TopicApiNetworkPartner path: ");
                            sbLIZ.append(path);
                            sbLIZ.append(", statusCode: ");
                            sbLIZ.append(((BookDetailResp) obj).status_code);
                            sbLIZ.append(", statusMsg: ");
                            sbLIZ.append(((BookDetailResp) obj).status_msg);
                            sbLIZ.append(", logId: ");
                            sbLIZ.append(((BookDetailResp) obj).extra.logid);
                            sbLIZ.append(", req {bookId: ");
                            sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                            sbLIZ.append("}, res {title: ");
                            sbLIZ.append(str2);
                            sbLIZ.append(", isCollected: ");
                            sbLIZ.append(z2);
                            sbLIZ.append('}');
                            abstractC1604130rqV.LJ(C2188811AlT.LIZIZ(sbLIZ));
                        } else {
                            LIZIZ(path, c0x52, th);
                        }
                    }
                } else if (path.equals("/tiktok/topic/book/collections/v1/")) {
                    if (obj instanceof BookCollectionListResponse) {
                        long j = ((BookCollectionListResponse) obj).cursor;
                        List<TopicRawInfo> list2 = ((BookCollectionListResponse) obj).bookList;
                        boolean z3 = ((BookCollectionListResponse) obj).hasMore;
                        if (list2 != null) {
                            numValueOf = Integer.valueOf(list2.size());
                            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                            Iterator<TopicRawInfo> it3 = list2.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(it3.next().id);
                            }
                        } else {
                            arrayList = null;
                            numValueOf = null;
                        }
                        Uri uri2 = UriProtector.parse(request.getUrl());
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "cursor");
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "count");
                        AbstractC1604130rqV abstractC1604130rqV2 = (AbstractC1604130rqV) this.LIZ.getValue();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("TopicApiNetworkPartner path: ");
                        sbLIZ2.append(path);
                        sbLIZ2.append(", statusCode: ");
                        sbLIZ2.append(((BookCollectionListResponse) obj).status_code);
                        sbLIZ2.append(", statusMsg: ");
                        sbLIZ2.append(((BookCollectionListResponse) obj).status_msg);
                        sbLIZ2.append(", logId: ");
                        sbLIZ2.append(((BookCollectionListResponse) obj).extra.logid);
                        sbLIZ2.append(", req {cursur: ");
                        sbLIZ2.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5);
                        sbLIZ2.append(", count: ");
                        sbLIZ2.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6);
                        sbLIZ2.append("}, res {cursur: ");
                        sbLIZ2.append(j);
                        sbLIZ2.append(", hasmore: ");
                        sbLIZ2.append(z3);
                        sbLIZ2.append(", length: ");
                        sbLIZ2.append(numValueOf);
                        sbLIZ2.append(", archiveIDList: ");
                        sbLIZ2.append(arrayList);
                        sbLIZ2.append('}');
                        abstractC1604130rqV2.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                    } else {
                        LIZIZ(path, c0x52, th);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
    }
}
