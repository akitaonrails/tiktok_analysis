package com.bytedance.android.livesdk.watch;

import X.C01GW;
import X.C086I;
import X.C0IJ3;
import X.C0IJT;
import X.C0IUA;
import X.C0UO0;
import X.C14KS;
import X.C16F5;
import X.C2093608Ic;
import X.C292401Bi;
import X.C464950ILd;
import X.C474500IjA;
import X.C475060Ik4;
import X.C477520Io2;
import X.C480460Ism;
import X.C497740JfY;
import X.C500980Jkm;
import X.C501470JlZ;
import X.C766270U4b;
import X.C786410Ut5;
import X.InterfaceC465240IMg;
import X.InterfaceC475100Ik8;
import Y.AfS176S0100000_7;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.handler.WeakHandler;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Answer;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Question;
import com.bytedance.android.livesdkapi.depend.model.live.debug.SubmitResponse;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class DetectReportDialog extends LiveDialogFragment implements View.OnClickListener, InterfaceC465240IMg, InterfaceC475100Ik8 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/HELIOSLSR9PyQ4Kid9DCA4LCwnGiA8Jj0nDCwtJSA0";
    public LiveIconView LL;
    public C16F5 LLILLJJLI;
    public RecyclerView LLILLL;
    public C475060Ik4 LLILZ;
    public List<Question> LLILZIL;
    public CoverImageModel LLILZLL;
    public final HashMap<Long, Answer> LLIZ = new HashMap<>();
    public long LLIZLLLIL = -1;
    public final C01GW LLJ = C292401Bi.LIZ(new AwS551S0100000_7(this, 107));

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final boolean MR() {
        CoverImageModel coverImageModel;
        CoverImageModel coverImageModel2;
        if (!this.LLIZ.isEmpty() && (coverImageModel = this.LLILZLL) != null) {
            if (!TextUtils.isEmpty(coverImageModel.uri) && (coverImageModel2 = this.LLILZLL) != null && coverImageModel2.urlList != null) {
                if (!C086I.LIZIZ(coverImageModel2 != null ? coverImageModel2.urlList : null)) {
                    List<Question> list = this.LLILZIL;
                    if (list != null) {
                        for (Question question : list) {
                            if (!C2093608Ic.LJ(question.displayValue)) {
                                Iterator<Map.Entry<Long, Answer>> it2 = this.LLIZ.entrySet().iterator();
                                while (it2.hasNext()) {
                                    if (it2.next().getValue().answers.contains(question.displayValue)) {
                                    }
                                }
                            }
                            if (question.required) {
                                Answer answer = this.LLIZ.get(Long.valueOf(question.questionId));
                                if (answer != null && !answer.answers.isEmpty() && !C086I.LIZIZ(answer.answers)) {
                                    Iterator<String> it3 = answer.answers.iterator();
                                    while (it3.hasNext()) {
                                        if (TextUtils.isEmpty(it3.next())) {
                                        }
                                    }
                                }
                                return false;
                            }
                            continue;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.h6e);
        c500980Jkm.LIZIZ = 0;
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIIZ = -1;
        c500980Jkm.LJIIJ = -2;
        return c500980Jkm;
    }

    @Override // X.InterfaceC475100Ik8
    public final void eM() {
        if (MR()) {
            C16F5 c16f5 = this.LLILLJJLI;
            if (c16f5 == null) {
                c16f5 = null;
            }
            c16f5.setEnabled(true);
            C16F5 c16f52 = this.LLILLJJLI;
            if (c16f52 == null) {
                c16f52 = null;
            }
            c16f52.setTextColor(C497740JfY.LJFF(R.color.aas));
            C16F5 c16f53 = this.LLILLJJLI;
            (c16f53 != null ? c16f53 : null).setBackgroundResource(R.drawable.dyp);
            return;
        }
        C16F5 c16f54 = this.LLILLJJLI;
        if (c16f54 == null) {
            c16f54 = null;
        }
        c16f54.setEnabled(false);
        C16F5 c16f55 = this.LLILLJJLI;
        if (c16f55 == null) {
            c16f55 = null;
        }
        c16f55.setTextColor(C497740JfY.LJFF(R.color.a7w));
        C16F5 c16f56 = this.LLILLJJLI;
        (c16f56 != null ? c16f56 : null).setBackgroundResource(R.drawable.eds);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (isShowing()) {
            dismiss();
        }
        this.LLILZLL = null;
        this.LLIZ.clear();
        ((Handler) this.LLJ.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC465240IMg
    public final void handleMsg(Message message) {
        Integer numValueOf;
        Object messageObj;
        if (message != null && (numValueOf = Integer.valueOf(message.what)) != null && numValueOf.intValue() == 49 && (messageObj = HandlerHook.getMessageObj(message.obj)) != null) {
            if (messageObj instanceof C477520Io2) {
                C501470JlZ c501470JlZ = (C501470JlZ) messageObj;
                if (!TextUtils.isEmpty(c501470JlZ.getPrompt())) {
                    C766270U4b.LJIIJJI(c501470JlZ.getPrompt());
                    return;
                }
            } else if ((messageObj instanceof SubmitResponse) && ((SubmitResponse) messageObj).success) {
                C766270U4b.LJIIJJI("Submit success");
                dismiss();
                return;
            }
            C766270U4b.LJIIJJI("Submit fail,Please try again later");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        CoverImageModel coverImageModel;
        String str;
        if (view != null && (numValueOf = Integer.valueOf(view.getId())) != null) {
            if (numValueOf.intValue() == R.id.ft5) {
                dismiss();
                return;
            }
            if (numValueOf.intValue() != R.id.zia) {
                return;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_submit_detection");
            c474500IjALIZ.LJJII(Long.valueOf(C0IJ3.LIZIZ), "detection_user_id");
            if (this.LLIZLLLIL <= 0) {
                this.LLIZLLLIL = UserService.getInstance().user().getCurrentUserId();
            }
            c474500IjALIZ.LJJII(Long.valueOf(this.LLIZLLLIL), "user_id");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
            if (!MR() || (coverImageModel = this.LLILZLL) == null || (str = coverImageModel.uri) == null || str.length() <= 0 || TextUtils.isEmpty(str)) {
                return;
            }
            C464950ILd c464950ILd = C464950ILd.LJI;
            WeakHandler weakHandler = (WeakHandler) this.LLJ.getValue();
            if (this.LLIZLLLIL <= 0) {
                this.LLIZLLLIL = UserService.getInstance().user().getCurrentUserId();
            }
            long j = this.LLIZLLLIL;
            long j2 = C0IUA.LJFF;
            long j3 = C0IUA.LIZLLL;
            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            n nVar = new n();
            nVar.LJJIII(Long.valueOf(j), "detector_user_id");
            nVar.LJJIII(Long.valueOf(j2), "anchor_id");
            nVar.LJJIII(Long.valueOf(j3), "room_id");
            nVar.LJJIII(Long.valueOf(jCurrentTimeMillis), "report_time");
            nVar.LJJIIJ("screenshot_url", str);
            h hVar = new h();
            for (Map.Entry<Long, Answer> entry : this.LLIZ.entrySet()) {
                n nVar2 = new n();
                nVar2.LJJIII(Long.valueOf(entry.getValue().questionId), "question_id");
                h hVar2 = new h();
                Iterator<String> it2 = entry.getValue().answers.iterator();
                while (it2.hasNext()) {
                    hVar2.LJJIII(it2.next());
                }
                nVar2.LJJIFFI("answers", hVar2);
                hVar.LJJIFFI(nVar2);
            }
            nVar.LJJIFFI("answers", hVar);
            c464950ILd.getClass();
            C480460Ism.LIZ().getClass();
            ((RoomRetrofitApi) C480460Ism.LIZLLL(RoomRetrofitApi.class)).submitDetect(nVar).LJIILIIL(new C0UO0()).LJJLL(new AfS176S0100000_7(weakHandler, 153), new AfS176S0100000_7(weakHandler, 154));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (isShowing()) {
            dismiss();
        }
        this.LLILZLL = null;
        this.LLIZ.clear();
        ((Handler) this.LLJ.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LL = (LiveIconView) view.findViewById(R.id.ft5);
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.zia);
        this.LLILLL = (RecyclerView) view.findViewById(R.id.fi2);
        LiveIconView liveIconView = this.LL;
        RecyclerView recyclerView = null;
        if (liveIconView == null) {
            liveIconView = null;
        }
        C786410Ut5.g8(liveIconView, this);
        C16F5 c16f5 = this.LLILLJJLI;
        if (c16f5 == null) {
            c16f5 = null;
        }
        C786410Ut5.l8(c16f5, this);
        this.LLILZ = new C475060Ik4();
        RecyclerView recyclerView2 = this.LLILLL;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        C475060Ik4 c475060Ik4 = this.LLILZ;
        if (c475060Ik4 != null) {
            List<Question> list = this.LLILZIL;
            CoverImageModel coverImageModel = this.LLILZLL;
            c475060Ik4.LL = list;
            c475060Ik4.LLILLL = coverImageModel;
            c475060Ik4.LLLI();
        }
        C475060Ik4 c475060Ik42 = this.LLILZ;
        if (c475060Ik42 != null) {
            c475060Ik42.LLILZ = this.LLIZ;
        }
        RecyclerView recyclerView3 = this.LLILLL;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.setAdapter(c475060Ik42);
        RecyclerView recyclerView4 = this.LLILLL;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        ViewGroup.LayoutParams layoutParams = recyclerView4.getLayoutParams();
        layoutParams.height = (int) (((double) C14KS.LIZLLL()) * 0.75d);
        RecyclerView recyclerView5 = this.LLILLL;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        C786410Ut5.p6(recyclerView5, layoutParams);
        C475060Ik4 c475060Ik43 = this.LLILZ;
        if (c475060Ik43 != null) {
            c475060Ik43.LLILZIL = this;
        }
        RecyclerView recyclerView6 = this.LLILLL;
        if (recyclerView6 == null) {
            recyclerView6 = null;
        }
        recyclerView6.scrollToPosition(0);
        RecyclerView recyclerView7 = this.LLILLL;
        if (recyclerView7 != null) {
            recyclerView = recyclerView7;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.scrollToPosition(0);
        }
    }
}
