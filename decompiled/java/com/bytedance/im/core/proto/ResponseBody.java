package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1C4S;
import X.C1C4Y;
import X.C1C52;
import X.C1C55;
import X.C1C58;
import X.C1ES1;
import X.C2224351C4b;
import X.C2224381C4e;
import X.C2224411C4h;
import X.C2224471C4n;
import X.C2224501C4q;
import X.C2224531C4t;
import X.C2281531ERz;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.HashMap;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class ResponseBody extends Message<ResponseBody, C1ES1> {
    public static final ProtoAdapter<ResponseBody> ADAPTER = new C2281531ERz();
    public static final long serialVersionUID = 0;
    public final HashMap<String, Object> LL;

    @C09CT("ack_message_body")
    public final AckMessageResponseBody ack_message_body;

    @C09CT("batch_ack_message_body")
    public final C1C4S batch_ack_message_body;

    @C09CT("batch_delete_conversation_body")
    public final BatchDeleteConversationResponseBody batch_delete_conversation_body;

    @C09CT("batch_get_conversation_participants_readindex")
    public final BatchGetConversationParticipantsReadIndexResponseBody batch_get_conversation_participants_readindex;

    @C09CT("batch_get_messages_body")
    public final BatchGetMessagesResponseBody batch_get_messages_body;

    @C09CT("batch_mark_read_body")
    public final BatchMarkConversationReadResponseBody batch_mark_read_body;

    @C09CT("batch_set_conversation_setting_info_body")
    public final BatchSetConversationSettingInfoResponseBody batch_set_conversation_setting_info_body;

    @C09CT("batch_unmark_message")
    public final BatchUnmarkMessageResponseBody batch_unmark_message;

    @C09CT("batch_update_conversation_participant_body")
    public final BatchUpdateConversationParticipantResponseBody batch_update_conversation_participant_body;

    @C09CT("biz_has_new_direct_push_notify")
    public final BizNewDirectPushNotify biz_has_new_direct_push_notify;

    @C09CT("block_conversation_body")
    public final C1C4Y block_conversation_body;

    @C09CT("block_members_body")
    public final BlockMembersResponseBody block_members_body;

    @C09CT("broadcast_user_counter_body")
    public final BroadcastUserCounterResponseBody broadcast_user_counter_body;

    @C09CT("check_messages_per_user_body")
    public final CheckMessagesPerUserResponseBody check_messages_per_user_body;

    @C09CT("check_status_message_body")
    public final CheckStatusMessagesResponseBody check_status_message_body;

    @C09CT("client_batch_ack_body")
    public final C2224411C4h client_batch_ack_body;

    @C09CT("conversation_add_participants_body")
    public final ConversationAddParticipantsResponseBody conversation_add_participants_body;

    @C09CT("conversation_message_pre_view_body")
    public final ConversationMessagePreViewResponseBody conversation_message_pre_view_body;

    @C09CT("conversation_participants_body")
    public final ConversationParticipantsListResponseBody conversation_participants_body;

    @C09CT("conversation_remove_participants_body")
    public final ConversationRemoveParticipantsResponseBody conversation_remove_participants_body;

    @C09CT("create_conversation_v2_body")
    public final CreateConversationV2ResponseBody create_conversation_v2_body;

    @C09CT("delete_multi_stranger_conversation_body")
    public final DeleteMultiStrangerConversationResponseBody delete_multi_stranger_conversation_body;

    @C09CT("delete_stranger_all_conversation_body")
    public final C2224471C4n delete_stranger_all_conversation_body;

    @C09CT("delete_stranger_conversation_body")
    public final C2224501C4q delete_stranger_conversation_body;

    @C09CT("delete_stranger_message_body")
    public final C2224531C4t delete_stranger_message_body;
    public transient HashMap<Integer, Pair<ProtoAdapter, Message>> extensions;

    @C09CT("get_cmd_message_body")
    public final GetCmdMessageRespBody get_cmd_message_body;

    @C09CT("get_configs_body")
    public final GetConfigsResponseBody get_configs_body;

    @C09CT("get_conversation_info_list_by_favorite_v2_body")
    public final GetConversationInfoListByFavoriteV2ResponseBody get_conversation_info_list_by_favorite_v2_body;

    @C09CT("get_conversation_info_list_by_top_v2_body")
    public final GetConversationInfoListByTopV2ResponseBody get_conversation_info_list_by_top_v2_body;

    @C09CT("get_conversation_info_list_v2_body")
    public final GetConversationInfoListV2ResponseBody get_conversation_info_list_v2_body;

    @C09CT("get_conversation_info_v2_body")
    public final GetConversationInfoV2ResponseBody get_conversation_info_v2_body;

    @C09CT("get_conversation_list_body")
    public final GetUserConversationListResponseBody get_conversation_list_body;

    @C09CT("get_conversations_check_info_v2_body")
    public final GetConversationsCheckInfoV2ResponseBody get_conversations_check_info_v2_body;

    @C09CT("get_conversations_checkinfo_body")
    public final GetConversationsCheckInfoResponseBody get_conversations_checkinfo_body;

    @C09CT("get_message_by_id_body")
    public final GetMessageByIdResponseBody get_message_by_id_body;

    @C09CT("get_message_check_info_v2_body")
    public final GetMessagesCheckInfoV2ResponseBody get_message_check_info_v2_body;

    @C09CT("get_message_info_by_index_v2_body")
    public final GetMessageInfoByIndexV2ResponseBody get_message_info_by_index_v2_body;

    @C09CT("get_message_info_by_index_v2_range_body")
    public final GetMessageInfoByIndexV2RangeResponseBody get_message_info_by_index_v2_range_body;

    @C09CT("get_message_preview_body")
    public final GetMessagePreviewResponseBody get_message_preview_body;

    @C09CT("get_messages_body")
    public final GetMessagesResponseBody get_messages_body;

    @C09CT("get_messages_checkinfo_in_conversation_body")
    public final GetMessagesCheckInfoInConversationResponseBody get_messages_checkinfo_in_conversation_body;

    @C09CT("get_recent_message_body")
    public final GetRecentMessageRespBody get_recent_message_body;

    @C09CT("get_stranger_conversation_body")
    public final GetStrangerConversationListResponseBody get_stranger_conversation_body;

    @C09CT("get_stranger_messages_body")
    public final GetStrangerMessagesResponseBody get_stranger_messages_body;

    @C09CT("get_stranger_unread_count_body")
    public final GetStrangerUnreadCountResponseBody get_stranger_unread_count_body;

    @C09CT("get_ticket_body")
    public final GetTicketResponseBody get_ticket_body;

    @C09CT("has_new_direct_push_notify")
    public final NewDirectPushNotify has_new_direct_push_notify;

    @C09CT("has_new_message_notify")
    public final NewMessageNotify has_new_message_notify;

    @C09CT("input_status_notify")
    public final InputStatusNotify input_status_notify;

    @C09CT("mark_conversation_read_notify")
    public final MarkConversationReadNotify mark_conversation_read_notify;

    @C09CT("mark_message_body")
    public final MarkMessageResponseBody mark_message_body;

    @C09CT("mark_msg_get_unread_count")
    public final MarkMsgGetUnreadCountResponseBody mark_msg_get_unread_count;

    @C09CT("mark_msg_unread_count_report")
    public final MarkMsgUnreadCountReportResponseBody mark_msg_unread_count_report;

    @C09CT("mark_multi_stranger_conversation_read_body")
    public final MarkMultiStrangerConversationReadResponseBody mark_multi_stranger_conversation_read_body;

    @C09CT("mark_stranger_all_conversation_read_body")
    public final C2224351C4b mark_stranger_all_conversation_read_body;

    @C09CT("mark_stranger_conversation_read_body")
    public final C2224381C4e mark_stranger_conversation_read_body;

    @C09CT("media_status_response_body")
    public final GetMediaStatusResponseBody media_status_response_body;

    @C09CT("media_upload_config_response_body")
    public final GetMediaUploadConfigResponseBody media_upload_config_response_body;

    @C09CT("message_by_init")
    public final MessageByInitResponseBody message_by_init;

    @C09CT("messages_in_conversation_body")
    public final MessagesInConversationResponseBody messages_in_conversation_body;

    @C09CT("messages_in_conversation_with_range")
    public final MessagesInConversationWithRangeResponseBody messages_in_conversation_with_range;

    @C09CT("messages_per_conversation_search_body")
    public final MessagesPerConversationSearchResponseBody messages_per_conversation_search_body;

    @C09CT("messages_per_user_body")
    public final MessagesPerUserResponseBody messages_per_user_body;

    @C09CT("messages_per_user_combo_body")
    public final MessagesPerUserComboResponseBody messages_per_user_combo_body;

    @C09CT("messages_per_user_init_v2_body")
    public final MessagesPerUserInitV2ResponseBody messages_per_user_init_v2_body;

    @C09CT("modify_message_property_body")
    public final ModifyMessagePropertyResponseBody modify_message_property_body;

    @C09CT("participants_min_index_body")
    public final GetConversationParticipantsMinIndexV3ResponseBody participants_min_index_body;

    @C09CT("participants_read_index_body")
    public final GetConversationParticipantsReadIndexV3ResponseBody participants_read_index_body;

    @C09CT("prefetch_conversation_id_body")
    public final PrefetchConversationIdResponseBody prefetch_conversation_id_body;

    @C09CT("previewer_get_conversation_info_list_body")
    public final PreviewerGetConversationInfoListResponseBody previewer_get_conversation_info_list_body;

    @C09CT("previewer_messages_in_conversation_body")
    public final PreviewerMessagesInConversationResponseBody previewer_messages_in_conversation_body;

    @C09CT("pull_mark_message_body")
    public final PullMarkMessageResponseBody pull_mark_message_body;

    @C09CT("recall_message_body")
    public final C1C52 recall_message_body;

    @C09CT("report_client_metrics_body")
    public final C1C55 report_client_metrics_body;

    @C09CT("send_input_status_body")
    public final SendInputStatusResponseBody send_input_status_body;

    @C09CT("send_message_body")
    public final SendMessageResponseBody send_message_body;

    @C09CT("send_user_action_body")
    public final C1C58 send_user_action_body;

    @C09CT("set_conversation_core_info_body")
    public final SetConversationCoreInfoResponseBody set_conversation_core_info_body;

    @C09CT("set_conversation_setting_info_body")
    public final SetConversationSettingInfoResponseBody set_conversation_setting_info_body;

    @C09CT("stranger_has_new_message_notify")
    public final StrangerNewMessageNotify stranger_has_new_message_notify;

    @C09CT("unread_count_report_body")
    public final UnReadCountReportResponseBody unread_count_report_body;

    @C09CT("update_conversation_participant_body")
    public final UpdateConversationParticipantResponseBody update_conversation_participant_body;

    @C09CT("upsert_conversation_core_ext_info_body")
    public final UpsertConversationCoreExtInfoResponseBody upsert_conversation_core_ext_info_body;

    @C09CT("upsert_conversation_setting_ext_info_body")
    public final UpsertConversationSettingExtInfoResponseBody upsert_conversation_setting_ext_info_body;

    @Override // com.squareup.wire.Message
    public C1ES1 newBuilder() {
        C1ES1 c1es1 = new C1ES1();
        c1es1.LIZLLL = this.send_message_body;
        c1es1.LJ = this.messages_per_user_body;
        c1es1.LJFF = this.messages_per_user_init_v2_body;
        c1es1.LJI = this.messages_per_user_combo_body;
        c1es1.LJII = this.messages_per_conversation_search_body;
        c1es1.LJIIIIZZ = this.check_messages_per_user_body;
        c1es1.LJIIIZ = this.check_status_message_body;
        c1es1.LJIIJ = this.get_message_by_id_body;
        c1es1.LJIIJJI = this.messages_in_conversation_body;
        c1es1.LJIIL = this.get_messages_checkinfo_in_conversation_body;
        c1es1.LJIILIIL = this.get_message_check_info_v2_body;
        c1es1.LJIILJJIL = this.messages_in_conversation_with_range;
        c1es1.LJIILL = this.get_message_preview_body;
        c1es1.LJIILLIIL = this.send_user_action_body;
        c1es1.LJIIZILJ = this.send_input_status_body;
        c1es1.LJIJ = this.has_new_message_notify;
        c1es1.LJIJI = this.mark_conversation_read_notify;
        c1es1.LJIJJ = this.stranger_has_new_message_notify;
        c1es1.LJIJJLI = this.has_new_direct_push_notify;
        c1es1.LJIL = this.input_status_notify;
        c1es1.LJJ = this.biz_has_new_direct_push_notify;
        c1es1.LJJI = this.batch_mark_read_body;
        c1es1.LJJIFFI = this.get_conversations_checkinfo_body;
        c1es1.LJJII = this.get_conversations_check_info_v2_body;
        c1es1.LJJIII = this.batch_delete_conversation_body;
        c1es1.LJJIIJ = this.get_conversation_info_v2_body;
        c1es1.LJJIIJZLJL = this.create_conversation_v2_body;
        c1es1.LJJIIZ = this.get_conversation_info_list_v2_body;
        c1es1.LJJIIZI = this.get_conversation_info_list_by_favorite_v2_body;
        c1es1.LJJIJ = this.get_conversation_info_list_by_top_v2_body;
        c1es1.LJJIJIIJI = this.conversation_participants_body;
        c1es1.LJJIJIIJIL = this.conversation_add_participants_body;
        c1es1.LJJIJIL = this.conversation_remove_participants_body;
        c1es1.LJJIJL = this.update_conversation_participant_body;
        c1es1.LJJIJLIJ = this.batch_update_conversation_participant_body;
        c1es1.LJJIL = this.recall_message_body;
        c1es1.LJJIZ = this.modify_message_property_body;
        c1es1.LJJJ = this.ack_message_body;
        c1es1.LJJJI = this.batch_ack_message_body;
        c1es1.LJJJIL = this.set_conversation_core_info_body;
        c1es1.LJJJJ = this.upsert_conversation_core_ext_info_body;
        c1es1.LJJJJI = this.set_conversation_setting_info_body;
        c1es1.LJJJJIZL = this.upsert_conversation_setting_ext_info_body;
        c1es1.LJJJJJ = this.batch_set_conversation_setting_info_body;
        c1es1.LJJJJJL = this.get_stranger_conversation_body;
        c1es1.LJJJJL = this.get_stranger_messages_body;
        c1es1.LJJJJLI = this.delete_stranger_message_body;
        c1es1.LJJJJLL = this.delete_stranger_conversation_body;
        c1es1.LJJJJZ = this.delete_stranger_all_conversation_body;
        c1es1.LJJJJZI = this.mark_stranger_conversation_read_body;
        c1es1.LJJJLIIL = this.mark_stranger_all_conversation_read_body;
        c1es1.LJJJLL = this.get_stranger_unread_count_body;
        c1es1.LJJJLZIJ = this.delete_multi_stranger_conversation_body;
        c1es1.LJJJZ = this.mark_multi_stranger_conversation_read_body;
        c1es1.LJJL = this.participants_read_index_body;
        c1es1.LJJLI = this.participants_min_index_body;
        c1es1.LJJLIIIIJ = this.get_ticket_body;
        c1es1.LJJLIIIJ = this.get_conversation_list_body;
        c1es1.LJJLIIIJILLIZJL = this.broadcast_user_counter_body;
        c1es1.LJJLIIIJJI = this.report_client_metrics_body;
        c1es1.LJJLIIIJJIZ = this.get_configs_body;
        c1es1.LJJLIIIJL = this.unread_count_report_body;
        c1es1.LJJLIIIJLJLI = this.block_members_body;
        c1es1.LJJLIIIJLLLLLLLZ = this.block_conversation_body;
        c1es1.LJJLIIJ = this.get_message_info_by_index_v2_body;
        c1es1.LJJLIL = this.mark_message_body;
        c1es1.LJJLJ = this.pull_mark_message_body;
        c1es1.LJJLJLI = this.batch_get_conversation_participants_readindex;
        c1es1.LJJLL = this.get_recent_message_body;
        c1es1.LJJZ = this.get_cmd_message_body;
        c1es1.LJJZZI = this.get_message_info_by_index_v2_range_body;
        c1es1.LJJZZIII = this.message_by_init;
        c1es1.LJL = this.previewer_messages_in_conversation_body;
        c1es1.LJLI = this.previewer_get_conversation_info_list_body;
        c1es1.LJLIIIL = this.mark_msg_unread_count_report;
        c1es1.LJLIIL = this.mark_msg_get_unread_count;
        c1es1.LJLIL = this.batch_unmark_message;
        c1es1.LJLILLLLZI = this.client_batch_ack_body;
        c1es1.LJLJI = this.media_upload_config_response_body;
        c1es1.LJLJJI = this.media_status_response_body;
        c1es1.LJLJJL = this.conversation_message_pre_view_body;
        c1es1.LJLJJLL = this.get_messages_body;
        c1es1.LJLJL = this.batch_get_messages_body;
        c1es1.LJLJLJ = this.prefetch_conversation_id_body;
        c1es1.LJLJLLL = this.extensions;
        c1es1.LJLL = this.LL;
        c1es1.addUnknownFields(unknownFields());
        return c1es1;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.send_message_body != null) {
            sb.append(", send_message_body=");
            sb.append(this.send_message_body);
        }
        if (this.messages_per_user_body != null) {
            sb.append(", messages_per_user_body=");
            sb.append(this.messages_per_user_body);
        }
        if (this.messages_per_user_init_v2_body != null) {
            sb.append(", messages_per_user_init_v2_body=");
            sb.append(this.messages_per_user_init_v2_body);
        }
        if (this.messages_per_user_combo_body != null) {
            sb.append(", messages_per_user_combo_body=");
            sb.append(this.messages_per_user_combo_body);
        }
        if (this.messages_per_conversation_search_body != null) {
            sb.append(", messages_per_conversation_search_body=");
            sb.append(this.messages_per_conversation_search_body);
        }
        if (this.check_messages_per_user_body != null) {
            sb.append(", check_messages_per_user_body=");
            sb.append(this.check_messages_per_user_body);
        }
        if (this.check_status_message_body != null) {
            sb.append(", check_status_message_body=");
            sb.append(this.check_status_message_body);
        }
        if (this.get_message_by_id_body != null) {
            sb.append(", get_message_by_id_body=");
            sb.append(this.get_message_by_id_body);
        }
        if (this.messages_in_conversation_body != null) {
            sb.append(", messages_in_conversation_body=");
            sb.append(this.messages_in_conversation_body);
        }
        if (this.get_messages_checkinfo_in_conversation_body != null) {
            sb.append(", get_messages_checkinfo_in_conversation_body=");
            sb.append(this.get_messages_checkinfo_in_conversation_body);
        }
        if (this.get_message_check_info_v2_body != null) {
            sb.append(", get_message_check_info_v2_body=");
            sb.append(this.get_message_check_info_v2_body);
        }
        if (this.messages_in_conversation_with_range != null) {
            sb.append(", messages_in_conversation_with_range=");
            sb.append(this.messages_in_conversation_with_range);
        }
        if (this.get_message_preview_body != null) {
            sb.append(", get_message_preview_body=");
            sb.append(this.get_message_preview_body);
        }
        if (this.send_user_action_body != null) {
            sb.append(", send_user_action_body=");
            sb.append(this.send_user_action_body);
        }
        if (this.send_input_status_body != null) {
            sb.append(", send_input_status_body=");
            sb.append(this.send_input_status_body);
        }
        if (this.has_new_message_notify != null) {
            sb.append(", has_new_message_notify=");
            sb.append(this.has_new_message_notify);
        }
        if (this.mark_conversation_read_notify != null) {
            sb.append(", mark_conversation_read_notify=");
            sb.append(this.mark_conversation_read_notify);
        }
        if (this.stranger_has_new_message_notify != null) {
            sb.append(", stranger_has_new_message_notify=");
            sb.append(this.stranger_has_new_message_notify);
        }
        if (this.has_new_direct_push_notify != null) {
            sb.append(", has_new_direct_push_notify=");
            sb.append(this.has_new_direct_push_notify);
        }
        if (this.input_status_notify != null) {
            sb.append(", input_status_notify=");
            sb.append(this.input_status_notify);
        }
        if (this.biz_has_new_direct_push_notify != null) {
            sb.append(", biz_has_new_direct_push_notify=");
            sb.append(this.biz_has_new_direct_push_notify);
        }
        if (this.batch_mark_read_body != null) {
            sb.append(", batch_mark_read_body=");
            sb.append(this.batch_mark_read_body);
        }
        if (this.get_conversations_checkinfo_body != null) {
            sb.append(", get_conversations_checkinfo_body=");
            sb.append(this.get_conversations_checkinfo_body);
        }
        if (this.get_conversations_check_info_v2_body != null) {
            sb.append(", get_conversations_check_info_v2_body=");
            sb.append(this.get_conversations_check_info_v2_body);
        }
        if (this.batch_delete_conversation_body != null) {
            sb.append(", batch_delete_conversation_body=");
            sb.append(this.batch_delete_conversation_body);
        }
        if (this.get_conversation_info_v2_body != null) {
            sb.append(", get_conversation_info_v2_body=");
            sb.append(this.get_conversation_info_v2_body);
        }
        if (this.create_conversation_v2_body != null) {
            sb.append(", create_conversation_v2_body=");
            sb.append(this.create_conversation_v2_body);
        }
        if (this.get_conversation_info_list_v2_body != null) {
            sb.append(", get_conversation_info_list_v2_body=");
            sb.append(this.get_conversation_info_list_v2_body);
        }
        if (this.get_conversation_info_list_by_favorite_v2_body != null) {
            sb.append(", get_conversation_info_list_by_favorite_v2_body=");
            sb.append(this.get_conversation_info_list_by_favorite_v2_body);
        }
        if (this.get_conversation_info_list_by_top_v2_body != null) {
            sb.append(", get_conversation_info_list_by_top_v2_body=");
            sb.append(this.get_conversation_info_list_by_top_v2_body);
        }
        if (this.conversation_participants_body != null) {
            sb.append(", conversation_participants_body=");
            sb.append(this.conversation_participants_body);
        }
        if (this.conversation_add_participants_body != null) {
            sb.append(", conversation_add_participants_body=");
            sb.append(this.conversation_add_participants_body);
        }
        if (this.conversation_remove_participants_body != null) {
            sb.append(", conversation_remove_participants_body=");
            sb.append(this.conversation_remove_participants_body);
        }
        if (this.update_conversation_participant_body != null) {
            sb.append(", update_conversation_participant_body=");
            sb.append(this.update_conversation_participant_body);
        }
        if (this.batch_update_conversation_participant_body != null) {
            sb.append(", batch_update_conversation_participant_body=");
            sb.append(this.batch_update_conversation_participant_body);
        }
        if (this.recall_message_body != null) {
            sb.append(", recall_message_body=");
            sb.append(this.recall_message_body);
        }
        if (this.modify_message_property_body != null) {
            sb.append(", modify_message_property_body=");
            sb.append(this.modify_message_property_body);
        }
        if (this.ack_message_body != null) {
            sb.append(", ack_message_body=");
            sb.append(this.ack_message_body);
        }
        if (this.batch_ack_message_body != null) {
            sb.append(", batch_ack_message_body=");
            sb.append(this.batch_ack_message_body);
        }
        if (this.set_conversation_core_info_body != null) {
            sb.append(", set_conversation_core_info_body=");
            sb.append(this.set_conversation_core_info_body);
        }
        if (this.upsert_conversation_core_ext_info_body != null) {
            sb.append(", upsert_conversation_core_ext_info_body=");
            sb.append(this.upsert_conversation_core_ext_info_body);
        }
        if (this.set_conversation_setting_info_body != null) {
            sb.append(", set_conversation_setting_info_body=");
            sb.append(this.set_conversation_setting_info_body);
        }
        if (this.upsert_conversation_setting_ext_info_body != null) {
            sb.append(", upsert_conversation_setting_ext_info_body=");
            sb.append(this.upsert_conversation_setting_ext_info_body);
        }
        if (this.batch_set_conversation_setting_info_body != null) {
            sb.append(", batch_set_conversation_setting_info_body=");
            sb.append(this.batch_set_conversation_setting_info_body);
        }
        if (this.get_stranger_conversation_body != null) {
            sb.append(", get_stranger_conversation_body=");
            sb.append(this.get_stranger_conversation_body);
        }
        if (this.get_stranger_messages_body != null) {
            sb.append(", get_stranger_messages_body=");
            sb.append(this.get_stranger_messages_body);
        }
        if (this.delete_stranger_message_body != null) {
            sb.append(", delete_stranger_message_body=");
            sb.append(this.delete_stranger_message_body);
        }
        if (this.delete_stranger_conversation_body != null) {
            sb.append(", delete_stranger_conversation_body=");
            sb.append(this.delete_stranger_conversation_body);
        }
        if (this.delete_stranger_all_conversation_body != null) {
            sb.append(", delete_stranger_all_conversation_body=");
            sb.append(this.delete_stranger_all_conversation_body);
        }
        if (this.mark_stranger_conversation_read_body != null) {
            sb.append(", mark_stranger_conversation_read_body=");
            sb.append(this.mark_stranger_conversation_read_body);
        }
        if (this.mark_stranger_all_conversation_read_body != null) {
            sb.append(", mark_stranger_all_conversation_read_body=");
            sb.append(this.mark_stranger_all_conversation_read_body);
        }
        if (this.get_stranger_unread_count_body != null) {
            sb.append(", get_stranger_unread_count_body=");
            sb.append(this.get_stranger_unread_count_body);
        }
        if (this.delete_multi_stranger_conversation_body != null) {
            sb.append(", delete_multi_stranger_conversation_body=");
            sb.append(this.delete_multi_stranger_conversation_body);
        }
        if (this.mark_multi_stranger_conversation_read_body != null) {
            sb.append(", mark_multi_stranger_conversation_read_body=");
            sb.append(this.mark_multi_stranger_conversation_read_body);
        }
        if (this.participants_read_index_body != null) {
            sb.append(", participants_read_index_body=");
            sb.append(this.participants_read_index_body);
        }
        if (this.participants_min_index_body != null) {
            sb.append(", participants_min_index_body=");
            sb.append(this.participants_min_index_body);
        }
        if (this.get_ticket_body != null) {
            sb.append(", get_ticket_body=");
            sb.append(this.get_ticket_body);
        }
        if (this.get_conversation_list_body != null) {
            sb.append(", get_conversation_list_body=");
            sb.append(this.get_conversation_list_body);
        }
        if (this.broadcast_user_counter_body != null) {
            sb.append(", broadcast_user_counter_body=");
            sb.append(this.broadcast_user_counter_body);
        }
        if (this.report_client_metrics_body != null) {
            sb.append(", report_client_metrics_body=");
            sb.append(this.report_client_metrics_body);
        }
        if (this.get_configs_body != null) {
            sb.append(", get_configs_body=");
            sb.append(this.get_configs_body);
        }
        if (this.unread_count_report_body != null) {
            sb.append(", unread_count_report_body=");
            sb.append(this.unread_count_report_body);
        }
        if (this.block_members_body != null) {
            sb.append(", block_members_body=");
            sb.append(this.block_members_body);
        }
        if (this.block_conversation_body != null) {
            sb.append(", block_conversation_body=");
            sb.append(this.block_conversation_body);
        }
        if (this.get_message_info_by_index_v2_body != null) {
            sb.append(", get_message_info_by_index_v2_body=");
            sb.append(this.get_message_info_by_index_v2_body);
        }
        if (this.mark_message_body != null) {
            sb.append(", mark_message_body=");
            sb.append(this.mark_message_body);
        }
        if (this.pull_mark_message_body != null) {
            sb.append(", pull_mark_message_body=");
            sb.append(this.pull_mark_message_body);
        }
        if (this.batch_get_conversation_participants_readindex != null) {
            sb.append(", batch_get_conversation_participants_readindex=");
            sb.append(this.batch_get_conversation_participants_readindex);
        }
        if (this.get_recent_message_body != null) {
            sb.append(", get_recent_message_body=");
            sb.append(this.get_recent_message_body);
        }
        if (this.get_cmd_message_body != null) {
            sb.append(", get_cmd_message_body=");
            sb.append(this.get_cmd_message_body);
        }
        if (this.get_message_info_by_index_v2_range_body != null) {
            sb.append(", get_message_info_by_index_v2_range_body=");
            sb.append(this.get_message_info_by_index_v2_range_body);
        }
        if (this.message_by_init != null) {
            sb.append(", message_by_init=");
            sb.append(this.message_by_init);
        }
        if (this.previewer_messages_in_conversation_body != null) {
            sb.append(", previewer_messages_in_conversation_body=");
            sb.append(this.previewer_messages_in_conversation_body);
        }
        if (this.previewer_get_conversation_info_list_body != null) {
            sb.append(", previewer_get_conversation_info_list_body=");
            sb.append(this.previewer_get_conversation_info_list_body);
        }
        if (this.mark_msg_unread_count_report != null) {
            sb.append(", mark_msg_unread_count_report=");
            sb.append(this.mark_msg_unread_count_report);
        }
        if (this.mark_msg_get_unread_count != null) {
            sb.append(", mark_msg_get_unread_count=");
            sb.append(this.mark_msg_get_unread_count);
        }
        if (this.batch_unmark_message != null) {
            sb.append(", batch_unmark_message=");
            sb.append(this.batch_unmark_message);
        }
        if (this.client_batch_ack_body != null) {
            sb.append(", client_batch_ack_body=");
            sb.append(this.client_batch_ack_body);
        }
        if (this.media_upload_config_response_body != null) {
            sb.append(", media_upload_config_response_body=");
            sb.append(this.media_upload_config_response_body);
        }
        if (this.media_status_response_body != null) {
            sb.append(", media_status_response_body=");
            sb.append(this.media_status_response_body);
        }
        if (this.conversation_message_pre_view_body != null) {
            sb.append(", conversation_message_pre_view_body=");
            sb.append(this.conversation_message_pre_view_body);
        }
        if (this.get_messages_body != null) {
            sb.append(", get_messages_body=");
            sb.append(this.get_messages_body);
        }
        if (this.batch_get_messages_body != null) {
            sb.append(", batch_get_messages_body=");
            sb.append(this.batch_get_messages_body);
        }
        if (this.prefetch_conversation_id_body != null) {
            sb.append(", prefetch_conversation_id_body=");
            sb.append(this.prefetch_conversation_id_body);
        }
        sb.replace(0, 2, "ResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public <T> T getExtension(int i) {
        if (this.extensions.get(Integer.valueOf(i)) != null) {
            try {
                return (T) this.extensions.get(Integer.valueOf(i)).second;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public ResponseBody(SendMessageResponseBody sendMessageResponseBody, MessagesPerUserResponseBody messagesPerUserResponseBody, MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody, MessagesPerUserComboResponseBody messagesPerUserComboResponseBody, MessagesPerConversationSearchResponseBody messagesPerConversationSearchResponseBody, CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody, CheckStatusMessagesResponseBody checkStatusMessagesResponseBody, GetMessageByIdResponseBody getMessageByIdResponseBody, MessagesInConversationResponseBody messagesInConversationResponseBody, GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody, GetMessagesCheckInfoV2ResponseBody getMessagesCheckInfoV2ResponseBody, MessagesInConversationWithRangeResponseBody messagesInConversationWithRangeResponseBody, GetMessagePreviewResponseBody getMessagePreviewResponseBody, C1C58 c1c58, SendInputStatusResponseBody sendInputStatusResponseBody, NewMessageNotify newMessageNotify, MarkConversationReadNotify markConversationReadNotify, StrangerNewMessageNotify strangerNewMessageNotify, NewDirectPushNotify newDirectPushNotify, InputStatusNotify inputStatusNotify, BizNewDirectPushNotify bizNewDirectPushNotify, BatchMarkConversationReadResponseBody batchMarkConversationReadResponseBody, GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody, GetConversationsCheckInfoV2ResponseBody getConversationsCheckInfoV2ResponseBody, BatchDeleteConversationResponseBody batchDeleteConversationResponseBody, GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody, CreateConversationV2ResponseBody createConversationV2ResponseBody, GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody, GetConversationInfoListByFavoriteV2ResponseBody getConversationInfoListByFavoriteV2ResponseBody, GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody, ConversationParticipantsListResponseBody conversationParticipantsListResponseBody, ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody, ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody, UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody, BatchUpdateConversationParticipantResponseBody batchUpdateConversationParticipantResponseBody, C1C52 c1c52, ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody, AckMessageResponseBody ackMessageResponseBody, C1C4S c1c4s, SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody, UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody, SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody, UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody, BatchSetConversationSettingInfoResponseBody batchSetConversationSettingInfoResponseBody, GetStrangerConversationListResponseBody getStrangerConversationListResponseBody, GetStrangerMessagesResponseBody getStrangerMessagesResponseBody, C2224531C4t c2224531C4t, C2224501C4q c2224501C4q, C2224471C4n c2224471C4n, C2224381C4e c2224381C4e, C2224351C4b c2224351C4b, GetStrangerUnreadCountResponseBody getStrangerUnreadCountResponseBody, DeleteMultiStrangerConversationResponseBody deleteMultiStrangerConversationResponseBody, MarkMultiStrangerConversationReadResponseBody markMultiStrangerConversationReadResponseBody, GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody, GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody, GetTicketResponseBody getTicketResponseBody, GetUserConversationListResponseBody getUserConversationListResponseBody, BroadcastUserCounterResponseBody broadcastUserCounterResponseBody, C1C55 c1c55, GetConfigsResponseBody getConfigsResponseBody, UnReadCountReportResponseBody unReadCountReportResponseBody, BlockMembersResponseBody blockMembersResponseBody, C1C4Y c1c4y, GetMessageInfoByIndexV2ResponseBody getMessageInfoByIndexV2ResponseBody, MarkMessageResponseBody markMessageResponseBody, PullMarkMessageResponseBody pullMarkMessageResponseBody, BatchGetConversationParticipantsReadIndexResponseBody batchGetConversationParticipantsReadIndexResponseBody, GetRecentMessageRespBody getRecentMessageRespBody, GetCmdMessageRespBody getCmdMessageRespBody, GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody, MessageByInitResponseBody messageByInitResponseBody, PreviewerMessagesInConversationResponseBody previewerMessagesInConversationResponseBody, PreviewerGetConversationInfoListResponseBody previewerGetConversationInfoListResponseBody, MarkMsgUnreadCountReportResponseBody markMsgUnreadCountReportResponseBody, MarkMsgGetUnreadCountResponseBody markMsgGetUnreadCountResponseBody, BatchUnmarkMessageResponseBody batchUnmarkMessageResponseBody, C2224411C4h c2224411C4h, GetMediaUploadConfigResponseBody getMediaUploadConfigResponseBody, GetMediaStatusResponseBody getMediaStatusResponseBody, ConversationMessagePreViewResponseBody conversationMessagePreViewResponseBody, GetMessagesResponseBody getMessagesResponseBody, BatchGetMessagesResponseBody batchGetMessagesResponseBody, PrefetchConversationIdResponseBody prefetchConversationIdResponseBody, HashMap<Integer, Pair<ProtoAdapter, Message>> map, HashMap<String, Object> map2) {
        this(sendMessageResponseBody, messagesPerUserResponseBody, messagesPerUserInitV2ResponseBody, messagesPerUserComboResponseBody, messagesPerConversationSearchResponseBody, checkMessagesPerUserResponseBody, checkStatusMessagesResponseBody, getMessageByIdResponseBody, messagesInConversationResponseBody, getMessagesCheckInfoInConversationResponseBody, getMessagesCheckInfoV2ResponseBody, messagesInConversationWithRangeResponseBody, getMessagePreviewResponseBody, c1c58, sendInputStatusResponseBody, newMessageNotify, markConversationReadNotify, strangerNewMessageNotify, newDirectPushNotify, inputStatusNotify, bizNewDirectPushNotify, batchMarkConversationReadResponseBody, getConversationsCheckInfoResponseBody, getConversationsCheckInfoV2ResponseBody, batchDeleteConversationResponseBody, getConversationInfoV2ResponseBody, createConversationV2ResponseBody, getConversationInfoListV2ResponseBody, getConversationInfoListByFavoriteV2ResponseBody, getConversationInfoListByTopV2ResponseBody, conversationParticipantsListResponseBody, conversationAddParticipantsResponseBody, conversationRemoveParticipantsResponseBody, updateConversationParticipantResponseBody, batchUpdateConversationParticipantResponseBody, c1c52, modifyMessagePropertyResponseBody, ackMessageResponseBody, c1c4s, setConversationCoreInfoResponseBody, upsertConversationCoreExtInfoResponseBody, setConversationSettingInfoResponseBody, upsertConversationSettingExtInfoResponseBody, batchSetConversationSettingInfoResponseBody, getStrangerConversationListResponseBody, getStrangerMessagesResponseBody, c2224531C4t, c2224501C4q, c2224471C4n, c2224381C4e, c2224351C4b, getStrangerUnreadCountResponseBody, deleteMultiStrangerConversationResponseBody, markMultiStrangerConversationReadResponseBody, getConversationParticipantsReadIndexV3ResponseBody, getConversationParticipantsMinIndexV3ResponseBody, getTicketResponseBody, getUserConversationListResponseBody, broadcastUserCounterResponseBody, c1c55, getConfigsResponseBody, unReadCountReportResponseBody, blockMembersResponseBody, c1c4y, getMessageInfoByIndexV2ResponseBody, markMessageResponseBody, pullMarkMessageResponseBody, batchGetConversationParticipantsReadIndexResponseBody, getRecentMessageRespBody, getCmdMessageRespBody, getMessageInfoByIndexV2RangeResponseBody, messageByInitResponseBody, previewerMessagesInConversationResponseBody, previewerGetConversationInfoListResponseBody, markMsgUnreadCountReportResponseBody, markMsgGetUnreadCountResponseBody, batchUnmarkMessageResponseBody, c2224411C4h, getMediaUploadConfigResponseBody, getMediaStatusResponseBody, conversationMessagePreViewResponseBody, getMessagesResponseBody, batchGetMessagesResponseBody, prefetchConversationIdResponseBody, map, map2, ByteString.EMPTY);
    }

    public ResponseBody(SendMessageResponseBody sendMessageResponseBody, MessagesPerUserResponseBody messagesPerUserResponseBody, MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody, MessagesPerUserComboResponseBody messagesPerUserComboResponseBody, MessagesPerConversationSearchResponseBody messagesPerConversationSearchResponseBody, CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody, CheckStatusMessagesResponseBody checkStatusMessagesResponseBody, GetMessageByIdResponseBody getMessageByIdResponseBody, MessagesInConversationResponseBody messagesInConversationResponseBody, GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody, GetMessagesCheckInfoV2ResponseBody getMessagesCheckInfoV2ResponseBody, MessagesInConversationWithRangeResponseBody messagesInConversationWithRangeResponseBody, GetMessagePreviewResponseBody getMessagePreviewResponseBody, C1C58 c1c58, SendInputStatusResponseBody sendInputStatusResponseBody, NewMessageNotify newMessageNotify, MarkConversationReadNotify markConversationReadNotify, StrangerNewMessageNotify strangerNewMessageNotify, NewDirectPushNotify newDirectPushNotify, InputStatusNotify inputStatusNotify, BizNewDirectPushNotify bizNewDirectPushNotify, BatchMarkConversationReadResponseBody batchMarkConversationReadResponseBody, GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody, GetConversationsCheckInfoV2ResponseBody getConversationsCheckInfoV2ResponseBody, BatchDeleteConversationResponseBody batchDeleteConversationResponseBody, GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody, CreateConversationV2ResponseBody createConversationV2ResponseBody, GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody, GetConversationInfoListByFavoriteV2ResponseBody getConversationInfoListByFavoriteV2ResponseBody, GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody, ConversationParticipantsListResponseBody conversationParticipantsListResponseBody, ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody, ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody, UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody, BatchUpdateConversationParticipantResponseBody batchUpdateConversationParticipantResponseBody, C1C52 c1c52, ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody, AckMessageResponseBody ackMessageResponseBody, C1C4S c1c4s, SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody, UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody, SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody, UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody, BatchSetConversationSettingInfoResponseBody batchSetConversationSettingInfoResponseBody, GetStrangerConversationListResponseBody getStrangerConversationListResponseBody, GetStrangerMessagesResponseBody getStrangerMessagesResponseBody, C2224531C4t c2224531C4t, C2224501C4q c2224501C4q, C2224471C4n c2224471C4n, C2224381C4e c2224381C4e, C2224351C4b c2224351C4b, GetStrangerUnreadCountResponseBody getStrangerUnreadCountResponseBody, DeleteMultiStrangerConversationResponseBody deleteMultiStrangerConversationResponseBody, MarkMultiStrangerConversationReadResponseBody markMultiStrangerConversationReadResponseBody, GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody, GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody, GetTicketResponseBody getTicketResponseBody, GetUserConversationListResponseBody getUserConversationListResponseBody, BroadcastUserCounterResponseBody broadcastUserCounterResponseBody, C1C55 c1c55, GetConfigsResponseBody getConfigsResponseBody, UnReadCountReportResponseBody unReadCountReportResponseBody, BlockMembersResponseBody blockMembersResponseBody, C1C4Y c1c4y, GetMessageInfoByIndexV2ResponseBody getMessageInfoByIndexV2ResponseBody, MarkMessageResponseBody markMessageResponseBody, PullMarkMessageResponseBody pullMarkMessageResponseBody, BatchGetConversationParticipantsReadIndexResponseBody batchGetConversationParticipantsReadIndexResponseBody, GetRecentMessageRespBody getRecentMessageRespBody, GetCmdMessageRespBody getCmdMessageRespBody, GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody, MessageByInitResponseBody messageByInitResponseBody, PreviewerMessagesInConversationResponseBody previewerMessagesInConversationResponseBody, PreviewerGetConversationInfoListResponseBody previewerGetConversationInfoListResponseBody, MarkMsgUnreadCountReportResponseBody markMsgUnreadCountReportResponseBody, MarkMsgGetUnreadCountResponseBody markMsgGetUnreadCountResponseBody, BatchUnmarkMessageResponseBody batchUnmarkMessageResponseBody, C2224411C4h c2224411C4h, GetMediaUploadConfigResponseBody getMediaUploadConfigResponseBody, GetMediaStatusResponseBody getMediaStatusResponseBody, ConversationMessagePreViewResponseBody conversationMessagePreViewResponseBody, GetMessagesResponseBody getMessagesResponseBody, BatchGetMessagesResponseBody batchGetMessagesResponseBody, PrefetchConversationIdResponseBody prefetchConversationIdResponseBody, HashMap<Integer, Pair<ProtoAdapter, Message>> map, HashMap<String, Object> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.extensions = new HashMap<>();
        this.LL = new HashMap<>();
        this.send_message_body = sendMessageResponseBody;
        this.messages_per_user_body = messagesPerUserResponseBody;
        this.messages_per_user_init_v2_body = messagesPerUserInitV2ResponseBody;
        this.messages_per_user_combo_body = messagesPerUserComboResponseBody;
        this.messages_per_conversation_search_body = messagesPerConversationSearchResponseBody;
        this.check_messages_per_user_body = checkMessagesPerUserResponseBody;
        this.check_status_message_body = checkStatusMessagesResponseBody;
        this.get_message_by_id_body = getMessageByIdResponseBody;
        this.messages_in_conversation_body = messagesInConversationResponseBody;
        this.get_messages_checkinfo_in_conversation_body = getMessagesCheckInfoInConversationResponseBody;
        this.get_message_check_info_v2_body = getMessagesCheckInfoV2ResponseBody;
        this.messages_in_conversation_with_range = messagesInConversationWithRangeResponseBody;
        this.get_message_preview_body = getMessagePreviewResponseBody;
        this.send_user_action_body = c1c58;
        this.send_input_status_body = sendInputStatusResponseBody;
        this.has_new_message_notify = newMessageNotify;
        this.mark_conversation_read_notify = markConversationReadNotify;
        this.stranger_has_new_message_notify = strangerNewMessageNotify;
        this.has_new_direct_push_notify = newDirectPushNotify;
        this.input_status_notify = inputStatusNotify;
        this.biz_has_new_direct_push_notify = bizNewDirectPushNotify;
        this.batch_mark_read_body = batchMarkConversationReadResponseBody;
        this.get_conversations_checkinfo_body = getConversationsCheckInfoResponseBody;
        this.get_conversations_check_info_v2_body = getConversationsCheckInfoV2ResponseBody;
        this.batch_delete_conversation_body = batchDeleteConversationResponseBody;
        this.get_conversation_info_v2_body = getConversationInfoV2ResponseBody;
        this.create_conversation_v2_body = createConversationV2ResponseBody;
        this.get_conversation_info_list_v2_body = getConversationInfoListV2ResponseBody;
        this.get_conversation_info_list_by_favorite_v2_body = getConversationInfoListByFavoriteV2ResponseBody;
        this.get_conversation_info_list_by_top_v2_body = getConversationInfoListByTopV2ResponseBody;
        this.conversation_participants_body = conversationParticipantsListResponseBody;
        this.conversation_add_participants_body = conversationAddParticipantsResponseBody;
        this.conversation_remove_participants_body = conversationRemoveParticipantsResponseBody;
        this.update_conversation_participant_body = updateConversationParticipantResponseBody;
        this.batch_update_conversation_participant_body = batchUpdateConversationParticipantResponseBody;
        this.recall_message_body = c1c52;
        this.modify_message_property_body = modifyMessagePropertyResponseBody;
        this.ack_message_body = ackMessageResponseBody;
        this.batch_ack_message_body = c1c4s;
        this.set_conversation_core_info_body = setConversationCoreInfoResponseBody;
        this.upsert_conversation_core_ext_info_body = upsertConversationCoreExtInfoResponseBody;
        this.set_conversation_setting_info_body = setConversationSettingInfoResponseBody;
        this.upsert_conversation_setting_ext_info_body = upsertConversationSettingExtInfoResponseBody;
        this.batch_set_conversation_setting_info_body = batchSetConversationSettingInfoResponseBody;
        this.get_stranger_conversation_body = getStrangerConversationListResponseBody;
        this.get_stranger_messages_body = getStrangerMessagesResponseBody;
        this.delete_stranger_message_body = c2224531C4t;
        this.delete_stranger_conversation_body = c2224501C4q;
        this.delete_stranger_all_conversation_body = c2224471C4n;
        this.mark_stranger_conversation_read_body = c2224381C4e;
        this.mark_stranger_all_conversation_read_body = c2224351C4b;
        this.get_stranger_unread_count_body = getStrangerUnreadCountResponseBody;
        this.delete_multi_stranger_conversation_body = deleteMultiStrangerConversationResponseBody;
        this.mark_multi_stranger_conversation_read_body = markMultiStrangerConversationReadResponseBody;
        this.participants_read_index_body = getConversationParticipantsReadIndexV3ResponseBody;
        this.participants_min_index_body = getConversationParticipantsMinIndexV3ResponseBody;
        this.get_ticket_body = getTicketResponseBody;
        this.get_conversation_list_body = getUserConversationListResponseBody;
        this.broadcast_user_counter_body = broadcastUserCounterResponseBody;
        this.report_client_metrics_body = c1c55;
        this.get_configs_body = getConfigsResponseBody;
        this.unread_count_report_body = unReadCountReportResponseBody;
        this.block_members_body = blockMembersResponseBody;
        this.block_conversation_body = c1c4y;
        this.get_message_info_by_index_v2_body = getMessageInfoByIndexV2ResponseBody;
        this.mark_message_body = markMessageResponseBody;
        this.pull_mark_message_body = pullMarkMessageResponseBody;
        this.batch_get_conversation_participants_readindex = batchGetConversationParticipantsReadIndexResponseBody;
        this.get_recent_message_body = getRecentMessageRespBody;
        this.get_cmd_message_body = getCmdMessageRespBody;
        this.get_message_info_by_index_v2_range_body = getMessageInfoByIndexV2RangeResponseBody;
        this.message_by_init = messageByInitResponseBody;
        this.previewer_messages_in_conversation_body = previewerMessagesInConversationResponseBody;
        this.previewer_get_conversation_info_list_body = previewerGetConversationInfoListResponseBody;
        this.mark_msg_unread_count_report = markMsgUnreadCountReportResponseBody;
        this.mark_msg_get_unread_count = markMsgGetUnreadCountResponseBody;
        this.batch_unmark_message = batchUnmarkMessageResponseBody;
        this.client_batch_ack_body = c2224411C4h;
        this.media_upload_config_response_body = getMediaUploadConfigResponseBody;
        this.media_status_response_body = getMediaStatusResponseBody;
        this.conversation_message_pre_view_body = conversationMessagePreViewResponseBody;
        this.get_messages_body = getMessagesResponseBody;
        this.batch_get_messages_body = batchGetMessagesResponseBody;
        this.prefetch_conversation_id_body = prefetchConversationIdResponseBody;
        this.extensions = map;
        this.LL = map2;
    }
}
