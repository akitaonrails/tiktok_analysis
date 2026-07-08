package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ChangeLocationData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressListData {

    @C09CT("shipping_address_list")
    public final List<ReachableAddress> addressList;

    @C09CT("address_num_threshold")
    public final Integer addressThreshold;

    @C09CT("change_hint_msg")
    public final String changeHintMsg;

    @C09CT("change_hint_msg_v2")
    public final String changeHintMsgV2;

    @C09CT("change_location_data")
    public final ChangeLocationData changeLocationData;

    @C09CT("change_location_selections")
    public final List<ChangeLocationData> changeLocationSelections;

    @C09CT("client_config")
    public final AddressListClientConfig clientConfig;

    @C09CT("incentive_notice_dialog")
    public final NoticeDialogMessage noticeDialogMessage;

    @C09CT("privacy_policy_statement")
    public final LinkRichText privacyPolicyStatement;

    public AddressListData(String str, List<ReachableAddress> list, LinkRichText linkRichText, NoticeDialogMessage noticeDialogMessage, Integer num, ChangeLocationData changeLocationData, List<ChangeLocationData> list2, AddressListClientConfig addressListClientConfig, String str2) {
        this.changeHintMsg = str;
        this.addressList = list;
        this.privacyPolicyStatement = linkRichText;
        this.noticeDialogMessage = noticeDialogMessage;
        this.addressThreshold = num;
        this.changeLocationData = changeLocationData;
        this.changeLocationSelections = list2;
        this.clientConfig = addressListClientConfig;
        this.changeHintMsgV2 = str2;
    }
}
