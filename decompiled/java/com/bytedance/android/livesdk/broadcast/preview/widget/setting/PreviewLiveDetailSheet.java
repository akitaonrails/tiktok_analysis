package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C01GW;
import X.C0WZX;
import X.C1119170fEJ;
import X.C1161920gLG;
import X.C1324720kZq;
import X.C16F5;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C292401Bi;
import X.C452501pT;
import X.C468960IaE;
import X.C475510Ikn;
import X.C486790J7d;
import X.C497740JfY;
import X.C754410TiZ;
import X.C754670Tiz;
import X.C758170Tod;
import X.C786120Usc;
import X.C786410Ut5;
import X.EnumC754690Tj1;
import Y.ACListenerS147S0100000_12;
import Y.ARunnableS112S0100000_12;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.broadcast.api.HashTagResp;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.game.IGameTopicService;
import com.bytedance.android.livesdk.broadcast.LiveCoverControllerChannel;
import com.bytedance.android.livesdk.broadcast.PreviewHideKeyboardEvent;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewPagerSelectedGameItem;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewLiveDetailSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTHELIOSMlLDh9PywoLionZjYpPTs6JiJiGT02PiwpPgM6PiAILDsyISkfISo2PA==";
    public C1324720kZq LLJLLL;
    public ConstraintLayout LLJZ;
    public ConstraintLayout LLJZIJLIL;
    public LiveEditText LLLFF;
    public C16F5 LLLFFI;
    public View LLLFZ;
    public C16F5 LLLI;
    public DataChannel LLLIIIIL;
    public C754410TiZ LLLIIIL;
    public LiveMode LLLIIL;
    public boolean LLLIILIL;
    public final C01GW LLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(81));
    public final C01GW LLLF = C292401Bi.LIZ(new AwS556S0100000_12(this, 195));
    public String LLLII = "";
    public final C786120Usc LLLIIII = new C786120Usc(this, 7);

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131842006));
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodUR = UR();
        if (c758170TodUR != null) {
            arrayList.add(c758170TodUR);
        }
        c1119170fEJ.LJFF = arrayList;
        return c1119170fEJ;
    }

    public final ImageSpan uS() {
        return (ImageSpan) this.LLLF.getValue();
    }

    public final void yS() {
        LiveMode liveMode;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        if (this.LLLIIIIL == null || (liveMode = this.LLLIIL) == null) {
            return;
        }
        EnumC754690Tj1.Companion.getClass();
        EnumC754690Tj1 enumC754690Tj1LIZ = C754670Tiz.LIZ(liveMode);
        if (enumC754690Tj1LIZ != null) {
            Hashtag hashtag = enumC754690Tj1LIZ.getHashtag();
            GameTag gameTag = enumC754690Tj1LIZ.getGameTag();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append((hashtag == null || !C468960IaE.LIZ(hashtag)) ? "" : hashtag.title);
            if (gameTag != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" | ");
                sbLIZ.append(gameTag.showName);
                stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ));
            }
            C16F5 c16f5 = this.LLLI;
            if (c16f5 != null) {
                c16f5.setText(stringBuffer);
            }
            Hashtag hashtag2 = enumC754690Tj1LIZ.getHashtag();
            if (hashtag2 != null && (dataChannel2 = this.LLLIIIIL) != null) {
                dataChannel2.zW(HashtagChangedChannel.class, hashtag2);
            }
            GameTag gameTagFB = ((IGameTopicService) C1161920gLG.LIZJ(IGameTopicService.class)).fB(liveMode);
            if (gameTagFB == null || (dataChannel = this.LLLIIIIL) == null) {
                return;
            }
            dataChannel.zW(PreviewPagerSelectedGameItem.class, gameTagFB);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJLLL = null;
        this.LLJZ = null;
        this.LLJZIJLIL = null;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final void bS(boolean z) {
        super.bS(z);
        LiveEditText liveEditText = this.LLLFF;
        if (liveEditText != null) {
            liveEditText.clearFocus();
        }
    }

    public final void wS(String str) {
        if (str != null && str.length() != 0) {
            LiveEditText liveEditText = this.LLLFF;
            if (liveEditText != null && liveEditText.isFocused()) {
                LiveEditText liveEditText2 = this.LLLFF;
                Editable editableLLLFZ = null;
                if (liveEditText2 != null) {
                    editableLLLFZ = C2204961BRm.LLLFZ(liveEditText2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1B8DMJolxCqBTNZOxQEDp8F7nrSJv4g==", null));
                }
                if (!TextUtils.isEmpty(String.valueOf(editableLLLFZ))) {
                    C16F5 c16f5 = this.LLLFFI;
                    if (c16f5 != null) {
                        c16f5.setText(str);
                    }
                    LiveEditText liveEditText3 = this.LLLFF;
                    if (liveEditText3 != null) {
                        liveEditText3.setText(str);
                        return;
                    }
                    return;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(' ');
            SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.p2(spannableString, uS(), str.length(), str.length() + 1, 17);
            C16F5 c16f52 = this.LLLFFI;
            if (c16f52 != null) {
                c16f52.setText(spannableString);
            }
            LiveEditText liveEditText4 = this.LLLFF;
            if (liveEditText4 != null) {
                liveEditText4.setText(spannableString);
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C754410TiZ c754410TiZ;
        LiveEditText liveEditText;
        View viewFindViewById;
        super.onViewCreated(view, bundle);
        this.LLLIIIIL = C475510Ikn.LJ(this);
        this.LLLI = (C16F5) view.findViewById(R.id.yf1);
        DataChannel dataChannel = this.LLLIIIIL;
        if (dataChannel != null) {
            dataChannel.EQ2(this, LiveModeChannel.class, new AwS591S0100000_12(this, 410));
            dataChannel.BQ2(this, HashTagResp.class, new AwS591S0100000_12(this, 411));
        }
        DataChannel dataChannel2 = this.LLLIIIIL;
        C16F5 c16f5 = null;
        if (dataChannel2 != null) {
            c754410TiZ = (C754410TiZ) dataChannel2.gg0(LiveCoverControllerChannel.class);
        } else {
            c754410TiZ = null;
        }
        this.LLLIIIL = c754410TiZ;
        C486790J7d.LIZ.post(new ARunnableS112S0100000_12(this, 88), this);
        View view2 = getView();
        if (view2 != null) {
            liveEditText = (LiveEditText) view2.findViewById(R.id.y1_);
        } else {
            liveEditText = null;
        }
        if (!(liveEditText instanceof LiveEditText)) {
            liveEditText = null;
        }
        this.LLLFF = liveEditText;
        View view3 = getView();
        if (view3 != null) {
            view3.findViewById(R.id.gq0);
        }
        View view4 = getView();
        if (view4 != null) {
            viewFindViewById = view4.findViewById(R.id.y22);
        } else {
            viewFindViewById = null;
        }
        this.LLLFZ = viewFindViewById;
        View view5 = getView();
        if (view5 != null) {
            c16f5 = (C16F5) view5.findViewById(R.id.y34);
        }
        this.LLLFFI = c16f5;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.BQ2(this, PreviewHideKeyboardEvent.class, new AwS591S0100000_12(this, 803));
        }
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        if (dataChannelLJ2 != null) {
            dataChannelLJ2.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 807));
        }
        C16F5 c16f52 = (C16F5) view.findViewById(R.id.g31);
        if (c16f52 != null) {
            C786410Ut5.l8(c16f52, new ACListenerS147S0100000_12(this, 165));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gl1, viewGroup, false);
    }
}
