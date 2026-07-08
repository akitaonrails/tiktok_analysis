package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _CommerceInfo_ProtoDecoder implements C0IMD<CommerceInfo> {
    public static CommerceInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CommerceInfo commerceInfo = new CommerceInfo();
        commerceInfo.voucherInfo = new HashMap();
        commerceInfo.productInfo = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                Long lValueOf = null;
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    commerceInfo.auctionInfo = _AuctionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                long jLIZJ2 = c1516680pZS.LIZJ();
                                VoucherItem voucherItemLIZLLL = null;
                                while (true) {
                                    int iLJI2 = c1516680pZS.LJI();
                                    if (iLJI2 == -1) {
                                        break;
                                    }
                                    if (iLJI2 != 1) {
                                        if (iLJI2 == 2) {
                                            voucherItemLIZLLL = _VoucherItem_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                }
                                c1516680pZS.LJ(jLIZJ2);
                                if (lValueOf != null) {
                                    if (voucherItemLIZLLL != null) {
                                        commerceInfo.voucherInfo.put(lValueOf, voucherItemLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        } else {
                            commerceInfo.popupWindowInfo = _PopupWindowInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        commerceInfo.popCardInfo = _PopCardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    long jLIZJ3 = c1516680pZS.LIZJ();
                    ProductItem productItemLIZLLL = null;
                    while (true) {
                        int iLJI3 = c1516680pZS.LJI();
                        if (iLJI3 == -1) {
                            break;
                        }
                        if (iLJI3 != 1) {
                            if (iLJI3 == 2) {
                                productItemLIZLLL = _ProductItem_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    }
                    c1516680pZS.LJ(jLIZJ3);
                    if (lValueOf != null) {
                        if (productItemLIZLLL != null) {
                            commerceInfo.productInfo.put(lValueOf, productItemLIZLLL);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return commerceInfo;
            }
        }
    }

    public static void LJ(CommerceInfo commerceInfo) {
        AuctionWinnerPopup auctionWinnerPopup;
        ImageModel imageModel;
        Map<Long, ProductItem> map = commerceInfo.productInfo;
        if (map == null) {
            commerceInfo.productInfo = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, ProductItem>> it2 = commerceInfo.productInfo.entrySet().iterator();
            while (it2.hasNext()) {
                ProductItem value = it2.next().getValue();
                if (value != null) {
                    _ProductItem_ProtoDecoder.LJ(value);
                }
            }
        }
        PopupWindowInfo popupWindowInfo = commerceInfo.popupWindowInfo;
        if (popupWindowInfo != null && (auctionWinnerPopup = popupWindowInfo.auctionWinnerPopup) != null && (imageModel = auctionWinnerPopup.productImg) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        Map<Long, VoucherItem> map2 = commerceInfo.voucherInfo;
        if (map2 == null) {
            commerceInfo.voucherInfo = new HashMap();
        } else if (!map2.isEmpty()) {
            Iterator<Map.Entry<Long, VoucherItem>> it3 = commerceInfo.voucherInfo.entrySet().iterator();
            while (it3.hasNext()) {
                it3.next().getValue();
            }
        }
        AuctionInfo auctionInfo = commerceInfo.auctionInfo;
        if (auctionInfo != null) {
            _AuctionInfo_ProtoDecoder.LJ(auctionInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CommerceInfo commerceInfo) {
        LJ(commerceInfo);
    }

    @Override // X.C0IMD
    public final CommerceInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CommerceInfo commerceInfo, List list) {
    }
}
