package com.bytedance.android.livesdk.chatroom.view;

import X.C098200Yq;
import X.C1115150f7p;
import X.C1389600mGU;
import X.C1494450ozb;
import X.C1685300txQ;
import X.C1811850xFX;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1AJ8;
import X.C1AJ9;
import X.C1AJC;
import X.C1AJJ;
import X.C20441214yg;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C418350Gan;
import X.C475510Ikn;
import X.C497740JfY;
import X.C501470JlZ;
import X.C501520Jle;
import X.C766270U4b;
import X.C784440Upu;
import X.C786410Ut5;
import X.ViewOnFocusChangeListenerC1864710ycn;
import Y.ACListenerS167S0100000_33;
import Y.ARunnableS127S0100000_27;
import Y.AfS202S0100000_33;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.livesdk.chatroom.view.StickerEditFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostFixStickerEditOOM;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes34.dex */
public final class StickerEditFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyHELIOS0tPT08JyhiPyY2P2sfPSYwIyA+DCs6PAM+KCg+LSs4";
    public LiveIconView LL;
    public LiveEditText LLILLJJLI;
    public C418350Gan LLILLL;
    public C1115150f7p LLILZ;
    public Room LLILZIL;
    public C1AJJ LLILZLL;
    public String LLIZ;
    public DataChannel LLJ;
    public RoomSticker LLJI;
    public boolean LLJIJIL;
    public Function1<? super Boolean, Unit> LLJILJIL;
    public Function0<Unit> LLJILJILJ;
    public String LLJJ;
    public long LLJJI;
    public Integer LLIZLLLIL = 0;
    public final C1AJ8 LLJILLL = new TextWatcher() { // from class: X.1AJ8
        public boolean LL;
        public String LLILLJJLI;

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String string;
            int i;
            boolean z;
            TextPaint paint;
            int iMeasureText;
            Editable editableLLLFZ;
            C20743416Fc decorationText;
            Room room;
            Long lValueOf;
            long id;
            User owner;
            Editable editableLLLFZ2;
            if (this.LLILLL.LLJIJIL && LiveHostFixStickerEditOOM.getEnable()) {
                return;
            }
            StickerEditFragment stickerEditFragment = this.LLILLL;
            LiveEditText liveEditText = stickerEditFragment.LLILLJJLI;
            if (liveEditText == null || (editableLLLFZ2 = C2204961BRm.LLLFZ(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwK5om2IdJn+LUa0DuErAt1C9H53uEWwLm", null))) == null || (string = editableLLLFZ2.toString()) == null) {
                string = "";
            }
            stickerEditFragment.LLIZ = string;
            StickerEditFragment stickerEditFragment2 = this.LLILLL;
            RoomSticker roomSticker = stickerEditFragment2.LLJI;
            if (roomSticker != null && !Intrinsics.LJFF(stickerEditFragment2.LLIZ, stickerEditFragment2.LLJJ) && !this.LL) {
                this.LL = true;
                C2177381AJk c2177381AJk = C1AJL.LIZLLL;
                DataChannel dataChannel = stickerEditFragment2.LLJ;
                String strLIZLLL = C342601Uq.LIZLLL(Long.valueOf(roomSticker.id));
                if (dataChannel != null) {
                    room = (Room) dataChannel.gg0(RoomChannel.class);
                } else {
                    room = null;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_character_edit_input");
                c474500IjALIZ.LJIJJLI(dataChannel);
                if (room != null && (owner = room.getOwner()) != null) {
                    lValueOf = Long.valueOf(owner.getId());
                } else {
                    lValueOf = null;
                }
                c474500IjALIZ.LJJII(String.valueOf(lValueOf), "anchor_id");
                c474500IjALIZ.LJJII("video_live", "live_type");
                if (room != null) {
                    id = room.getId();
                } else {
                    id = 0;
                }
                c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
                c474500IjALIZ.LJJII(Long.valueOf(roomSticker.id), "prop_id");
                c474500IjALIZ.LJJII(strLIZLLL, "resource_id");
                c474500IjALIZ.LJJII(roomSticker.source, "entrance");
                c474500IjALIZ.LJIILJJIL("live_take_detail");
                c474500IjALIZ.LJJII(roomSticker.name, "prop_name");
                c474500IjALIZ.LIZ();
            }
            StickerEditFragment stickerEditFragment3 = this.LLILLL;
            String str = stickerEditFragment3.LLIZ;
            if (str == null) {
                str = "";
            }
            C418350Gan c418350Gan = stickerEditFragment3.LLILLL;
            if (c418350Gan == null) {
                c418350Gan = null;
            }
            if (str.length() == 0) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLJJ(c418350Gan, i);
            if (u.LJJIFFI(str, " ", "", false).length() == 0) {
                z = true;
            } else {
                z = false;
            }
            stickerEditFragment3.PR(z);
            StickerEditFragment stickerEditFragment4 = this.LLILLL;
            String str2 = stickerEditFragment4.LLIZ;
            C1AJJ c1ajj = stickerEditFragment4.LLILZLL;
            if (c1ajj != null && (decorationText = c1ajj.getDecorationText()) != null) {
                paint = decorationText.getPaint();
            } else {
                paint = null;
            }
            if (str2 != null && str2.length() != 0 && paint != null) {
                iMeasureText = (int) paint.measureText(str2, 0, str2.length());
            } else {
                iMeasureText = 0;
            }
            if (iMeasureText <= C497740JfY.LJIIIZ(R.dimen.aji)) {
                StickerEditFragment stickerEditFragment5 = this.LLILLL;
                String str3 = stickerEditFragment5.LLIZ;
                this.LLILLJJLI = str3;
                C1AJJ c1ajj2 = stickerEditFragment5.LLILZLL;
                if (c1ajj2 != null && c1ajj2.getType() == 4 && str3 != null) {
                    C20743416Fc roomDecorationTextFromXml = c1ajj2.getRoomDecorationTextFromXml();
                    if (roomDecorationTextFromXml != null) {
                        roomDecorationTextFromXml.setText(str3);
                    }
                    c1ajj2.P0();
                }
                C1AJJ c1ajj3 = this.LLILLL.LLILZLL;
                if (c1ajj3 != null) {
                    c1ajj3.P0();
                    return;
                }
                return;
            }
            StickerEditFragment stickerEditFragment6 = this.LLILLL;
            stickerEditFragment6.LLJIJIL = true;
            LiveEditText liveEditText2 = stickerEditFragment6.LLILLJJLI;
            if (liveEditText2 != null) {
                liveEditText2.setText(this.LLILLJJLI);
            }
            LiveEditText liveEditText3 = this.LLILLL.LLILLJJLI;
            if (liveEditText3 != null && (editableLLLFZ = C2204961BRm.LLLFZ(liveEditText3, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwK5om2IdJn+LUa0DuErAt1C9H53uEWwLm", null))) != null) {
                Selection.setSelection(editableLLLFZ, editableLLLFZ.length());
            }
            this.LLILLL.LLJIJIL = false;
        }
    };

    public final LiveIconView NR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.xqu) : null;
            this.LL = (LiveIconView) viewFindViewById;
        }
        return (LiveIconView) viewFindViewById;
    }

    public final void MR() {
        try {
            dismissAllowingStateLoss();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Function1<? super Boolean, Unit> function1 = this.LLJILJIL;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        this.LLJILJIL = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        LiveEditText liveEditText = this.LLILLJJLI;
        if (liveEditText != null) {
            HandlerHook.viewPost(liveEditText, new ARunnableS127S0100000_27(this, 5));
        }
        LiveEditText liveEditText2 = this.LLILLJJLI;
        if (liveEditText2 != null) {
            liveEditText2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1864710ycn(this, 1));
        }
    }

    public final void OR(Throwable th) {
        if (!(th instanceof TimeoutException) && !(th instanceof C1811850xFX) && !(th instanceof C1494450ozb)) {
            if (th instanceof C501470JlZ) {
                if (((C501520Jle) th).getErrorCode() == 4003107) {
                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131844173));
                    C1AJJ c1ajj = this.LLILZLL;
                    if (c1ajj != null) {
                        c1ajj.O0(4, null);
                        return;
                    }
                    return;
                }
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error message:");
            sbLIZ.append(th);
            C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C766270U4b.LJIIJJI(getString(2131844174));
        C1AJJ c1ajj2 = this.LLILZLL;
        if (c1ajj2 == null) {
            return;
        }
        c1ajj2.O0(4, null);
    }

    public final void PR(boolean z) {
        if (z) {
            NR().setIconTint(C20736316Cj.LIZJ(R.attr.fy4, NR()));
        } else {
            NR().setIconTint(C20736316Cj.LIZJ(R.attr.fxr, NR()));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Room room;
        super.onCreate(bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        this.LLJ = dataChannelLJ;
        Integer numValueOf = null;
        if (dataChannelLJ != null) {
            room = (Room) dataChannelLJ.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLILZIL = room;
        Bundle arguments = getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("build_dialog"));
        }
        this.LLIZLLLIL = numValueOf;
        setCancelable(true);
        setStyle(1, R.style.akh);
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.EQ2(this, LinkCrossRoomStateChangeEvent.class, new C1AJ9(this));
        }
        C784440Upu.LIZ().LJ(C1AJC.class).LJJLJLI(new AfS202S0100000_33(this, 9));
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.addFlags(32);
            window.setSoftInputMode(3);
            window.clearFlags(2);
        }
        Window window2 = dialogOnCreateDialog.getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0133  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.view.StickerEditFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.hq9, viewGroup, false);
        this.LLILLJJLI = (LiveEditText) viewTd.findViewById(R.id.xqr);
        this.LLILLL = (C418350Gan) viewTd.findViewById(R.id.gs8);
        LiveEditText liveEditText = this.LLILLJJLI;
        if (liveEditText != null) {
            liveEditText.addTextChangedListener(this.LLJILLL);
        }
        C1115150f7p c1115150f7p = (C1115150f7p) viewTd.findViewById(R.id.view_shadow);
        this.LLILZ = c1115150f7p;
        if (c1115150f7p != null) {
            c1115150f7p.setActivity(getActivity());
        }
        C1115150f7p c1115150f7p2 = this.LLILZ;
        if (c1115150f7p2 != null) {
            c1115150f7p2.setShowStatusBar(true);
        }
        viewTd.findViewById(R.id.w5p);
        ImageView imageView = (ImageView) viewTd.findViewById(R.id.xqu);
        if (imageView != null) {
            C786410Ut5.Q7(imageView, new ACListenerS167S0100000_33(this, 7));
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
