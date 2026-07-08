package com.bytedance.android.livesdk.aireply;

import X.AbstractC1110800f0o;
import X.C013C;
import X.C01C7;
import X.C020Z;
import X.C1115360f8A;
import X.C1115380f8C;
import X.C1161920gLG;
import X.C1338270kvh;
import X.C20736316Cj;
import X.C23250099c;
import X.C378001dS;
import X.C475510Ikn;
import X.C5183020f;
import X.C766270U4b;
import X.C786410Ut5;
import X.InterfaceC1112060f2q;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.aireply.IAIReplyWatcherManagerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.aireply.AIReplyAssistantFeedbackDialog;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.CommentReplyMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AIReplyAssistantFeedbackDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSw+LDHELIOS8/MWsNAB02OCk1CDwgITY4KCEnDiApLS0yKy4IIC4/JyI=";
    public LiveIconView LLJLLL;
    public LiveIconView LLJZ;
    public int LLJZIJLIL = -1;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.dimBehindType = 0;
        sheetOptions.LIZ(0, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    public final void uS(CommentReplyMessage commentReplyMessage) {
        int i = commentReplyMessage.LL;
        this.LLJZIJLIL = i;
        if (i != 1) {
            if (i != 2) {
                LiveIconView liveIconView = this.LLJZ;
                if (liveIconView != null) {
                    liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.ejk, getContext()));
                }
                LiveIconView liveIconView2 = this.LLJLLL;
                if (liveIconView2 != null) {
                    liveIconView2.setIcon(C20736316Cj.LIZLLL(R.attr.eji, getContext()));
                    return;
                }
                return;
            }
            LiveIconView liveIconView3 = this.LLJZ;
            if (liveIconView3 != null) {
                liveIconView3.setIcon(C20736316Cj.LIZLLL(R.attr.ejk, getContext()));
            }
            LiveIconView liveIconView4 = this.LLJLLL;
            if (liveIconView4 == null) {
                return;
            }
            liveIconView4.setIcon(C20736316Cj.LIZLLL(R.attr.ejj, getContext()));
            return;
        }
        LiveIconView liveIconView5 = this.LLJZ;
        if (liveIconView5 != null) {
            liveIconView5.setIcon(C20736316Cj.LIZLLL(R.attr.ejl, getContext()));
        }
        LiveIconView liveIconView6 = this.LLJLLL;
        if (liveIconView6 == null) {
            return;
        }
        liveIconView6.setIcon(C20736316Cj.LIZLLL(R.attr.eji, getContext()));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        AbstractC1110800f0o abstractC1110800f0o;
        final CommentReplyMessage commentReplyMessage;
        super.onViewCreated(view, bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            TextView textView = (TextView) view.findViewById(R.id.zy4);
            TextView textView2 = (TextView) view.findViewById(R.id.tv_reply_content);
            dataChannelLJ.BQ2(this, LiveEndDismissDialogEvent.class, new C5183020f(this, 80));
            View viewFindViewById = view.findViewById(R.id.cvz);
            View viewFindViewById2 = view.findViewById(R.id.cvy);
            this.LLJZ = (LiveIconView) view.findViewById(R.id.lxr);
            this.LLJLLL = (LiveIconView) view.findViewById(R.id.lxq);
            Bundle arguments = getArguments();
            if (arguments != null) {
                j = arguments.getLong("param_msg_id");
            } else {
                j = 0;
            }
            final Room room = (Room) dataChannelLJ.gg0(RoomChannel.class);
            if (room == null) {
                Map<String, Object> map = C1338270kvh.LIZ;
                C766270U4b.LIZLLL(2131851936);
                close(1);
                return;
            }
            InterfaceC1112060f2q interfaceC1112060f2qAA1 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).aA1(0, room.getId(), j);
            if ((interfaceC1112060f2qAA1 instanceof AbstractC1110800f0o) && (abstractC1110800f0o = (AbstractC1110800f0o) interfaceC1112060f2qAA1) != null) {
                MESSAGE message = abstractC1110800f0o.LJIL;
                if ((message instanceof CommentReplyMessage) && (commentReplyMessage = (CommentReplyMessage) message) != null) {
                    User user = (User) UserService.getInstance().user().getCurrentUser();
                    textView2.setText(commentReplyMessage.replyContent);
                    C1115360f8A c1115360f8A = C1115380f8C.LIZ;
                    C1115380f8C.LIZLLL(new SpannableStringBuilder(commentReplyMessage.commentContent), textView.getResources(), this, new C020Z(user, textView, 3));
                    final C013C c013c = new C013C();
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C378001dS(commentReplyMessage, c013c, commentReplyMessage.LL, this, null), 3);
                    uS(commentReplyMessage);
                    C01C7.LIZIZ(new View.OnClickListener() { // from class: X.01iD
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            if (this.LL.LLJZIJLIL == 1) {
                                return;
                            }
                            IAIReplyWatcherManagerService.Companion.getClass();
                            if (C378201dU.LIZ().feedbackComment(commentReplyMessage, room.getOwnerUserId(), true)) {
                                AIReplyAssistantFeedbackDialog aIReplyAssistantFeedbackDialog = this.LL;
                                LiveIconView liveIconView = aIReplyAssistantFeedbackDialog.LLJZ;
                                if (liveIconView != null) {
                                    liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.ejl, aIReplyAssistantFeedbackDialog.getContext()));
                                }
                                AIReplyAssistantFeedbackDialog aIReplyAssistantFeedbackDialog2 = this.LL;
                                LiveIconView liveIconView2 = aIReplyAssistantFeedbackDialog2.LLJLLL;
                                if (liveIconView2 != null) {
                                    liveIconView2.setIcon(C20736316Cj.LIZLLL(R.attr.eji, aIReplyAssistantFeedbackDialog2.getContext()));
                                }
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ai_reply_audience_feedback");
                                c474500IjALIZ.LJIIIIZZ();
                                c474500IjALIZ.LJJII("like", "click_type");
                                c474500IjALIZ.LJJII(Long.valueOf(commentReplyMessage.getMessageId()), "msg_id");
                                c474500IjALIZ.LIZ();
                                c013c.element = true;
                            }
                        }
                    }, viewFindViewById);
                    C01C7.LIZIZ(new View.OnClickListener() { // from class: X.01iE
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            if (this.LL.LLJZIJLIL == 2) {
                                return;
                            }
                            IAIReplyWatcherManagerService.Companion.getClass();
                            if (C378201dU.LIZ().feedbackComment(commentReplyMessage, room.getOwnerUserId(), false)) {
                                AIReplyAssistantFeedbackDialog aIReplyAssistantFeedbackDialog = this.LL;
                                LiveIconView liveIconView = aIReplyAssistantFeedbackDialog.LLJLLL;
                                if (liveIconView != null) {
                                    liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.ejj, aIReplyAssistantFeedbackDialog.getContext()));
                                }
                                AIReplyAssistantFeedbackDialog aIReplyAssistantFeedbackDialog2 = this.LL;
                                LiveIconView liveIconView2 = aIReplyAssistantFeedbackDialog2.LLJZ;
                                if (liveIconView2 != null) {
                                    liveIconView2.setIcon(C20736316Cj.LIZLLL(R.attr.ejk, aIReplyAssistantFeedbackDialog2.getContext()));
                                }
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ai_reply_audience_feedback");
                                c474500IjALIZ.LJIIIIZZ();
                                c474500IjALIZ.LJJII("unlike", "click_type");
                                c474500IjALIZ.LJJII(Long.valueOf(commentReplyMessage.getMessageId()), "msg_id");
                                c474500IjALIZ.LIZ();
                                c013c.element = true;
                            }
                        }
                    }, viewFindViewById2);
                    return;
                }
                return;
            }
            Map<String, Object> map2 = C1338270kvh.LIZ;
            C766270U4b.LIZLLL(2131851936);
            close(1);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g4n, viewGroup, false);
    }
}
