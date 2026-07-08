package com.bytedance.android.livesdk.variant.service;

import X.AbstractC470040Iby;
import X.C20441214yg;
import X.C2188811AlT;
import X.C293501Bt;
import X.C470050Ibz;
import X.C470060Ic0;
import X.C470140Ic8;
import X.C470150Ic9;
import X.C470220IcG;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.watchlive.InsertRoomIntoFeedSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import webcast.api.feed.SpecialCard;
import webcast.api.room.EncourageGoLiveCard;
import webcast.api.room.GoLiveCardPicture;

/* JADX INFO: loaded from: classes8.dex */
public class VariantCardService implements IVariantCardService {
    @Override // com.bytedance.android.livesdk.variant.service.IVariantCardService
    public final AbstractC470040Iby H22(Room room) {
        SpecialCard specialCard;
        boolean z;
        int i;
        AbstractC470040Iby c470220IcG;
        if (room != null && (specialCard = room.specialCard) != null && specialCard.type == 1) {
            String str = specialCard.payload;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C20441214yg.LJ("VariantCardService", "Payload is null or empty");
            } else {
                try {
                    EncourageGoLiveCard encourageGoLiveCard = (EncourageGoLiveCard) C293501Bt.LIZ().LJII(str, EncourageGoLiveCard.class);
                    if (encourageGoLiveCard != null) {
                        if (encourageGoLiveCard.isLynxCard || ((i = encourageGoLiveCard.style) >= 101 && i <= 199)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Creating PromoteLynxVariantCard, card_id=");
                            sbLIZ.append(encourageGoLiveCard.cardId);
                            sbLIZ.append(", style=");
                            sbLIZ.append(encourageGoLiveCard.style);
                            C20441214yg.LIZIZ("VariantCardFactory", C2188811AlT.LIZIZ(sbLIZ));
                            C470150Ic9 c470150Ic9 = new C470150Ic9();
                            try {
                                c470150Ic9.LIZ(null, null, null, room);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Lynx card initialized successfully, card_id=");
                                sbLIZ2.append(encourageGoLiveCard.cardId);
                                C20441214yg.LIZIZ("VariantCardFactory", C2188811AlT.LIZIZ(sbLIZ2));
                                return c470150Ic9;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("Failed to initialize Lynx card, card_id=");
                                sbLIZ3.append(encourageGoLiveCard.cardId);
                                C20441214yg.LJFF("VariantCardFactory", C2188811AlT.LIZIZ(sbLIZ3), e);
                                return null;
                            }
                        }
                        boolean zEnable = InsertRoomIntoFeedSetting.enable();
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("useVariantCardImplementation: ");
                        sbLIZ4.append(zEnable);
                        sbLIZ4.append(" (AB key: promote_card_use_variant_implementation)");
                        C20441214yg.LIZIZ("PromoteCardSettings", C2188811AlT.LIZIZ(sbLIZ4));
                        if (!zEnable) {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("BaseVariantCard feature disabled, card_id=");
                            sbLIZ5.append(encourageGoLiveCard.cardId);
                            C20441214yg.LIZIZ("VariantCardFactory", C2188811AlT.LIZIZ(sbLIZ5));
                            return null;
                        }
                        int i2 = encourageGoLiveCard.style;
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 != 3) {
                                        if (i2 != 4) {
                                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                            sbLIZ6.append("Unsupported card style: ");
                                            sbLIZ6.append(encourageGoLiveCard.style);
                                            sbLIZ6.append(", card_id=");
                                            sbLIZ6.append(encourageGoLiveCard.cardId);
                                            C20441214yg.LIZIZ("VariantCardFactory", C2188811AlT.LIZIZ(sbLIZ6));
                                            return null;
                                        }
                                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                        sbLIZ7.append("Creating PromoteNewSinglePhotoVariantCard, card_id=");
                                        sbLIZ7.append(encourageGoLiveCard.cardId);
                                        C20441214yg.LIZIZ("VariantCardFactory", C2188811AlT.LIZIZ(sbLIZ7));
                                        c470220IcG = new C470060Ic0();
                                    } else {
                                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                        sbLIZ8.append("Creating PromoteVideoVariantCard, card_id=");
                                        sbLIZ8.append(encourageGoLiveCard.cardId);
                                        C20441214yg.LIZIZ("VariantCardFactory", C2188811AlT.LIZIZ(sbLIZ8));
                                        c470220IcG = new C470140Ic8();
                                    }
                                } else {
                                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                    sbLIZ9.append("Creating PromoteSinglePhotoVariantCard, card_id=");
                                    sbLIZ9.append(encourageGoLiveCard.cardId);
                                    C20441214yg.LIZIZ("VariantCardFactory", C2188811AlT.LIZIZ(sbLIZ9));
                                    c470220IcG = new AbstractC470040Iby() { // from class: X.0Ic2
                                        @Override // X.AbstractC470040Iby
                                        public final int LJIIZILJ() {
                                            return R.layout.hjw;
                                        }

                                        @Override // X.AbstractC470040Iby
                                        public final boolean LJJI() {
                                            return true;
                                        }

                                        @Override // X.AbstractC470040Iby
                                        public final void LJJ(View view) {
                                            List<GoLiveCardPicture> list;
                                            GoLiveCardPicture goLiveCardPicture;
                                            String str2;
                                            EncourageGoLiveCard encourageGoLiveCard2 = this.LLILZ;
                                            if (encourageGoLiveCard2 != null && (list = encourageGoLiveCard2.pictures) != null && (goLiveCardPicture = (GoLiveCardPicture) C13LP.LJJJLL(list)) != null && (str2 = goLiveCardPicture.bgColor) != null && str2.length() > 0) {
                                                try {
                                                    view.setBackgroundColor(Color.parseColor(str2));
                                                } catch (Exception e2) {
                                                    TryCatchGuardChecker.doCheck(e2);
                                                }
                                            }
                                        }

                                        @Override // X.AbstractC470040Iby, X.AbstractC463340IEy
                                        public final void LJII(View view, Bundle bundle) {
                                            ViewGroup viewGroup;
                                            GoLiveCardPicture goLiveCardPicture;
                                            String str2;
                                            super.LJII(view, bundle);
                                            EncourageGoLiveCard encourageGoLiveCard2 = this.LLILZ;
                                            if (encourageGoLiveCard2 != null && (viewGroup = this.LLJJIII) != null) {
                                                TextView textView = (TextView) viewGroup.findViewById(R.id.tv_title);
                                                if (textView != null) {
                                                    textView.setText(encourageGoLiveCard2.title);
                                                }
                                                TextView textView2 = (TextView) viewGroup.findViewById(R.id.tv_sub_title);
                                                if (textView2 != null) {
                                                    textView2.setText(encourageGoLiveCard2.subTitle);
                                                }
                                                View viewFindViewById = viewGroup.findViewById(R.id.la1);
                                                if (viewFindViewById != null && (goLiveCardPicture = (GoLiveCardPicture) C13LP.LJJJLL(encourageGoLiveCard2.pictures)) != null && (str2 = goLiveCardPicture.url) != null) {
                                                    LJIJJ(str2, viewFindViewById, null);
                                                }
                                            }
                                        }
                                    };
                                }
                            } else {
                                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                sbLIZ10.append("Creating PromoteTextVariantCard, card_id=");
                                sbLIZ10.append(encourageGoLiveCard.cardId);
                                C20441214yg.LIZIZ("VariantCardFactory", C2188811AlT.LIZIZ(sbLIZ10));
                                c470220IcG = new C470050Ibz();
                            }
                        } else {
                            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                            sbLIZ11.append("Creating Promote3PhotoVariantCard, card_id=");
                            sbLIZ11.append(encourageGoLiveCard.cardId);
                            C20441214yg.LIZIZ("VariantCardFactory", C2188811AlT.LIZIZ(sbLIZ11));
                            c470220IcG = new C470220IcG();
                        }
                        try {
                            c470220IcG.LIZ(null, null, null, room);
                            StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                            sbLIZ12.append("Card initialized successfully, type=");
                            sbLIZ12.append(c470220IcG.getClass().getSimpleName());
                            sbLIZ12.append(", card_id=");
                            sbLIZ12.append(encourageGoLiveCard.cardId);
                            C20441214yg.LIZIZ("VariantCardFactory", C2188811AlT.LIZIZ(sbLIZ12));
                            return c470220IcG;
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                            sbLIZ13.append("Failed to initialize card, type=");
                            sbLIZ13.append(c470220IcG.getClass().getSimpleName());
                            sbLIZ13.append(", card_id=");
                            sbLIZ13.append(encourageGoLiveCard.cardId);
                            C20441214yg.LJFF("VariantCardFactory", C2188811AlT.LIZIZ(sbLIZ13), e2);
                            return null;
                        }
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                    sbLIZ14.append("Failed to parse EncourageGoLiveCard from payload: ");
                    sbLIZ14.append(e3.getMessage());
                    C20441214yg.LJ("VariantCardService", C2188811AlT.LIZIZ(sbLIZ14));
                    return null;
                }
            }
        }
        return null;
    }
}
