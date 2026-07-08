package com.bytedance.android.livesdk.subcription.subspaceeditor;

import X.AbstractC1115080f7i;
import X.C098200Yq;
import X.C0IK5;
import X.C0J3Y;
import X.C0WZX;
import X.C1085120eLO;
import X.C1114290f6R;
import X.C1114310f6T;
import X.C1114670f73;
import X.C1114680f74;
import X.C1114810f7H;
import X.C1114960f7W;
import X.C1114990f7Z;
import X.C1115040f7e;
import X.C1115060f7g;
import X.C1115140f7o;
import X.C1115150f7p;
import X.C1124870fNV;
import X.C1151810g4x;
import X.C1161920gLG;
import X.C1389600mGU;
import X.C1685300txQ;
import X.C16F5;
import X.C181500mr;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1CC2;
import X.C20441214yg;
import X.C20586215gy;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2372909Rn;
import X.C2685012d;
import X.C476750Imn;
import X.C476760Imo;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501600Jlm;
import X.C508920Jxa;
import X.C520890Kbn;
import X.C764830TzN;
import X.C766270U4b;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC1114820f7I;
import X.EnumC1134120fcQ;
import X.EnumC584890Mwp;
import X.InterfaceC1112060f2q;
import X.InterfaceC1115130f7n;
import X.InterfaceC1115250f7z;
import X.InterfaceC1115270f81;
import X.InterfaceC1115310f85;
import X.InterfaceC19323110ij;
import X.InterfaceC500940Jki;
import X.ViewOnFocusChangeListenerC1115160f7q;
import X.ViewOnLayoutChangeListenerC1151610g4d;
import Y.ACListenerS152S0100000_17;
import Y.ARunnableS0S1110000_7;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS86S0200000_17;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.chatroom.model.ChatResult;
import com.bytedance.android.livesdk.chatroom.model.InputAttrs;
import com.bytedance.android.livesdk.chatroom.ui.ControllableDialogFragment;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentInputDialogDismissFixSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.performance.emote.EmoteFixTextHelper;
import com.bytedance.android.livesdk.performance.emote.EmotePerformanceTrackerViewModel;
import com.bytedance.android.livesdk.subcription.subspaceeditor.SubEmojiInputDialogFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class SubEmojiInputDialogFragment extends ControllableDialogFragment implements InterfaceC19323110ij, InterfaceC1115250f7z {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OzAuKj06ODElJiF9HELIOSOzAuOj8yKyApLSYnJzdiGjoxDSgjIyYaJjU5PQs6KSkjLgkhKSIhLCEn";
    public int LL;
    public boolean LLILLJJLI;
    public DataChannel LLILLL;
    public InterfaceC1115130f7n LLILZ;
    public C1114810f7H LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public String LLJ;
    public InputFilter LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public long LLJJ;
    public boolean LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public String LLJJIJIIJIL;
    public List<EmoteWithIndex> LLJJIJIL;
    public boolean LLJJJ;
    public EmotePerformanceTrackerViewModel LLJJJIL;
    public MeasureLinearLayout LLJJJJ;
    public LiveIconView LLJJJJJIL;
    public LiveIconView LLJJJJLIIL;
    public LiveIconView LLJJL;
    public C20586215gy LLJJLIIIJLLLLLLLZ;
    public C16F5 LLJL;
    public TextView LLJLIL;
    public View LLJLILLLLZIIL;
    public View LLJLL;
    public View LLJLLIL;
    public C1085120eLO LLJLLL;
    public C1115150f7p LLJZ;
    public LinearLayout LLJZIJLIL;
    public ViewPager LLL;
    public AbstractC1115080f7i LLLF;
    public EmoteFixTextHelper LLLFF;
    public C1115060f7g LLLFFI;
    public C1114290f6R LLLFZ;
    public long LLLI;
    public int LLLIIIL;
    public JSONObject LLLIZZ;
    public boolean LLLJIL;
    public BPEAHandler LLLJL;
    public EnumC1114820f7I LLIZLLLIL = EnumC1114820f7I.Keyboard;
    public Boolean LLLII = Boolean.FALSE;
    public boolean LLLIIII = false;
    public int LLLIIIIL = 0;
    public final int LLLIIL = (int) C497740JfY.LIZIZ(218.0f);
    public boolean LLLIILIL = false;
    public boolean LLLIL = false;
    public boolean LLLILZ = true;
    public boolean LLLILZJ = false;
    public boolean LLLILZLLLI = false;
    public final List<AbstractC1115080f7i> LLLJ = new ArrayList();
    public final ACListenerS152S0100000_17 LLLL = new ACListenerS152S0100000_17(this, 3);
    public final C1114960f7W LLLLII = new TextWatcher() { // from class: X.0f7W
        public int LL = -1;
        public int LLILLJJLI = -1;
        public boolean LLILLL;

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) throws Throwable {
            C20586215gy c20586215gy;
            String string;
            InterfaceC1115130f7n interfaceC1115130f7n;
            int iSR;
            String string2;
            SubEmojiInputDialogFragment subEmojiInputDialogFragment = this.LLILZ;
            if (subEmojiInputDialogFragment.LLILLJJLI && (c20586215gy = subEmojiInputDialogFragment.LLJJLIIIJLLLLLLLZ) != null) {
                Editable editableLLLFF = C2204961BRm.LLLFF(c20586215gy, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm19W3MpfpLShHqBycIE6yoiW7Zg6JpA4YS0F", null));
                SubEmojiInputDialogFragment subEmojiInputDialogFragment2 = this.LLILZ;
                if (editableLLLFF == null) {
                    string = "";
                } else {
                    string = editableLLLFF.toString();
                }
                subEmojiInputDialogFragment2.LLJJIII = string;
                boolean zIsEmpty = TextUtils.isEmpty(this.LLILZ.LLJJIII);
                SubEmojiInputDialogFragment subEmojiInputDialogFragment3 = this.LLILZ;
                InterfaceC1115130f7n interfaceC1115130f7n2 = subEmojiInputDialogFragment3.LLILZ;
                if (interfaceC1115130f7n2 != null && !subEmojiInputDialogFragment3.LLLIL) {
                    interfaceC1115130f7n2.Mc();
                }
                if (zIsEmpty) {
                    C786410Ut5.LLIL(this.LLILZ.LLJLIL, 0);
                    C786410Ut5.LLJJJJ(this.LLILZ.LLJL, 8);
                    this.LLILZ.LLJL.setText("");
                    this.LLILZ.LLJJL.setClickable(false);
                } else {
                    C786410Ut5.LLIL(this.LLILZ.LLJLIL, 8);
                    SubEmojiInputDialogFragment subEmojiInputDialogFragment4 = this.LLILZ;
                    if (!subEmojiInputDialogFragment4.LLLIILIL && (interfaceC1115130f7n = subEmojiInputDialogFragment4.LLILZ) != null) {
                        subEmojiInputDialogFragment4.LLLIILIL = true;
                        interfaceC1115130f7n.Oc();
                    }
                    this.LLILZ.LLJJL.setClickable(true);
                }
                this.LLILZ.gS(zIsEmpty);
                SubEmojiInputDialogFragment subEmojiInputDialogFragment5 = this.LLILZ;
                int iLJI = subEmojiInputDialogFragment5.LLLFF.LJI(C2204961BRm.LLLF(subEmojiInputDialogFragment5.LLJJLIIIJLLLLLLLZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm19W3MpfpLShHqBycIE6yoiW7Zg6JpA4YS0F", null)), null);
                SubEmojiInputDialogFragment subEmojiInputDialogFragment6 = this.LLILZ;
                int iSR2 = 15;
                if (subEmojiInputDialogFragment6.LLJIJIL) {
                    iSR = 15;
                } else {
                    iSR = subEmojiInputDialogFragment6.SR();
                }
                if (iLJI > iSR && !this.LLILZ.LLLII.booleanValue()) {
                    SubEmojiInputDialogFragment subEmojiInputDialogFragment7 = this.LLILZ;
                    C20586215gy c20586215gy2 = subEmojiInputDialogFragment7.LLJJLIIIJLLLLLLLZ;
                    InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(subEmojiInputDialogFragment7.LLJJIII.length());
                    ArrayList arrayList = (ArrayList) C13LQ.LJLI(c20586215gy2.getFilters());
                    arrayList.add(lengthFilter);
                    c20586215gy2.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
                    subEmojiInputDialogFragment7.LLJI = lengthFilter;
                } else {
                    SubEmojiInputDialogFragment subEmojiInputDialogFragment8 = this.LLILZ;
                    C1115140f7o.LIZIZ(subEmojiInputDialogFragment8.LLJJLIIIJLLLLLLLZ, subEmojiInputDialogFragment8.LLJI);
                    subEmojiInputDialogFragment8.LLJI = null;
                }
                SubEmojiInputDialogFragment subEmojiInputDialogFragment9 = this.LLILZ;
                if (!subEmojiInputDialogFragment9.LLJIJIL) {
                    iSR2 = subEmojiInputDialogFragment9.SR();
                }
                if (iLJI > iSR2 && !this.LLILZ.LLLII.booleanValue()) {
                    this.LLILLL = false;
                    SubEmojiInputDialogFragment subEmojiInputDialogFragment10 = this.LLILZ;
                    if (subEmojiInputDialogFragment10.LLJIJIL) {
                        string2 = subEmojiInputDialogFragment10.getString(2131853436);
                    } else {
                        string2 = subEmojiInputDialogFragment10.getString(2131841268);
                    }
                    C766270U4b.LJIIJJI(string2);
                    EmoteFixTextHelper emoteFixTextHelper = this.LLILZ.LLLFF;
                    int i = emoteFixTextHelper.recordInputIndex;
                    editableLLLFF.delete(i, emoteFixTextHelper.recordLength + i);
                    try {
                        SubEmojiInputDialogFragment subEmojiInputDialogFragment11 = this.LLILZ;
                        subEmojiInputDialogFragment11.LLJJLIIIJLLLLLLLZ.setSelection(subEmojiInputDialogFragment11.LLLFF.recordInputIndex);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        HashMap map = new HashMap();
                        map.put("error", e.getMessage());
                        C1CC2.LJII(1, "ttlive_emoji_fragment_error", map);
                    }
                } else {
                    SubEmojiInputDialogFragment subEmojiInputDialogFragment12 = this.LLILZ;
                    if (!subEmojiInputDialogFragment12.LLLILZJ && this.LLILLL && !subEmojiInputDialogFragment12.LLLIL) {
                        this.LLILLL = false;
                        int i2 = this.LL;
                        if (i2 < this.LLILLJJLI + i2 && subEmojiInputDialogFragment12.LLJJIII.length() >= this.LL + this.LLILLJJLI) {
                            int length = editableLLLFF.length();
                            int i3 = this.LL;
                            int i4 = this.LLILLJJLI + i3;
                            if (length >= i4) {
                                String strReplace = this.LLILZ.LLJJIII.substring(i3, i4).replace((char) 65532, ' ');
                                int i5 = this.LL;
                                editableLLLFF.replace(i5, this.LLILLJJLI + i5, strReplace);
                            }
                        }
                    }
                }
                getClass();
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SubEmojiInputDialogFragment subEmojiInputDialogFragment = this.LLILZ;
            if (!subEmojiInputDialogFragment.LLLIL && subEmojiInputDialogFragment.LLILLJJLI) {
                if (i2 != 0) {
                    subEmojiInputDialogFragment.LLLFF.LIZLLL(i, i2 + i);
                }
                if (i3 != 0) {
                    EmoteFixTextHelper emoteFixTextHelper = this.LLILZ.LLLFF;
                    emoteFixTextHelper.recordInputIndex = i;
                    emoteFixTextHelper.recordLength = i3;
                    for (int i4 = i; i4 < i + i3; i4++) {
                        if (charSequence.charAt(i4) != 65532 || this.LLILZ.LLLILZ) {
                            this.LLILZ.LLLFF.LIZJ(i4, charSequence.subSequence(i4, i4 + 1));
                        }
                    }
                }
                if (!this.LLILZ.LLLILZJ && i3 != 0) {
                    int i5 = i;
                    while (true) {
                        if (i5 >= i + i3) {
                            break;
                        }
                        if (charSequence.charAt(i5) == 65532) {
                            this.LLILLL = true;
                            break;
                        }
                        i5++;
                    }
                    this.LL = i;
                    this.LLILLJJLI = i3;
                }
                this.LLILZ.LLLILZ = true;
            }
        }
    };
    public final C1114990f7Z LLLLIIIILLL = new InterfaceC1115270f81() { // from class: X.0f7Z
        @Override // X.InterfaceC1114320f6U
        public final void LIZJ() {
            this.LIZ.WR(1);
        }

        @Override // X.InterfaceC1114320f6U
        public final void LJ(AbstractC1115080f7i abstractC1115080f7i) {
        }

        @Override // X.InterfaceC1114320f6U
        public final void LIZ() {
            this.LIZ.MR();
        }

        @Override // X.InterfaceC1114330f6V
        public final void LIZIZ() {
            this.LIZ.LLJJLIIIJLLLLLLLZ.dispatchKeyEvent(new KeyEvent(0, 67));
        }

        @Override // X.InterfaceC1114330f6V
        public final void LIZLLL(C1115500f8O c1115500f8O) throws Throwable {
            C20586215gy c20586215gy;
            int iSR;
            String string;
            if (c1115500f8O != null && c1115500f8O.previewEmoji != null && (c20586215gy = this.LIZ.LLJJLIIIJLLLLLLLZ) != null && C2204961BRm.LLLFF(c20586215gy, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm19W3MpfpLShHqBycIE6yoiW7Zg6JpA4YS0F", null)) != null) {
                SubEmojiInputDialogFragment subEmojiInputDialogFragment = this.LIZ;
                int iLJI = subEmojiInputDialogFragment.LLLFF.LJI(C2204961BRm.LLLF(subEmojiInputDialogFragment.LLJJLIIIJLLLLLLLZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm19W3MpfpLShHqBycIE6yoiW7Zg6JpA4YS0F", null)), null) + c1115500f8O.previewEmoji.length();
                SubEmojiInputDialogFragment subEmojiInputDialogFragment2 = this.LIZ;
                if (subEmojiInputDialogFragment2.LLJIJIL) {
                    iSR = 15;
                } else {
                    iSR = subEmojiInputDialogFragment2.SR();
                }
                if (iLJI > iSR) {
                    SubEmojiInputDialogFragment subEmojiInputDialogFragment3 = this.LIZ;
                    if (subEmojiInputDialogFragment3.LLJIJIL) {
                        string = subEmojiInputDialogFragment3.getString(2131841268);
                    } else {
                        string = subEmojiInputDialogFragment3.getString(2131841268);
                    }
                    C766270U4b.LJIIJJI(string);
                    return;
                }
                if (TextUtils.isEmpty(c1115500f8O.previewEmoji)) {
                    return;
                }
                int selectionStart = this.LIZ.LLJJLIIIJLLLLLLLZ.getSelectionStart();
                Editable editableLLLFF = C2204961BRm.LLLFF(this.LIZ.LLJJLIIIJLLLLLLLZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm19W3MpfpLShHqBycIE6yoiW7Zg6JpA4YS0F", null));
                this.LIZ.LLLIL = true;
                editableLLLFF.insert(selectionStart, c1115500f8O.previewEmoji);
                SubEmojiInputDialogFragment subEmojiInputDialogFragment4 = this.LIZ;
                subEmojiInputDialogFragment4.LLLIL = false;
                subEmojiInputDialogFragment4.LLLFF.LIZJ(selectionStart, c1115500f8O.previewEmoji);
            }
        }
    };

    public int SR() {
        return 100;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final void MR() {
        if (this.LLILLJJLI) {
            try {
                UR();
                if (isAdded()) {
                    if (this.LLJJJIL == null) {
                        this.LLJJJIL = C508920Jxa.LIZ(getContext(), "live_room_sub_emote_input_page");
                    }
                    EmotePerformanceTrackerViewModel emotePerformanceTrackerViewModel = this.LLJJJIL;
                    if (emotePerformanceTrackerViewModel != null) {
                        emotePerformanceTrackerViewModel.LLILLL = System.currentTimeMillis();
                        this.LLJJJIL.xQ2();
                    }
                    dismissAllowingStateLoss();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1CC2.LIZ("LiveEmojiInputDialogFragment", e);
            }
        }
    }

    public final void NR() {
        if (this.LLLILZLLLI || this.LLJJLIIIJLLLLLLLZ == null) {
            return;
        }
        HandlerHook.viewPost(this.LLJJLIIIJLLLLLLLZ, new ARunnableS117S0100000_17(this, 118));
        this.LLJJLIIIJLLLLLLLZ.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1115160f7q(this));
    }

    public final int RR() {
        View view = this.LLJLL;
        return (view == null || view.getMeasuredHeight() == 0) ? (int) C497740JfY.LIZIZ(60.0f) : this.LLJLL.getMeasuredHeight();
    }

    public final void UR() {
        if (!this.LLILLJJLI || this.LLJJLIIIJLLLLLLLZ == null) {
            return;
        }
        KeyBoardUtil.LIZJ(getContext(), this.LLJJLIIIJLLLLLLLZ);
    }

    public final void aS() {
        if (this.LLJILJILJ) {
            return;
        }
        this.LLIZLLLIL = EnumC1114820f7I.Panel;
        this.LLLF = this.LLLFFI;
        this.LLJJLIIIJLLLLLLLZ.setShowSoftInputOnFocus(!(r0 instanceof C1114290f6R));
        if (this.LLIZ) {
            int iIndexOf = ((ArrayList) this.LLLJ).indexOf(this.LLLF);
            if (iIndexOf != -1) {
                ZR(iIndexOf);
                this.LLL.setCurrentItem(iIndexOf, false);
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(C2204961BRm.LLLFF(this.LLJJLIIIJLLLLLLLZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm19W3MpfpLShHqBycIE6yoiW7Zg6JpA4YS0F", null)));
        gS(zIsEmpty);
        if (!zIsEmpty) {
            this.LLJJL.setClickable(true);
        }
        EnumC1114820f7I enumC1114820f7I = this.LLIZLLLIL;
        this.LLJJLIIIJLLLLLLLZ.requestFocus();
        HandlerHook.viewPost(this.LLJJLIIIJLLLLLLLZ, new ARunnableS86S0200000_17(this, enumC1114820f7I, 4));
    }

    public final void bS() {
        if (this.LLJILJILJ) {
            return;
        }
        this.LLIZLLLIL = EnumC1114820f7I.Panel;
        this.LLLF = this.LLLFZ;
        this.LLJJLIIIJLLLLLLLZ.setShowSoftInputOnFocus(!(r0 instanceof C1114290f6R));
        if (this.LLIZ) {
            int iIndexOf = ((ArrayList) this.LLLJ).indexOf(this.LLLF);
            if (iIndexOf != -1) {
                ZR(iIndexOf);
                this.LLL.setCurrentItem(iIndexOf, false);
            }
        }
        EnumC1114820f7I enumC1114820f7I = this.LLIZLLLIL;
        this.LLJJLIIIJLLLLLLLZ.requestFocus();
        HandlerHook.viewPost(this.LLJJLIIIJLLLLLLLZ, new ARunnableS86S0200000_17(this, enumC1114820f7I, 4));
    }

    public final void cS() {
        if (this.LLJILJILJ) {
            return;
        }
        this.LLIZLLLIL = EnumC1114820f7I.Keyboard;
        boolean zIsEmpty = TextUtils.isEmpty(C2204961BRm.LLLFF(this.LLJJLIIIJLLLLLLLZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm19W3MpfpLShHqBycIE6yoiW7Zg6JpA4YS0F", null)));
        gS(zIsEmpty);
        if (!zIsEmpty) {
            this.LLJJL.setClickable(true);
        }
        EnumC1114820f7I enumC1114820f7I = this.LLIZLLLIL;
        this.LLJJLIIIJLLLLLLLZ.requestFocus();
        HandlerHook.viewPost(this.LLJJLIIIJLLLLLLLZ, new ARunnableS86S0200000_17(this, enumC1114820f7I, 4));
    }

    public final InputAttrs PR() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        arguments.setClassLoader(InputAttrs.class.getClassLoader());
        return (InputAttrs) arguments.getParcelable("live.intent.extra.INPUT_ATTRS");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLILLJJLI = false;
        BPEAHandler bPEAHandler = this.LLLJL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
    }

    public static boolean VR(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                if (str.length() <= 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void WR(int i) {
        C1114670f73 c1114670f73 = new C1114670f73();
        c1114670f73.LIZ = i;
        InputAttrs inputAttrsPR = PR();
        if (inputAttrsPR != null) {
            c1114670f73.LIZIZ = inputAttrsPR.hasDraft;
        }
        String str = null;
        if (C500260Jjc.LJJJIL(this.LLILLL)) {
            ChatResult chatResult = new ChatResult();
            chatResult.setMsgId(0L);
            chatResult.setDisplayText(new Text());
            chatResult.setBackground(new ImageModel());
            if (VR(C2204961BRm.LLLFF(this.LLJJLIIIJLLLLLLLZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm19W3MpfpLShHqBycIE6yoiW7Zg6JpA4YS0F", null)).toString()) || this.LLLFF.LJ() != 0) {
                if (inputAttrsPR != null && inputAttrsPR.isQAStrengthen) {
                    this.LLLII = Boolean.TRUE;
                    C1115140f7o.LIZIZ(this.LLJJLIIIJLLLLLLLZ, this.LLJI);
                    this.LLJI = null;
                    C2204961BRm.LLLF(this.LLJJLIIIJLLLLLLLZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm19W3MpfpLShHqBycIE6yoiW7Zg6JpA4YS0F", null)).insert(0, inputAttrsPR.inputWithEmote);
                    C2204961BRm.LLLFF(this.LLJJLIIIJLLLLLLLZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm19W3MpfpLShHqBycIE6yoiW7Zg6JpA4YS0F", null)).toString();
                }
                chatResult.setContent(C2204961BRm.LLLFF(this.LLJJLIIIJLLLLLLLZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm19W3MpfpLShHqBycIE6yoiW7Zg6JpA4YS0F", null)).toString());
                chatResult.setFullScreenTextColor("#FF0000");
                InterfaceC1112060f2q interfaceC1112060f2qOo = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Oo(C181500mr.LIZ(0L, chatResult, UserService.getInstance().user().LJIJJLI(), UserService.getInstance().user().getCurrentUser(), new ArrayList(), false));
                if (interfaceC1112060f2qOo != null) {
                    this.LLILZ.Sc(interfaceC1112060f2qOo, Boolean.valueOf(c1114670f73.LIZIZ));
                }
            }
            this.LLJJLIIIJLLLLLLLZ.setText("");
            return;
        }
        InterfaceC1115130f7n interfaceC1115130f7n = this.LLILZ;
        if (interfaceC1115130f7n != null) {
            interfaceC1115130f7n.Nc(this.LLLFF.LJII(), c1114670f73);
        }
        if (!UserService.getInstance().user().isLogin()) {
            if (getActivity() == null) {
                C766270U4b.LIZLLL(2131851926);
                return;
            }
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            C19EG activity = getActivity();
            C476760Imo c476760Imo = new C476760Imo();
            c476760Imo.LIZ = C497740JfY.LJIJI(2131853570);
            c476760Imo.LIZLLL = "comment_live";
            c476760Imo.LIZJ = LSPassThroughRecordSizeConfig.DEFAULT;
            interfaceC500940JkiUser.LJIILL(activity, new C501600Jlm(c476760Imo)).LIZIZ(new C476750Imn());
            return;
        }
        if (UserService.getInstance().user().LJIJI(EnumC1134120fcQ.COMMENT)) {
            return;
        }
        if (this.LLJIJIL && ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).isNeedProtectMinor()) {
            C766270U4b.LIZLLL(2131853495);
            return;
        }
        if (this.LLILZ == null || C2204961BRm.LLLFF(this.LLJJLIIIJLLLLLLLZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm19W3MpfpLShHqBycIE6yoiW7Zg6JpA4YS0F", null)) == null) {
            return;
        }
        if (!VR(C2204961BRm.LLLFF(this.LLJJLIIIJLLLLLLLZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm19W3MpfpLShHqBycIE6yoiW7Zg6JpA4YS0F", null)).toString()) && this.LLLFF.LJ() == 0) {
            return;
        }
        if (inputAttrsPR != null && inputAttrsPR.isQAStrengthen) {
            this.LLLII = Boolean.TRUE;
            C1115140f7o.LIZIZ(this.LLJJLIIIJLLLLLLLZ, this.LLJI);
            this.LLJI = null;
            C2204961BRm.LLLF(this.LLJJLIIIJLLLLLLLZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm19W3MpfpLShHqBycIE6yoiW7Zg6JpA4YS0F", null)).insert(0, inputAttrsPR.inputWithEmote);
            C2204961BRm.LLLFF(this.LLJJLIIIJLLLLLLLZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm19W3MpfpLShHqBycIE6yoiW7Zg6JpA4YS0F", null)).toString();
        }
        List<EmoteWithIndex> listLJFF = this.LLLFF.LJFF();
        if (inputAttrsPR != null && inputAttrsPR.starlingKey != null) {
            C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
            String str2 = inputAttrsPR.starlingKey;
            c1124870fNVLIZJ.getClass();
            if (TextUtils.equals(C1124870fNV.LIZIZ(str2), this.LLLFF.LJII()) && listLJFF.isEmpty()) {
                str = inputAttrsPR.starlingKey;
            }
        }
        InterfaceC1115130f7n interfaceC1115130f7n2 = this.LLILZ;
        String strLJII = this.LLLFF.LJII();
        boolean z = this.LLJIJIL;
        int i2 = this.LLLIIIIL;
        this.LLLFF.getClass();
        interfaceC1115130f7n2.Tc(strLJII, str, z, i2, new C520890Kbn(EmoteFixTextHelper.LJIIJ(listLJFF), listLJFF), c1114670f73, null);
        this.LLLIIIIL = 0;
    }

    public final void ZR(int i) {
        if (i >= 0 && i < ((ArrayList) this.LLLJ).size()) {
            AbstractC1115080f7i abstractC1115080f7i = (AbstractC1115080f7i) ListProtector.get(this.LLLJ, i);
            boolean zIsEmpty = TextUtils.isEmpty(C2204961BRm.LLLFF(this.LLJJLIIIJLLLLLLLZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm19W3MpfpLShHqBycIE6yoiW7Zg6JpA4YS0F", null)));
            gS(zIsEmpty);
            this.LLJJL.setClickable(!zIsEmpty);
            this.LLLF = abstractC1115080f7i;
            this.LLJJLIIIJLLLLLLLZ.setShowSoftInputOnFocus(!(abstractC1115080f7i instanceof C1114290f6R));
            for (int i2 = 0; i2 < ((ArrayList) this.LLLJ).size(); i2++) {
                if (i2 != i) {
                    AbstractC1115080f7i abstractC1115080f7i2 = (AbstractC1115080f7i) ListProtector.get(this.LLLJ, i2);
                    if (abstractC1115080f7i2.LJFF) {
                        abstractC1115080f7i2.LJFF = false;
                        abstractC1115080f7i2.LIZLLL("", false);
                    }
                }
            }
            if (!abstractC1115080f7i.LJFF) {
                abstractC1115080f7i.LJFF = true;
                abstractC1115080f7i.LIZLLL("", true);
            }
        }
    }

    public void dS(int i) {
        View view = this.LLJLILLLLZIIL;
        if (view != null) {
            C786410Ut5.ed(view, i);
        }
        View view2 = this.LLJLLIL;
        if (view2 != null) {
            C786410Ut5.ed(view2, i);
        }
    }

    public void gS(boolean z) {
        if (z) {
            LiveIconView liveIconView = this.LLJJL;
            liveIconView.setIconTint(C20736316Cj.LIZJ(R.attr.fy4, liveIconView));
        } else {
            LiveIconView liveIconView2 = this.LLJJL;
            liveIconView2.setIconTint(C20736316Cj.LIZJ(R.attr.fxr, liveIconView2));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        C20586215gy c20586215gy;
        super.onActivityCreated(bundle);
        if (this.LLIZLLLIL == EnumC1114820f7I.Keyboard) {
            this.LLLILZLLLI = true;
            C1114680f74.LIZ("Keyboard will open");
            InterfaceC1115130f7n interfaceC1115130f7n = this.LLILZ;
            if (interfaceC1115130f7n != null) {
                interfaceC1115130f7n.Qc();
            }
            if (this.LLILLJJLI && (c20586215gy = this.LLJJLIIIJLLLLLLLZ) != null) {
                c20586215gy.requestFocus();
                KeyBoardUtil.LIZLLL(getContext(), this.LLJJLIIIJLLLLLLLZ);
            }
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        if (this.LLLJL == null) {
            this.LLLJL = new BPEAHandler(Looper.getMainLooper());
        }
        C786410Ut5.LJLIIL(500L, this.LLLJL, new ARunnableS107S0100000_7(this, 100));
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLILLJJLI = true;
        setCancelable(true);
        InputAttrs inputAttrsPR = PR();
        if (inputAttrsPR != null) {
            this.LLJIJIL = inputAttrsPR.isDanmuOpen;
            this.LLJILJIL = inputAttrsPR.isBroadcaster;
            this.LLJILJILJ = inputAttrsPR.isUserBanned;
            this.LLJILLL = inputAttrsPR.isUserBannedWholeLive;
            this.LLJJ = inputAttrsPR.mutedDuration;
            String str = inputAttrsPR.input;
            if (str == null) {
                str = "";
            }
            this.LLJJIII = str;
            this.LLJJIJI = inputAttrsPR.atName;
            this.LLJJIJIIJIL = inputAttrsPR.content;
            this.LLJJIJIL = inputAttrsPR.atEmoteWithIndexList;
            EmoteFixTextHelper emoteFixTextHelper = inputAttrsPR.emoteFixTextHelperForText;
            if (emoteFixTextHelper == null) {
                emoteFixTextHelper = new EmoteFixTextHelper();
            }
            this.LLLFF = emoteFixTextHelper;
            this.LLJJI = inputAttrsPR.canSendDanmu;
            this.LL = !inputAttrsPR.emoteEnabled ? 1 : 0;
            this.LLJ = inputAttrsPR.hint;
            this.LLLIZZ = inputAttrsPR.trackInfo;
        } else {
            this.LLLFF = new EmoteFixTextHelper();
        }
        this.LLLFF.inputScene = EnumC584890Mwp.SUB_SPACE;
        if (this.LL == 2) {
            this.LLIZLLLIL = EnumC1114820f7I.Panel;
        }
        setStyle(1, R.style.ai9);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.setCanceledOnTouchOutside(this.LLJJJ);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.ax);
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.addFlags(32);
            window.setSoftInputMode(20);
            window.clearFlags(2);
        }
        Window window2 = dialogOnCreateDialog.getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C1114680f74.LIZ("Dialog onDismiss");
        this.LLJLLL = new C1085120eLO(0, RR(), false);
        C784440Upu.LIZ().LIZIZ(this.LLJLLL);
        this.LLILLJJLI = false;
        if (this.LLILZ != null) {
            InputAttrs inputAttrs = new InputAttrs();
            inputAttrs.isBroadcaster = this.LLJILJIL;
            inputAttrs.isUserBanned = this.LLJILJILJ;
            inputAttrs.isUserBannedWholeLive = this.LLJILLL;
            inputAttrs.mutedDuration = this.LLJJ;
            inputAttrs.isDanmuOpen = this.LLJIJIL;
            inputAttrs.input = "";
            inputAttrs.emoteFixTextHelperForText = this.LLLFF;
            if (PR() != null) {
                inputAttrs.replyInfo = PR().replyInfo;
                inputAttrs.copyInfo = PR().copyInfo;
                inputAttrs.mCommentMethod = PR().mCommentMethod;
            }
            inputAttrs.canSendDanmu = this.LLJJI;
            inputAttrs.trackInfo = this.LLLIZZ;
            this.LLILZ.Rc(inputAttrs);
        }
        if (C2204961BRm.LLLF(this.LLJJLIIIJLLLLLLLZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm19W3MpfpLShHqBycIE6yoiW7Zg6JpA4YS0F", null)) != null) {
            this.LLLIL = true;
            C2204961BRm.LLLF(this.LLJJLIIIJLLLLLLLZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm19W3MpfpLShHqBycIE6yoiW7Zg6JpA4YS0F", null)).clear();
        }
        this.LLILZ = null;
        this.LLILZLL = false;
        this.LLIZ = false;
        this.LLIZLLLIL = EnumC1114820f7I.Keyboard;
        this.LLJIJIL = false;
        this.LLJILJILJ = false;
        this.LLJILLL = false;
        this.LLJJ = -1L;
        this.LLJJI = false;
        this.LLJJIII = "";
        this.LLLII = Boolean.FALSE;
        this.LLLIIIIL = 0;
        this.LLLIL = false;
        this.LLLILZ = false;
        this.LLLILZJ = false;
        this.LLLILZLLLI = false;
        this.LLLIILIL = false;
        ((ArrayList) this.LLLJ).clear();
        this.LLLJIL = false;
        ViewPager viewPager = this.LLL;
        if (viewPager != null) {
            viewPager.setAdapter(null);
        }
        C500260Jjc.LJIILIIL(this.LLJLLIL);
        C500260Jjc.LJIILIIL(this.LLJL);
        MeasureLinearLayout measureLinearLayout = this.LLJJJJ;
        if (measureLinearLayout != null) {
            measureLinearLayout.setCanSaveState(false);
        }
        C1115140f7o.LIZIZ(this.LLJJLIIIJLLLLLLLZ, this.LLJI);
        this.LLJI = null;
    }

    public View OR(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C0J3Y c0j3y = C0J3Y.LIZ;
        Context context = getContext();
        c0j3y.getClass();
        return C0J3Y.LJFF(c0j3y, R.layout.glx, viewGroup, false, context, false, 48);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) throws Throwable {
        super.onViewCreated(view, bundle);
        this.LLJZ.LLILZIL = false;
        C786410Ut5.LJLLLLLL(0, this.LLJLLIL);
        if (getDialog() != null) {
            Window window = getDialog().getWindow();
            C764830TzN c764830TzN = new C764830TzN();
            c764830TzN.LIZ = this;
            c764830TzN.LIZIZ = this.LLJJJJ;
            c764830TzN.LIZJ = window;
            c764830TzN.LIZ();
        }
        C786410Ut5.g8(this.LLJJJJJIL, this.LLLL);
        if (PR() != null && PR().emoteEnabled) {
            C786410Ut5.LLJJIJIL(this.LLJJJJLIIL, 0);
            C786410Ut5.g8(this.LLJJJJLIIL, this.LLLL);
            this.LLL.setOnPageChangeListener(new C1151810g4x(this, 1));
        } else {
            C786410Ut5.LLJJIJIL(this.LLJJJJLIIL, 8);
            C786410Ut5.g8(this.LLJJJJLIIL, null);
        }
        Context context = view.getContext();
        EnumC584890Mwp enumC584890Mwp = EnumC584890Mwp.SUB_SPACE;
        C1115060f7g c1115060f7g = new C1115060f7g(context, this, enumC584890Mwp);
        this.LLLFFI = c1115060f7g;
        c1115060f7g.LIZJ = this.LLILLL;
        c1115060f7g.LJ = true;
        c1115060f7g.LJIILIIL = this.LLLLIIIILLL;
        if (!this.LLJJIII.isEmpty()) {
            this.LLLFF.textList.clear();
            C2204961BRm.LLLF(this.LLJJLIIIJLLLLLLLZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm19W3MpfpLShHqBycIE6yoiW7Zg6JpA4YS0F", null)).append((CharSequence) this.LLJJIII);
        } else {
            this.LLLIL = true;
            this.LLLFF.LJIIIIZZ(this.LLJJLIIIJLLLLLLLZ, SR());
            this.LLLIL = false;
        }
        InputAttrs inputAttrsPR = PR();
        if (inputAttrsPR != null) {
            inputAttrsPR.hasDraft = !this.LLLFF.textList.isEmpty();
        }
        if (this.LL != 2) {
            ((ArrayList) this.LLLJ).add(this.LLLFFI);
            C786410Ut5.LLJJIJIL(this.LLJJJJJIL, 0);
        } else {
            C786410Ut5.LLJJIJIL(this.LLJJJJJIL, 8);
        }
        if (this.LL != 1) {
            C1114290f6R c1114290f6R = new C1114290f6R(context, enumC584890Mwp);
            this.LLLFZ = c1114290f6R;
            c1114290f6R.LIZJ = this.LLILLL;
            c1114290f6R.LJ = true;
            C1115040f7e c1115040f7e = new C1115040f7e(this);
            c1114290f6R.LJIILLIIL = c1115040f7e;
            c1114290f6R.LJIIL = new C1114310f6T(c1115040f7e, c1114290f6R);
            c1114290f6R.LJIIZILJ = c1115040f7e;
            ((ArrayList) this.LLLJ).add(c1114290f6R);
        }
        for (AbstractC1115080f7i abstractC1115080f7i : (ArrayList) this.LLLJ) {
            boolean z = this.LLJILJILJ;
            if (abstractC1115080f7i.LJIIJ != z) {
                abstractC1115080f7i.LJIIJ = z;
                abstractC1115080f7i.LIZ();
            }
        }
        boolean zLIZIZ = C2685012d.LIZIZ();
        String strLIZ = C2685012d.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("open emoji input dialog with pacakge id ");
        sbLIZ.append(strLIZ);
        C20441214yg.LIZIZ("MultiTier", C2188811AlT.LIZIZ(sbLIZ));
        C0IK5.LIZJ(new ARunnableS0S1110000_7(this, strLIZ, zLIZIZ, 0));
        if (isAdded()) {
            if (this.LLJILJILJ) {
                this.LLJJLIIIJLLLLLLLZ.setText("");
                this.LLJLIL.setText(2131842825);
                this.LLJJLIIIJLLLLLLLZ.setEnabled(false);
            } else {
                this.LLJJLIIIJLLLLLLLZ.setTextSize(1, 17.0f);
                if (this.LLJIJIL) {
                    this.LLJLIL.setText(2131851988);
                } else if (!TextUtils.isEmpty(this.LLJ)) {
                    this.LLJLIL.setText(this.LLJ);
                } else {
                    this.LLJLIL.setText(2131842707);
                }
                this.LLJJLIIIJLLLLLLLZ.setEnabled(true);
            }
        }
        if (this.LLLJIL) {
            dS(0);
        } else {
            dS(RR());
        }
    }

    @Override // X.InterfaceC19323110ij
    public final void u2(int i, boolean z) {
        int iMax;
        ViewGroup.LayoutParams layoutParams;
        if (z) {
            if (!isResumed()) {
                return;
            }
            this.LLLI = SystemClock.uptimeMillis();
            if (this.LLL != null) {
                if (this.LLLJIL) {
                    iMax = C497740JfY.LJIIIZ(R.dimen.aqz) + ((int) C497740JfY.LIZIZ(1.0f));
                } else {
                    iMax = Math.max(this.LLLIIL, i);
                }
                if (iMax != this.LLLIIIL && (layoutParams = this.LLL.getLayoutParams()) != null) {
                    layoutParams.height = iMax;
                    C786410Ut5.q6(this.LLL, layoutParams);
                    this.LLLIIIL = iMax;
                }
            }
            EnumC1114820f7I enumC1114820f7I = this.LLIZLLLIL;
            EnumC1114820f7I enumC1114820f7I2 = EnumC1114820f7I.Keyboard;
            if (enumC1114820f7I != enumC1114820f7I2) {
                this.LLIZLLLIL = enumC1114820f7I2;
            }
            C1114680f74.LIZ("Open keyboard");
            this.LLILZLL = true;
            this.LLJJJJJIL.setIconAttr(R.attr.cj2);
            this.LLJJJJLIIL.setIcon(R.drawable.emf);
            C786410Ut5.LJZL(8, this.LLJZIJLIL);
            dS(-i);
            this.LLJLLL = new C1085120eLO(i, RR(), true);
            C784440Upu.LIZ().LIZIZ(this.LLJLLL);
            InterfaceC1115130f7n interfaceC1115130f7n = this.LLILZ;
            if (interfaceC1115130f7n != null) {
                interfaceC1115130f7n.LIZIZ();
                return;
            }
            return;
        }
        if (this.LLIZLLLIL == EnumC1114820f7I.Panel) {
            C786410Ut5.LLJILLL(this.LLJJJJ, 0);
            if (this.LLJZIJLIL.getVisibility() != 0) {
                C786410Ut5.LJZL(0, this.LLJZIJLIL);
                HandlerHook.viewPost(this.LLJZIJLIL, new ARunnableS117S0100000_17(this, 11));
            }
            int i2 = this.LLLIIIL;
            dS(0);
            this.LLJLLL = new C1085120eLO(i2, RR(), true);
            C784440Upu.LIZ().LIZIZ(this.LLJLLL);
            return;
        }
        C1114680f74.LIZ("close keyboard");
        if (LiveCommentInputDialogDismissFixSetting.getValue().enable && SystemClock.uptimeMillis() - this.LLLI < LiveCommentInputDialogDismissFixSetting.getValue().delayTime) {
            C1114680f74.LIZ("Unexpected close keyboard");
            return;
        }
        if (this.LLILZLL) {
            this.LLILZLL = false;
            try {
                dismissAllowingStateLoss();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1CC2.LIZ("LiveEmojiInputDialogFragment", e);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MeasureLinearLayout measureLinearLayout = this.LLJJJJ;
        if (measureLinearLayout != null) {
            if (measureLinearLayout.getParent() != null) {
                C786410Ut5.LJJJJI((ViewGroup) this.LLJJJJ.getParent());
            }
        } else {
            View viewOR = OR(layoutInflater, viewGroup);
            this.LLJJJJ = (MeasureLinearLayout) viewOR;
            if (getActivity() != null && getActivity().getRequestedOrientation() == 1) {
                MeasureLinearLayout measureLinearLayout2 = this.LLJJJJ;
                measureLinearLayout2.getClass();
                measureLinearLayout2.LL = new C2372909Rn() { // from class: X.09Ro
                    public int LJ;

                    @Override // X.C2372909Rn
                    public final void LIZIZ(int i, Context context) {
                        int iLIZIZ;
                        int size = View.MeasureSpec.getSize(i);
                        if (LIZ(size, context)) {
                            return;
                        }
                        int i2 = this.LJ;
                        if (size >= i2) {
                            i2 = size;
                        }
                        this.LJ = i2;
                        int iLJIIIIZZ = C12ES.LJIIIIZZ(context);
                        int i3 = this.LJ;
                        if (iLJIIIIZZ < i3) {
                            iLJIIIIZZ = i3;
                        }
                        if (C2084308En.LIZ(context) != 0) {
                            iLIZIZ = C2084308En.LIZ(context);
                            C20441214yg.LJIIIZ("KeyBoardObservable", "ScreenUtils.getNavigationBarHeight");
                        } else {
                            iLIZIZ = (int) C497740JfY.LIZIZ(48.0f);
                        }
                        int iLJIJ = C497740JfY.LJIJ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("sH: ");
                        sbLIZ.append(iLJIIIIZZ);
                        sbLIZ.append(", mH: ");
                        sbLIZ.append(size);
                        sbLIZ.append(", nH: ");
                        sbLIZ.append(iLIZIZ);
                        sbLIZ.append(", bH: ");
                        sbLIZ.append(iLJIJ);
                        sbLIZ.append(", kv: ");
                        sbLIZ.append(this.LIZJ);
                        sbLIZ.append(", last height:");
                        sbLIZ.append(this.LIZIZ);
                        C20441214yg.LJIIIZ("KeyBoardObservable", C2188811AlT.LIZIZ(sbLIZ));
                        int i4 = iLJIIIIZZ - size;
                        if (Math.abs(i4) <= iLIZIZ + iLJIJ + 1) {
                            if (this.LIZJ) {
                                this.LIZJ = false;
                                Math.abs(iLJIIIIZZ - this.LIZIZ);
                                return;
                            }
                            return;
                        }
                        this.LIZIZ = size;
                        if (this.LIZJ) {
                            return;
                        }
                        this.LIZJ = true;
                        Math.abs(i4);
                    }
                };
            }
            this.LLJZ = (C1115150f7p) this.LLJJJJ.findViewById(R.id.view_shadow);
            this.LLJJJJJIL = (LiveIconView) viewOR.findViewById(R.id.po8);
            this.LLJJJJLIIL = (LiveIconView) viewOR.findViewById(R.id.po9);
            LiveIconView liveIconView = (LiveIconView) viewOR.findViewById(R.id.upp);
            this.LLJJL = liveIconView;
            C786410Ut5.g8(liveIconView, new ACListenerS152S0100000_17(this, 4));
            this.LLJLILLLLZIIL = viewOR.findViewById(R.id.ko2);
            this.LLJLLIL = viewOR.findViewById(R.id.ko3);
            View viewFindViewById = viewOR.findViewById(R.id.kqv);
            this.LLJLL = viewFindViewById;
            viewFindViewById.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1151610g4d(this, 0));
            C20586215gy c20586215gy = (C20586215gy) viewOR.findViewById(R.id.grz);
            this.LLJJLIIIJLLLLLLLZ = c20586215gy;
            c20586215gy.setImeOptions(268435460);
            ((ArrayList) this.LLJJLIIIJLLLLLLLZ.LLJIJIL).add(new InterfaceC1115310f85() { // from class: X.0f84
                @Override // X.InterfaceC1115310f85
                public final void LIZ() {
                    this.LIZ.LLLIIIIL = 1;
                }
            });
            this.LLJJLIIIJLLLLLLLZ.addTextChangedListener(this.LLLLII);
            this.LLJJLIIIJLLLLLLLZ.setOnKeyListener(new View.OnKeyListener() { // from class: X.0f7x
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    SubEmojiInputDialogFragment subEmojiInputDialogFragment = this.LL;
                    subEmojiInputDialogFragment.getClass();
                    if (66 != i) {
                        return false;
                    }
                    if (1 == keyEvent.getAction()) {
                        subEmojiInputDialogFragment.WR(0);
                    }
                    return true;
                }
            });
            this.LLJLIL = (TextView) viewOR.findViewById(R.id.gs8);
            this.LLJZIJLIL = (LinearLayout) viewOR.findViewById(R.id.h05);
            this.LLL = (ViewPager) viewOR.findViewById(R.id.ks8);
            if (getDialog() != null) {
                C786410Ut5.y8(this.LLJZ, new ACListenerS152S0100000_17(this, 5));
            }
            this.LLLIIIL = C497740JfY.LJIIIZ(R.dimen.aqz) + ((int) C497740JfY.LIZIZ(1.0f));
            C16F5 c16f5 = (C16F5) viewOR.findViewById(R.id.b67);
            this.LLJL = c16f5;
            c16f5.LJJJI(R.style.a9d);
        }
        if (!this.LLJJJ) {
            this.LLJZ.setActivity(getActivity());
        }
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
            this.LLJZ.setForceDispatchTouchEvent(true);
        }
        this.LLJJJJ.setCanSaveState(true);
        this.LLJJLIIIJLLLLLLLZ.setPadding(0, 0, 0, 0);
        C1115140f7o.LIZ(this.LLJJLIIIJLLLLLLLZ);
        if (!this.LLJJI) {
            this.LLJIJIL = false;
        }
        if (this.LLIZLLLIL == EnumC1114820f7I.Panel) {
            C786410Ut5.LLJILLL(this.LLJJJJ, 0);
            C786410Ut5.LJZL(0, this.LLJZIJLIL);
            HandlerHook.viewPost(this.LLJZIJLIL, new ARunnableS117S0100000_17(this, 11));
            this.LLJLLL = new C1085120eLO(this.LLLIIIL, RR(), true);
            C784440Upu.LIZ().LIZIZ(this.LLJLLL);
        } else {
            C786410Ut5.LJZL(8, this.LLJZIJLIL);
        }
        if (getActivity() != null && C500260Jjc.LJJIII(getActivity().getRequestedOrientation())) {
            if (this.LLJJIJIIJIL != null && this.LLJJIJI != null && this.LLJJIJIL != null) {
                C786410Ut5.LLJJJJ(this.LLJL, 0);
            } else {
                C786410Ut5.LLJJJJ(this.LLJL, 8);
            }
        }
        MeasureLinearLayout measureLinearLayout3 = this.LLJJJJ;
        C19GS c19gs = null;
        if (!(measureLinearLayout3 instanceof View)) {
            measureLinearLayout3 = null;
        }
        if (measureLinearLayout3 != null) {
            try {
                ViewTreeLifecycleOwner.set(measureLinearLayout3, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(measureLinearLayout3, this);
                measureLinearLayout3.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return measureLinearLayout3;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return measureLinearLayout3;
    }
}
