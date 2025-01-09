const faturamentoMensalPorEstado = {
    SP: 67836.43,
    RJ: 36678.66,
    MG: 29229.88,
    ES: 27165.48,
    Outros: 19849.53
};

// Calcula o faturamento total
const faturamentoTotal = Object.values(faturamentoMensalPorEstado).reduce((acc, valor) => acc + valor, 0);

// Calcula o percentual de cada estado e exibe os resultados
console.log("Representação de cada estado sobre o faturamento da distribuidora: ");
for (const [estado, valor] of Object.entries(faturamentoMensalPorEstado)) {
    const percentual = (valor / faturamentoTotal) * 100;
    console.log(`${estado}: ${percentual.toFixed(2)}%`);
}
