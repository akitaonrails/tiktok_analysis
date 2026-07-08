package com.ss.android.ugc.aweme.notification.banner.protocol;

import X.C098200Yq;
import X.C0PEM;
import X.C1227904rF;
import X.C13IQ;
import X.C13LE;
import X.C1411190mpJ;
import X.C1421930n6d;
import X.C1421950n6f;
import X.C1466920oHC;
import X.C1558520qew;
import X.C189200o6;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C593260NOq;
import X.C624370OeJ;
import X.C786410Ut5;
import X.EnumC637310OzB;
import X.InterfaceC1554640qYg;
import X.InterfaceC1891350zJl;
import X.InterfaceC494301wD;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.im.common.model.IMFromMessageTips;
import com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxBannerWidgetAbility;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes23.dex */
public final class InboxRecommendGroupBannerAssem extends InboxBannerCustomAssem implements InboxAbilityCenter$IInboxBannerWidgetAbility.IRecommendCreateGroupBannerAbility, InterfaceC1554640qYg {
    public C1421950n6f LLILZ = new C1421950n6f(new AwS566S0100000_22(this, 229), 95);
    public boolean LLILZIL;

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1558520qew.LJI(this, InboxFragmentScope.class, this, InboxAbilityCenter$IInboxBannerWidgetAbility.IRecommendCreateGroupBannerAbility.class, null, null);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -601125816) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final void lo(RecyclerView.ViewHolder viewHolder) {
        if (!this.LLILZIL) {
            C593260NOq.LIZ("show", this.LLILZ.LLIZ);
            this.LLILZIL = true;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()).plus(new C1466920oHC(CoroutineExceptionHandler.LJJLIL, 0))), null, null, new C1411190mpJ(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxBannerWidgetAbility.IRecommendCreateGroupBannerAbility
    public final void wx2(IMNoticeMsgStruct iMNoticeMsgStruct) {
        Object c098200Yq;
        String str;
        Pair pair;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateBanner onCall, notice: ");
        sbLIZ.append(iMNoticeMsgStruct);
        C624370OeJ.LIZ("inbox_recommend_new_group_banner", C2188811AlT.LIZIZ(sbLIZ));
        C2252321DDq c2252321DDq = this.LL;
        String str2 = "";
        if (iMNoticeMsgStruct == null) {
            C624370OeJ.LIZ("inbox_recommend_new_group_banner", "canShowNotice: notice is null");
        } else {
            try {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                String str3 = iMNoticeMsgStruct.msgContent.extras.get("event_tracking_fields_map");
                if (str3 == null) {
                    str3 = "";
                }
                Type type = new TypeToken<Map<String, ? extends String>>() { // from class: X.04Y9
                }.getType();
                c1227904rF.getClass();
                c098200Yq = (Map) C1227904rF.LIZJ(str3, type);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Map mapLJ = C2097608Jq.LJ();
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = mapLJ;
            }
            Map map = (Map) c098200Yq;
            C1421950n6f c1421950n6f = this.LLILZ;
            String str4 = iMNoticeMsgStruct.noticeCode;
            if (str4 == null) {
                str4 = "";
            }
            IMFromMessageTips iMFromMessageTips = iMNoticeMsgStruct.msgContent;
            String str5 = iMFromMessageTips.extras.get("schema_url");
            if (str5 == null) {
                str5 = "";
            }
            String str6 = iMNoticeMsgStruct.msgContent.extras.get("recom_id");
            if (str6 == null) {
                str6 = "";
            }
            String str7 = iMNoticeMsgStruct.msgContent.extras.get("cover_url");
            if (str7 != null) {
                str2 = str7;
            }
            this.LLILZ = new C1421950n6f(str4, iMFromMessageTips, str5, str2, str6, c1421950n6f.LLILZLL, map);
            if (a0.LJJJIL(str4)) {
                C624370OeJ.LIZ("inbox_recommend_new_group_banner", "canShowNotice: noticeCode is empty");
            } else {
                IMFromMessageTips iMFromMessageTips2 = this.LLILZ.LLILLJJLI;
                if (iMFromMessageTips2 != null && (str = iMFromMessageTips2.tips) != null && !a0.LJJJIL(str)) {
                    if (a0.LJJJIL(this.LLILZ.LLILLL)) {
                        C624370OeJ.LIZ("inbox_recommend_new_group_banner", "canShowNotice: schemaUrl is empty");
                    } else if (a0.LJJJIL(this.LLILZ.LLILZIL)) {
                        C624370OeJ.LIZ("inbox_recommend_new_group_banner", "canShowNotice: redId is empty");
                    } else {
                        pair = new Pair(EnumC637310OzB.TOP_SHOW, this.LLILZ);
                        c2252321DDq.setValue(pair);
                    }
                } else {
                    C624370OeJ.LIZ("inbox_recommend_new_group_banner", "canShowNotice: tip is empty");
                }
            }
        }
        pair = new Pair(EnumC637310OzB.DISMISS, null);
        c2252321DDq.setValue(pair);
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final RecyclerView.ViewHolder ko(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C1421950n6f.class))) {
            return new C1421930n6d(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a_5, viewGroup, false));
        }
        return null;
    }
}
