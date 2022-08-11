package BFFSpring.BFF.services;

import BFFSpring.BFF.model.Cliente;
import BFFSpring.BFF.repositories.CLienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServices
{

    private CLienteRepository repository;

    @Autowired
    public ClienteServices(CLienteRepository repo)
    {
        this.repository = repo;
    }

        public void salvarCliente(Cliente cliente)
        {
            validarCliente(cliente);
            this.repository.persistir(cliente);
        }

    public void validarCliente(Cliente cliente)
    {
        ///aplica validações
    }
}
