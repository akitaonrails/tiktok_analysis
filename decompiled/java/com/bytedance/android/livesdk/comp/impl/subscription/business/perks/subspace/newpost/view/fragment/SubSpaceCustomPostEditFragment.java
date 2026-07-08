package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.view.fragment;

import X.C16F5;
import X.C16FS;
import X.C497740JfY;
import X.C500980Jkm;
import X.C501810Jm7;
import X.C501820Jm8;
import X.C786410Ut5;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicInfo;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedAbility;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.view.fragment.SubSpaceCustomPostEditFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;
import webcast.api.sub.PostCreateReq;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceCustomPostEditFragment extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2s8LDHELIOS04O2s/PC0gOCQvLGE9LTI8JjwnZjMlLDh9LjctLiI2JjFiGjoxGzUtKioQPTY4JiIDJzY4DCs6PAM+KCg+LSs4";
    public C16F5 LL;
    public C16FS LLILLJJLI;
    public LiveEditText LLILLL;
    public SubSpaceNewPostVM LLILZ;
    public C501810Jm7 LLILZIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final LiveEditText MR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fdm) : null;
            this.LLILLL = (LiveEditText) viewFindViewById;
        }
        return (LiveEditText) viewFindViewById;
    }

    public final C16FS NR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.zsh) : null;
            this.LLILLJJLI = (C16FS) viewFindViewById;
        }
        return (C16FS) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.glt);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJI = 0.5f;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = (int) C497740JfY.LIZIZ(202.0f);
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C501820Jm8 c501820Jm8;
        String str;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.f830xlp);
            } else {
                viewFindViewById = null;
            }
            this.LL = (C16F5) viewFindViewById;
        }
        ((TextView) viewFindViewById).setText("0/300");
        NR().setEnabled(false);
        MR().addTextChangedListener(new TextWatcher() { // from class: X.0JmG
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
                int length;
                CharSequence charSequenceLJLIIIL;
                boolean z = false;
                if (charSequence != null && charSequence.length() > 300) {
                    C766270U4b.LJIIJJI(this.LL.getString(2131841268));
                    this.LL.MR().setText(charSequence.subSequence(0, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
                    this.LL.MR().setSelection(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
                }
                StringBuilder sb = new StringBuilder();
                Editable editableLLLFZ = C2204961BRm.LLLFZ(this.LL.MR(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGhmvW7hEalGQG/8idGyBgzwf0iqbha6GwAgZTWkehRdBNRKoTaUD6d7rL7MZ+jz+Rcd8t5BWQSGQLeGW6R6hkmTxMGqP2wPuXPmDvuVjikrpqX/TJMs/ZrG", null));
                if (editableLLLFZ != null) {
                    length = editableLLLFZ.length();
                } else {
                    length = 0;
                }
                sb.append(length);
                sb.append("/300");
                String string = sb.toString();
                SubSpaceCustomPostEditFragment subSpaceCustomPostEditFragment = this.LL;
                View viewFindViewById2 = subSpaceCustomPostEditFragment.LL;
                if (viewFindViewById2 == null) {
                    View view3 = subSpaceCustomPostEditFragment.getView();
                    if (view3 != null) {
                        viewFindViewById2 = view3.findViewById(R.id.f830xlp);
                    } else {
                        viewFindViewById2 = null;
                    }
                    subSpaceCustomPostEditFragment.LL = (C16F5) viewFindViewById2;
                }
                ((TextView) viewFindViewById2).setText(string);
                C16FS c16fsNR = this.LL.NR();
                Editable editableLLLFZ2 = C2204961BRm.LLLFZ(this.LL.MR(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGhmvW7hEalGQG/8idGyBgzwf0iqbha6GwAgZTWkehRdBNRKoTaUD6d7rL7MZ+jz+Rcd8t5BWQSGQLeGW6R6hkmTxMGqP2wPuXPmDvuVjikrpqX/TJMs/ZrG", null));
                if (editableLLLFZ2 == null || (charSequenceLJLIIIL = a0.LJLIIIL(editableLLLFZ2)) == null || charSequenceLJLIIIL.length() == 0) {
                    z = true;
                }
                c16fsNR.setEnabled(!z);
            }
        });
        MR().requestFocus();
        HandlerHook.viewPostDelay(MR(), new Runnable() { // from class: X.0JmH
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SubSpaceCustomPostEditFragment@2297.initViews$2");
                try {
                    KeyBoardUtil.LIZLLL(this.LL.getContext(), this.LL.MR());
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SubSpaceCustomPostEditFragment@2297.initViews$2");
            }
        }, 100L);
        C501810Jm7 c501810Jm7 = this.LLILZIL;
        if (c501810Jm7 != null && (c501820Jm8 = c501810Jm7.LL) != null && (str = c501820Jm8.LIZJ) != null) {
            MR().setText(str);
        }
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.0JmF
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) throws Throwable {
                C501820Jm8 c501820Jm82;
                SubSpaceCustomPostEditFragment subSpaceCustomPostEditFragment = this.LL;
                C501810Jm7 c501810Jm72 = subSpaceCustomPostEditFragment.LLILZIL;
                if (c501810Jm72 != null && (c501820Jm82 = c501810Jm72.LL) != null) {
                    LiveEditText liveEditTextMR = subSpaceCustomPostEditFragment.MR();
                    CharSequence charSequenceLJLIIIL = null;
                    Editable editableLLLFZ = C2204961BRm.LLLFZ(liveEditTextMR, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGhmvW7hEalGQG/8idGyBgzwf0iqbha6GwAgZTWkehRdBNRKoTaUD6d7rL7MZ+jz+Rcd8t5BWQSGQLeGW6R6hkmTxMGqP2wPuXPmDvuVjikrpqX/TJMs/ZrG", null));
                    if (editableLLLFZ != null) {
                        charSequenceLJLIIIL = a0.LJLIIIL(editableLLLFZ);
                    }
                    c501820Jm82.LIZJ = String.valueOf(charSequenceLJLIIIL);
                }
            }
        });
        C786410Ut5.h8(NR(), new View.OnClickListener() { // from class: X.0JmN
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) throws Throwable {
                CharSequence charSequenceLJLIIIL;
                SubSpaceNewPostVM subSpaceNewPostVM;
                C501810Jm7 c501810Jm7XQ2;
                C501820Jm8 c501820Jm82;
                SpaceTopicCategory spaceTopicCategory;
                Editable editableLLLFZ = C2204961BRm.LLLFZ(this.LL.MR(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGhmvW7hEalGQG/8idGyBgzwf0iqbha6GwAgZTWkehRdBNRKoTaUD6d7rL7MZ+jz+Rcd8t5BWQSGQLeGW6R6hkmTxMGqP2wPuXPmDvuVjikrpqX/TJMs/ZrG", null));
                if (editableLLLFZ != null) {
                    charSequenceLJLIIIL = a0.LJLIIIL(editableLLLFZ);
                } else {
                    charSequenceLJLIIIL = null;
                }
                String strValueOf = String.valueOf(charSequenceLJLIIIL);
                if (C1533950q1J.LJ(strValueOf) && (subSpaceNewPostVM = this.LL.LLILZ) != null && (c501810Jm7XQ2 = subSpaceNewPostVM.xQ2()) != null && (c501820Jm82 = c501810Jm7XQ2.LL) != null && (spaceTopicCategory = c501820Jm82.LIZIZ) != null) {
                    PostCreateReq postCreateReq = new PostCreateReq();
                    SpaceTopicInfo spaceTopicInfo = new SpaceTopicInfo();
                    spaceTopicInfo.spaceTopicCategory = spaceTopicCategory;
                    postCreateReq.topicInfo = spaceTopicInfo;
                    postCreateReq.text = strValueOf;
                    postCreateReq.contentType = EnumC503090JoB.TEXT.getValue();
                    subSpaceNewPostVM.xQ2();
                    subSpaceNewPostVM.setState(new C501990JmP());
                    InterfaceC665370Q7z interfaceC665370Q7z = subSpaceNewPostVM.LL;
                    if (interfaceC665370Q7z == null) {
                        interfaceC665370Q7z = null;
                    }
                    SubSpaceFeedAbility subSpaceFeedAbility = (SubSpaceFeedAbility) C1558520qew.LIZ(interfaceC665370Q7z, SubSpaceFeedAbility.class, null);
                    if (subSpaceFeedAbility != null) {
                        subSpaceFeedAbility.bG2(postCreateReq);
                    }
                }
                this.LL.dismissAllowingStateLoss();
            }
        });
    }
}
