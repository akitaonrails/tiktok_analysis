package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YOB;
import X.C1C4V;
import X.C1ES0;
import X.C2224441C4k;
import X.C2224561C4w;
import X.C2224591C4z;
import X.C2281521ERy;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.HashMap;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class RequestBody extends Message<RequestBody, C1ES0> {
    public static final ProtoAdapter<RequestBody> ADAPTER = new C2281521ERy();
    public static final long serialVersionUID = 0;
    public final HashMap<String, Object> LL;

    @C09CT("ack_message_body")
    public final AckMessageRequestBody ack_message_body;

    @C09CT("batch_ack_message_body")
    public final BatchAckMessageRequestBody batch_ack_message_body;

    @C09CT("batch_delete_conversation_body")
    public final BatchDeleteConversationRequestBody batch_delete_conversation_body;

    @C09CT("batch_get_conversation_participants_readindex")
    public final BatchGetConversationParticipantsReadIndexRequestBody batch_get_conversation_participants_readindex;

    @C09CT("batch_get_messages_body")
    public final BatchGetMessagesRequestBody batch_get_messages_body;

    @C09CT("batch_mark_read_body")
    public final BatchMarkConversationReadRequestBody batch_mark_read_body;

    @C09CT("batch_set_conversation_setting_info_body")
    public final BatchSetConversationSettingInfoRequestBody batch_set_conversation_setting_info_body;

    @C09CT("batch_unmark_message")
    public final BatchUnmarkMessageRequestBody batch_unmark_message;

    @C09CT("batch_update_conversation_participant_body")
    public final BatchUpdateConversationParticipantRequestBody batch_update_conversation_participant_body;

    @C09CT("block_conversation_body")
    public final BlockConversationRequestBody block_conversation_body;

    @C09CT("block_members_body")
    public final BlockMembersRequestBody block_members_body;

    @C09CT("broadcast_user_counter_body")
    public final BroadcastUserCounterRequestBody broadcast_user_counter_body;

    @C09CT("check_messages_per_user_body")
    public final CheckMessagePerUserRequestBody check_messages_per_user_body;

    @C09CT("check_status_messages_body")
    public final CheckStatusMessagesRequestBody check_status_messages_body;

    @C09CT("client_ack_body")
    public final ClientACKRequestBody client_ack_body;

    @C09CT("client_batch_ack_body")
    public final ClientBatchACKRequestBody client_batch_ack_body;

    @C09CT("conversation_add_participants_body")
    public final ConversationAddParticipantsRequestBody conversation_add_participants_body;

    @C09CT("conversation_message_pre_view_body")
    public final ConversationMessagePreViewRequestBody conversation_message_pre_view_body;

    @C09CT("conversation_message_search_body")
    public final ConversationMessageSearchRequestBody conversation_message_search_body;

    @C09CT("conversation_participants_body")
    public final ConversationParticipantsListRequestBody conversation_participants_body;

    @C09CT("conversation_remove_participants_body")
    public final ConversationRemoveParticipantsRequestBody conversation_remove_participants_body;

    @C09CT("create_conversation_v2_body")
    public final CreateConversationV2RequestBody create_conversation_v2_body;

    @C09CT("delete_conversation_body")
    public final DeleteConversationRequestBody delete_conversation_body;

    @C09CT("delete_message_body")
    public final DeleteMessageRequestBody delete_message_body;

    @C09CT("delete_multi_stranger_conversation_body")
    public final DeleteMultiStrangerConversationRequestBody delete_multi_stranger_conversation_body;

    @C09CT("delete_stranger_all_conversation_body")
    public final C2224441C4k delete_stranger_all_conversation_body;

    @C09CT("delete_stranger_conversation_body")
    public final DeleteStrangerConversationRequestBody delete_stranger_conversation_body;

    @C09CT("delete_stranger_message_body")
    public final DeleteStrangerMessageRequestBody delete_stranger_message_body;

    @C09CT("dissolve_conversation_body")
    public final DissolveConversationRequestBody dissolve_conversation_body;
    public transient HashMap<Integer, Pair<ProtoAdapter, Message>> extensions;

    @C09CT("get_cmd_message_body")
    public final GetCmdMessageReqBody get_cmd_message_body;

    @C09CT("get_configs_body")
    public final C2224561C4w get_configs_body;

    @C09CT("get_conversation_check_info_v2_body")
    public final GetConversationsCheckInfoV2RequestBody get_conversation_check_info_v2_body;

    @C09CT("get_conversation_info_list_by_favorite_v2_body")
    public final ConversationsPerUserByFavoriteV2RequestBody get_conversation_info_list_by_favorite_v2_body;

    @C09CT("get_conversation_info_list_by_top_v2_body")
    public final ConversationsPerUserByTopV2RequestBody get_conversation_info_list_by_top_v2_body;

    @C09CT("get_conversation_info_list_v2_body")
    public final GetConversationInfoListV2RequestBody get_conversation_info_list_v2_body;

    @C09CT("get_conversation_info_v2_body")
    public final GetConversationInfoV2RequestBody get_conversation_info_v2_body;

    @C09CT("get_conversation_list_body")
    public final GetUserConversationListRequestBody get_conversation_list_body;

    @C09CT("get_conversations_checkinfo_body")
    public final C2224591C4z get_conversations_checkinfo_body;

    @C09CT("get_message_by_id_body")
    public final GetMessageByIdRequestBody get_message_by_id_body;

    @C09CT("get_message_info_by_index_v2_body")
    public final GetMessageInfoByIndexV2RequestBody get_message_info_by_index_v2_body;

    @C09CT("get_message_info_by_index_v2_range_body")
    public final GetMessageInfoByIndexV2RangeRequestBody get_message_info_by_index_v2_range_body;

    @C09CT("get_message_preview_body")
    public final GetMessagePreviewRequestBody get_message_preview_body;

    @C09CT("get_messages_body")
    public final GetMessagesRequestBody get_messages_body;

    @C09CT("get_messages_check_info_v2_body")
    public final GetMessagesCheckInfoV2RequestBody get_messages_check_info_v2_body;

    @C09CT("get_messages_checkinfo_in_conversation_body")
    public final GetMessagesCheckInfoInConversationRequestBody get_messages_checkinfo_in_conversation_body;

    @C09CT("get_recent_message_body")
    public final GetRecentMessageReqBody get_recent_message_body;

    @C09CT("get_stranger_conversation_body")
    public final GetStrangerConversationListRequestBody get_stranger_conversation_body;

    @C09CT("get_stranger_messages_body")
    public final GetStrangerMessagesRequestBody get_stranger_messages_body;

    @C09CT("get_ticket_body")
    public final GetTicketRequestBody get_ticket_body;

    @C09CT("leave_conversation_body")
    public final ConversationLeaveRequestBody leave_conversation_body;

    @C09CT("mark_conversation_read_body")
    public final MarkConversationReadRequestBody mark_conversation_read_body;

    @C09CT("mark_message_body")
    public final MarkMessageRequestBody mark_message_body;

    @C09CT("mark_msg_get_unread_count")
    public final MarkMsgGetUnreadCountRequestBody mark_msg_get_unread_count;

    @C09CT("mark_msg_unread_count_report")
    public final MarkMsgUnreadCountReportRequestBody mark_msg_unread_count_report;

    @C09CT("mark_multi_stranger_conversation_read_body")
    public final MarkMultiStrangerConversationReadRequestBody mark_multi_stranger_conversation_read_body;

    @C09CT("mark_stranger_all_conversation_read_body")
    public final C1C4V mark_stranger_all_conversation_read_body;

    @C09CT("mark_stranger_conversation_read_body")
    public final MarkStrangerConversationReadRequestBody mark_stranger_conversation_read_body;

    @C09CT("media_status_request_body")
    public final GetMediaStatusRequestBody media_status_request_body;

    @C09CT("media_upload_config_request_body")
    public final C0YOB media_upload_config_request_body;

    @C09CT("message_by_init")
    public final MessageByInitRequestBody message_by_init;

    @C09CT("messages_in_conversation_body")
    public final MessagesInConversationRequestBody messages_in_conversation_body;

    @C09CT("messages_in_conversation_with_range")
    public final MessagesInConversationWithRangeRequestBody messages_in_conversation_with_range;

    @C09CT("messages_per_conversation_search_body")
    public final MessagesPerConversationSearchRequestBody messages_per_conversation_search_body;

    @C09CT("messages_per_user_body")
    public final MessagesPerUserRequestBody messages_per_user_body;

    @C09CT("messages_per_user_combo_body")
    public final MessagesPerUserComboRequestBody messages_per_user_combo_body;

    @C09CT("messages_per_user_init_v2_body")
    public final MessagesPerUserInitV2RequestBody messages_per_user_init_v2_body;

    @C09CT("modify_message_property_body")
    public final ModifyMessagePropertyRequestBody modify_message_property_body;

    @C09CT("participants_min_index_body")
    public final GetConversationParticipantsMinIndexV3RequestBody participants_min_index_body;

    @C09CT("participants_read_index_body")
    public final GetConversationParticipantsReadIndexV3RequestBody participants_read_index_body;

    @C09CT("prefetch_conversation_id_body")
    public final PrefetchConversationIdRequestBody prefetch_conversation_id_body;

    @C09CT("previewer_get_conversation_info_list_body")
    public final PreviewerGetConversationInfoListRequestBody previewer_get_conversation_info_list_body;

    @C09CT("previewer_messages_in_conversation_body")
    public final PreviewerMessagesInConversationRequestBody previewer_messages_in_conversation_body;

    @C09CT("pull_mark_message_body")
    public final PullMarkMessageRequestBody pull_mark_message_body;

    @C09CT("recall_message_body")
    public final RecallMessageRequestBody recall_message_body;

    @C09CT("report_client_metrics_body")
    public final ReportClientMetricsRequestBody report_client_metrics_body;

    @C09CT("send_input_status_body")
    public final SendInputStatusRequestBody send_input_status_body;

    @C09CT("send_message_body")
    public final SendMessageRequestBody send_message_body;

    @C09CT("send_message_p2p_body")
    public final SendMessageP2PRequestBody send_message_p2p_body;

    @C09CT("send_user_action_body")
    public final SendUserActionRequestBody send_user_action_body;

    @C09CT("set_conversation_core_info_body")
    public final SetConversationCoreInfoRequestBody set_conversation_core_info_body;

    @C09CT("set_conversation_setting_info_body")
    public final SetConversationSettingInfoRequestBody set_conversation_setting_info_body;

    @C09CT("unread_count_report_body")
    public final UnReadCountReportRequestBody unread_count_report_body;

    @C09CT("update_conversation_participant_body")
    public final UpdateConversationParticipantRequestBody update_conversation_participant_body;

    @C09CT("upsert_conversation_core_ext_info_body")
    public final UpsertConversationCoreExtInfoRequestBody upsert_conversation_core_ext_info_body;

    @C09CT("upsert_conversation_setting_ext_info_body")
    public final UpsertConversationSettingExtInfoRequestBody upsert_conversation_setting_ext_info_body;

    @Override // com.squareup.wire.Message
    public C1ES0 newBuilder() {
        C1ES0 c1es0 = new C1ES0();
        c1es0.LIZLLL = this.send_message_body;
        c1es0.LJ = this.messages_per_user_body;
        c1es0.LJFF = this.messages_per_user_init_v2_body;
        c1es0.LJI = this.messages_per_user_combo_body;
        c1es0.LJII = this.messages_per_conversation_search_body;
        c1es0.LJIIIIZZ = this.check_messages_per_user_body;
        c1es0.LJIIIZ = this.check_status_messages_body;
        c1es0.LJIIJ = this.get_message_by_id_body;
        c1es0.LJIIJJI = this.messages_in_conversation_body;
        c1es0.LJIIL = this.get_messages_checkinfo_in_conversation_body;
        c1es0.LJIILIIL = this.get_messages_check_info_v2_body;
        c1es0.LJIILJJIL = this.messages_in_conversation_with_range;
        c1es0.LJIILL = this.get_message_preview_body;
        c1es0.LJIILLIIL = this.send_user_action_body;
        c1es0.LJIIZILJ = this.send_input_status_body;
        c1es0.LJIJ = this.delete_conversation_body;
        c1es0.LJIJI = this.mark_conversation_read_body;
        c1es0.LJIJJ = this.conversation_participants_body;
        c1es0.LJIJJLI = this.get_conversation_info_v2_body;
        c1es0.LJIL = this.create_conversation_v2_body;
        c1es0.LJJ = this.get_conversation_info_list_v2_body;
        c1es0.LJJI = this.get_conversation_info_list_by_favorite_v2_body;
        c1es0.LJJIFFI = this.get_conversation_info_list_by_top_v2_body;
        c1es0.LJJII = this.batch_mark_read_body;
        c1es0.LJJIII = this.dissolve_conversation_body;
        c1es0.LJJIIJ = this.get_conversations_checkinfo_body;
        c1es0.LJJIIJZLJL = this.get_conversation_check_info_v2_body;
        c1es0.LJJIIZ = this.batch_delete_conversation_body;
        c1es0.LJJIIZI = this.conversation_add_participants_body;
        c1es0.LJJIJ = this.conversation_remove_participants_body;
        c1es0.LJJIJIIJI = this.leave_conversation_body;
        c1es0.LJJIJIIJIL = this.update_conversation_participant_body;
        c1es0.LJJIJIL = this.batch_update_conversation_participant_body;
        c1es0.LJJIJL = this.delete_message_body;
        c1es0.LJJIJLIJ = this.recall_message_body;
        c1es0.LJJIL = this.modify_message_property_body;
        c1es0.LJJIZ = this.ack_message_body;
        c1es0.LJJJ = this.batch_ack_message_body;
        c1es0.LJJJI = this.set_conversation_core_info_body;
        c1es0.LJJJIL = this.upsert_conversation_core_ext_info_body;
        c1es0.LJJJJ = this.set_conversation_setting_info_body;
        c1es0.LJJJJI = this.upsert_conversation_setting_ext_info_body;
        c1es0.LJJJJIZL = this.batch_set_conversation_setting_info_body;
        c1es0.LJJJJJ = this.get_stranger_conversation_body;
        c1es0.LJJJJJL = this.get_stranger_messages_body;
        c1es0.LJJJJL = this.delete_stranger_message_body;
        c1es0.LJJJJLI = this.delete_stranger_conversation_body;
        c1es0.LJJJJLL = this.delete_stranger_all_conversation_body;
        c1es0.LJJJJZ = this.mark_stranger_conversation_read_body;
        c1es0.LJJJJZI = this.mark_stranger_all_conversation_read_body;
        c1es0.LJJJLIIL = this.delete_multi_stranger_conversation_body;
        c1es0.LJJJLL = this.mark_multi_stranger_conversation_read_body;
        c1es0.LJJJLZIJ = this.participants_read_index_body;
        c1es0.LJJJZ = this.participants_min_index_body;
        c1es0.LJJL = this.get_ticket_body;
        c1es0.LJJLI = this.get_conversation_list_body;
        c1es0.LJJLIIIIJ = this.broadcast_user_counter_body;
        c1es0.LJJLIIIJ = this.client_ack_body;
        c1es0.LJJLIIIJILLIZJL = this.report_client_metrics_body;
        c1es0.LJJLIIIJJI = this.get_configs_body;
        c1es0.LJJLIIIJJIZ = this.unread_count_report_body;
        c1es0.LJJLIIIJL = this.block_members_body;
        c1es0.LJJLIIIJLJLI = this.block_conversation_body;
        c1es0.LJJLIIIJLLLLLLLZ = this.send_message_p2p_body;
        c1es0.LJJLIIJ = this.get_message_info_by_index_v2_body;
        c1es0.LJJLIL = this.mark_message_body;
        c1es0.LJJLJ = this.pull_mark_message_body;
        c1es0.LJJLJLI = this.batch_get_conversation_participants_readindex;
        c1es0.LJJLL = this.get_recent_message_body;
        c1es0.LJJZ = this.get_cmd_message_body;
        c1es0.LJJZZI = this.get_message_info_by_index_v2_range_body;
        c1es0.LJJZZIII = this.message_by_init;
        c1es0.LJL = this.previewer_messages_in_conversation_body;
        c1es0.LJLI = this.previewer_get_conversation_info_list_body;
        c1es0.LJLIIIL = this.mark_msg_unread_count_report;
        c1es0.LJLIIL = this.mark_msg_get_unread_count;
        c1es0.LJLIL = this.batch_unmark_message;
        c1es0.LJLILLLLZI = this.client_batch_ack_body;
        c1es0.LJLJI = this.media_upload_config_request_body;
        c1es0.LJLJJI = this.media_status_request_body;
        c1es0.LJLJJL = this.conversation_message_search_body;
        c1es0.LJLJJLL = this.conversation_message_pre_view_body;
        c1es0.LJLJL = this.get_messages_body;
        c1es0.LJLJLJ = this.batch_get_messages_body;
        c1es0.LJLJLLL = this.prefetch_conversation_id_body;
        c1es0.LJLL = this.extensions;
        c1es0.LJLLI = this.LL;
        c1es0.addUnknownFields(unknownFields());
        return c1es0;
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
        if (this.check_status_messages_body != null) {
            sb.append(", check_status_messages_body=");
            sb.append(this.check_status_messages_body);
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
        if (this.get_messages_check_info_v2_body != null) {
            sb.append(", get_messages_check_info_v2_body=");
            sb.append(this.get_messages_check_info_v2_body);
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
        if (this.delete_conversation_body != null) {
            sb.append(", delete_conversation_body=");
            sb.append(this.delete_conversation_body);
        }
        if (this.mark_conversation_read_body != null) {
            sb.append(", mark_conversation_read_body=");
            sb.append(this.mark_conversation_read_body);
        }
        if (this.conversation_participants_body != null) {
            sb.append(", conversation_participants_body=");
            sb.append(this.conversation_participants_body);
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
        if (this.batch_mark_read_body != null) {
            sb.append(", batch_mark_read_body=");
            sb.append(this.batch_mark_read_body);
        }
        if (this.dissolve_conversation_body != null) {
            sb.append(", dissolve_conversation_body=");
            sb.append(this.dissolve_conversation_body);
        }
        if (this.get_conversations_checkinfo_body != null) {
            sb.append(", get_conversations_checkinfo_body=");
            sb.append(this.get_conversations_checkinfo_body);
        }
        if (this.get_conversation_check_info_v2_body != null) {
            sb.append(", get_conversation_check_info_v2_body=");
            sb.append(this.get_conversation_check_info_v2_body);
        }
        if (this.batch_delete_conversation_body != null) {
            sb.append(", batch_delete_conversation_body=");
            sb.append(this.batch_delete_conversation_body);
        }
        if (this.conversation_add_participants_body != null) {
            sb.append(", conversation_add_participants_body=");
            sb.append(this.conversation_add_participants_body);
        }
        if (this.conversation_remove_participants_body != null) {
            sb.append(", conversation_remove_participants_body=");
            sb.append(this.conversation_remove_participants_body);
        }
        if (this.leave_conversation_body != null) {
            sb.append(", leave_conversation_body=");
            sb.append(this.leave_conversation_body);
        }
        if (this.update_conversation_participant_body != null) {
            sb.append(", update_conversation_participant_body=");
            sb.append(this.update_conversation_participant_body);
        }
        if (this.batch_update_conversation_participant_body != null) {
            sb.append(", batch_update_conversation_participant_body=");
            sb.append(this.batch_update_conversation_participant_body);
        }
        if (this.delete_message_body != null) {
            sb.append(", delete_message_body=");
            sb.append(this.delete_message_body);
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
        if (this.client_ack_body != null) {
            sb.append(", client_ack_body=");
            sb.append(this.client_ack_body);
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
        if (this.send_message_p2p_body != null) {
            sb.append(", send_message_p2p_body=");
            sb.append(this.send_message_p2p_body);
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
        if (this.media_upload_config_request_body != null) {
            sb.append(", media_upload_config_request_body=");
            sb.append(this.media_upload_config_request_body);
        }
        if (this.media_status_request_body != null) {
            sb.append(", media_status_request_body=");
            sb.append(this.media_status_request_body);
        }
        if (this.conversation_message_search_body != null) {
            sb.append(", conversation_message_search_body=");
            sb.append(this.conversation_message_search_body);
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
        sb.replace(0, 2, "RequestBody{");
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

    public RequestBody(SendMessageRequestBody sendMessageRequestBody, MessagesPerUserRequestBody messagesPerUserRequestBody, MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody, MessagesPerUserComboRequestBody messagesPerUserComboRequestBody, MessagesPerConversationSearchRequestBody messagesPerConversationSearchRequestBody, CheckMessagePerUserRequestBody checkMessagePerUserRequestBody, CheckStatusMessagesRequestBody checkStatusMessagesRequestBody, GetMessageByIdRequestBody getMessageByIdRequestBody, MessagesInConversationRequestBody messagesInConversationRequestBody, GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody, GetMessagesCheckInfoV2RequestBody getMessagesCheckInfoV2RequestBody, MessagesInConversationWithRangeRequestBody messagesInConversationWithRangeRequestBody, GetMessagePreviewRequestBody getMessagePreviewRequestBody, SendUserActionRequestBody sendUserActionRequestBody, SendInputStatusRequestBody sendInputStatusRequestBody, DeleteConversationRequestBody deleteConversationRequestBody, MarkConversationReadRequestBody markConversationReadRequestBody, ConversationParticipantsListRequestBody conversationParticipantsListRequestBody, GetConversationInfoV2RequestBody getConversationInfoV2RequestBody, CreateConversationV2RequestBody createConversationV2RequestBody, GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody, ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody, ConversationsPerUserByTopV2RequestBody conversationsPerUserByTopV2RequestBody, BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody, DissolveConversationRequestBody dissolveConversationRequestBody, C2224591C4z c2224591C4z, GetConversationsCheckInfoV2RequestBody getConversationsCheckInfoV2RequestBody, BatchDeleteConversationRequestBody batchDeleteConversationRequestBody, ConversationAddParticipantsRequestBody conversationAddParticipantsRequestBody, ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody, ConversationLeaveRequestBody conversationLeaveRequestBody, UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody, BatchUpdateConversationParticipantRequestBody batchUpdateConversationParticipantRequestBody, DeleteMessageRequestBody deleteMessageRequestBody, RecallMessageRequestBody recallMessageRequestBody, ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody, AckMessageRequestBody ackMessageRequestBody, BatchAckMessageRequestBody batchAckMessageRequestBody, SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody, UpsertConversationCoreExtInfoRequestBody upsertConversationCoreExtInfoRequestBody, SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody, UpsertConversationSettingExtInfoRequestBody upsertConversationSettingExtInfoRequestBody, BatchSetConversationSettingInfoRequestBody batchSetConversationSettingInfoRequestBody, GetStrangerConversationListRequestBody getStrangerConversationListRequestBody, GetStrangerMessagesRequestBody getStrangerMessagesRequestBody, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody, DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody, C2224441C4k c2224441C4k, MarkStrangerConversationReadRequestBody markStrangerConversationReadRequestBody, C1C4V c1c4v, DeleteMultiStrangerConversationRequestBody deleteMultiStrangerConversationRequestBody, MarkMultiStrangerConversationReadRequestBody markMultiStrangerConversationReadRequestBody, GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody, GetConversationParticipantsMinIndexV3RequestBody getConversationParticipantsMinIndexV3RequestBody, GetTicketRequestBody getTicketRequestBody, GetUserConversationListRequestBody getUserConversationListRequestBody, BroadcastUserCounterRequestBody broadcastUserCounterRequestBody, ClientACKRequestBody clientACKRequestBody, ReportClientMetricsRequestBody reportClientMetricsRequestBody, C2224561C4w c2224561C4w, UnReadCountReportRequestBody unReadCountReportRequestBody, BlockMembersRequestBody blockMembersRequestBody, BlockConversationRequestBody blockConversationRequestBody, SendMessageP2PRequestBody sendMessageP2PRequestBody, GetMessageInfoByIndexV2RequestBody getMessageInfoByIndexV2RequestBody, MarkMessageRequestBody markMessageRequestBody, PullMarkMessageRequestBody pullMarkMessageRequestBody, BatchGetConversationParticipantsReadIndexRequestBody batchGetConversationParticipantsReadIndexRequestBody, GetRecentMessageReqBody getRecentMessageReqBody, GetCmdMessageReqBody getCmdMessageReqBody, GetMessageInfoByIndexV2RangeRequestBody getMessageInfoByIndexV2RangeRequestBody, MessageByInitRequestBody messageByInitRequestBody, PreviewerMessagesInConversationRequestBody previewerMessagesInConversationRequestBody, PreviewerGetConversationInfoListRequestBody previewerGetConversationInfoListRequestBody, MarkMsgUnreadCountReportRequestBody markMsgUnreadCountReportRequestBody, MarkMsgGetUnreadCountRequestBody markMsgGetUnreadCountRequestBody, BatchUnmarkMessageRequestBody batchUnmarkMessageRequestBody, ClientBatchACKRequestBody clientBatchACKRequestBody, C0YOB c0yob, GetMediaStatusRequestBody getMediaStatusRequestBody, ConversationMessageSearchRequestBody conversationMessageSearchRequestBody, ConversationMessagePreViewRequestBody conversationMessagePreViewRequestBody, GetMessagesRequestBody getMessagesRequestBody, BatchGetMessagesRequestBody batchGetMessagesRequestBody, PrefetchConversationIdRequestBody prefetchConversationIdRequestBody, HashMap<Integer, Pair<ProtoAdapter, Message>> map, HashMap<String, Object> map2) {
        this(sendMessageRequestBody, messagesPerUserRequestBody, messagesPerUserInitV2RequestBody, messagesPerUserComboRequestBody, messagesPerConversationSearchRequestBody, checkMessagePerUserRequestBody, checkStatusMessagesRequestBody, getMessageByIdRequestBody, messagesInConversationRequestBody, getMessagesCheckInfoInConversationRequestBody, getMessagesCheckInfoV2RequestBody, messagesInConversationWithRangeRequestBody, getMessagePreviewRequestBody, sendUserActionRequestBody, sendInputStatusRequestBody, deleteConversationRequestBody, markConversationReadRequestBody, conversationParticipantsListRequestBody, getConversationInfoV2RequestBody, createConversationV2RequestBody, getConversationInfoListV2RequestBody, conversationsPerUserByFavoriteV2RequestBody, conversationsPerUserByTopV2RequestBody, batchMarkConversationReadRequestBody, dissolveConversationRequestBody, c2224591C4z, getConversationsCheckInfoV2RequestBody, batchDeleteConversationRequestBody, conversationAddParticipantsRequestBody, conversationRemoveParticipantsRequestBody, conversationLeaveRequestBody, updateConversationParticipantRequestBody, batchUpdateConversationParticipantRequestBody, deleteMessageRequestBody, recallMessageRequestBody, modifyMessagePropertyRequestBody, ackMessageRequestBody, batchAckMessageRequestBody, setConversationCoreInfoRequestBody, upsertConversationCoreExtInfoRequestBody, setConversationSettingInfoRequestBody, upsertConversationSettingExtInfoRequestBody, batchSetConversationSettingInfoRequestBody, getStrangerConversationListRequestBody, getStrangerMessagesRequestBody, deleteStrangerMessageRequestBody, deleteStrangerConversationRequestBody, c2224441C4k, markStrangerConversationReadRequestBody, c1c4v, deleteMultiStrangerConversationRequestBody, markMultiStrangerConversationReadRequestBody, getConversationParticipantsReadIndexV3RequestBody, getConversationParticipantsMinIndexV3RequestBody, getTicketRequestBody, getUserConversationListRequestBody, broadcastUserCounterRequestBody, clientACKRequestBody, reportClientMetricsRequestBody, c2224561C4w, unReadCountReportRequestBody, blockMembersRequestBody, blockConversationRequestBody, sendMessageP2PRequestBody, getMessageInfoByIndexV2RequestBody, markMessageRequestBody, pullMarkMessageRequestBody, batchGetConversationParticipantsReadIndexRequestBody, getRecentMessageReqBody, getCmdMessageReqBody, getMessageInfoByIndexV2RangeRequestBody, messageByInitRequestBody, previewerMessagesInConversationRequestBody, previewerGetConversationInfoListRequestBody, markMsgUnreadCountReportRequestBody, markMsgGetUnreadCountRequestBody, batchUnmarkMessageRequestBody, clientBatchACKRequestBody, c0yob, getMediaStatusRequestBody, conversationMessageSearchRequestBody, conversationMessagePreViewRequestBody, getMessagesRequestBody, batchGetMessagesRequestBody, prefetchConversationIdRequestBody, map, map2, ByteString.EMPTY);
    }

    public RequestBody(SendMessageRequestBody sendMessageRequestBody, MessagesPerUserRequestBody messagesPerUserRequestBody, MessagesPerUserInitV2RequestBody messagesPerUserInitV2RequestBody, MessagesPerUserComboRequestBody messagesPerUserComboRequestBody, MessagesPerConversationSearchRequestBody messagesPerConversationSearchRequestBody, CheckMessagePerUserRequestBody checkMessagePerUserRequestBody, CheckStatusMessagesRequestBody checkStatusMessagesRequestBody, GetMessageByIdRequestBody getMessageByIdRequestBody, MessagesInConversationRequestBody messagesInConversationRequestBody, GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody, GetMessagesCheckInfoV2RequestBody getMessagesCheckInfoV2RequestBody, MessagesInConversationWithRangeRequestBody messagesInConversationWithRangeRequestBody, GetMessagePreviewRequestBody getMessagePreviewRequestBody, SendUserActionRequestBody sendUserActionRequestBody, SendInputStatusRequestBody sendInputStatusRequestBody, DeleteConversationRequestBody deleteConversationRequestBody, MarkConversationReadRequestBody markConversationReadRequestBody, ConversationParticipantsListRequestBody conversationParticipantsListRequestBody, GetConversationInfoV2RequestBody getConversationInfoV2RequestBody, CreateConversationV2RequestBody createConversationV2RequestBody, GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody, ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody, ConversationsPerUserByTopV2RequestBody conversationsPerUserByTopV2RequestBody, BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody, DissolveConversationRequestBody dissolveConversationRequestBody, C2224591C4z c2224591C4z, GetConversationsCheckInfoV2RequestBody getConversationsCheckInfoV2RequestBody, BatchDeleteConversationRequestBody batchDeleteConversationRequestBody, ConversationAddParticipantsRequestBody conversationAddParticipantsRequestBody, ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody, ConversationLeaveRequestBody conversationLeaveRequestBody, UpdateConversationParticipantRequestBody updateConversationParticipantRequestBody, BatchUpdateConversationParticipantRequestBody batchUpdateConversationParticipantRequestBody, DeleteMessageRequestBody deleteMessageRequestBody, RecallMessageRequestBody recallMessageRequestBody, ModifyMessagePropertyRequestBody modifyMessagePropertyRequestBody, AckMessageRequestBody ackMessageRequestBody, BatchAckMessageRequestBody batchAckMessageRequestBody, SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody, UpsertConversationCoreExtInfoRequestBody upsertConversationCoreExtInfoRequestBody, SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody, UpsertConversationSettingExtInfoRequestBody upsertConversationSettingExtInfoRequestBody, BatchSetConversationSettingInfoRequestBody batchSetConversationSettingInfoRequestBody, GetStrangerConversationListRequestBody getStrangerConversationListRequestBody, GetStrangerMessagesRequestBody getStrangerMessagesRequestBody, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody, DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody, C2224441C4k c2224441C4k, MarkStrangerConversationReadRequestBody markStrangerConversationReadRequestBody, C1C4V c1c4v, DeleteMultiStrangerConversationRequestBody deleteMultiStrangerConversationRequestBody, MarkMultiStrangerConversationReadRequestBody markMultiStrangerConversationReadRequestBody, GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody, GetConversationParticipantsMinIndexV3RequestBody getConversationParticipantsMinIndexV3RequestBody, GetTicketRequestBody getTicketRequestBody, GetUserConversationListRequestBody getUserConversationListRequestBody, BroadcastUserCounterRequestBody broadcastUserCounterRequestBody, ClientACKRequestBody clientACKRequestBody, ReportClientMetricsRequestBody reportClientMetricsRequestBody, C2224561C4w c2224561C4w, UnReadCountReportRequestBody unReadCountReportRequestBody, BlockMembersRequestBody blockMembersRequestBody, BlockConversationRequestBody blockConversationRequestBody, SendMessageP2PRequestBody sendMessageP2PRequestBody, GetMessageInfoByIndexV2RequestBody getMessageInfoByIndexV2RequestBody, MarkMessageRequestBody markMessageRequestBody, PullMarkMessageRequestBody pullMarkMessageRequestBody, BatchGetConversationParticipantsReadIndexRequestBody batchGetConversationParticipantsReadIndexRequestBody, GetRecentMessageReqBody getRecentMessageReqBody, GetCmdMessageReqBody getCmdMessageReqBody, GetMessageInfoByIndexV2RangeRequestBody getMessageInfoByIndexV2RangeRequestBody, MessageByInitRequestBody messageByInitRequestBody, PreviewerMessagesInConversationRequestBody previewerMessagesInConversationRequestBody, PreviewerGetConversationInfoListRequestBody previewerGetConversationInfoListRequestBody, MarkMsgUnreadCountReportRequestBody markMsgUnreadCountReportRequestBody, MarkMsgGetUnreadCountRequestBody markMsgGetUnreadCountRequestBody, BatchUnmarkMessageRequestBody batchUnmarkMessageRequestBody, ClientBatchACKRequestBody clientBatchACKRequestBody, C0YOB c0yob, GetMediaStatusRequestBody getMediaStatusRequestBody, ConversationMessageSearchRequestBody conversationMessageSearchRequestBody, ConversationMessagePreViewRequestBody conversationMessagePreViewRequestBody, GetMessagesRequestBody getMessagesRequestBody, BatchGetMessagesRequestBody batchGetMessagesRequestBody, PrefetchConversationIdRequestBody prefetchConversationIdRequestBody, HashMap<Integer, Pair<ProtoAdapter, Message>> map, HashMap<String, Object> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.extensions = new HashMap<>();
        this.LL = new HashMap<>();
        this.send_message_body = sendMessageRequestBody;
        this.messages_per_user_body = messagesPerUserRequestBody;
        this.messages_per_user_init_v2_body = messagesPerUserInitV2RequestBody;
        this.messages_per_user_combo_body = messagesPerUserComboRequestBody;
        this.messages_per_conversation_search_body = messagesPerConversationSearchRequestBody;
        this.check_messages_per_user_body = checkMessagePerUserRequestBody;
        this.check_status_messages_body = checkStatusMessagesRequestBody;
        this.get_message_by_id_body = getMessageByIdRequestBody;
        this.messages_in_conversation_body = messagesInConversationRequestBody;
        this.get_messages_checkinfo_in_conversation_body = getMessagesCheckInfoInConversationRequestBody;
        this.get_messages_check_info_v2_body = getMessagesCheckInfoV2RequestBody;
        this.messages_in_conversation_with_range = messagesInConversationWithRangeRequestBody;
        this.get_message_preview_body = getMessagePreviewRequestBody;
        this.send_user_action_body = sendUserActionRequestBody;
        this.send_input_status_body = sendInputStatusRequestBody;
        this.delete_conversation_body = deleteConversationRequestBody;
        this.mark_conversation_read_body = markConversationReadRequestBody;
        this.conversation_participants_body = conversationParticipantsListRequestBody;
        this.get_conversation_info_v2_body = getConversationInfoV2RequestBody;
        this.create_conversation_v2_body = createConversationV2RequestBody;
        this.get_conversation_info_list_v2_body = getConversationInfoListV2RequestBody;
        this.get_conversation_info_list_by_favorite_v2_body = conversationsPerUserByFavoriteV2RequestBody;
        this.get_conversation_info_list_by_top_v2_body = conversationsPerUserByTopV2RequestBody;
        this.batch_mark_read_body = batchMarkConversationReadRequestBody;
        this.dissolve_conversation_body = dissolveConversationRequestBody;
        this.get_conversations_checkinfo_body = c2224591C4z;
        this.get_conversation_check_info_v2_body = getConversationsCheckInfoV2RequestBody;
        this.batch_delete_conversation_body = batchDeleteConversationRequestBody;
        this.conversation_add_participants_body = conversationAddParticipantsRequestBody;
        this.conversation_remove_participants_body = conversationRemoveParticipantsRequestBody;
        this.leave_conversation_body = conversationLeaveRequestBody;
        this.update_conversation_participant_body = updateConversationParticipantRequestBody;
        this.batch_update_conversation_participant_body = batchUpdateConversationParticipantRequestBody;
        this.delete_message_body = deleteMessageRequestBody;
        this.recall_message_body = recallMessageRequestBody;
        this.modify_message_property_body = modifyMessagePropertyRequestBody;
        this.ack_message_body = ackMessageRequestBody;
        this.batch_ack_message_body = batchAckMessageRequestBody;
        this.set_conversation_core_info_body = setConversationCoreInfoRequestBody;
        this.upsert_conversation_core_ext_info_body = upsertConversationCoreExtInfoRequestBody;
        this.set_conversation_setting_info_body = setConversationSettingInfoRequestBody;
        this.upsert_conversation_setting_ext_info_body = upsertConversationSettingExtInfoRequestBody;
        this.batch_set_conversation_setting_info_body = batchSetConversationSettingInfoRequestBody;
        this.get_stranger_conversation_body = getStrangerConversationListRequestBody;
        this.get_stranger_messages_body = getStrangerMessagesRequestBody;
        this.delete_stranger_message_body = deleteStrangerMessageRequestBody;
        this.delete_stranger_conversation_body = deleteStrangerConversationRequestBody;
        this.delete_stranger_all_conversation_body = c2224441C4k;
        this.mark_stranger_conversation_read_body = markStrangerConversationReadRequestBody;
        this.mark_stranger_all_conversation_read_body = c1c4v;
        this.delete_multi_stranger_conversation_body = deleteMultiStrangerConversationRequestBody;
        this.mark_multi_stranger_conversation_read_body = markMultiStrangerConversationReadRequestBody;
        this.participants_read_index_body = getConversationParticipantsReadIndexV3RequestBody;
        this.participants_min_index_body = getConversationParticipantsMinIndexV3RequestBody;
        this.get_ticket_body = getTicketRequestBody;
        this.get_conversation_list_body = getUserConversationListRequestBody;
        this.broadcast_user_counter_body = broadcastUserCounterRequestBody;
        this.client_ack_body = clientACKRequestBody;
        this.report_client_metrics_body = reportClientMetricsRequestBody;
        this.get_configs_body = c2224561C4w;
        this.unread_count_report_body = unReadCountReportRequestBody;
        this.block_members_body = blockMembersRequestBody;
        this.block_conversation_body = blockConversationRequestBody;
        this.send_message_p2p_body = sendMessageP2PRequestBody;
        this.get_message_info_by_index_v2_body = getMessageInfoByIndexV2RequestBody;
        this.mark_message_body = markMessageRequestBody;
        this.pull_mark_message_body = pullMarkMessageRequestBody;
        this.batch_get_conversation_participants_readindex = batchGetConversationParticipantsReadIndexRequestBody;
        this.get_recent_message_body = getRecentMessageReqBody;
        this.get_cmd_message_body = getCmdMessageReqBody;
        this.get_message_info_by_index_v2_range_body = getMessageInfoByIndexV2RangeRequestBody;
        this.message_by_init = messageByInitRequestBody;
        this.previewer_messages_in_conversation_body = previewerMessagesInConversationRequestBody;
        this.previewer_get_conversation_info_list_body = previewerGetConversationInfoListRequestBody;
        this.mark_msg_unread_count_report = markMsgUnreadCountReportRequestBody;
        this.mark_msg_get_unread_count = markMsgGetUnreadCountRequestBody;
        this.batch_unmark_message = batchUnmarkMessageRequestBody;
        this.client_batch_ack_body = clientBatchACKRequestBody;
        this.media_upload_config_request_body = c0yob;
        this.media_status_request_body = getMediaStatusRequestBody;
        this.conversation_message_search_body = conversationMessageSearchRequestBody;
        this.conversation_message_pre_view_body = conversationMessagePreViewRequestBody;
        this.get_messages_body = getMessagesRequestBody;
        this.batch_get_messages_body = batchGetMessagesRequestBody;
        this.prefetch_conversation_id_body = prefetchConversationIdRequestBody;
        this.extensions = map;
        this.LL = map2;
    }
}
